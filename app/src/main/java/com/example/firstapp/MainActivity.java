package com.example.firstapp;
import android.graphics.Color;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.view.View.OnTouchListener;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ImageButton;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.graphics.ColorFilter;
public class MainActivity extends AppCompatActivity {
    ImageView imgNews ;
    ImageView imgSearch ;
    ImageView imgHeart ;
    ImageView imgHistory;
    ImageView imgProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        imgNews = findViewById(R.id.img_news);
        imgSearch = findViewById(R.id.img_search);
        imgHeart =  findViewById(R.id.img_heart);
        imgHistory =  findViewById(R.id.img_history);
        imgProfile =  findViewById(R.id.img_profile);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.news:
                                imgNews.setVisibility(View.VISIBLE);
                                imgSearch.setVisibility(View.GONE);
                                imgHeart.setVisibility(View.GONE);
                                imgHistory.setVisibility(View.GONE);
                                imgProfile.setVisibility(View.GONE);
                                break;
                            case R.id.search:
                                imgNews.setVisibility(View.GONE);
                                imgSearch.setVisibility(View.VISIBLE);
                                imgHeart.setVisibility(View.GONE);
                                imgHistory.setVisibility(View.GONE);
                                imgProfile.setVisibility(View.GONE);
                                break;
                            case R.id.history:
                                imgNews.setVisibility(View.GONE);
                                imgSearch.setVisibility(View.GONE);
                                imgHeart.setVisibility(View.GONE);
                                imgHistory.setVisibility(View.VISIBLE);
                                imgProfile.setVisibility(View.GONE);
                                break;
                            case R.id.help:
                                imgNews.setVisibility(View.GONE);
                                imgSearch.setVisibility(View.GONE);
                                imgHeart.setVisibility(View.VISIBLE);
                                imgHistory.setVisibility(View.GONE);
                                imgProfile.setVisibility(View.GONE);
                                break;
                            case R.id.profile:
                                imgNews.setVisibility(View.GONE);
                                imgSearch.setVisibility(View.GONE);
                                imgHeart.setVisibility(View.GONE);
                                imgHistory.setVisibility(View.GONE);
                                imgProfile.setVisibility(View.VISIBLE);
                                break;
                        }
                        return false;
                    }
                });

    }
    public void onClick (View view){
        ImageButton imageButton = findViewById(R.id.imageButton3);
        TextView textView = findViewById(R.id.help);
        if(view.getId()==R.id.imageButton){
            imageButton = findViewById(R.id.imageButton);
            textView = findViewById(R.id.profile);
        }
        else if(view.getId()==R.id.imageButton2){
            imageButton = findViewById(R.id.imageButton2);
            textView = findViewById(R.id.history);
        }
        else if(view.getId()==R.id.imageButton4){
            imageButton = findViewById(R.id.imageButton4);
            textView = findViewById(R.id.search);
        }
        else if(view.getId()==R.id.imageButton5){
            imageButton = findViewById(R.id.imageButton5);
            textView = findViewById(R.id.news);
        }
        if(imageButton.getId()  ==R.id.imageButton3){
            imageButton.setColorFilter(getResources().getColor(R.color.colorMelon));
            imageButton.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            textView.setTextColor(getResources().getColor(R.color.colorMelon));
        }else {
            imageButton.setColorFilter(getResources().getColor(R.color.colorGreen));
            textView.setTextColor(getResources().getColor(R.color.colorGreen));
        }

        int[] images ={R.id.imageButton,R.id.imageButton2,R.id.imageButton4,R.id.imageButton5,R.id.imageButton3};
        int[] texts ={R.id.profile,R.id.history,R.id.search,R.id.news,R.id.help};
        for(int i=0;i<images.length;i++){
            ImageButton imageButton2 = findViewById(images[i]);
            TextView textView2 = findViewById(texts[i]);
            if (imageButton!=imageButton2){
                imageButton2.setColorFilter(getResources().getColor(R.color.colorGray));
                textView2.setTextColor(getResources().getColor(R.color.colorGray));
            }
            if (images[i]==R.id.imageButton3&&imageButton!=imageButton2){
                imageButton2.setColorFilter(getResources().getColor(R.color.colorWhite));
                imageButton2.setBackgroundColor(getResources().getColor(R.color.colorMelon));
                textView2.setTextColor(getResources().getColor(R.color.colorGray));
            }
        }

    }


}