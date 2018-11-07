package br.edu.unoesc.webmob.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;

import br.edu.unoesc.webmob.offtrail.R;

@EActivity(R.layout.activity_login)
@Fullscreen
@WindowFeature(Window.FEATURE_NO_TITLE)
public class LoginActivity extends AppCompatActivity {
    @ViewById
    EditText edtLogin;
    @ViewById
    EditText edtSenha;

    public void login(View v) {
        String strLogin = edtLogin.getText().toString();
        String strSenha = edtSenha.getText().toString();

        if (strLogin != null && strSenha != null &&
                !strLogin.trim().equals("") &&
                !strSenha.trim().equals("") &&
                strLogin.equals("jonas") &&
                strSenha.equals("jonas")) {

            Intent itPrincipal = new Intent(
                    this,
                    PrincipalActivity.class
            );
            startActivity(itPrincipal);
            finish();
        } else {
            Toast.makeText(this, "Usuário e/ou Senha Inválidos!", Toast.LENGTH_LONG).show();
            edtLogin.setText("");
            edtSenha.setText("");
            edtLogin.requestFocus();
        }
    }

    public void sair(View v) {
        finish();
        System.exit(0);
    }
}
