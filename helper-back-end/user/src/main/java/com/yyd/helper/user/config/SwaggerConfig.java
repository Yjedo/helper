package com.yyd.helper.user.config;

import com.yyd.helper.common.config.BaseSwaggerConfig;
import com.yyd.helper.common.propertity.SwaggerProperty;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperty swaggerProperty() {
        return SwaggerProperty.builder()
                .apiBasePackage("com.yyd.helper.user.controller")
                .title("helper用户系统")
                .description("helper相关接口文档")
                .contactName("yyd")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return generateBeanPostProcessor();
    }
}
