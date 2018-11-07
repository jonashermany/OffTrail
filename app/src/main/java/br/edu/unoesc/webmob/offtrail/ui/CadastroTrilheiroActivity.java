package br.edu.unoesc.webmob.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import br.edu.unoesc.webmob.offtrail.R;

@EActivity(R.layout.activity_cadastro_trilheiro)
public class CadastroTrilheiroActivity extends AppCompatActivity {
    @ViewById
    EditText edtNomeTrilheiro;
    @ViewById
    EditText edtIdadeTrilheiro;

    public void salvar(View v) {
        String strNomeTrilheiro = edtNomeTrilheiro.getText().toString();
        String strIdadeTrilheiro = edtIdadeTrilheiro.getText().toString();

        if (strNomeTrilheiro != null && strIdadeTrilheiro != null &&
                !strNomeTrilheiro.trim().equals("") &&
                !strIdadeTrilheiro.trim().equals("")) {

        }
    }

    public void cancelar(View v) {
        finish();
    }
}
