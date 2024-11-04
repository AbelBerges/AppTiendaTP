package com.desarrollo.apptienda.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.desarrollo.apptienda.databinding.ItemRopaBinding;
import com.desarrollo.apptienda.listener.RopaClickedListener;
import com.desarrollo.apptienda.model.Ropa;

import java.util.List;

public class RopaAdapter extends RecyclerView.Adapter<RopaAdapter.ViewHolder> {
    private List<Ropa> ropas;
    private RopaClickedListener ropaClickedListener;
    private Context context;

    public RopaAdapter(List<Ropa> ropas, RopaClickedListener ropaClickedListener, Context context){
        this.ropas = ropas;
        this.ropaClickedListener = ropaClickedListener;
        this.context = context;
    }

    //public abstract void onRopaClicked(Ropa ropa);
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        ItemRopaBinding binding = ItemRopaBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new ViewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        Ropa ropa = ropas.get(position);
        holder.bind(ropa);
    }

    @Override
    public int getItemCount(){
        return ropas.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemRopaBinding binding;
        public ViewHolder(@NonNull ItemRopaBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Ropa ropa){
            binding.nombreRopa.setText(ropa.getNombre());
            binding.ropaCover.setImageResource(ropa.getFoto());
            binding.ropaCover.setOnClickListener(v -> ropaClickedListener.onRopaClicked(ropa));
        }
    }
}
