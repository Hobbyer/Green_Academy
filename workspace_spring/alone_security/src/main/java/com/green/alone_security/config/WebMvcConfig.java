package com.green.alone_security.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  public void configureViewResolevers(ViewResolverRegistry registry) {
    MustacheViewResolver resolver = new MustacheViewResolver();
    resolver.setCharset("UTF-8");
    resolver.setContentType("text/html; charset=UTF-8");
    resolver.setPrefix("classpath:/static/");
    resolver.setSuffix(".html");

    registry.viewResolver(resolver);
  }
}
