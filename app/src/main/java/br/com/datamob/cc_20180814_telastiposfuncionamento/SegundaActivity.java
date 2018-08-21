package br.com.datamob.cc_20180814_telastiposfuncionamento;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
//        int valor1 = getIntent().getIntExtra("Valor1", -1);
//        String valor2 = getIntent().getStringExtra("Valor2");

        final Teste teste = (Teste) getIntent().getSerializableExtra("obj");
        TesteParcelable testeParcelable = getIntent().getParcelableExtra("objpar");


        //

        //

//        ((TextView)findViewById(R.id.tvTextView)).setText(valor1 + " - " + valor2);
//        ((TextView)findViewById(R.id.tvTextView)).setText(teste.getValor1() + " - " + teste.getValor2());
        ((TextView)findViewById(R.id.tvTextView)).setText(testeParcelable.getValor1() + " - " + testeParcelable.getValor2());

        ((TextView)findViewById(R.id.tvTextView)).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Teste teste = new Teste();
                teste.setValor1(10);
                teste.setValor2("Retornando valor alterado");

                TesteParcelable testeParcelable = new TesteParcelable();
                testeParcelable.setValor1(20);
                testeParcelable.setValor2("Meu valor parcelable");

                Intent retorno = new Intent();
                retorno.putExtra("obj", teste);
                retorno.putExtra("objpar", testeParcelable);

                setResult(Activity.RESULT_OK, retorno);
                SegundaActivity.this.finish();
            }
        });
    }
}
