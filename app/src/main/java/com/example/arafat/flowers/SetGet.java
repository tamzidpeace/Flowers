package com.example.arafat.flowers;

public class SetGet {
    private int Flower_Image_ID;
    private String Flowers_Name;

    public  SetGet(int ID, String Name){
        this.Flower_Image_ID = ID;
        this.Flowers_Name = Name;
    }

    public int getFlower_Image_ID() {
        return Flower_Image_ID;
    }

    public void setFlower_Image_ID(int flower_Image_ID) {
        Flower_Image_ID = flower_Image_ID;
    }

    public String getFlowers_Name() {
        return Flowers_Name;
    }

    public void setFlowers_Name(String flowers_Name) {
        Flowers_Name = flowers_Name;
    }
}
