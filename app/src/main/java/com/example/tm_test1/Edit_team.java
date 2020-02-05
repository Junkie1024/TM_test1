package com.example.tm_test1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Edit_team extends Fragment {

    private RecyclerView edtplayerlist_recyclerview;
    private Context context;
    private ArrayList<Player_List> playerLists;
    private Player_Adapter playerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_edit_team, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        context = getActivity().getApplicationContext();

        edtplayerlist_recyclerview.findViewById(R.id.editplayerlist_recyclerview);
        playerLists = new ArrayList<Player_List>();
        playerLists.clear();

        playerLists.add(new Player_List("Player 1",R.drawable.football_player));
        playerLists.add(new Player_List("Player 2",R.drawable.football_player));
        playerLists.add(new Player_List("Player 3",R.drawable.football_player));
        playerLists.add(new Player_List("Player 4",R.drawable.football_player));

        playerAdapter = new Player_Adapter(playerLists,context);
        playerAdapter.notifyDataSetChanged();
        edtplayerlist_recyclerview.setLayoutManager(new LinearLayoutManager(context));
        edtplayerlist_recyclerview.setAdapter(playerAdapter);
    }
}
