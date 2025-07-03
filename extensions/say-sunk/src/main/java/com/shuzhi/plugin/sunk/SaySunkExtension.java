package com.shuzhi.plugin.sunk;

import com.shuzhi.plugin.common.SayNameExtensions;
import org.pf4j.Extension;

@Extension(ordinal = 1)
public class SaySunkExtension implements SayNameExtensions {
        @Override
        public String say() {
            return "Hello，here is sunk...." ;
        }
}