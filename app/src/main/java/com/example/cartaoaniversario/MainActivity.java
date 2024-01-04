package com.example.cartaoaniversario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Metodo OnClick na ImageView
    public void FraseAniverario(View view){

        TextView txtAniverario = findViewById(R.id.txt_msg_aniversario);
        txtAniverario.setText(R.string.txt_msg_aniversario);
    }
}