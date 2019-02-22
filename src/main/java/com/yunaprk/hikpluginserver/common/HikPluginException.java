package com.yunaprk.hikpluginserver.common;

/**
 * Created by xzhang on 2019/2/18.
 */
public class HikPluginException extends Exception {

    public HikPluginException(String message) {
        super(message);
    }

    public HikPluginException(String message, Throwable cause) {
        super(message, cause);
    }
}
