package com.example.myapplication;

import android.widget.ImageView;


public class Cl1 {
    String hazmatName;
    int productWeight;
    double classNr;
    int unNr;
    int placard;
    ImageView ivPlacard;

   public void Desc (String hazmatName,int productWeight, double classNr , int unNr, ImageView ivPlacard,int placard){
        this.hazmatName = hazmatName;
        this.productWeight = productWeight;
        this.classNr = classNr;
        this.unNr = unNr;
        this.ivPlacard = ivPlacard;
        this.placard=placard;

    }

    public String toString(){
       return "Hazmat name: "+hazmatName + "\n"
               + "Class number: "+classNr + "\n"
               + "Product Weight: "+productWeight + "lbs" +"\n"
               + "UN number:"+unNr;
    }





}
