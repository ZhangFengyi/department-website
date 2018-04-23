package com.baohao.departmentwebsite.common;

import com.zwzx.common.spring.PropertiesConfigurer;
import org.apache.commons.lang3.StringUtils;

public class GlobalConfigurations {

    public static boolean isReleaseMode() {
        return StringUtils.equalsIgnoreCase(PropertiesConfigurer.getProperty("run.mode", "local"), "release");
    }
}
