package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlideshowAdapter slideshowAdapter;
    private int[] images = {R.drawable.icecube, R.drawable.fiftycent, R.drawable.snoopdog};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia al ViewPager en el archivo de diseño
        viewPager = findViewById(R.id.viewPager);

        // Crear una instancia del adaptador personalizado
        slideshowAdapter = new SlideshowAdapter(this, images);

        // Configurar el adaptador en el ViewPager
        viewPager.setAdapter(slideshowAdapter);
    }
}