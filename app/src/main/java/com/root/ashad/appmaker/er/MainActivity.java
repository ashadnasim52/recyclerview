package com.root.ashad.appmaker.er;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goaadt");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goadat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goadat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goaassdt");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goassdat");
        animalNames.add("Goaassdt");
        animalNames.add("Goat");
        animalNames.add("Goasdat");
        animalNames.add("Gadoat");
        animalNames.add("Goat");
        animalNames.add("Goaadadaaadt");
        animalNames.add("Godadadat");
        animalNames.add("Gosadaat");
        animalNames.add("Goaasdt");
        animalNames.add("Goaat");
        animalNames.add("Goaasdat");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

//        recyclerView.addItemDecoration(
//                new DividerItemDecoration(getApplicationContext(), R.drawable.my_divider));
//        recyclerView.addItemDecoration(new DividerItemDecoration(getAct,R.drawable.my_divider));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
            DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);



    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
