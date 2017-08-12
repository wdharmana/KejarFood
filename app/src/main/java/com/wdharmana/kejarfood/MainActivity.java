package com.wdharmana.kejarfood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    // TODO: 1. Definisikan variabel Button btnAddCart, btnPlus, btnMin, btnEmpty, btnOrder. Contoh: Button btnAddCart

    // TODO: 2. Definisikan variabel TextView txtResult, txtTotal

    // TODO: 3. Definisikan variabel EditText edtName, edtPrice, edtQty

    // TODO: 17. Buat variabel Integer bernama grandTotal dan bernilai awal = 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // TODO: 8. Panggil method setupUI

        // TODO: 23. Tambahkan event onclick pada btnAddCart menggunakan setOnClickListener dan jalankan fetchData()

        // TODO: 26. Tambahkan event onclick pada btnPlus dengan setOnClickListener dan jalankan qtyPlus()

        // TODO: 27. Tambahkan event onclick pada btnMin dengan setOnClickListener dan jalankan qtyMin()

        // TODO: 29. Tambahkan event onclick pada btnEmpty dengan setOnClickListener dan jalankan empty()

        // TODO: 34. Tambahkan event onclick pada btnOrder dengan setOnClickListener dan jalankan processOrder()

    }

    // TODO: 30. Buat method void bernama processOrder tanpa parameter untuk memproses order
    // TODO: 31. Inisialisasi sebuah variabel bernama openIntent dengan tipe data Intent
    // TODO: 32. Pada openIntent, tambahkan extra bernama grandtotal dengan value String dari variabel grandTotal
    // TODO: 33. startActivity dengan openIntent


    // TODO: 24. Buat method qtyPlus untuk menambahkan nilai dari txtQty


    // TODO: 25. Buat method qtyPlus untuk mengurangi nilai dari txtQty


    // TODO: 4. Buatlah sebuah method dengan nama setupUI,tanpa parameter dan return void

    // TODO: 5. Definisikan komponen dari btnAddCart, btnPlus, btnMin,btnEmpty,btnOrder menggunakan findViewById

    // TODO: 6. Definisikan komponen dari txtResult,txtTotal,txtQty menggunakan findViewById

    // TODO: 7. Definisikan komponen dari edtName, edtPrice menggunakan findViewById



    // TODO: 9. Buat method dengan nama fetchData, tanpa parameter dan return void

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



    // TODO: 19. Buat method bernama money, return String, parameter Integer val.

    // TODO: 28. Buat method void bernama empty tanpa parameter untuk mengosongkan list


}
