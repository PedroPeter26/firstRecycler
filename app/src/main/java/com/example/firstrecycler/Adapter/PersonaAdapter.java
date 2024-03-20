package com.example.firstrecycler.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstrecycler.Model.Mascota;
import com.example.firstrecycler.Model.Persona;
import com.example.firstrecycler.R;

import java.util.List;

// Extender las clases necesarias con ayuda del foco rojo
public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder> {

    List<Persona> miLista;
    Persona p;
    Mascota m;
    View view;

    public PersonaAdapter(List<Persona> miLista){
        this.miLista = miLista;
    } // Aquí llega la info, por el constructor

    @NonNull
    @Override // Retorna un viewholder
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext()); //Crea vistas a través de los XML
        View view = layoutInflater.inflate(R.layout.recicladordepibes, parent, false);
        return new ViewHolder(view); //Para evitar crear otro viewHolder solo lo pasas en el return
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Persona persona = miLista.get(position);
        holder.setdata(persona); // se marca que se cree el método "setdata" en ViewHolder
    }

    @Override
    public int getItemCount() {
        return miLista.size();
    }

    //Adaptador ya hecho después de implementarle el ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView edad;
        TextView correo;
        TextView mascota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            edad = itemView.findViewById(R.id.edad);
            correo = itemView.findViewById(R.id.correo);
            mascota = itemView.findViewById(R.id.mascota);
            view = itemView;
        }

        public void setdata(Persona persona) {
            p = persona;
            nombre.setText(persona.getNombre());
            edad.setText(persona.getEdad().toString());
            correo.setText(persona.getCorreo());
            mascota.setText(persona.getMascota().getNombre());
            view.setBackgroundColor(persona.getColor());
        }
    }
}
