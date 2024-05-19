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

public class TasActivity extends AppCompatActivity {

    ImageButton imbHome, imbKategori,imbTas, imbWishlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tas);
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
                Intent intentHome = new Intent(TasActivity.this, HomeActivity.class);
                startActivity(intentHome);
            }
        });
        imbKategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKategori = new Intent(TasActivity.this, KategoriActivity.class);
                startActivity(intentKategori);
            }
        });
        imbTas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTas = new Intent(TasActivity.this, TasActivity.class);
                startActivity(intentTas);
            }
        });
        imbWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWishlist = new Intent(TasActivity.this, WishlistActivity.class);
                startActivity(intentWishlist);
            }
        });
    }
}