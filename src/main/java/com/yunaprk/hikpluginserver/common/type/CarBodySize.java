package com.yunaprk.hikpluginserver.common.type;

/**
 * 车身大小
 * 数据字典Key: {@link DictionaryKey#CAR_BODY_SIZE}
 *
 * @author xzhang on 2019/2/18.
 */
public enum CarBodySize {
    /**
     * 小型车
     */
    SMALL(1),

    /**
     * 中型车
     */
    MEDIUM(2),

    /**
     * 大型车
     */
    LARGE(3);

    private int value;

    CarBodySize(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
