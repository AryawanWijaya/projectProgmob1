package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv = findViewById(R.id.lvLoremIpsum);
        Spinner spinner = findViewById(R.id.spinnerProgmob);

        //utk perantara xml dan data di activity menggunakan adapter
        lv.setAdapter(new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1,items));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { // i= urutan list dari atas, index ke brp
                // list view dan recycle view tidak bs akses nama listnya, tapi yang bisa diakses posisi indexnya
                Toast.makeText(ListActivity.this,"Anda memilih= "+items[i],Toast.LENGTH_LONG).show();
            }
        });

        ArrayAdapter<String> aa = new ArrayAdapter<>(ListActivity.this,android.R.layout.simple_list_item_1,items);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this,"Anda memilih= "+items[i],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(ListActivity.this,"Anda tidak memilih ",Toast.LENGTH_LONG).show();
            }
        });
    }
}
