package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uts_progmob.Adapter.DataMatkulAdapter;
import com.example.uts_progmob.Adapter.DataMhsAdapter;
import com.example.uts_progmob.Model.DataMatkul;
import com.example.uts_progmob.Model.DataMhs;

import java.util.ArrayList;

public class LihatDataMhs extends AppCompatActivity {
private RecyclerView recyclerView;
private DataMhsAdapter dataMhsAdapter;
private ArrayList<DataMhs> dataMhsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data_mhs);
        setTitle("Lihat Data Mahasiswa");

        addData();

        recyclerView = findViewById(R.id.rcMhs);
        dataMhsAdapter = new DataMhsAdapter(dataMhsArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(LihatDataMhs.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dataMhsAdapter);
    }

    private void addData(){
        dataMhsArrayList = new ArrayList<>();
        dataMhsArrayList.add(new DataMhs("72160071-Eben Haezer G", "Nologaten", "ebenhaezer688@gmail.com"));
        dataMhsArrayList.add(new DataMhs("72160025-Sombuk", "Seturan", "sombuk123@gmail.com"));
    }
}
