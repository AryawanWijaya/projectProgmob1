package com.example.projectprogmoba1.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectprogmoba1.Model.Mahasiswa;
import com.example.projectprogmoba1.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {
    public MahasiswaAdapter(ArrayList<Mahasiswa> mahasiswaArrayList) {
        this.mahasiswaArrayList = mahasiswaArrayList;
    }

    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs, parent,false);
        return new ViewHolder(view); //manggil kelas dibawah, denan isi parameter yang ada di cardView
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(mahasiswaArrayList.get(position).getNama());
        holder.txtNoHp.setText(mahasiswaArrayList.get(position).getNohp());
        holder.txtNpm.setText(mahasiswaArrayList.get(position).getNpm());
    }

    @Override
    public int getItemCount() {
        return (mahasiswaArrayList != null) ? mahasiswaArrayList.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;
        public ViewHolder(View view){
            super(view);
            txtNama= view.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm=view.findViewById(R.id.txt_npm_mahasiswa);
            txtNoHp=view.findViewById(R.id.txt_nohp_mahasiswa);
        }

    }
}
