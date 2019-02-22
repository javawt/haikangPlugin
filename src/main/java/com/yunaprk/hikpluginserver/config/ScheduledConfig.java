package com.yunaprk.hikpluginserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author xzhang
 * @date 2018/11/27
 */
public class ScheduledConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(setTaskExecutors());
    }

    @Bean(destroyMethod="shutdown")
    public ScheduledExecutorService setTaskExecutors(){
        return Executors.newScheduledThreadPool(2);
    }
}
