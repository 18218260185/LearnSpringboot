package com.how2java.springboot.pojo;

import javax.persistence.*;

@Entity
@Table(name="hero")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name ="name")
    private String name;
    @Column(name="hp")
    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
    @Override
    public String toString(){
        return "Category [hp="+ hp +",name="+ name +"]";
    }
}
