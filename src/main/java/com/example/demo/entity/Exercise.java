package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Exercise {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "shortDesc")
    private String shortDesc;
    @Column(name = "joint")
    private String joint;
    @Column(name = "recommendPerWeek")
    private int recommendPerWeek;
    @Column(name = "exerciseTime")
    private int exerciseTime;
    @Column(name = "detail")
    private String detail;
    @Column(name = "thumbnail")
    private String thumbnail;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getJoint() {
        return joint;
    }

    public void setJoint(String joint) {
        this.joint = joint;
    }

    public int getRecommendPerWeek() {
        return recommendPerWeek;
    }

    public void setRecommendPerWeek(int recommendPerWeek) {
        this.recommendPerWeek = recommendPerWeek;
    }

    public int getExerciseTime() {
        return exerciseTime;
    }

    public void setExerciseTime(int exerciseTime) {
        this.exerciseTime = exerciseTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
