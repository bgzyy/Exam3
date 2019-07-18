package com.hand.exam.exam3test.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.hand.exam.exam3test.aspect.ServiceAspect;
import com.hand.exam.exam3test.listener.MyListener;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * Created by zhao'yin
 * Date 2019/7/18.
 */
@Configuration
@EnableAspectJAutoProxy
@ServletComponentScan(basePackages = {"com.hand.exam.exam3test.listener"})
@Import({ServiceAspect.class})
public class MainConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource() {
        return new DruidDataSource();
    }
}