package com.example.act2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.act2.ActivityKedua;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variable untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variable untuk menyimpan email dan password
    String nama, password;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variable btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //Menghubungkan variable edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variable edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Menyimpan input user di edittext email kedalam variable nama
                nama = edemail.getText().toString();

                //menyimpan input user di editText password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variable toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + "dan Password anda: " + password + "", Toast.LENGTH_LONG);

                String email = "admin@mail.com";
                String pass = "123";

                if (nama.equals(email) && password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Login sukses", Toast.LENGTH_LONG);
                    t.show();

                    //Membuat objek bundle
                    Bundle b = new Bundle();

                    //memasukan value dari variable nama dengan kunci "a"
                    //dan dimasukan kedalam bundle
                    b.putString("a", nama.trim());

                    //memasukan value dari variable nama dengan kunci "b"
                    //dan dimasukan kedalam bundle
                    b.putString("a", password.trim());

                    //Membuat objek intent berpindah activity
                    Intent i = new Intent (getApplicationContext(), ActivityKedua.class);

                    //Masukkan bundle kedalam intent yang akan dikirimkan
                    i.putExtras(b);

                    //berpindah ke ActivityHasil
                    startActivity(i);
                }

                else if (!nama.equals(email) && password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Email Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (nama.equals(email)&& !password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Password salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Email dan Password salah", Toast.LENGTH_LONG);
                    t.show();
                }
                //Menampilkan Toast
                t.show();
            }
        });
    }
}