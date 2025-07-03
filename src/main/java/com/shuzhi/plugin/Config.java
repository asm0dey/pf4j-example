package com.shuzhi.plugin;

import org.pf4j.spring.SpringPluginManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// <h2> Config <h2/>
///
///
/// @author Tigers Leung
/// @version 1.0.0
/// @since 1.0.0
@Configuration
public class Config {


    @Bean
    public SpringPluginManager pluginManager(ApplicationContext applicationContext) {
        SpringPluginManager springPluginManager = new SpringPluginManager();
        springPluginManager.setApplicationContext(applicationContext);
        springPluginManager.init() ;
        return springPluginManager ;
    }
}
