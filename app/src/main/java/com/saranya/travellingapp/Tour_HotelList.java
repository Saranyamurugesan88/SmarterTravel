package com.saranya.travellingapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
public class Tour_HotelList extends AppCompatActivity {

    ImageView hotel_imageview1,hotel_imageview2,hotel_imageview3;
    TextView hotel1,hotel2,hotel3;
    RatingBar rating_bar1,rating_bar2,rating_bar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_hotel_list);
        hotel_imageview1= findViewById(R.id.hotel_imageView1);
        hotel_imageview2= findViewById(R.id.hotel_imageView2);
        hotel_imageview3= findViewById(R.id.hotel_imageView3);
        hotel1= findViewById(R.id.hotel_name1);
        hotel2= findViewById(R.id.hotel_name2);
        hotel3= findViewById(R.id.hotel_name3);
        rating_bar1= findViewById(R.id.hotel_ratingbar);
        rating_bar2= findViewById(R.id.hotel_ratingbar2);
        rating_bar3= findViewById(R.id.hotel_ratingbar3);

        String str_hotel_city= getIntent().getStringExtra("hotel_city");
        if(str_hotel_city.equals("Amritsar"))
        {
            hotel_imageview1.setImageResource(R.drawable.hotel_golden_lotus);
            hotel_imageview2.setImageResource(R.drawable.taj_swarna);
            hotel_imageview3.setImageResource(R.drawable.welcome_heritage);
            hotel1.setText("Hotel Golden Lotus");
            hotel2.setText("Taj Swarna");
            hotel3.setText("Welcome Heritage");
            rating_bar1.setRating(3);
            rating_bar2.setRating(4);
            rating_bar3.setRating(4);
        }
        if(str_hotel_city.equals("New Delhi"))
        {
            hotel_imageview1.setImageResource(R.drawable.aloft_new_delhi_aerocity);
            hotel_imageview2.setImageResource(R.drawable.hotel_ronit_royal);
            hotel_imageview3.setImageResource(R.drawable.the_imperial);
            hotel1.setText("Aloft New Delhi Aerocity");
            hotel2.setText("Hotel Ronit Royal");
            hotel3.setText("The Imperial");
            rating_bar1.setRating(5);
            rating_bar2.setRating(3);
            rating_bar3.setRating(4);
        }
        if(str_hotel_city.equals("Agra"))
        {
            hotel_imageview1.setImageResource(R.drawable.courtyard_marriot_agra);
            hotel_imageview2.setImageResource(R.drawable.doubletree_by_hiltan_agra);
            hotel_imageview3.setImageResource(R.drawable.trident_agra);
            hotel1.setText("Courtyard Marriot Agra");
            hotel2.setText("Doubletree by Hiltan Agra");
            hotel3.setText("Trident Agra");
            rating_bar1.setRating(4);
            rating_bar2.setRating(5);
            rating_bar3.setRating(4);
        }
        if(str_hotel_city.equals("Varanasi"))
        {
            hotel_imageview1.setImageResource(R.drawable.radisson);
            hotel_imageview2.setImageResource(R.drawable.ramada_plaza);
            hotel_imageview3.setImageResource(R.drawable.rivatas_by_ideal);
            hotel1.setText("Radisson");
            hotel2.setText("Ramada Plaza");
            hotel3.setText("Rivatas by Ideal");
            rating_bar1.setRating(5);
            rating_bar2.setRating(4);
            rating_bar3.setRating(4);
        }
        if(str_hotel_city.equals("Udaipur"))
        {
            hotel_imageview1.setImageResource(R.drawable.hotel_lakeend);
            hotel_imageview2.setImageResource(R.drawable.jagat_niwas_palace);
            hotel_imageview3.setImageResource(R.drawable.lake_pichola);
            hotel1.setText("Hotel Lakeend");
            hotel2.setText("Jagat Niwas Palace");
            hotel3.setText("Lake Pichola");
            rating_bar1.setRating(4);
            rating_bar2.setRating(3);
            rating_bar3.setRating(5);
        }
        if(str_hotel_city.equals("Kolkata"))
        {
            hotel_imageview1.setImageResource(R.drawable.itc_royal_bengal);
            hotel_imageview2.setImageResource(R.drawable.the_oberoi_grand);
            hotel_imageview3.setImageResource(R.drawable.westing_kolkata_rajarhat);
            hotel1.setText("ITC Royal bengal");
            hotel2.setText("The Oberoi grand");
            hotel3.setText("Westing Kolkata Rajarhat");
            rating_bar1.setRating(3);
            rating_bar2.setRating(5);
            rating_bar3.setRating(5);
        }

    }
}