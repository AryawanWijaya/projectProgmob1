package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectprogmoba1.Adapter.TugasAdapter;
import com.example.projectprogmoba1.Model.Tugas;

import java.util.ArrayList;

public class TugasRecycleViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TugasAdapter tugasAdapter;
    private ArrayList<Tugas> tugasArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_recycle_view);
        addData();
        recyclerView = findViewById(R.id.rvTugas);
        tugasAdapter=new TugasAdapter(tugasArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(TugasRecycleViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(tugasAdapter);
    }

    private void addData(){
        tugasArrayList =new ArrayList<>();
        tugasArrayList.add(new Tugas(R.drawable.beni,"Beni Mulia Tabarus","72170177","Pria","Basket","Membanggakan orang tua","Just do it"));
        tugasArrayList.add(new Tugas(R.drawable.eva,"Eva Kristina","72170091","Wanita","Bermain game","Animal rescuer & Membantu orang lain","Kalo laper ya makan, kalo ngantuk ya tidur, kalo kangen yauda, dia uda sama yg lain"));
        tugasArrayList.add(new Tugas(R.drawable.monic,"Monica carista","72170133","Wanita","Main game, Nonton animasi kura2, Ghibah","Menjadi lebih berguna bagi keluarga","Jangan Banyak Bacod"));
        tugasArrayList.add(new Tugas(R.drawable.grace,"Grace Hutabarat","72170171","Wanita","Olahraga","Jadi pemimpin","Nikmati prosesnya"));
        tugasArrayList.add(new Tugas(R.drawable.michael,"Michael Gerald","7217010","Pria","Basket + baca buku","Buat bisnis","Jangan menyerah sebelum berhasil"));

    }
}
