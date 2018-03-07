package br.usjt.deswebmob.servicedeskcco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String FILA = "br.usjt.deswebmob.servicedeskcco.fila";
    private EditText textFila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFila = (EditText) findViewById(R.id.buscar_fila);
    }

    public void buscarChamados(View view) {
        String fila = textFila.getText().toString();
        Intent intent = new Intent(this, ListarChamadosActivity.class);
        intent.putExtra(FILA, fila);
        startActivity(intent);
    }
}
