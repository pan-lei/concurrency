package com.panlei.concurrency.annotations;

/**
 * @author pan_l
 * @ClassName ThreadSafe
 * @Description
 * @date 2019-06-10 17:56
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记【线程安全】的类或者写法
 */
@Target(ElementType.TYPE)       // 表示该注解可以在哪里注解，这里表示的是类
@Retention(RetentionPolicy.SOURCE)  // 表示该注解存在的范围，此处表示仅在源码中
public @interface ThreadSafe {
    // 表示注解的属性
    String value() default "";
}
