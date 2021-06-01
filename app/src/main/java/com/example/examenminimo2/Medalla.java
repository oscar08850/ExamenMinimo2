package com.example.examenminimo2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Medalla implements Serializable {

    @SerializedName("Medallas")
    @Expose
    private String Medallas;

    @SerializedName("URL")
    @Expose
    private String URL;


    public String getMedallas() {
        return Medallas;
    }

    public void setMedallas(String medallas) {
        Medallas = medallas;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }



}
