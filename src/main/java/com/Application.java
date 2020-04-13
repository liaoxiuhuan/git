package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @ Copyright:Zhejiang DRORE Technology
 * @ Desc:
 * @ ProjectName: crawler_gather
 * @ Date: 2018/7/25 17:43
 * @ Author: caowj
 */
@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableJpaRepositories
public class Application implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(2080);
    }
}
