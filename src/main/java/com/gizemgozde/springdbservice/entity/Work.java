package com.gizemgozde.springdbservice.entity;


import javax.persistence.*;

@Entity
@Table(name = "work")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name =  "id")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "work_order")
    private int workOrder;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(int workOrder) {
        this.workOrder = workOrder;
    }
}
