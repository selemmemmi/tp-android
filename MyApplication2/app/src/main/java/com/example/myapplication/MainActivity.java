package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnCall , btnWeb , btnInscription , btnConexion ;
EditText username , password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.user);
        password = findViewById(R.id.pass);
        //sign in
        btnConexion = findViewById(R.id.button3);
        btnConexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("ranimmekni") && pass.equals("ranimmekni")) {
                    Toast.makeText(MainActivity.this, "Bienvenue", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "essayer de nouveau monsieur", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // sign up
        btnInscription =findViewById(R.id.button4);
        btnInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , MainActivity3.class);
                startActivity(intent);
            }
        });
// url
        btnWeb = findViewById(R.id.button2);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.islaib.rnu.tn/Fr/actualit%C3%A9s-et-ev%C3%A9nements_7_643"));
                startActivity(intent);
            }
        });
        //call
        btnCall = findViewById(R.id.button);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:123456789"));
                startActivity(intent);


            }


        });

    }
    // when button back is pressed
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("quitter");
                builder.setMessage("êtes vous sûr de vouloir quitter");
                builder.setCancelable(false);
                builder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
                builder.create().show();
    }

}