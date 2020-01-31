package com.moraes.mobile.cardapiox9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonSair, btnNovoCardapio, btnPesqCardapio, btnNovoPrato, btnPesqPrato, btnCadstFuncionario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        buttonSair = findViewById(R.id.btnSair);
        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNovoCardapio = findViewById(R.id.btnCardapioNovo);
        btnNovoCardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNovoCardapio = new Intent(getApplicationContext(),InserirCardapioActivity.class);
                startActivity(intentNovoCardapio);
            }
        });
    }
}
