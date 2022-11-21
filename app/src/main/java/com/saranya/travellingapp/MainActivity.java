package com.saranya.travellingapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity
{
    AdapterViewFlipper flipper;
    ArrayList<AdapterFlipperModel> flipper_data;
    AdapterFlipper_BaseAdapter flipper_baseadapter;
    CardView amritsar,new_delhi,agra,varanasi,udaipur,kolkata;
    ArrayList<String> str_city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ArrayList of Items

        str_city= new ArrayList<String>();
        str_city.add("Amritsar");
        str_city.add("New Delhi");
        str_city.add("Agra");
        str_city.add("Varanasi");
        str_city.add("Udaipur");
        str_city.add("Kolkata");
        flipper = findViewById(R.id.adapter_flipper_home); //main flipper of the home which would be shown in application
        flipper_data = new ArrayList<>();

        //Adding items to flipper_data arraylist.
        flipper_data.add(new AdapterFlipperModel("Taj Mahal", "Agra", R.drawable.agra_taj_mahal)); //setting values to the items which were in the constructor of model adpater java class
        flipper_data.add(new AdapterFlipperModel("Akshardham Temple", "Delhi", R.drawable.new_delhi_akshardham_temple));
        flipper_data.add(new AdapterFlipperModel("Amritsar Golden Temple", "Amritsar", R.drawable.amritsar_golden_temple));
        flipper_data.add(new AdapterFlipperModel("Lake Pichola", "Udaipur", R.drawable.udaipur_lake_pichola));
        flipper_data.add(new AdapterFlipperModel("Victoria Memorial Hall", "Kolkata", R.drawable.kolkata_victoria_memorial_hall));

        //Setting the adapter
        flipper_baseadapter = new AdapterFlipper_BaseAdapter(this, flipper_data);
        flipper.setAdapter(flipper_baseadapter);

        //Few settings for controlling the flipper
        flipper.setAutoStart(true); //start when the application starts without the user click.
        flipper.setFlipInterval(3000); //3000 milliseconds = 3 seconds.

        amritsar = findViewById(R.id.amritsar_home);
        amritsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,City_Information.class);
                intent.putExtra("extra_city",str_city.get(0));
                startActivity(intent);
            }
        });
        new_delhi= findViewById(R.id.new_delhi_home);
        new_delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,City_Information.class);
                intent.putExtra("extra_city",str_city.get(1));
                startActivity(intent);
            }
        });
         agra= findViewById(R.id.agra);
         agra.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent= new Intent(MainActivity.this,City_Information.class);
                 intent.putExtra("extra_city",str_city.get(2));
                 startActivity(intent);
             }
         });
         varanasi= findViewById(R.id.varanasi_home);
         varanasi.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent= new Intent(MainActivity.this,City_Information.class);
                 intent.putExtra("extra_city",str_city.get(3));
                 startActivity(intent);
             }
         });
         udaipur= findViewById(R.id.udaipur);
         udaipur.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent= new Intent(MainActivity.this,City_Information.class);
                 intent.putExtra("extra_city",str_city.get(4));
                 startActivity(intent);
             }
         });
         kolkata= findViewById(R.id.kolkata_home);
         kolkata.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent= new Intent(MainActivity.this,City_Information.class);
                 intent.putExtra("extra_city",str_city.get(5));
                 startActivity(intent);
             }
         });
    }
    public void user_login(View view)
    {
        Toast.makeText(this,"USER IS LOGGED IN",Toast.LENGTH_LONG).show();
    }
}