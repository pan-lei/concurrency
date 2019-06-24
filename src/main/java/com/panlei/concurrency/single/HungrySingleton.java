package com.panlei.concurrency.single;

/**
 * @author pan_l
 * @ClassName HungrySingleton
 * @Description
 * @date 2019-06-12 17:19
 */
public class HungrySingleton {
    // 私有化构造函数
    private HungrySingleton() {}
    // 单例对象
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
