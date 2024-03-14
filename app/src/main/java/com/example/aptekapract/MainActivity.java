package com.example.aptekapract;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listProducts;
    private ArrayList<MedicalProduct> medicalProducts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeProduct();

        listProducts = findViewById(R.id.list_item_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listProducts.setLayoutManager(layoutManager);

        ProductsAdapter adapter = new ProductsAdapter(medicalProducts, this);
        listProducts.setAdapter(adapter);
    }

    private void initializeProduct(){
        medicalProducts.add(new MedicalProduct("Терафлю", " г. Боровичи, ул Свободы 51 ", 46));
        medicalProducts.add(new MedicalProduct("Цитромон", " г. Окуловка, ул Некрасовская 21 ", 67));
        medicalProducts.add(new MedicalProduct("Нурофен", " г. Москва, ул Набережная 21 ", 89));
        medicalProducts.add(new MedicalProduct("Ибуклин", " г. Санкт-Петербург, ул Мира 45 ", 78));
        medicalProducts.add(new MedicalProduct("Парацетамол", " г. Великий Новгород, ул Комсомольская 76 ", 36));
        medicalProducts.add(new MedicalProduct("Найз", " г. Малая Вишера, ул Московская 89 ", 77));
        medicalProducts.add(new MedicalProduct("Селмевит", " г. Москва, ул Гончарная 21 ", 98));
        medicalProducts.add(new MedicalProduct("Ринорус", " г. Санкт-Петербург, ул Набережная 26 ", 32));
        medicalProducts.add(new MedicalProduct("Римантадин", " г. Боровичи, ул Пушкинская 23 ", 64));
        medicalProducts.add(new MedicalProduct("Амбробене", " г. Боровичи, ул Коммунарная 50 ", 22));
        medicalProducts.add(new MedicalProduct("Амелакс", " г. Нижний Новгород, ул Советская 88 ", 84));
    }
}