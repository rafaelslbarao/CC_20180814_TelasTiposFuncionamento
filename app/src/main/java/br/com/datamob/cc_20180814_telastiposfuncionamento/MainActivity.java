package br.com.datamob.cc_20180814_telastiposfuncionamento;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Context context = MainActivity.this;
    private Button btTeste;

    // Armazena o nome
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(context, PrimeiraActivity.class));
//        inicializaComponentes();
    }

    private void inicializaComponentes()
    {
        btTeste = findViewById(R.id.btTeste);
        btTeste.setOnClickListener(this);
        btTeste.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                executaTesteDialog();
//                executaTesteToast();
            }
        });
    }

    public void executaTeste(View view)
    {
        executaTesteToast();
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btTeste:
                executaTesteToast();
                break;
        }
    }

    private void executaTesteToast()
    {
        Toast.makeText(this, "Teste do botão (Toast)", Toast.LENGTH_LONG).show();
        Toast.makeText(this, R.string.testeToast, Toast.LENGTH_LONG).show();
        Toast.makeText(this, getString(R.string.testeToast), Toast.LENGTH_SHORT).show();
    }

    private void executaTesteToastCustomizado()
    {
        Toast toast = new Toast(this);
        toast.setView(getLayoutInflater().inflate(R.layout.activity_main, null));
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();

    }

    public Context getContext()
    {
        return context;
    }

    public void setContext(Context context)
    {
        this.context = context;
    }

    public Button getBtTeste()
    {
        return btTeste;
    }

    public void setBtTeste(Button btTeste)
    {
        this.btTeste = btTeste;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    private void executaTesteDialog()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Meu Título");
        builder.setMessage("Olá, tudo bem?");
        builder.setPositiveButton("Estou Bem", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                avisaQueEstaBemToast();
            }
        });
        builder.setNeutralButton("Nem sei", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        builder.setNegativeButton("To Mal", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                correEAvisaQueTaMalToast();
            }
        });
    }

    private void executaTesteDialogCustomizado()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        builder = new AlertDialog.Builder(context);
        View view = getLayoutInflater().inflate(R.layout.activity_main, null);
        builder.setView(view);
        //
        Button botao = view.findViewById(R.id.btTeste);
        botao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context, "Clicou no botao", Toast.LENGTH_LONG).show();
            }
        });
        //
        alertDialog = builder.create();
        alertDialog.show();

    }

    private void correEAvisaQueTaMalToast()
    {
        Toast.makeText(this, "Ele tá morrendo", Toast.LENGTH_LONG).show();
    }

    private void avisaQueEstaBemToast()
    {
        Toast.makeText(this, "Continua que ta TOP", Toast.LENGTH_LONG).show();
    }

}
