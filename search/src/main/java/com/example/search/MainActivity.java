package com.example.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Model> modelList;

    private RecyclerView mRecyclerView;
    private CustomAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createExampleList();
        buildRecyclerView();

        EditText editText = findViewById(R.id.edit_text);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }

    private void filter(String text) {
        ArrayList<Model> filteredList = new ArrayList<>();
        for (Model item : modelList) {
            if (item.getTitle().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
    }

    private void createExampleList() {
        modelList = new ArrayList<>();
        modelList.add(new Model("One", "Line 2"));
        modelList.add(new Model("Two", "Line 2"));
        modelList.add(new Model("Three", "Line 2"));
        modelList.add(new Model("Four", "Line 2"));
        modelList.add(new Model("Five", "Line 2"));
        modelList.add(new Model("Six", "Line 2"));
        modelList.add(new Model("Seven", "Line 2"));
        modelList.add(new Model("Eight", "Line 2"));
        modelList.add(new Model("Nine", "Line 2"));
    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        adapter = new CustomAdapter(modelList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(adapter);
    }


}
