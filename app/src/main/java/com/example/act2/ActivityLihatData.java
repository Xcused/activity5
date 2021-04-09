package com.example.act2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    //Deklarasi variabel dengan jenis data Textview
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylihatdata);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);
    
    //membuat variable dengan jenis data bundle
    //dan assign value dari variable tersebut dengan
    //getntent().getExtras()
    Bundle bundle = getIntent().getExtras();

    //membuat variable nama dan assign value dari pesan
    //yang dikirimkan dari activity sebelumnya
    String nama = bundle.getString("a");

    //membuat fungsi untuk mengatur textview nama dan nomor telfon
    //berdasarkan pesan yang dikirimkan dari activity sebelumnya
    switch (nama)
    {
        case "Inayah":
            tvnama.setText("Inayah M");
            tvnomor.setText("081222333444");
            break;
        case "Ilham":
            tvnama.setText("Inayah M");
            tvnomor.setText("08129382413");
            break;
        case "Eris":
            tvnama.setText("Eris M");
            tvnomor.setText("0129831724");
            break;
        case "Fikri":
            tvnama.setText("Fikri M");
            tvnomor.setText("091238412");
            break;
        case "Maul":
            tvnama.setText("Maul M");
            tvnomor.setText("1273891264");
            break;
        case "Intan":
            tvnama.setText("Intan M");
            tvnomor.setText("0192830917");
            break;
        case "Vina":
            tvnama.setText("Vina M");
            tvnomor.setText("109246123");
            break;
        case "Gita":
            tvnama.setText("Gita M");
            tvnomor.setText("761253213");
            break;
        case "Lutfi":
            tvnama.setText("Lutfi M");
            tvnomor.setText("5156243672");
            break;
        case "Vian":
            tvnama.setText("Vian M");
            tvnomor.setText("67512623");
            break;
    }
}
}
