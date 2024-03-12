package com.example.doacaosangue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Spinner dropdownMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.dropdownMenu = findViewById(R.id.spinner);
        String[] tiposSangue = new String[]{"A+","A-","B+","B-","AB+","AB-","O+","O-"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tiposSangue);
        dropdownMenu.setAdapter(adapter);
    }
    public void pesquisar(View v){
        String escolha = dropdownMenu.getSelectedItem().toString();
        String resposta = "";
        switch (escolha){
            case "A+":
                resposta = "A+, A-, O+, O-";
                break;
            case "A-":
                resposta = "A-, O-";
                break;
            case "B+":
                resposta = "B+, B-, O+, O-";
                break;
            case "B-":
                resposta = "B-, O-";
                break;
            case "AB+":
                resposta = "Todos os tipos";
                break;
            case "AB-":
                resposta = "A-, B-, AB-, O-";
                break;
            case "O+":
                resposta = "O+, O-";
                break;
            case "O-":
                resposta = "O-";
                break;
        }
        TextView respostaTV = (TextView) findViewById(R.id.respostaId);
        respostaTV.setText(resposta);
//        Toast.makeText(this,resposta,Toast.LENGTH_LONG).show();
    }
}