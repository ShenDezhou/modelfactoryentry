package com.chinalawinfo.modelsprintboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Configuration 
@ComponentScan(basePackages={"com.chinalawinfo.modelsprintboot.controller"})
@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class Application 
{
    public static void main( String[] args )
    {
    	  SpringApplication.run(Application.class);
    }
}
