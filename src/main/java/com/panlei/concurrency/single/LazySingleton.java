package com.panlei.concurrency.single;

import com.panlei.concurrency.annotations.ThreadSafe;

/**
 * @author pan_l
 * @ClassName LazySingleton
 * @Description 单例模式的懒汉模式
 * @date 2019-06-12 17:14
 */
@ThreadSafe
public class LazySingleton {
    // 私有化构造函数
    private LazySingleton() {}
    // 单例对象
    private static volatile LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class){
                if(instance==null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
