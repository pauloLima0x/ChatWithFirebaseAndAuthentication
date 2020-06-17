package com.example.chatwithfirebaseandauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class NovoUsuarioActivity extends AppCompatActivity {

    private EditText loginNovoUsuarioEditText;
    private EditText senhaNovoUsuarioEditText;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        // Inicialização das variáveis
        loginNovoUsuarioEditText = findViewById(R.id.loginNovoUsuarioEditText);
        senhaNovoUsuarioEditText = findViewById(R.id.senhaNovoUsuarioEditText);
        mAuth = FirebaseAuth.getInstance();
    }

    // Método responsável por cadastrar
    public void criarNovoUsuario(View view) {
        // Variáveis auxiliares com o valor de login e senha
        String login = loginNovoUsuarioEditText.getText().toString();
        String senha = senhaNovoUsuarioEditText.getText().toString();

        // Observação: lambda expression só é possível do Java 8 pra frente
        mAuth.createUserWithEmailAndPassword(login, senha)
                .addOnSuccessListener((result) -> { // em caso de sucesso exibe um toast com o nome do usuário
                    Toast.makeText(this,
                            getString(R.string.cadastro_sucesso),
                            Toast.LENGTH_SHORT).show();
                    finish();
                }).addOnFailureListener((error) -> {
            Toast.makeText(this,
                    getString(R.string.cadastro_falha),
                    Toast.LENGTH_SHORT).show();
            Log.e("CADASTRO", error.getMessage(), error); // Em caso de erro, printa o stack trace
            finish();
        });

    }
}