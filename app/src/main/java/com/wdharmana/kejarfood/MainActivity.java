package com.wdharmana.kejarfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // TODO: 1. Definisikan variabel Button btnAddCart, btnPlus, btnMin, btnEmpty, btnOrder. Contoh: Button btnAddCart
    Button btnAddCart, btnPlus, btnMin, btnEmpty, btnOrder;

    // TODO: 2. Definisikan variabel TextView txtResult, txtTotal
    TextView txtResult, txtTotal, txtQty;

    // TODO: 3. Definisikan variabel EditText edtName, edtPrice, edtQty
    EditText edtName, edtPrice;

    // TODO: 17. Buat variabel Integer bernama grandTotal dan bernilai awal = 0
    Integer grandTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // TODO: 8. Panggil method setupUI
        setupUI();

        // TODO: 23. Tambahkan event onclick pada btnAddCart menggunakan setOnClickListener dan jalankan fetchData()
        btnAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchData();
            }
        });



        // TODO: 26. Tambahkan event onclick pada btnPlus dengan setOnClickListener dan jalankan qtyPlus()
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyPlus();
            }
        });

        // TODO: 27. Tambahkan event onclick pada btnMin dengan setOnClickListener dan jalankan qtyMin()
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyMin();
            }
        });

        // TODO: 29. Tambahkan event onclick pada btnEmpty dengan setOnClickListener dan jalankan empty()
        btnEmpty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty();
            }
        });

        // TODO: 34. Tambahkan event onclick pada btnOrder dengan setOnClickListener dan jalankan processOrder()
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOrder();
            }
        });

    }

    // TODO: 30. Buat method void bernama processOrder tanpa parameter untuk memproses order
    // TODO: 31. Inisialisasi sebuah variabel bernama openIntent dengan tipe data Intent
    // TODO: 32. Pada openIntent, tambahkan extra bernama grandtotal dengan value String dari variabel grandTotal
    // TODO: 33. startActivity dengan openIntent
    private void processOrder() {
        Intent openIntent = new Intent(MainActivity.this, OrderActivity.class);
        openIntent.putExtra("grandtotal", String.valueOf(grandTotal) );
        startActivity(openIntent);
    }

    // TODO: 24. Buat method qtyPlus untuk menambahkan nilai dari txtQty
    private void qtyPlus() {
        Integer qty = Integer.parseInt(txtQty.getText().toString());
        qty++;
        txtQty.setText(String.valueOf(qty));
    }

    // TODO: 25. Buat method qtyPlus untuk mengurangi nilai dari txtQty
    private void qtyMin() {
        Integer qty = Integer.parseInt(txtQty.getText().toString());
        qty--;
        txtQty.setText(String.valueOf(qty));
    }

    // TODO: 4. Buatlah sebuah method dengan nama setupUI,tanpa parameter dan return void
    private void setupUI() {
        // TODO: 5. Definisikan komponen dari btnAddCart, btnPlus, btnMin,btnEmpty,btnOrder menggunakan findViewById
        btnAddCart  = (Button) findViewById(R.id.btnAddCart);
        btnPlus     = (Button) findViewById(R.id.btnPlus);
        btnMin      = (Button) findViewById(R.id.btnMin);
        btnEmpty    = (Button) findViewById(R.id.btnEmpty);
        btnOrder    = (Button) findViewById(R.id.btnOrder);

        // TODO: 6. Definisikan komponen dari txtResult,txtTotal,txtQty menggunakan findViewById
        txtResult   = (TextView) findViewById(R.id.txtResult);
        txtTotal    = (TextView) findViewById(R.id.txtTotal);
        txtQty    = (TextView) findViewById(R.id.txtQty);

        // TODO: 7. Definisikan komponen dari edtName, edtPrice menggunakan findViewById
        edtName     = (EditText) findViewById(R.id.edtName);
        edtPrice    = (EditText) findViewById(R.id.edtPrice);
    }

    // TODO: 9. Buat method dengan nama fetchData, tanpa parameter dan return void
    private void fetchData() {
        String dataName     = edtName.getText().toString();
        Integer dataPrice   = Integer.valueOf(edtPrice.getText().toString());
        Integer dataQty     = Integer.valueOf(txtQty.getText().toString());

        addList(dataName, dataPrice, dataQty);
    }
    // TODO: 10. Dalam fetchData, buat variabel local String dataName yang diambil dari edtName dengan getText
    // TODO: 11. Buat variabel local Integer dataPrice dan dataQty yang diambil dari edtPrice dan edtQty
    // TODO: 12. Tambahkan Integer.valueOf untuk mendefinisikan variabel dataPrice dan dataQty

    // TODO: 22. Jalankan method addList dengan parameter dari variabel dataName, dataPrice , dataQty

    // TODO: 13. Buatlah method void bernama addList, parameternya String name, Integer price dan Integer qty
    // TODO: 14. Buat variabel lokal Integer bernama total dengan rumus price dikali qty
    // TODO: 15. Buat variabel lokal String bernama newList = name + " ("+price+" x "+qty+" = "+total+")\n";
    // TODO: 16. Ganti text dari txtResult menggunakan setText dengan value currentList + newList
    // TODO: 18. Tambah nilai grandTotal dengan cara grandTotal+=total

    // TODO: 20. Ganti text dari txtTotal menggunakan setText dengan value money(grandTotal)

    private void addList(String name, Integer price, Integer qty) {
        Integer total   = price * qty;

        String newList = name + " ("+price+" x "+qty+" = "+total+")\n";

        String currentList = txtResult.getText().toString();

        txtResult.setText(currentList+newList);

        grandTotal+=total;
        txtTotal.setText(money(grandTotal));
    }

    // TODO: 19. Buat method bernama money, return String, parameter Integer val.
    private String money(Integer val) {
        return NumberFormat.getNumberInstance(Locale.UK).format(val);
    }

    // TODO: 28. Buat method void bernama empty tanpa parameter untuk mengosongkan list
    private void empty() {
        txtResult.setText("");
        grandTotal = 0;
        txtTotal.setText(money(grandTotal));
    }

}
