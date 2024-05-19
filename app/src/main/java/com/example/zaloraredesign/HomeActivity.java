package com.example.zaloraredesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    
    ImageButton imbHome, imbKategori,imbTas, imbWishlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        imbHome = findViewById(R.id.imbHome);
        imbKategori = findViewById(R.id.imbKategori);
        imbTas = findViewById(R.id.imbTas);
        imbWishlist = findViewById(R.id.imbWishlist);
        klik();
    }
    void klik(){
        imbHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intentHome);
            }
        });
        imbKategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKategori = new Intent(HomeActivity.this, KategoriActivity.class);
                startActivity(intentKategori);
            }
        });
        imbTas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTas = new Intent(HomeActivity.this, TasActivity.class);
                startActivity(intentTas);
            }
        });
        imbWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWishlist = new Intent(HomeActivity.this, WishlistActivity.class);
                startActivity(intentWishlist);
            }
        });
    }
}