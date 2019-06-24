package com.panlei.concurrency.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.panlei.concurrency.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

/**
 * @author pan_l
 * @ClassName finalExample
 * @Description final关键字的例子
 * @date 2019-06-21 17:36
 */
@ThreadSafe
@Slf4j
public class finalExample {
    private static final ImmutableList list = ImmutableList.of(1,2,3);
    private static final ImmutableSet set = ImmutableSet.copyOf(list);

    public static void main(String[] args) {
        list.add(4);
        set.add(4);
    }
}
