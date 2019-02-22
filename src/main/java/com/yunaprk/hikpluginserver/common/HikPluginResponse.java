package com.yunaprk.hikpluginserver.common;

import java.util.List;

/**
 * @Author: xzhang
 * @Description:通用的返回结果对象
 * @Date: Created on 2018/3/22
 */
public class HikPluginResponse<T> {
    int resCode;
    String  resMsg;
    List<T> data;
    int total;

    public HikPluginResponse(int resCode, String resMsg, int total, List<T> data) {
        this.resCode = resCode;
        this.resMsg = resMsg;
        this.data = data;
        this.total=total;
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
