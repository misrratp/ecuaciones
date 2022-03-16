package com.example.ecuaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivitylogin extends AppCompatActivity {


    private Button boton;

    private Button buttonTwitter;
    private Button buttonFacebook;
    private Button buttonGoogle;
    private String urlf;
    private String urlg;
    private String  urlt;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //usuario y contra admin admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    startActivity(new Intent(MainActivitylogin.this, ecu.class));
                    Toast.makeText(MainActivitylogin.this,"Sesion iniciada, redirigiendo!",Toast.LENGTH_SHORT).show();


                }else
                    //incorrect
                    startActivity(new Intent(MainActivitylogin.this, ecu.class));
                    Toast.makeText(MainActivitylogin.this,"Sesion fallida, revise sus datos.!!!",Toast.LENGTH_SHORT).show();

            }


        });

        buttonGoogle = findViewById(R.id.buttonGoogle);
        urlg="https://www.google.com/accounts/Login?hl=es";
        buttonGoogle.setOnClickListener(new View.OnClickListener(){
        @Override
       public void onClick(View view){
        Uri uri = Uri.parse(urlg);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
           startActivity(intent);
                                            }
                                        }

        );
        buttonFacebook = findViewById(R.id.buttonFacebook);
        urlf="https://es-la.facebook.com/";
        buttonFacebook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Uri uri = Uri.parse(urlf);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }


        });
        buttonTwitter = findViewById(R.id.buttonTwitter);
        urlt="https://twitter.com/login?lang=es";
        buttonTwitter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Uri uri = Uri.parse(urlt);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }


        });
    } }
