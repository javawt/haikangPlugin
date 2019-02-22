package com.yunaprk.hikpluginserver.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: xzhang
 * @Description:
 * @Date: Created on 2018/3/28
 */
@Data
public class ParkingRecord {
    private long id;
    private String serialno;
    private String batchNo;
    private String carPlateNo;
    private String cashierNo;
    private int carPlateColor;
    private int carBodySize;
    private String ingateNo;
    private String inregionNo;
    private Long intime;
    private String incarPhoto;
    private String inplatePhoto;
    private String outgateNo;
    private String outregionNo;
    private Long outtime;
    private String outplatePhoto;
    private String outcarPhoto;
    private String seatNo;
    private int status;
    private BigDecimal parkAmt;
    private BigDecimal cashAmt;
    private int payFlag;
    private String relateParkLogSerialno;
    private long createTime;
    private long updateTime;
    private int memberType;
    private BigDecimal couponAmt;
    private String outBatchNo;
    private BigDecimal selfPayAmt;
}
