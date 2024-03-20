package com.example.firstrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.example.firstrecycler.Adapter.PersonaAdapter;
import com.example.firstrecycler.Model.Mascota;
import com.example.firstrecycler.Model.Persona;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> personasLista = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.rcview);

        // Forma 1
        Persona P1 = new Persona("Rigo Tovar", 22.0, "rtovar1@gmail.com", new Mascota("Vaarg"), Color.rgb(255,173,173));
        personasLista.add(P1);
        // Forma 2
        personasLista.add(new Persona("Yeojin Loona", 25.0, "yloona@gmail.com", new Mascota("Felix"), Color.rgb(0,0,255)));
        personasLista.add(new Persona("Asa Mitaka", 18.4, "mitaka.asa@yahoo.com", new Mascota("Yoru"), Color.rgb(0,255,0)));
        // Con el otro constructor
        personasLista.add(new Persona("Dario Ramon", 19.5, "dramos@gmail.com", new Mascota("Pelusa"), Color.rgb(255,0,0)));
        // En estos ejemplos se pasa como parámetro una instancia del objeto Mascota de forma anónima, solo con "New" para llamar a su constructor.
        // La propiedad "Color" se pone con una cantidad de los 3 valores RGB, el IDE debería de mostrarte cuál es red, green y blue.

        PersonaAdapter miAdapter = new PersonaAdapter(personasLista); //Constructor

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(miAdapter);
    }
}