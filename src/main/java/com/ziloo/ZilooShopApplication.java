package com.ziloo;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.ziloo.repository")
@EntityScan("com.ziloo.model")
@SpringBootApplication
public class ZilooShopApplication extends SpringBootServletInitializer implements ApplicationContextAware {
    private static ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication.run(ZilooShopApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.appContext = applicationContext;
    }
}
