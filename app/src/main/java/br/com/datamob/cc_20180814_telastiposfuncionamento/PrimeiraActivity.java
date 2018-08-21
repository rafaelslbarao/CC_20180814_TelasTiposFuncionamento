package br.com.datamob.cc_20180814_telastiposfuncionamento;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PrimeiraActivity extends AppCompatActivity
{
    private static final String EXTRA_VALORQUALQUER = "br.com.datamob.cc_20180814_telastiposfuncionamento.primeiratela.valor_qualquer";
    private static final int SEGUNDA_TELA_REQUEST = 1;

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
//                intent.putExtra("Valor1", 1);
//                intent.putExtra("Valor2", "Valor 2");

                Teste teste = new Teste(1, "Valor 2");
                intent.putExtra("obj", teste);

                TesteParcelable testeParcelable = new TesteParcelable(1, "Valor 2");
                intent.putExtra("objpar", testeParcelable);

//                startActivity(intent);
                startActivityForResult(intent, SEGUNDA_TELA_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent retorno)
    {
        super.onActivityResult(requestCode, resultCode, retorno);
        switch (requestCode)
        {
            case SEGUNDA_TELA_REQUEST:
                if(resultCode == Activity.RESULT_OK)
                {

                    Teste teste = (Teste) retorno.getSerializableExtra("obj");
                    TesteParcelable testeParcelable = retorno.getParcelableExtra("objpar");

                    TextView textView = findViewById(R.id.tvTextView);
                    textView.setText(teste.getValor1() + " - " + teste.getValor2() + " - " + testeParcelable.getValor1()
                    + " - " + testeParcelable.getValor2());
                }
                break;

        }
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
