package com.example.tm_test1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Add_Player extends Fragment implements View.OnClickListener {

    public NavController navController;
    public Context context;
    ImageView pro_pic;
    Button btn_cancel,btn_addplayer;
    EditText name,position,strength;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add__player, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        navController = Navigation.findNavController(getActivity(),R.id.host_fragment);
        context = getActivity().getApplicationContext();

        btn_addplayer = view.findViewById(R.id.btn_add_player);
        btn_addplayer.setOnClickListener(this);

        btn_cancel = view.findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btn_addplayer){
            navController.navigate(R.id.player_List);
        }
        else if(v == btn_cancel){
            navController.navigate(R.id.player_List);
        }
    }
}
