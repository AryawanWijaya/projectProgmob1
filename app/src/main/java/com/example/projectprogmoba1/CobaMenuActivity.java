package com.example.projectprogmoba1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CobaMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_menu);

        //context menu
        String ContMenu [] ={"Ayam","Bebek","Kuda","Entog","Lele"};
        ListView listView = (ListView)findViewById(R.id.LstView1);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ContMenu);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }
    //nmpilin icon titik tiga diatas
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }
    //item selected option menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.item1){
            Toast.makeText(getApplicationContext(),"Ini Menu pertama diklik",Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent (CobaMenuActivity.this,ProteinTracker_layout.class);
//            startActivity(intent);
        }else if(item.getItemId()==R.id.item2) {
            Toast.makeText(getApplicationContext(), "Ini Menu kedua diklik", Toast.LENGTH_SHORT).show();
        }
        return true;
    }


    //Context menu

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Silahkan pilih");
        menu.add(0,v.getId(),0,"Simpan"); //groupId, itemId, order, tittle
        menu.add(0,v.getId(),0,"Tidak");
    }

    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Simpan"){
            Toast.makeText(getApplicationContext(),"pura-puranya item disimpan ke DB",Toast.LENGTH_SHORT).show();
        }else if(item.getTitle()=="Tidak"){
            Toast.makeText(getApplicationContext(),"Tidak disimpan ke DB",Toast.LENGTH_SHORT).show();
        }else{
            return false;
        }
        return true;
    }
}
