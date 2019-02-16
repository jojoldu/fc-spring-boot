package com.jojoldu.lecture.fcspringboot.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_image") // user 라는 테이블명은 DBMS에서 생성안될 수 있다.
@Setter
@Getter
public class ItemImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment를 사용한다.
    private Long id;

    private String fileName;
    private String saveFileName;
    private String contentType;
    private long fileLength;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;
}
