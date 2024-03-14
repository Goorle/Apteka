package com.example.aptekapract;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.PortUnreachableException;
import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsHolder>{

    private ArrayList<MedicalProduct> medicalProducts = new ArrayList<>();
    private Context context;

    public ProductsAdapter(ArrayList<MedicalProduct> medicalProducts, Context context){
        this.medicalProducts = medicalProducts;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items, parent, false);
        return new ProductsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsHolder holder, int position) {
        MedicalProduct product = medicalProducts.get(position);
        String storageResult = "Находится на складе: " + product.getStorage();
        String countResult = "В наличии " + String.valueOf(product.getCountProduct() + " штук");

        holder.nameProduct.setText(product.getProductName());
        holder.storageProduct.setText(storageResult);
        holder.countProduct.setText(countResult);


    }

    @Override
    public int getItemCount() {
        return medicalProducts.size();
    }

    public static class ProductsHolder extends RecyclerView.ViewHolder{

        TextView nameProduct;
        TextView storageProduct;
        TextView countProduct;
        public ProductsHolder(@NonNull View itemView) {
            super(itemView);

            nameProduct = itemView.findViewById(R.id.name_medicine);
            storageProduct = itemView.findViewById(R.id.storage_name);
            countProduct = itemView.findViewById(R.id.count_medical);

            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(itemView.getContext(), ProductItemActivity.class);
                intent.putExtra("name", nameProduct.getText().toString());
                intent.putExtra("storage", storageProduct.getText().toString());
                intent.putExtra("count", countProduct.getText().toString());

                itemView.getContext().startActivity(intent);

            });
        }
    }
}
