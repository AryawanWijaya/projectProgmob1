package com.example.projectprogmoba1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectprogmoba1.Model.Tugas;
import com.example.projectprogmoba1.R;

import java.util.ArrayList;

public class TugasAdapter extends RecyclerView.Adapter<TugasAdapter.ViewHolder>{

    public  TugasAdapter (ArrayList<Tugas>tugasArrayList){
        this.tugasArrayList=tugasArrayList;
    }
    private ArrayList<Tugas> tugasArrayList;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_tugas,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.fotoTemen.setImageResource(tugasArrayList.get(position).getFotoTemen());
        holder.txtNamaTemen.setText(tugasArrayList.get(position).getNamaTemen());
        holder.txtNimTemen.setText(tugasArrayList.get(position).getNimTemen());
        holder.txtGenderTemen.setText(tugasArrayList.get(position).getGenderTemen());
        holder.txtHobiTemen.setText(tugasArrayList.get(position).getHobiTemen());
        holder.txtCitaCitaTemen.setText(tugasArrayList.get(position).getCitaCitaTemen());
        holder.txtMotoTemen.setText(tugasArrayList.get(position).getMotoTemen());
    }

    @Override
    public int getItemCount() {
        return (tugasArrayList !=null)?tugasArrayList.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView fotoTemen;
        private TextView txtNamaTemen,txtNimTemen,txtGenderTemen,txtHobiTemen,txtCitaCitaTemen,txtMotoTemen;
        public ViewHolder(View view){
            super(view);
            fotoTemen = view.findViewById(R.id.fotoTemen);
            txtNamaTemen= view.findViewById(R.id.txtNamaTemen);
            txtNimTemen=view.findViewById(R.id.txtNimTemen);
            txtGenderTemen=view.findViewById(R.id.txtGenderTemen);
            txtHobiTemen=view.findViewById(R.id.txtHobiTemen);
            txtCitaCitaTemen=view.findViewById(R.id.txtCitaCitaTemen);
            txtMotoTemen=view.findViewById(R.id.txtMotoTemen);
        }

    }
}
