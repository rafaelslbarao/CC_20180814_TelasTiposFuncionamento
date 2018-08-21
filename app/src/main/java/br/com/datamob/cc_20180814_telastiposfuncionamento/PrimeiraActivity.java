package br.com.datamob.cc_20180814_telastiposfuncionamento;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PrimeiraActivity extends AppCompatActivity
{
    private static final String EXTRA_VALORQUALQUER = "br.com.datamob.cc_20180814_telastiposfuncionamento.primeiratela.valor_qualquer";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
        String valor;
        if (savedInstanceState != null)
        {
            valor = savedInstanceState.getString(EXTRA_VALORQUALQUER);
            valor.toString();
        }
        findViewById(R.id.tvTextView).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(PrimeiraActivity.this, SegundaActivity.class);
                intent.putExtra("Valor1", 1);
                intent.putExtra("Valor2", "Valor 2");
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putString(EXTRA_VALORQUALQUER, "Teste do meu bundle");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        comecaCamera();
    }

    private void comecaCamera()
    {

    }

    @Override
    protected void onPause()
    {
        super.onPause();
    }

    @Override
    protected void onStop()
    {
        super.onStop();

        paraCamera();
    }

    private void paraCamera()
    {

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
    }
}
