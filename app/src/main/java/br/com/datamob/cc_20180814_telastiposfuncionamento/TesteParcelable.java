package br.com.datamob.cc_20180814_telastiposfuncionamento;

import android.os.Parcel;
import android.os.Parcelable;

public class TesteParcelable implements Parcelable
{
    private Integer valor1;
    private String valor2;

    public TesteParcelable(Integer valor1, String valor2)
    {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    protected TesteParcelable(Parcel in)
    {
        valor1 = in.readInt();
        valor2 = in.readString();
    }

    public static final Creator<TesteParcelable> CREATOR = new Creator<TesteParcelable>()
    {
        @Override
        public TesteParcelable createFromParcel(Parcel in)
        {
            return new TesteParcelable(in);
        }

        @Override
        public TesteParcelable[] newArray(int size)
        {
            return new TesteParcelable[size];
        }
    };

    public TesteParcelable()
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

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeInt(valor1);
        dest.writeString(valor2);
    }
}


