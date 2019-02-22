package com.yunaprk.hikpluginserver;

import cn.tnar.pms.kesb.KesbClient;
import com.yunaprk.hikpluginserver.config.AppConfig;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author xzhang
 */
@SpringBootApplication
@EnableRetry
@EnableCaching
@EnableSwagger2
@EnableScheduling
@EnableConfigurationProperties({AppConfig.class})
@Log4j
public class HikpluginserverApplication implements CommandLineRunner {

    @Bean
    public KesbClient createKesbClient(@Value("${tnar.kesbUrl}") String kesbUrl){
        return  new KesbClient(kesbUrl);
    }

    public static void main(String[] args) {
        SpringApplication.run(HikpluginserverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
