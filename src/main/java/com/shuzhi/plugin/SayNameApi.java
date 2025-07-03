package com.shuzhi.plugin;

import com.shuzhi.plugin.common.SayNameExtensions;
import jakarta.annotation.Resource;
import org.pf4j.spring.SpringPluginManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/// <h2> SayNameApi <h2/>
///
///
/// @author Tigers Leung
/// @version 1.0.0
/// @since 1.0.0
@RestController
@DependsOn(value = "pluginManager")
public class SayNameApi {

    private final List<SayNameExtensions> extensions ;

    @Resource
    private SpringPluginManager pluginManager ;

    @Autowired
    public SayNameApi(List<SayNameExtensions> extensions) {
        this.extensions = extensions;
    }

    @GetMapping(value = "/say/name")
    public String sayName ()
    {
        return extensions.stream().map(SayNameExtensions::say).collect(Collectors.joining(","));
    }
}
