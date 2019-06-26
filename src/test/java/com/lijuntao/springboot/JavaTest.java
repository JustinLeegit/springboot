package com.lijuntao.springboot;

public class JavaTest {
    public static void main(String[] args) {
        UnsafeSequence us = new UnsafeSequence();
        us.setValue(5);
        int a = us.getNext();
        System.out.println(a);
    }
}
