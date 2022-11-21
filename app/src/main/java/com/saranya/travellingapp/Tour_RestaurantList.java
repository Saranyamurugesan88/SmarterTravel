package com.saranya.travellingapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
public class Tour_RestaurantList extends AppCompatActivity
{
    ImageView res_image1,res_image2,res_image3;
    TextView rest_name1,rest_name2,rest_name3;
    RatingBar rating_bar1,rating_bar2,rating_bar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_restaurant_list);
        res_image1= findViewById(R.id.res_imageView1);
        res_image2= findViewById(R.id.res_imageView2);
        res_image3= findViewById(R.id.res_imageView3);
        rest_name1= findViewById(R.id.res_name1);
        rest_name2= findViewById(R.id.res_name2);
        rest_name3= findViewById(R.id.res_name3);
        rating_bar1= findViewById(R.id.res_ratingbar1);
        rating_bar2= findViewById(R.id.res_ratingbar2);
        rating_bar3= findViewById(R.id.res_ratingbar3);
        String str_rest_city= getIntent().getStringExtra("rest_city");
        if(str_rest_city.equals("Amritsar"))
        {
           res_image1.setImageResource(R.drawable.firnagi_dhaba);
           res_image2.setImageResource(R.drawable.kava_grill_lounge);
           res_image3.setImageResource(R.drawable.ziva_all_day_dining);
           rest_name1.setText("Firnagi Dhaba");
           rest_name2.setText("Kava Grill lounge");
           rest_name3.setText("Ziva all day dining");
           rating_bar1.setRating(4);
           rating_bar2.setRating(3);
           rating_bar3.setRating(4);
        }
        if(str_rest_city.equals("New Delhi"))
        {
            res_image1.setImageResource(R.drawable.megu_restaurant);
            res_image2.setImageResource(R.drawable.sandoz);
            res_image3.setImageResource(R.drawable.sorrento);
            rest_name1.setText("Megu Restaurant");
            rest_name2.setText("Sandoz");
            rest_name3.setText("Sorrento");
            rating_bar1.setRating(5);
            rating_bar2.setRating(3);
            rating_bar3.setRating(3);
        }
        if(str_rest_city.equals("Agra"))
        {
            res_image1.setImageResource(R.drawable.peshawri);
            res_image2.setImageResource(R.drawable.taj_bano);
            res_image3.setImageResource(R.drawable.tease_me);
            rest_name1.setText("Peshawri");
            rest_name2.setText("Taj Bano");
            rest_name3.setText("Tease me");
            rating_bar1.setRating(4);
            rating_bar2.setRating(3);
            rating_bar3.setRating(5);
        }
        if(str_rest_city.equals("Varanasi"))
        {
            res_image1.setImageResource(R.drawable.sushi_cafe);
            res_image2.setImageResource(R.drawable.tadka_ramada_plaza);
            res_image3.setImageResource(R.drawable.varuna_restaurant);
            rest_name1.setText("Sushi Cafe");
            rest_name2.setText("Tadka Ramada Plaza");
            rest_name3.setText("Varuna Restaurant");
            rating_bar1.setRating(3);
            rating_bar2.setRating(5);
            rating_bar3.setRating(5);
        }
        if(str_rest_city.equals("Udaipur"))
        {
            res_image1.setImageResource(R.drawable.jaajam_restaurant);
            res_image2.setImageResource(R.drawable.millets_of_mewar);
            res_image3.setImageResource(R.drawable.rainbow_restaurant);
            rest_name1.setText("Jaajam Restaurant");
            rest_name2.setText("Millets of Mewar");
            rest_name3.setText("Rainbow Restaurant");
            rating_bar1.setRating(4);
            rating_bar2.setRating(3);
            rating_bar3.setRating(3);
        }
        if(str_rest_city.equals("Kolkata"))
        {
            res_image1.setImageResource(R.drawable.barbeque_nation);
            res_image2.setImageResource(R.drawable.mocambo_restaurant);
            res_image3.setImageResource(R.drawable.peter_cat);
            rest_name1.setText("Barbeque Nation");
            rest_name2.setText("Mocambo Restaurant");
            rest_name3.setText("Peter Cat");
            rating_bar1.setRating(5);
            rating_bar2.setRating(3);
            rating_bar3.setRating(5);
        }
    }
}