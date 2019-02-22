package com.yunaprk.hikpluginserver.common.type;

/**
 * 出入口类型
 *
 * @author xzhang on 2019/2/18.
 */
public enum GateType {
    /**
     * 入口
     */
    IN(1),
    /**
     * 出口
     */
    OUT(2);

    GateType(int value) {
        this.value = value;
    }

    private final int value;


    public int value() {
        return value;
    }
}
