package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataModel>d = new ArrayList<DataModel>();

    RecyclerView recyclerView;

    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        populateData();
        recyclerViewAdapter = new RecyclerViewAdapter(d);

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(recyclerViewAdapter);

    }
       void populateData(){
            d.add(new DataModel("img",R.drawable.albert));
           d.add(new DataModel("img",R.drawable.albert));
           d.add(new DataModel("img",R.drawable.albert));
           d.add(new DataModel("img",R.drawable.albert));
           d.add(new DataModel("img",R.drawable.albert));





    }
}