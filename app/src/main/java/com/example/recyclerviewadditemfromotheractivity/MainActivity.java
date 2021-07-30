package com.example.recyclerviewadditemfromotheractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recyclerviewadditemfromotheractivity.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<ModelItemMurojaah> modelItemMurojaahArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        createMurojaahArrayList();
        buildRecyclerView();





        activityMainBinding.buttonNext.setOnClickListener(view1 -> {
            Intent intent = new Intent(getApplicationContext(), AddRecyclerViewItem.class);
            startActivity(intent);

        });
    }
    public void createMurojaahArrayList() {
        modelItemMurojaahArrayList = new ArrayList<>();
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("1", "Al-Fatihah", "1 - 7"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("2", "Al-Baqarah", "1 - 10"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("3", "Al-Kafirun", "1 - 5"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("4", "An-Naas", "1 - 4"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
        modelItemMurojaahArrayList.add(new ModelItemMurojaah("5", "Al-Fiil", "1 - 6"));
    }

    public void buildRecyclerView() {
        recyclerView = activityMainBinding.recyclerViewListMurojaah;
        layoutManager = new LinearLayoutManager(this);
        adapter = new RecyclcerViewAdapter(modelItemMurojaahArrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}