package com.example.recycleview_1918105;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images [] = {R.drawable.cplusplus,R.drawable.csam,R.drawable.java,R.drawable.javascript,
    R.drawable.kotlin,R.drawable.python,R.drawable.ruby,R.drawable.swift,R.drawable.typescript,
    R.drawable.visualstudio};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        s1 =getResources().getStringArray(R.array.programming_languages);
        s2 =getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
    }
}