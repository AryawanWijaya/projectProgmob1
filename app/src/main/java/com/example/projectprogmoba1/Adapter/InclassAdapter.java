package com.example.projectprogmoba1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectprogmoba1.Model.Inclass;
import com.example.projectprogmoba1.R;


import java.util.ArrayList;

public class InclassAdapter extends RecyclerView.Adapter<InclassAdapter.ViewHolder>{
    public InclassAdapter(ArrayList<Inclass> inclassArrayList) {
        this.inclassArrayList = inclassArrayList;
    }
    private ArrayList<Inclass> inclassArrayList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        //inflater utk membaca file xmlnya, disimpan ke view krn kita mau pake kelas ViewHolder yg
        //paramnya view
        View view =layoutInflater.inflate(R.layout.card_view_inclass,parent,false);
        return new ViewHolder(view); //memanggil kelas ViewHolder dengan param hasil inflater
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageViewInclass.setImageResource(inclassArrayList.get(position).getAndroidImage());
        holder.txtNamaInclass.setText(inclassArrayList.get(position).getNamaInclass());
        holder.txtNoHpInclass.setText(inclassArrayList.get(position).getNoHpInclass());
        holder.txtNimInclass.setText(inclassArrayList.get(position).getNimInclass());
    }

    @Override
    public int getItemCount() {
        return (inclassArrayList !=null)?inclassArrayList.size():0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewInclass;
        private TextView txtNamaInclass, txtNimInclass, txtNoHpInclass;
        public ViewHolder(View view){
            super(view);
            imageViewInclass = view.findViewById(R.id.img_inclass);
            txtNamaInclass= view.findViewById(R.id.txt_inclass_nama);
            txtNimInclass=view.findViewById(R.id.txt_inclass_nim);
            txtNoHpInclass=view.findViewById(R.id.txt_inclass_noHp);
        }

    }
}
