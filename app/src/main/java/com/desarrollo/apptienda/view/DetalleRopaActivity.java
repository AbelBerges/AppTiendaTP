package com.desarrollo.apptienda.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.desarrollo.apptienda.R;
import com.desarrollo.apptienda.databinding.ActivityDetalleRopaBinding;

public class DetalleRopaActivity extends AppCompatActivity {
    private ActivityDetalleRopaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleRopaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.detalleImagenRopa.setImageResource(getIntent().getIntExtra("foto",0));
        binding.detalleNombre.setText(getIntent().getStringExtra("nombre"));
        binding.coverTalles.setImageResource(getIntent().getIntExtra("talle",0));
        binding.coverColores.setImageResource(getIntent().getIntExtra("color",0));
        binding.detalleMarca.setText(getIntent().getStringExtra("marca"));
        //binding.detallePrecio.setText(String.valueOf(getIntent().getFloatExtra("precio",0)));
        binding.detallePrecio.setText(getIntent().getStringExtra("precio"));
        //binding.detalleStock.setText(String.valueOf(getIntent().getIntExtra("stock",0)));
        binding.detalleStock.setText(getIntent().getStringExtra("stock"));

        binding.btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalleRopaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}