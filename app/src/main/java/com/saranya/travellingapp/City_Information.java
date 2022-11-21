package com.saranya.travellingapp;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
public class City_Information extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager manager;
    ArrayList<RecyclerViewModel> list = new ArrayList<>();
    RecyclerViewItemDecoration decoration;
    TextView text_city,text_state,days_tour,famous_attractions;
    Button btn_map,btn_hotel,btn_rest;
    String location_map;
    ShapeableImageView shapeableImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_information);
        text_city = findViewById(R.id.textView7);
        text_state = findViewById(R.id.textView8);
        days_tour = findViewById(R.id.textView9);
        famous_attractions = findViewById(R.id.textView10);
        btn_map = findViewById(R.id.button);
        btn_hotel = findViewById(R.id.button2);
        btn_rest = findViewById(R.id.button3);
        shapeableImageView = findViewById(R.id.shapeable_image);
        String msg = getIntent().getStringExtra("extra_city");
        if (msg.equals("Amritsar")) {
            shapeableImageView.setImageResource(R.drawable.amritsar);
            text_city.setText("Amritsar");
            text_state.setText("Punjab");
            days_tour.setText("3 Days Tour");
            famous_attractions.setText("3+ Famous Attractions");
            list.add(new RecyclerViewModel("The Golden Temple", "2 km", R.drawable.amritsar_golden_temple, 4f));
            list.add(new RecyclerViewModel("Wagah Border", "28 km", R.drawable.amritsar_wagah_border, 4f));
            list.add(new RecyclerViewModel("Jallianwala Bagh", "2 km", R.drawable.amritsar_jallianwala_bagh, 4f));
            list.add(new RecyclerViewModel("Partition Museum", "3 km", R.drawable.amritsar_partition_museum, 3f));
            recyclerView = findViewById(R.id.recyclerView);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
            manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            decoration = new RecyclerViewItemDecoration(16);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(manager);
            recyclerView.addItemDecoration(decoration);
            location_map = "https://www.google.co.in/maps/place/Amritsar,+Punjab/@31.633525,74.8000794,12z/data=!3m1!4b1!4m5!3m4!1s0x391964aa569e7355:0xeea2605bee84ef7d!8m2!3d31.6339793!4d74.8722642";
        }
        if (msg.equals("New Delhi")) {
            shapeableImageView.setImageResource(R.drawable.delhi);
            text_city.setText("New Delhi");
            text_state.setText("Delhi");
            days_tour.setText("4 Days Tour");
            famous_attractions.setText("3+ Famous Attractions");
            list.add(new RecyclerViewModel("Akshardham", "3 km", R.drawable.akshardham, 4.5f));
            list.add(new RecyclerViewModel("India Gate", "12 km", R.drawable.indiagate, 5f));
            list.add(new RecyclerViewModel("Lodhi Garden", "15 km", R.drawable.lodhi_garden, 4f));
            list.add(new RecyclerViewModel("Lotus Temple", "10 km", R.drawable.lotus_temple, 4f));
            recyclerView = findViewById(R.id.recyclerView);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
            manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            decoration = new RecyclerViewItemDecoration(16);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(manager);
            recyclerView.addItemDecoration(decoration);
            location_map = "https://www.google.com/maps/place/New+Delhi,+Delhi/@28.5273522,77.2089851,11z/data=!3m1!4b1!4m5!3m4!1s0x390cfd5b347eb62d:0x52c2b7494e204dce!8m2!3d28.6139391!4d77.2090212";
        }
        if (msg.equals("Agra")) {
            shapeableImageView.setImageResource(R.drawable.agra_taj_mahal);
            text_city.setText("Agra");
            text_state.setText("Uttar Pradesh");
            days_tour.setText("5 Days Tour");
            famous_attractions.setText("3+ Famous attractions");
            list.add(new RecyclerViewModel("Gurudwara", "2.5 km", R.drawable.gurudwara, 4f));
            list.add(new RecyclerViewModel("Itmad_UD_Daulah", "8 km", R.drawable.itmad_ud_daulah, 5f));
            list.add(new RecyclerViewModel("Red Fort", "7.5km", R.drawable.red_fort, 3f));
            list.add(new RecyclerViewModel("Tomb of Akbar", "9 km", R.drawable.tomb_of_akbar, 4f));
            recyclerView = findViewById(R.id.recyclerView);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
            manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            decoration = new RecyclerViewItemDecoration(16);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(manager);
            recyclerView.addItemDecoration(decoration);
            location_map = "https://www.google.co.in/maps/place/Agra,+Uttar+Pradesh/@27.176369,77.9386518,11z/data=!4m13!1m7!3m6!1s0x39740d857c2f41d9:0x784aef38a9523b42!2sAgra,+Uttar+Pradesh!3b1!8m2!3d27.1766701!4d78.0080745!3m4!1s0x39740d857c2f41d9:0x784aef38a9523b42!8m2!3d27.1766701!4d78.0080745";
        }
        if (msg.equals("Varanasi")) {
            shapeableImageView.setImageResource(R.drawable.varanasi);
            text_city.setText("Varanasi");
            text_state.setText("Uttar Pradesh");
            days_tour.setText("2 Days Tour");
            famous_attractions.setText("2+ Famous Attractions");
            list.add(new RecyclerViewModel("Assi Ghat", "4.5 km", R.drawable.assi_ghat, 3f));
            list.add(new RecyclerViewModel("Dashashwamedh", "18 km", R.drawable.dashashwamedh, 4f));
            list.add(new RecyclerViewModel("Durga Temple", "13km", R.drawable.durga_temple, 3.8f));
            recyclerView = findViewById(R.id.recyclerView);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
            manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            decoration = new RecyclerViewItemDecoration(16);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(manager);
            recyclerView.addItemDecoration(decoration);
            location_map = "https://www.google.com/maps/place/Varanasi,+Uttar+Pradesh/@25.3207626,82.9911089,12z/data=!3m1!4b1!4m5!3m4!1s0x398e2db76febcf4d:0x68131710853ff0b5!8m2!3d25.3176452!4d82.9739144";
        }
        if (msg.equals("Udaipur")) {
            shapeableImageView.setImageResource(R.drawable.udaipur);
            text_city.setText("Udaipur");
            text_state.setText("Rajasthan");
            days_tour.setText("6 Days Tour");
            famous_attractions.setText("4+ Famous Attractions");
            list.add(new RecyclerViewModel("City Palace", "5 km", R.drawable.city_palace, 4f));
            list.add(new RecyclerViewModel("Jagdish Temple", "6.8 km", R.drawable.jagdish_temple, 5f));
            list.add(new RecyclerViewModel("Monsoon Palace", "7 km", R.drawable.monsoon_palace, 4f));
            list.add(new RecyclerViewModel("Sahelion", "14 km", R.drawable.sahelion, 5f));
            list.add(new RecyclerViewModel("Shilpgram", "20 km", R.drawable.shilpgram, 4.8f));
            recyclerView = findViewById(R.id.recyclerView);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
            manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            decoration = new RecyclerViewItemDecoration(16);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(manager);
            recyclerView.addItemDecoration(decoration);
            location_map = "https://www.google.com/maps/place/Udaipur,+Rajasthan/@24.6082862,73.7070585,13z/data=!3m1!4b1!4m5!3m4!1s0x3967e56550a14411:0xdbd8c28455b868b0!8m2!3d24.585445!4d73.712479";
        }
        if (msg.equals("Kolkata")) {
            shapeableImageView.setImageResource(R.drawable.kolkata);
            text_city.setText("Kolkata");
            text_state.setText("West Bengal");
            days_tour.setText("7 Days Tour");
            famous_attractions.setText("5+ Famous Attractions");
            list.add(new RecyclerViewModel("Eco Park", "10 km", R.drawable.eco_park, 5f));
            list.add(new RecyclerViewModel("Eden Garden", "11 km", R.drawable.eden_garden, 5f));
            list.add(new RecyclerViewModel("India Museum", "1.8 km", R.drawable.india_museum, 3f));
            list.add(new RecyclerViewModel("Princep Ghat", "2.8  km", R.drawable.princep_ghat, 3f));
            list.add(new RecyclerViewModel("Science City", "3 km", R.drawable.science_city, 4f));
            list.add(new RecyclerViewModel("Victoria Memorial", "4 km", R.drawable.victoria_memorial, 4f));
            recyclerView = findViewById(R.id.recyclerView);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
            manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            decoration = new RecyclerViewItemDecoration(16);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(manager);
            recyclerView.addItemDecoration(decoration);
            location_map = "https://www.google.com/maps/place/Kolkata,+West+Bengal/@22.6759958,88.3297288,10z/data=!3m1!4b1!4m5!3m4!1s0x39f882db4908f667:0x43e330e68f6c2cbc!8m2!3d22.572646!4d88.363895";
        }
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location_map)));
            }
        });

        btn_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(City_Information.this, Tour_HotelList.class);
                intent.putExtra("hotel_city", msg);
                startActivity(intent);
            }
        });

        btn_rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(City_Information.this, Tour_RestaurantList.class);
                intent.putExtra("rest_city", msg);
                startActivity(intent);
            }
        });
    }
    public void click_back_arrow(View view)
    {
       Intent intent= new Intent(City_Information.this,MainActivity.class);
       startActivity(intent);
    }
}
