package com.hackathon.sudocoders.fossmaster.Model;

/**
 * Created by jatin on 31/3/17.
 */

import com.google.gson.annotations.SerializedName;

public class MyRepo {

    @SerializedName("name")
    private String name;

    @SerializedName("desc")
    private String desc;

    @SerializedName("language")
    private String language;

    @SerializedName("stars")
    private String stars;

    @SerializedName("forks")
    private String no_forks;

    public MyRepo(String name, String desc, String language, String stars, String no_forks) {
        this.name = name;
        this.desc = desc;
        this.language = language;
        this.stars = stars;
        this.no_forks = no_forks;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getLanguage() {
        return language;
    }

    public String getStars() {
        return stars;
    }

    public String getNo_forks() {
        return no_forks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public void setNo_forks(String no_forks) {
        this.no_forks = no_forks;
    }
}
