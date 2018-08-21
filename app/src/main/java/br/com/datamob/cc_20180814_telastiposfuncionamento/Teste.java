package br.com.datamob.cc_20180814_telastiposfuncionamento;

import java.io.Serializable;

public class Teste implements Serializable
{
    private Integer valor1;
    private String valor2;

    public Teste(Integer valor1, String valor2)
    {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Teste()
    {

    }

    public Integer getValor1()
    {
        return valor1;
    }

    public void setValor1(Integer valor1)
    {
        this.valor1 = valor1;
    }

    public String getValor2()
    {
        return valor2;
    }

    public void setValor2(String valor2)
    {
        this.valor2 = valor2;
    }
}
