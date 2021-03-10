package com.example.bottom;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyRecycler extends RecyclerView.Adapter<MyViewHolder> {
    private List<Profesor> profesores;
    private View.OnClickListener oyente;


    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vista_profesor, parent, false);



        MiViewHolder vh = new MiViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt_nombre.setText(profesores.get(position).getNombre());
        holder.txt_asignatura.setText(profesores.get(position).getAsignatura());
        Picasso.get().load(profesores.get(position).getImagen()).into(holder.iv_foto);
    }



    public MiRecycler(List<Profesor> profesores, View.OnClickListener oyente) {
        this.profesores=profesores;
        this.oyente=oyente;
    }



    @Override
    public int getItemCount() {
        return profesores.size();
    }
}