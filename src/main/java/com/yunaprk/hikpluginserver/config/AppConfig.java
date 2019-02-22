package com.yunaprk.hikpluginserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * @author xzhang
 */
@ConfigurationProperties(prefix = "tnar")
@Data
public class AppConfig {
    private String kesbUrl;
    private String hikUrl;

}
