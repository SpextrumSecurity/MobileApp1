package com.sewa.mobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sewa.mobil.domain.Pelanggan;

import java.util.ArrayList;
import java.util.List;

public class PelangganActivity extends AppCompatActivity {

    ListView lvPelanggan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelanggan);

        lvPelanggan = (ListView) findViewById(R.id.lv_pelanggan);

        String[] arrPelanggan = {"Pelanggan 1", "Pelanggan 2", "Pelanggan 3"};

//        ArrayAdapter adapter =
//                new ArrayAdapter(
//                        this,
//                        android.R.layout.simple_list_item_1,
//                        arrPelanggan);
//
//        lvPelanggan.setAdapter(adapter);

        Pelanggan pelanggan1 = new Pelanggan();
        pelanggan1.setNama("John Doe");
        pelanggan1.setTelp("0899912322");

        Pelanggan pelanggan2 = new Pelanggan();
        pelanggan2.setNama("Jonathan Doe");
        pelanggan2.setTelp("08912312394");

        List<Pelanggan> pelanggansYgMauDikirim = new ArrayList<>();
        pelanggansYgMauDikirim.add(pelanggan1);
        pelanggansYgMauDikirim.add(pelanggan2);

        ListPelangganAdapter pelangganAdapter =
                new ListPelangganAdapter(
                        this, pelanggansYgMauDikirim
                )
                ;

        lvPelanggan.setAdapter(pelangganAdapter);
    }
}
