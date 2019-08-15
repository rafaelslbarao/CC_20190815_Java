package br.rafael.myapplication;

import android.util.Log;

import java.util.ArrayList;

public class DivulgadoraPessoas {

    public void divulgaPessoas(ArrayList<MinhaDivulgacao> listaDivulgacao)
    {
        for(MinhaDivulgacao divulga : listaDivulgacao)
        {
            Log.i("DIVULGACAO", divulga.getDescricao());
        }
    }

}
