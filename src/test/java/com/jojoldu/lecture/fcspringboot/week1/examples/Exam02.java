package com.jojoldu.lecture.fcspringboot.week1.examples;

/**
 * Created by jojoldu@gmail.com on 2019-01-05
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class Exam02 {
    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        MyBean2 m = new MyBean2(); //MyBean2 클래스 정보를 메모리에 로드
        m.print();
    }
}

class MyBean2{
    static {
        System.out.println("MyBean static");
    }
    public MyBean2() {
        System.out.println("MyBean2()");
    }

    public void print() {
        System.out.println("print");
    }
}