package dev.android.monique.franca.app.lista.tarefa02_lista_compras.controller;

import java.util.ArrayList;
import java.util.List;

import dev.android.monique.franca.app.lista.tarefa02_lista_compras.model.Item;
import dev.android.monique.franca.app.lista.tarefa02_lista_compras.model.LocalCompra;

public class ComprasController {
    private List listaItem;
    private  List listaLocalCompra;

    public List getListaItem(){
        listaItem =new ArrayList<Item>();
        listaItem.add(new Item("Maça"));
        listaItem.add(new Item("Uva"));
        listaItem.add(new Item("Pera"));
        listaItem.add(new Item("Laranja"));
        listaItem.add(new Item("Melancia"));
        listaItem.add(new Item("Banana"));
        listaItem.add(new Item("Caju"));
        listaItem.add(new Item("Limão"));
        listaItem.add(new Item("Ameixa"));
        listaItem.add(new Item("Melão"));
        listaItem.add(new Item("Caja"));
        listaItem.add(new Item("Manga"));

        return listaItem;

    }

    public  List getListLocalCompra(){
        listaLocalCompra = new ArrayList<LocalCompra>();
        listaLocalCompra.add(new LocalCompra("SuperMAxi"));
        listaLocalCompra.add(new LocalCompra("Atacadão"));
        listaLocalCompra.add(new LocalCompra("Leal"));
        return listaLocalCompra;
    }


}
