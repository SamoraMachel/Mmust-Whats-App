package com.example.mmustwhatsapp;

public class profile {
    private String name;
    private String image;
    private String text;

    public profile(String _name, String _image, String _text) {
        name = _name;
        image = _image;
        text = _text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
