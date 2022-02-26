package com.cydeo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.cydeo.proxy","com.cydeo.repository","com.cydeo.services"})
public class ProjectConfig {

}
