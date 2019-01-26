package com.jojoldu.lecture.fcspringboot.week4;

import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by jojoldu@gmail.com on 2019-01-26
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class PasswordTest {
    @Test
    public void passwordEncode_test() {
        //given
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        //when
        String encode = passwordEncoder.encode("1234");

        //then
        System.out.println(encode);

    }
}
