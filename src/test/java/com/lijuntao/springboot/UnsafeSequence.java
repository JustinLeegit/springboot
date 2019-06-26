package com.lijuntao.springboot;

import net.jcip.annotations.ThreadSafe;
import net.jcip.annotations.GuardedBy;
import org.junit.runner.notification.RunListener;


@ThreadSafe
public class UnsafeSequence {
    @GuardedBy("this")
    private int value;


    public synchronized int getNext(){
        return ++value;
    }


    public void setValue(int value){
        this.value = value;
    }
}
