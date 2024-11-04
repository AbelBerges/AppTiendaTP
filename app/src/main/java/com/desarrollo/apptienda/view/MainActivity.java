package com.desarrollo.apptienda.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.desarrollo.apptienda.databinding.ActivityMainBinding;
import com.desarrollo.apptienda.listener.RopaClickedListener;
import com.desarrollo.apptienda.model.Ropa;
import com.desarrollo.apptienda.viewModel.RopaViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private RopaViewModel ropaViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ropaViewModel = new ViewModelProvider(this).get(RopaViewModel.class);
        binding.reciclador.setLayoutManager(new GridLayoutManager(this,2));
        ropaViewModel.getListado().observe(this, new Observer<List<Ropa>>() {
            @Override
            public void onChanged(List<Ropa> ropas) {
                if (ropas != null && !ropas.isEmpty()){
                    Log.d("RopaList", "Mi lista de ropa " + ropas.size());
                    RopaAdapter adapter = new RopaAdapter(ropas, new RopaClickedListener() {
                        @Override
                        public void onRopaClicked(Ropa ropa) {
                            Toast.makeText(MainActivity.this,"Elegiste. " + ropa.getNombre(),Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(MainActivity.this, DetalleRopaActivity.class);
                            intent.putExtra("nombre", ropa.getNombre());
                            intent.putExtra("foto", ropa.getFoto());
                            intent.putExtra("talle", ropa.getTalle());
                            intent.putExtra("color", ropa.getColor());
                            intent.putExtra("marca", ropa.cadenaMarca());
                            intent.putExtra("precio", ropa.cadenaPrecio());
                            intent.putExtra("stock", ropa.cadenaStock());
                            startActivity(intent);
                        }
                    },MainActivity.this);
                    binding.reciclador.setAdapter(adapter);
                } else {
                    Log.d("RopaList", "La lista está vacía");
                }
            }
        });
    }
}