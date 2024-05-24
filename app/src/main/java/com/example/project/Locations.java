package com.example.project;

import com.google.gson.annotations.SerializedName;
public class Locations {
    @SerializedName("ID")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("location")
    private String location;

    @SerializedName("category")
    private String category;

    public Locations(String id, String name, String location, String category) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.category = category;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation(){
        return location;
    }

    public String getCategory(){
        return category;
    }

}