package com.example.act2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import  androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    //mendeklarasikan varaible dengan tipe data TextView
    TextView txemail, txpassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //Menghubungkan variable txemail dengan componen textview pada layout
        txemail = findViewById(R.id.textView2);

        //Menghubungkan variable txpassword dengan componen textview pada layout
        txpassword = findViewById(R.id.textView);

        //Mendeklarasikan variabel bundel yang akan digunakan untuk mengambil
        //pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variable email kedalam txemail
        txemail.setText(email);

        //menampilkan value dari variable pass kedalam txpassword
        txpassword.setText(pass);
    }
}
