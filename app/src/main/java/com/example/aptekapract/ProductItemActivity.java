package com.example.aptekapract;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ProductItemActivity extends AppCompatActivity {

    private TextView headerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_item);

        headerTitle = findViewById(R.id.header_title_product);

        initialize();
    }
    private void initialize(){
        String nameProduct = getIntent().getStringExtra("name");
        headerTitle.setText(nameProduct);
    }
}