package com.example.inn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText user;
    private EditText pass;
    private FirebaseAuth mauth;
    private TextView forgetpass;
    private Button button1;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private TextView textView;


    Handler handler=new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            button1.setVisibility(View.VISIBLE);
            linearLayout1.setVisibility(View.VISIBLE);
            linearLayout2.setVisibility(View.VISIBLE);
            textView.setVisibility(View.VISIBLE);
        }
    }
;


    @Override
    protected void onStart() {
        super.onStart();
        mauth = FirebaseAuth.getInstance();
        FirebaseUser currentuser = mauth.getCurrentUser();
        if (currentuser != null) {

            if (currentuser.getEmail().contentEquals("priyanshugupta132@gmail.com")) {

                Intent intent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
            }
            if(currentuser.getEmail().contentEquals("deepanksingh1122@gmail.com")){
                Intent intent=new Intent(MainActivity.this,dashboard2.class);
                startActivity(intent);
            }
            if(currentuser.getEmail().contentEquals("nirajmaurya9929@gmail.com")){
                Intent intent=new Intent(MainActivity.this,dashboard3.class);
                startActivity(intent);
            }

            if(currentuser.getEmail().contentEquals("inn25@gmail.com")){
                Intent intent=new Intent(MainActivity.this,adminDashboard.class);
                startActivity(intent);
            }
            if(currentuser.getEmail().contentEquals("p25@gmail.com")){
                Intent intent=new Intent(MainActivity.this,dashboard4.class);
                startActivity(intent);
            }
            if(currentuser.getEmail().contentEquals("g25@gmail.com")){
                Intent intent=new Intent(MainActivity.this,dashboard5.class);
                startActivity(intent);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.bu);
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.pass);
        forgetpass=(TextView)findViewById(R.id.fpass);
        button1=(Button)findViewById(R.id.bu);
        linearLayout1=(LinearLayout)findViewById(R.id.la2);
        linearLayout2=(LinearLayout)findViewById(R.id.la3);
        textView=(TextView)findViewById(R.id.fpass);





       handler.postDelayed(runnable,2000);



        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent=new Intent(MainActivity.this,forgetpassword.class);
             startActivity(intent);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mauth = FirebaseAuth.getInstance();
                final String uuser = user.getText().toString();
                String ppass = pass.getText().toString();

                if (uuser.isEmpty() || ppass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill all the fields", Toast.LENGTH_LONG).show();
                } else {

                    mauth.signInWithEmailAndPassword(uuser, ppass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "Invalid Email/Password", Toast.LENGTH_LONG).show();
                            } else {
                                if (uuser.contentEquals("priyanshugupta132@gmail.com")) {
                                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                                    finish();
                                    startActivity(intent);
                                }
                                if (uuser.contentEquals("deepanksingh1122@gmail.com")) {
                                    Intent intent1 = new Intent(MainActivity.this, dashboard2.class);
                                    finish();
                                    startActivity(intent1);

                                }
                                if (uuser.contentEquals("nirajmaurya9929@gmail.com")) {
                                    Intent intent1 = new Intent(MainActivity.this, dashboard3.class);
                                    finish();
                                    startActivity(intent1);

                                }

                                if (uuser.contentEquals("inn25@gmail.com")) {
                                    Intent intent1 = new Intent(MainActivity.this, adminDashboard.class);
                                    finish();
                                    startActivity(intent1);

                                }

                                if (uuser.contentEquals("p25@gmail.com")) {
                                    Intent intent1 = new Intent(MainActivity.this, dashboard4.class);
                                    finish();
                                    startActivity(intent1);

                                }

                                if (uuser.contentEquals("g25@gmail.com")) {
                                    Intent intent1 = new Intent(MainActivity.this, dashboard5.class);
                                    finish();
                                    startActivity(intent1);

                                }
                            }

                        }
                    });
                }
            }
        });


    }
}
