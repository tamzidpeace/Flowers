package com.example.arafat.flowers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static RecyclerView recyclerView;
    private static RecyclerView.LayoutManager layoutManager;
    private static MyAdpater myAdpater;

    private int[] flower_image_id = {R.drawable.anemone, R.drawable.aster, R.drawable.azalea, R.drawable.calla_lily,
    R.drawable.dahlia, R.drawable.lily, R.drawable.orchidaceae, R.drawable.rose, R.drawable.water_lily,
            R.drawable.merigold};
    private String[] flower_name = {"Anemone", "Aster", "Azalea", "Calla_lily", "Dahlia", "Lily", "Orchidaceae",
    "Rose", "Water Lily", "Merigold"};

    private List<SetGet> mList = new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        //recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



        myAdpater = new MyAdpater(mList);
        recyclerView.setAdapter(myAdpater);



        // adding elements to the container(mList)

        for(int i=0; i<flower_image_id.length; i++) {
            mList.add(new SetGet(flower_image_id[i], flower_name[i]));
        }

    }
}
