package com.example.tm_test1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Player_Adapter extends RecyclerView.Adapter<Player_Adapter.ViewHolder>{

    private ArrayList<Player_List> player_ArrayList;
    private Context context;
    private View.OnClickListener playerListener;

    public Player_Adapter(ArrayList<Player_List> player_ArrayList, Context context) {
        this.player_ArrayList = player_ArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Player_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.fragment_player__list,parent,false);
        return new Player_Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Player_Adapter.ViewHolder holder, int position) {

        holder.player_name.setText(player_ArrayList.get(position).getPlayer_name());
        holder.player_img.setText(player_ArrayList.get(position).getPlayer_img());
    }

    @Override
    public int getItemCount() {
        return player_ArrayList.size();
    }

    public void setOnClickListener(View.OnClickListener clickListener){

        playerListener = clickListener;

    }
}


