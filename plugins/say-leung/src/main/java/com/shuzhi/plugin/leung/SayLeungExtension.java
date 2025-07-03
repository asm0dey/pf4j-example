package com.shuzhi.plugin.leung;

import com.shuzhi.plugin.common.SayNameExtensions;
import org.pf4j.Extension;

@Extension(ordinal = 2)
public final class SayLeungExtension implements SayNameExtensions {
        @Override
        public String say() {
            return "Hello, here is leung...." ;
        }
}