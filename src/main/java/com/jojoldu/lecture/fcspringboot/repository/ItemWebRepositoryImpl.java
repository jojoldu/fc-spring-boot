package com.jojoldu.lecture.fcspringboot.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ItemWebRepositoryImpl implements ItemWebRepositoryCustom{

    private final JPAQueryFactory queryFactory;



}
