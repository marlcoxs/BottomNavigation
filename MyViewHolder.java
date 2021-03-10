package com.example.bottom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder extends MiRecycler.ViewHolder{
    TextView tv_nombre;
    TextView tv_asignatura;
    ImageView iv_foto;
    public MyViewHolder(View itemView) {//La vista que recibe es el del layout creado para mostrar contactos
        super(itemView);
        tv_nombre= itemView.findViewById(R.id.txt_nombre);
        tv_asignatura= itemView.findViewById(R.id.txt_asignatura);
        iv_foto= itemView.findViewById(R.id.id_img);

    }

}
