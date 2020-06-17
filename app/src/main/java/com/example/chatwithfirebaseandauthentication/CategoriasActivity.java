package com.example.chatwithfirebaseandauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseUser;

public class CategoriasActivity extends AppCompatActivity {

    private FirebaseUser fireUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    // Retorna o intent já com a categoria
    private Intent getCategoriaIntent(String categoria){
        Intent intent = new Intent(this,  ChatActivity.class);
        intent.putExtra("categoria", categoria);

        return intent;
    }

    public void entrarChatCinema(View view){
        Intent intent = getCategoriaIntent("cinema");
        startActivity(intent);
    }

    public void entrarChatNovidades(View view){
        Intent intent = getCategoriaIntent("novidades");
        startActivity(intent);
    }

    public void entrarChatTecnologia(View view){
        Intent intent = getCategoriaIntent("tecnologia");
        startActivity(intent);
    }

    public void entrarChatEconomia(View view){
        Intent intent = getCategoriaIntent("economia");
        startActivity(intent);
    }

    public void irParaLogin(View view) {
        Intent intent = new Intent( this, MainActivity.class);
        startActivity(intent);
    }
}