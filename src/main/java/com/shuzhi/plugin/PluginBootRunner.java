package com.shuzhi.plugin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/// <h2> com.shuzhi.plugin.runner.PluginBootRunner <h2/>
///
///
/// @author Tigers Leung
/// @version 1.0.0
/// @since 1.0.0
@SpringBootApplication
public class PluginBootRunner {

    public static void main(String[] args) {
        var app = new SpringApplication(PluginBootRunner.class) ;
        app.run(args) ;
    }
}
