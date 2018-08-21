package br.com.datamob.cc_20180814_telastiposfuncionamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        //
        carregaTela();
    }

    private void carregaTela()
    {
        int valor1 = getIntent().getIntExtra("Valor1", -1);
        String valor2 = getIntent().getStringExtra("Valor2");
        ((TextView)findViewById(R.id.tvTextView)).setText(valor1 + " - " + valor2);
    }
}
