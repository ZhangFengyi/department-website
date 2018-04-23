package com.baohao.departmentwebsite.common.util;

import com.zwzx.common.utils.CodingUtil;

public class EncryptUtils {

    public static Object md5Encrypt(Object obj) {
        if (obj == null) {
            return null;
        }

        return CodingUtil.md5(obj.toString());
    }
}
