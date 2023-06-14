package dev.android.monique.franca.app.lista.tarefa02_lista_compras.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import dev.android.monique.franca.app.lista.tarefa02_lista_compras.R;
import dev.android.monique.franca.app.lista.tarefa02_lista_compras.controller.ComprasController;
import dev.android.monique.franca.app.lista.tarefa02_lista_compras.controller.ItemController;
import dev.android.monique.franca.app.lista.tarefa02_lista_compras.model.Compras;
import dev.android.monique.franca.app.lista.tarefa02_lista_compras.model.Item;
import dev.android.monique.franca.app.lista.tarefa02_lista_compras.model.LocalCompra;

public class MainActivity extends AppCompatActivity {

    ComprasController comprasController;
    ItemController itemController;


    Compras outrasCompras;

    List<LocalCompra> listaLocalCompra;
    List<Item> listaItem;


    EditText editnomeItem;
    EditText editquantidadeItem;
    EditText editlocal;

    Button btn_button_limpar;
    Button btn_button_salvar;
    Button btn_button_finalizar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       itemController = new ItemController(MainActivity.this);
       itemController.toString();

       comprasController = new ComprasController();
       listaItem = comprasController.getListaItem();
       listaLocalCompra = comprasController.getListLocalCompra();

        outrasCompras = new Compras();
        itemController.buscar(outrasCompras);

        editnomeItem = findViewById(R.id.text_nomerItem);
        editquantidadeItem = findViewById(R.id.editText_quantidade);
        editlocal =findViewById(R.id.text_local);


        btn_button_limpar =findViewById(R.id.button_limpar);
        btn_button_salvar = findViewById(R.id.button_salvar);
        btn_button_finalizar = findViewById(R.id.button_finalizar);

        editnomeItem.setText(outrasCompras.getNomeItem());
        editquantidadeItem.setText(outrasCompras.getQuantidadeItem());
        editlocal.setText(outrasCompras.getLocal());

        btn_button_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editnomeItem.setText("");
                editquantidadeItem.setText("");
                editlocal.setText("");
            }
        });

        btn_button_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outrasCompras.setNomeItem(editnomeItem.getText().toString());
                outrasCompras.setQuantidadeItem(editquantidadeItem.getText().toString());
                outrasCompras.setLocal(editlocal.getText().toString());

                Toast.makeText(MainActivity.this,"Ítem adicionado na lista!",Toast.LENGTH_LONG).show();
                itemController.salvar(outrasCompras);
            }
        });

        btn_button_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ítem Comprado com Sucesso!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        Log.i("proframacaoPOO", outrasCompras.toString());

    }
}