package com.yunaprk.hikpluginserver.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@MappedJdbcTypes(value = {JdbcType.BIGINT}, includeNullJdbcType = true)
@MappedTypes({LocalDateTime.class})
public class BigintLocalDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime> {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, LocalDateTime parameter, JdbcType jdbcType) throws SQLException {
        ps.setLong(i, toBigInt(parameter));
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return toLocalDateTime(rs.getLong(columnName));
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return toLocalDateTime(rs.getLong(columnIndex));
    }

    @Override
    public LocalDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return toLocalDateTime(cs.getLong(columnIndex));
    }

    /**
     * 数据库存储时间类型转为 Java 8 LocalDateTime
     *
     * @param time 数据库存储的时间如： 20180321140400
     * @return time 对应的 LocalDateTime
     */
    private LocalDateTime toLocalDateTime(long time) {
        // 如果为 0，表示数据库中为 null
        if (time == 0) {
            return null;
        }
        return LocalDateTime.parse(String.valueOf(time), FORMATTER);
    }

    /**
     * Java 8 LocalDateTime 转为数据库存储时间类型
     *
     * @param dateTime Java 中表示的时间类型
     * @return LocalDateTime 对应的 bigint 表示
     */
    private long toBigInt(LocalDateTime dateTime) {
        int year = dateTime.getYear();
        int month = dateTime.getMonth().getValue();
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        int second = dateTime.getSecond();
        return year * 100_00_00_00_00L + month * 100_00_00_00L + day * 100_00_00L + hour * 100_00L + minute * 100L + second;
    }
}
