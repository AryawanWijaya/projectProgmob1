package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectprogmoba1.Adapter.MahasiswaAdapter;
import com.example.projectprogmoba1.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    public MahasiswaAdapter mahasiswaAdapter;
    public ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        addData();
        recyclerView =findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter =new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);

    }

    private void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Cok","123","081"));
        mahasiswaArrayList.add(new Mahasiswa("Cak","124","082"));
        mahasiswaArrayList.add(new Mahasiswa("Cik","125","083"));
        mahasiswaArrayList.add(new Mahasiswa("Cek","126","084"));
        mahasiswaArrayList.add(new Mahasiswa("Cuk","127","085"));

    }
}
