package com.zproale.filmandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class posterLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poster_layout);

        //Ottengo i dati
        String titolo = getIntent().getStringExtra("titolo");

        //Faccio vedere il titolo
        TextView tv1 = (TextView)findViewById(R.id.textView5);
        tv1.setText("Hai selezionato: "+titolo + ", ecco il tuo poster!");

        //Faccio vedere il poster di quel film specifico
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(getResources().getIdentifier(titolo.toLowerCase(Locale.ROOT), "drawable", getPackageName()));
    }
}