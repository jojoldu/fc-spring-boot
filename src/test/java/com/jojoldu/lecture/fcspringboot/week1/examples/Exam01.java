package com.jojoldu.lecture.fcspringboot.week1.examples;

/**
 * Created by jojoldu@gmail.com on 2019-01-05
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class Exam01 {

    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.i);
        p.print();
    }
}

class Parent {
    int i = 5;

    public void print () {
        System.out.println(i);
    }
}

class Child extends Parent {
    int i = 10;

    public void print () {
        System.out.println(i);
    }
}
