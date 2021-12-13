package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
Button btnEnregistrer;
EditText nom , prénom , motDePasse ;
RadioGroup radioGroup;
RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnEnregistrer = findViewById(R.id.button5);
        nom =findViewById(R.id.nom);
        prénom= findViewById(R.id.prenom);
        motDePasse = findViewById(R.id.pass);
        radioGroup = findViewById(R.id.radioG);
        // after press inscription Toast appeared
        btnEnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "Nom: " + nom.getText().toString() + "Prénom: " + prénom.getText().toString() + "Mot de Passe : " + motDePasse.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    // radio button check
    public void checkbutton (View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(MainActivity3.this, "vous etes un " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}