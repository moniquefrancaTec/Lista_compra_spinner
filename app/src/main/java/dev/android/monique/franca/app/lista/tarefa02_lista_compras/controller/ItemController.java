package dev.android.monique.franca.app.lista.tarefa02_lista_compras.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import dev.android.monique.franca.app.lista.tarefa02_lista_compras.model.Compras;
import dev.android.monique.franca.app.lista.tarefa02_lista_compras.view.MainActivity;

public class ItemController {
    SharedPreferences preferences;
    SharedPreferences.Editor listaItens;

    public static final  String NOME_PREFERENCEA ="pref_listaItens";

    public ItemController(MainActivity mainActivity){
        preferences =mainActivity.getSharedPreferences(NOME_PREFERENCEA,0);
        listaItens = preferences.edit();
    }

    @NonNull
    @Override
    public  String toString(){
        Log.d("MVC_Controller","Controller iniciada....");
        return super.toString();
    }

    public void salvar(Compras outroItem){
        Log.d("MVC_Controller","Salvo: "+outroItem.toString());
        listaItens.putString("nomeItem", outroItem.getNomeItem());
        listaItens.putString("quantidadeItem",outroItem.getQuantidadeItem());
        listaItens.putString("localCompra", outroItem.getLocal());
        listaItens.apply();
    }

    public  Compras buscar(Compras outroItem){
        outroItem.setNomeItem(preferences.getString("nomeItem",""));
        outroItem.setQuantidadeItem(preferences.getString("quantidadeItem",""));
        outroItem.setLocal(preferences.getString("localCompra",""));
        return outroItem;
    }

    public  void limpar(Compras item){
        listaItens.clear();
        listaItens.apply();
    }

}
