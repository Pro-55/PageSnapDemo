package com.example.admin.pagesnapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> data = new ArrayList<>();

        for (int x = 0; x < 1000; x++) {
            data.add(String.valueOf(x));
        }

        // set up the RecyclerView
        RecyclerView idRvSnapRecycler = findViewById(R.id.idRvSnapRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        adapter = new MyAdapter(this, data);
        idRvSnapRecycler.setLayoutManager(layoutManager);
        idRvSnapRecycler.setAdapter(adapter);
        //SnapHelper for snapping effect of pages
        SnapHelper mySnapHelper = new PagerSnapHelper();
        mySnapHelper.attachToRecyclerView(idRvSnapRecycler);
    }
}
