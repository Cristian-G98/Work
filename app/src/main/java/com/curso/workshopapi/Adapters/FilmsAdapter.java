package com.curso.workshopapi.Adapters;

//Developed by Cristian 2020

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.curso.workshopapi.Models.Film;
import com.curso.workshopapi.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.ViewHolder> {

    Context context;
    List<Film> filmList;

    public FilmsAdapter(Context context, List<Film> filmList) {
        this.context = context;
        this.filmList = filmList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.film_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txt_title.setText(filmList.get(position).getTitle());
        holder.txt_episode_id.setText(String.valueOf(filmList.get(position).getEpidose_id()));
        holder.txt_opening_clawl.setText(filmList.get(position).getOpening_clawl());
        holder.txt_director.setText(filmList.get(position).getDirector());
        holder.txt_producer.setText(filmList.get(position).getProducer());
        holder.txt_url.setText(filmList.get(position).getRelease_date());
        holder.txt_creted.setText(filmList.get(position).getCreated());
        holder.txt_edited.setText(filmList.get(position).getEdited());
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_title, txt_episode_id, txt_opening_clawl, txt_director,
                txt_producer, txt_url ,txt_creted, txt_edited;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_title = itemView.findViewById(R.id.txt_title);
            txt_episode_id = itemView.findViewById(R.id.txt_episode_id);
            txt_opening_clawl = itemView.findViewById(R.id.txt_opening_claw);
            txt_director = itemView.findViewById(R.id.txt_director);
            txt_producer = itemView.findViewById(R.id.txt_producer);
            txt_url = itemView.findViewById(R.id.txt_url);
            txt_creted = itemView.findViewById(R.id.txt_created);
            txt_edited = itemView.findViewById(R.id.txt_edited);
        }
    }
}
