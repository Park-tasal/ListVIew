package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        SingerAdapter adapter = new SingerAdapter();
        adapter.addItem(new SingerItem("소녀시대","010-0000-0000"));
        adapter.addItem(new SingerItem("소녀시대","010-0000-1000"));
        adapter.addItem(new SingerItem("소녀시대","010-0000-2000"));
        adapter.addItem(new SingerItem("소녀시대","010-0000-3000"));
        adapter.addItem(new SingerItem("소녀시대","010-0000-4000"));
        adapter.addItem(new SingerItem("소녀시대","010-0000-5000"));

        listView.setAdapter(adapter);
    }



}