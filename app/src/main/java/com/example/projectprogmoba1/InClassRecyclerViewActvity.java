package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectprogmoba1.Adapter.InclassAdapter;
import com.example.projectprogmoba1.Model.Inclass;

import java.util.ArrayList;

public class InClassRecyclerViewActvity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private InclassAdapter inclassAdapter;
    private ArrayList<Inclass> inclassArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_class_recycler_view_actvity);
        addData();
        recyclerView = findViewById(R.id.rvInclass);
        inclassAdapter = new InclassAdapter(inclassArrayList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(InClassRecyclerViewActvity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(inclassAdapter);
    }

    private void addData(){
        inclassArrayList = new ArrayList<>();
        inclassArrayList.add(new Inclass(R.mipmap.ic_launcher_coba,"Ary","72170115","081"));
        inclassArrayList.add(new Inclass(R.mipmap.ic_launcher_coba2_round,"Ary2","72170116","082"));
        inclassArrayList.add(new Inclass(R.mipmap.ic_launcher_coba_round,"Ary3","72170117","083"));
        inclassArrayList.add(new Inclass(R.mipmap.ic_launcher_coba2,"Ary4","72170118","084"));
        inclassArrayList.add(new Inclass(R.mipmap.ic_launcher_coba,"Ary5","72170119","085"));

    }

}
