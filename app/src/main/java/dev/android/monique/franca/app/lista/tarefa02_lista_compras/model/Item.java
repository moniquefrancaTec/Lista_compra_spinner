package dev.android.monique.franca.app.lista.tarefa02_lista_compras.model;

public class Item {
    private String itemDesejado;

    public Item(){

    }
    public Item(String itemDesejado){
        this.itemDesejado =itemDesejado;
    }

    public String getItemDesejado() {
        return itemDesejado;
    }

    public void setItemDesejado(String itemDesejado) {
        this.itemDesejado = itemDesejado;
    }
}
