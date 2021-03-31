package com.example.act2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ActivityDaftar extends AppCompatActivity {

    //Deklarasi variable dengan tipe data EditText
    EditText edNama, edAlamat, edEmail, edPassword, edrepass;

    //Deklarasi variable dengan tipe data Floating Action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);


        //Membuat method untuk event dari floating button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edNama.getText().toString().isEmpty() ||
                        edAlamat.getText().toString().isEmpty() ||
                        edEmail.getText().toString().isEmpty() ||
                        edPassword.getText().toString().isEmpty() ||
                        edrepass.getText().toString().isEmpty())
                {
                    //Menampilkan pesan notifikasi jika seluruh EditText wajib diisi
                    Snackbar.make(view, "Wajib isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
                }
                else
                    {
                          //Membuat kondisi untuk mencgecek apakah isi dari EditText password dan Edittext repassword sama atau tidak
                        if (edPassword.getText().toString().equals(edrepass.getText().toString()))
                        {
                            //Menampilkan pesan notifikasi jika pendaftaran berhasil
                            Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil!",
                            Toast.LENGTH_LONG).show();

                            //Method untuk kembaloi ke activity Main
                            Intent i = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(i);
                        }
                        else
                            {
                                //Menampilkan pesan bahwa isi dari EditText password dan Edittext Repasword tidak sama
                                Snackbar.make(view, "Masukkan Password yang sama!!",
                                Snackbar.LENGTH_LONG).show();
                            }
                    }
                }
            });
    }
}
