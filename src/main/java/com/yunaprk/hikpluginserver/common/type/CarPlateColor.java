package com.yunaprk.hikpluginserver.common.type;

/**
 * 车牌颜色
 * 数据字典Key: {@link DictionaryKey#CAR_PLATE_COLOR}
 *
 * @author xzhang on 2019/2/18.
 */
public enum CarPlateColor {
    /**
     * 蓝
     */
    BLUE(1),

    /**
     * 黄
     */
    YELLOW(3),

    /**
     * 绿
     */
    GREEN(6),

    /**
     * 白
     */
    WHITE(7),

    /**
     * 黑
     */
    BLACK(5);

    private int value;

    CarPlateColor(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
