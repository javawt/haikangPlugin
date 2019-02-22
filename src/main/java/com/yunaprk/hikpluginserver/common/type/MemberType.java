package com.yunaprk.hikpluginserver.common.type;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

/**
 * 会员类型
 * 数据字典Key: {@link DictionaryKey#MEMBER_TYPE}
 *
 * @author xzhang on 2019/2/18.
 */
public enum MemberType {
    /**
     * 临时车
     */
    TEMPORAL(0) {
        @Override
        public String playType() {
            return EMPTY_NAME;
        }
    },

    /**
     * 免费车
     */
    FREE(1) {
        @Override
        public String playType() {
            return MONTH_NAME;
        }
    },

    /**
     * 储值车
     */
    PREPAID(2) {
        @Override
        public String playType() {
            return PREPAY_NAME;
        }
    },

    /**
     * 月卡车
     */
    MONTH(3) {
        @Override
        public String playType() {
            return MONTH_NAME;
        }
    },

    /**
     * 次卡车
     */
    TIMES(4) {
        @Override
        public String playType() {
            return EMPTY_NAME;
        }
    },

    /**
     * 内部储值
     */
    INNERPAID(5) {
        @Override
        public String playType() {
            return PREPAY_NAME;
        }
    },

    /**
     * 优惠券
     */
    COUPON(6) {
        @Override
        public String playType() {
            return EMPTY_NAME;
        }
    };

    private static Map<Integer, MemberType> map = new HashMap<>(8);

    static {
        for (MemberType memberType : MemberType.values()) {
            map.put(memberType.value, memberType);
        }
    }

    public static MemberType from(int value) {
        return map.get(value);
    }

    private int value;
    private static final String EMPTY_NAME = "";
    private static final String MONTH_NAME = "月卡车";
    private static final String PREPAY_NAME = "储值车";


    MemberType(int value) {
        this.value = value;
    }

    @JsonValue
    public int value() {
        return value;
    }

    /**
     * 获取播放语音中车的类型
     *
     * @return 语音播报车的类型
     */
    public abstract String playType();
}
