package com.yxt.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version V1.0
 * @author: xintong yi
 * @date: 2023年05月30日 16时50分
 * @contact yixintong@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface CheckGetter {
}
