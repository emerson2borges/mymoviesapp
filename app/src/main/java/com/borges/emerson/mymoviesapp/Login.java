package com.borges.emerson.mymoviesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText entradaEmail, entradaSenha;
    private Button Registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = entradaEmail.getText().toString();
                String senha = entradaSenha.getText().toString();

                Toast.makeText(getApplicationContext(),"oi" + Email +
                        "voce digitou a senha"+ senha,Toast.LENGTH_SHORT).show();
            }
        });

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        entradaEmail = findViewById(R.id.editEmail);
        entradaSenha = findViewById(R.id.editSenha);
        Registro = findViewById(R.id.btnRegistro);
    }

}
