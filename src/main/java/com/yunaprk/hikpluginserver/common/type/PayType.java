package com.yunaprk.hikpluginserver.common.type;

/**
 * 支付类型
 * @author xzhang on 2019/2/18.
 */
public enum PayType {
    //未支付	0
    //现金	1
    //刷卡	2
    //自助缴费	5
    //套餐	8
    //电子支付	10
    //混合支付	11
    //内部储值	12
    //无感支付   13
    //线下券     14
    //线上券     15
    //代客缴费   16
    //停车场折扣 17
    //城市通	20
    //异常出场 30
    UNPAID(0),
    CASH(1),
    PAYBYCARD(2),
    SELF_PAYMENT(5),
    PACKAGE(8),
    ELEC_PAYMENT(10),
    MIXED_PAYMENT(11),
    PREPAID(12),
    EPAY(13),
    OFFLINE_COUPON(14),
    ONLINT_COUPON(15),
    PAY_FOR_GUESTS(16),
    PARK_DISCOUNT(17),
    CITY_CARD(20),
    ABNORMAL_OUT(30);

    int value;

    public int value() {
        return value;
    }

    PayType(int value) {
        this.value = value;
    }

}
