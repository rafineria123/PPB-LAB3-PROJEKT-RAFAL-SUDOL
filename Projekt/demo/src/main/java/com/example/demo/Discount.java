package com.example.demo;

import javax.persistence.*;

@Entity
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Double price_before;
    private Double price_after;

    public Discount(){

    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Long getId() {
        return id;
    }

    public Double getPrice_before() {
        return price_before;
    }

    public Double getPrice_after() {
        return price_after;
    }

    public void setPrice_before(Double price_before) {
        this.price_before = price_before;
    }

    public void setPrice_after(Double price_after) {
        this.price_after = price_after;
    }
}
