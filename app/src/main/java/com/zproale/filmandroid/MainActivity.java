package com.zproale.filmandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creo una lista view con i film
        String[] nomeFilm = new String[] { "Spiderman", "CasaDiCarta", "Titanic" };
        ArrayAdapter<String> nomeList =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomeFilm);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(nomeList);

        //Avvio un altra activity per crare il poster e gli passo i dati
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, posterLayout.class);
                String nomeSingolo = nomeFilm[position];
                intent.putExtra("titolo", nomeSingolo);
                startActivity(intent);
            }
        });
    }
}