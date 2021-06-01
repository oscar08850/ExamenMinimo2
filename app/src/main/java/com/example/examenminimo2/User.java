package com.example.examenminimo2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("medallaList")
    @Expose
    private List<Medalla> medallaList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Medalla> getMedallaList() {
        return medallaList;
    }

    public void setMedallaList(List<Medalla> medallaList) {
        this.medallaList = medallaList;
    }
}
