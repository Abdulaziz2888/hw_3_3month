package com.example.hw_3_3month;

public class CarModel {
    private String model;
    private String image;
    private String desc;

    public CarModel(String model, String image, String desc) {
        this.model = model;
        this.image = image;
        this.desc = desc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
