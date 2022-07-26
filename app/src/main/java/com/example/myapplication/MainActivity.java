package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    TextView tvTest;
    EditText etTest ;
    EditText etUnNr ;
    EditText etWeight;
    ImageView ivPlacard;
    Cl1 cl1 = new Cl1();
    Cl1 cl2 = new Cl1();
    Cl1 cl2_1 = new Cl1();
    Cl1 cl2_2 = new Cl1();
    Cl1 cl2_3 = new Cl1();
    Cl1 cl3 = new Cl1();
    Cl1 cl4_1 = new Cl1();
    Cl1 cl4_2 = new Cl1();
    Cl1 cl4_3 = new Cl1();
    Cl1 cl5_1 = new Cl1();
    Cl1 cl5_2 = new Cl1();
    Cl1 cl6 = new Cl1();
    Cl1 cl7 = new Cl1();
    Cl1 cl8 = new Cl1();
    Cl1 cl9 = new Cl1();

    Cl1[] hzmtTypes = {cl1,cl2,cl2_1,cl2_2,cl2_3,cl3,cl4_1,cl4_2,cl4_3,cl5_1,cl5_2,cl6,cl7,cl8,cl9};
    List <Object> hazmatsStored = new ArrayList<>();

    public void tesst(View view){
        Log.i("AA", (hazmatsStored).toString());
        etTest.getText().clear();
        etUnNr.getText().clear();
        etWeight.getText().clear();

    }

    public void findAndDisplayPlacard(){



    }

    public void hazObj(){
        cl1.hazmatName = "Explosives";
        cl1.classNr = 1.1;
        cl1.placard=R.drawable.explosive;

        cl2.hazmatName ="Oxygen";
        cl2.classNr =2;
        cl2.placard=R.drawable.oxygengas;

        cl2_1.hazmatName ="Flammable Gas";
        cl2_1.classNr =2.1;
        cl2_1.placard=R.drawable.flamgas;

        cl2_2.hazmatName ="Non flammable gas";
        cl2_2.classNr =2.2;
        cl2_2.placard=R.drawable.nonflamgas;

        cl2_3.hazmatName ="Inhalation Hazard";
        cl2_3.classNr =2.3;
        cl2_3.placard=R.drawable.inhalhaz;

        cl3.hazmatName="Flamable";
        cl3.classNr=3;
        cl3.placard=R.drawable.flammab;

        cl4_1.hazmatName="Flamable Solid";
        cl4_1.classNr=4.1;
        cl4_1.placard=R.drawable.flamsolid;

        cl4_2.hazmatName="Spontaneosly combustible";
        cl4_2.classNr=4.2;
        cl4_2.placard=R.drawable.spontancombust;

        cl4_3.hazmatName="Dangerous when wet";
        cl4_3.classNr=4.3;
        cl4_3.placard=R.drawable.dangerouswhenwet;

        cl5_1.hazmatName="Oxidizer";
        cl5_1.classNr=5.1;
        cl5_1.placard=R.drawable.oxidizer;

        cl5_2.hazmatName="Organic Peroxide";
        cl5_2.classNr=5.2;
        cl5_2.placard=R.drawable.orgperoxide;

        cl6.hazmatName="Poison";
        cl6.classNr=6;
        cl6.placard=R.drawable.poison;

        cl7.hazmatName="Radioactive";
        cl7.classNr=7;
        cl7.placard=R.drawable.radioactive;

        cl8.hazmatName="Corrosive";
        cl8.classNr=8;
        cl8.placard=R.drawable.corosive;

        cl9.hazmatName="Misc";
        cl9.classNr=9;
        cl9.placard=R.drawable.misc;


    }




    public  void check(View View){
    try {
        hazObj();


        for (Cl1 hzmtType : hzmtTypes) {
            if (hzmtType.classNr == Double.parseDouble(etTest.getText().toString())) {
               // hzmtType.unNr = Integer.parseInt(etUnNr.getText().toString());
              //  hzmtType.productWeight = Integer.parseInt(etWeight.getText().toString());
             //   tvTest.setText(hzmtType.toString());
             //   ivPlacard.setBackgroundResource(hzmtType.placard);
                   hzmtType.unNr=Integer.parseInt(etUnNr.getText().toString());
                   hzmtType.productWeight=Integer.parseInt(etWeight.getText().toString());
                    hazmatsStored.add(hzmtType);
            }


        }
    }catch (Exception e){}

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // tvTest = findViewById(R.id.tvTest);
        etTest = findViewById(R.id.etTest);
        ivPlacard = findViewById(R.id.ivPlacard);
        etUnNr=findViewById(R.id.etUnNr);
        etWeight=findViewById(R.id.etWeight);

    }
}


