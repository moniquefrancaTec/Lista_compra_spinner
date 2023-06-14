package dev.android.monique.franca.app.lista.tarefa02_lista_compras.model;

public class Compras {
    private String nomeItem;
    private  String quantidadeItem;
    private String local;

    public Compras() {
    }

    public Compras(String nomeItem, String quantidadeItem, String local) {
        this.nomeItem = nomeItem;
        this.quantidadeItem = quantidadeItem;
        this.local = local;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(String quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public  String toString(){
        return "Nome Item: " + nomeItem + "Quantidade: " +quantidadeItem + "local: "+ local;
    }
}
