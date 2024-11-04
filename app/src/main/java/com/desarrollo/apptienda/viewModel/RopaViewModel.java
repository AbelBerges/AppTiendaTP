package com.desarrollo.apptienda.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.desarrollo.apptienda.R;
import com.desarrollo.apptienda.model.Ropa;

import java.util.ArrayList;
import java.util.List;

public class RopaViewModel extends ViewModel {
    private MutableLiveData<List<Ropa>> listaRopa;
    public RopaViewModel(){
        listaRopa = new MutableLiveData<>();
        crearLista();
    }
    private void crearLista(){
        List<Ropa> lista = new ArrayList<>();
        //String nombre, int foto, int talle,int color,String marca,float precio,int stock
        lista.add(new Ropa("Pantalón jeans de Dama", R.drawable.foto_pantalon_jean_dama,R.drawable.talles,R.drawable.colores_jean_dama,"Wrangler",76211f,54));
        lista.add(new Ropa("Pantalón jeans de Hombre",R.drawable.foto_pantalon_jean_varon,R.drawable.talles,R.drawable.colores_jean_hombre,"Levis",88541f,45));
        lista.add(new Ropa("Blusa fibrana Dama", R.drawable.foto_blusa_de_fibrana_estampada_hojas,R.drawable.talles,R.drawable.colores_blusa_fibrana_dama,"Zara",87110f,38));
        lista.add(new Ropa("Camisa de Hombre",R.drawable.foto_camisa_hombre,R.drawable.talles,R.drawable.colores_camisa_hombre,"Solar",93281f,29));
        lista.add(new Ropa("Remera algodón dama",R.drawable.foto_remera_algodon_dama,R.drawable.talles,R.drawable.colores_remera_algodon_dama,"Maxis",88443f,31));
        lista.add(new Ropa("Remera algodón de hombre",R.drawable.foto_remera_algodon_hombre,R.drawable.talles,R.drawable.colores_remera_algodon_hombre,"Surven",76542f,53));
        lista.add(new Ropa("ninguno",R.drawable.ic_launcher_foreground));
        listaRopa.setValue(lista);
    }
    public LiveData<List<Ropa>> getListado(){
        return this.listaRopa;
    }
}
