package com.wdharmana.kejarfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // TODO: 35. Buat variabel lokal TextView bernama txtTotal untuk komponen bernama txtTotal dengan findViewById
        TextView txtTotal = (TextView) findViewById(R.id.txtTotal);

        // TODO: 36. Definisikan variabel tipe data Intent bernama myIntent dengan value = getIntent()
        Intent myIntent = getIntent();
        // TODO: 37. Definisikan variabel String total dengan data diambil myIntent.getStringExtra("grandtotal");
        String total = myIntent.getStringExtra("grandtotal");

        // TODO: 38. Ganti text dari txtTotal menjadi variabel total
        txtTotal.setText(total);

    }
}
