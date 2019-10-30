package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListMhsActivity extends AppCompatActivity {

    String [] mhs ={"Riyan Mozes Sahetapy","Brian Eldrin Sombuk","Elias Aru F. Langer",
            "Aditya Halimawan","Immanuel Harold Maga","Eben Haezer Gultom",
            "Yosua Erick Gunawan","Eva Kristina","Jonathan Prajna Marga Parama",
            "Emma Norren Cahya Putri","Michael Gerardi Adji","Cynthia Kumalasari",
            "Nikolaus Aryawan Ravato Wijaya","Daniel Surya Nugraha","Lionrico Sanjay Exauvida Jeipy",
            "Jonathan Alvin Ananto","Monica Carista","Didimus Candra Gased",
            "Valeriana Tanesha Indra S","Ivan Bernov","Friska F. Nainggolan",
            "Grace Hutabarat","Beni Mulia Tabarus"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mhs);
        Button addMhs = findViewById(R.id.btnAddMhs);
        final Button editMhs = findViewById(R.id.btnEdit);
        ListView listMhs = findViewById(R.id.ListMhs);

        listMhs.setAdapter(new ArrayAdapter<String>(ListMhsActivity.this,android.R.layout.simple_list_item_1,mhs));
        listMhs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListMhsActivity.this,"Anda telah memilih mahasiswa= "+mhs[i],Toast.LENGTH_LONG).show();
            }
        });

        addMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMhsActivity.this,CreadMhsActivity.class);
                startActivity(intent);
            }
        });
        editMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ListMhsActivity.this,EditMhsActivity.class);
                startActivity(intent);
            }
        });

        ListView listView = (ListView)findViewById(R.id.ListMhs);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mhs);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    //utk context menu, jika list ditahan lama keluar pilihan menunya
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Pilih Menumu");
        menu.add(0,v.getId(),0,"Create"); //groupId, itemId, order, tittle
        menu.add(0,v.getId(),0,"Edit");
    }

    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Create"){
            Intent intent = new Intent(ListMhsActivity.this, CreadMhsActivity.class);
            startActivity(intent);
//            Toast.makeText(getApplicationContext(),"pura-puranya item disimpan ke DB",Toast.LENGTH_SHORT).show();
        }else if(item.getTitle()=="Edit"){
            Intent intent = new Intent(ListMhsActivity.this, EditMhsActivity.class);
            startActivity(intent);
//            Toast.makeText(getApplicationContext(),"Tidak disimpan ke DB",Toast.LENGTH_SHORT).show();
        }else{
            return false;
        }
        return true;
    }
}
