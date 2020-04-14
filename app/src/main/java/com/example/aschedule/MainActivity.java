package com.example.aschedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<KumpulanData> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recview);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<KumpulanData>();

        data.add(new KumpulanData("SENIN :","1. ISU DAN PRINSIP PROTEKSI TI\n\t\t\tJAM : 08:30-10.10\n\t\t\tRUANG.TI 202\n\n2. ANALISIS DAN DESAIN SISTEM\n\t\t\tJAM : 11:00-13:30\n\t\t\tRUANG.AULA 2"));
        data.add(new KumpulanData("SELASA :","1. KECERDASAN TIRUAN\n\t\t\tJAM : 08:30-11.00\n\t\t\tRUANG.TI 102\n\n2. INTEGRASI DAN MIGRASI SISTEM\n\t\t\tJAM : 11:00-13:30\n\t\t\tRUANG.TI 202"));
        data.add(new KumpulanData("RABU :","1. PEMROGRAMAN MOBILE\n\t\t\tJAM : 08:00-11:00\n\t\t\tRUANG.TI 102"));
        data.add(new KumpulanData("KAMIS :","1. IT SERVICE MANAGEMENT\n\t\t\tJAM : 11:00-13:30\n\t\t\tRUANG.TI 203B"));
        data.add(new KumpulanData("JUMAT :","1. PULANG KAMPUNG\n\t\t\tJAM : 08:00-13:30\n\t\t\tKE GIANYAR"));
        mAdapter = new myAdapter(this,data);

        recyclerView.setAdapter(mAdapter);
    }
}
