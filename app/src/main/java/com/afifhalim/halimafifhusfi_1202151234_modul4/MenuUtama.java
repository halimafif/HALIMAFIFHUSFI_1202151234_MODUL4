package com.afifhalim.halimafifhusfi_1202151234_modul4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }

    public void nama(View view) {
        Intent i = new Intent(this, MainActivity.class);
    }

    public void Gambar(View view) {
        Intent intent = new Intent(this, Gambar.class);
        startActivity(intent);
    }
}
