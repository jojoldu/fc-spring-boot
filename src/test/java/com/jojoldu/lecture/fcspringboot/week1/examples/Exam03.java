package com.jojoldu.lecture.fcspringboot.week1.examples;

import java.lang.reflect.Method;

/**
 * Created by jojoldu@gmail.com on 2019-01-05
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class Exam03 {
    public static void main(String[] args) throws Exception {
        int num = 1;
        Class clazz = Class.forName("Action"+num); //클래스정보를 가질 수 있는 타입
        Object obj = clazz.newInstance();
        Method runMethod = clazz.getMethod("run", null);
        runMethod.invoke(obj, null);
    }
}

class Action1 {
    static {
        System.out.println("static");
    }

    public Action1() {
        System.out.println("Action1 constructor");
    }

    public void run() {
        System.out.println("action 1");
    }
}

class Action2 {
    public void run() {
        System.out.println("action 2");
    }
}