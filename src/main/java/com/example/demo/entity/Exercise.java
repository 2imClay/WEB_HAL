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
    @Column(name = "muscle")
    private String muscle;
    @Column(name = "recommendPerWeek")
    private int recommendPerWeek;
    @Column(name = "exerciseTime")
    private int exerciseTime;
    @Column(name = "detail")
    private String detail;
    @Column(name = "thumbnail")
    private String thumbnail;
    @Column(name = "videoURL")
    private String videoURL;

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

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String joint) {
        this.muscle = joint;
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

    public String getEmbedVideoURL() {
        return videoURL;
    }

    public void setEmbedVideoURL(String embedVideoURL) {
        this.videoURL = embedVideoURL;
    }
}
