package br.rafael.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MinhaDivulgacao> listaDeDivulgacao = new ArrayList<>();

        listaDeDivulgacao.add(new PessoaFisica("Rafael", 1, 1));
        listaDeDivulgacao.add(new PessoaFisica("Rafael2", 2, 2));
        listaDeDivulgacao.add(new PessoaFisica("Rafael3", 3, 3));

        listaDeDivulgacao.add(new PessoaJuridica("Barao", 1, 1));
        listaDeDivulgacao.add( new PessoaJuridica("Barao2", 2, 2));
        listaDeDivulgacao.add( new PessoaJuridica("Barao3", 3, 3));

        DivulgadoraPessoas divulgadoraPessoas = new DivulgadoraPessoas();
        divulgadoraPessoas.divulgaPessoas(listaDeDivulgacao);

    }
}
