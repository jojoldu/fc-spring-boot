package com.jojoldu.lecture.fcspringboot.domain.item;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "item") // user 라는 테이블명은 DBMS에서 생성안될 수 있다.
@Setter
@Getter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment를 사용한다.
    private Long id;
    @Column(length = 200)
    private String name;
    private int price;
    private LocalDateTime createDate;

    public Item(){
        createDate = LocalDateTime.now();
    }

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private Set<ItemImage> itemImages;

    // helper 메소드
    public void addImage(ItemImage itemImage){
        if(itemImages == null)
            itemImages = new HashSet<>();

        itemImage.setItem(this); // 쌍방향이라서 this를 넣어줘야한다.
        itemImages.add(itemImage);
    }
}
