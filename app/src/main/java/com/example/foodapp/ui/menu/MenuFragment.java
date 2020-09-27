package com.example.foodapp.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.Controllers.MenuController;
import  com.example.foodapp.model.Menu.*;
import java.util.ArrayList;
import java.util.List;



public class MenuFragment extends Fragment {

    private RecyclerView recyclerView;
     public  MenuFragment(){

    }

    public View onCreateView( LayoutInflater inflater,

            ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        recyclerView =view.findViewById(R.id.food_RV);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new FoodListAdapter(this.getContext()));


        return  view;
    }
}



