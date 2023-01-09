package com.destination.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destination.Adapters.AdapterRecInform;
import com.destination.Adapters.AdapterRecMenu;
import com.destination.R;

public class Inform extends AppCompatActivity {

    RecyclerView rec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform);

        rec             = findViewById(R.id.rec);


        Init();
    }

    public void Init()
    {
        AdapterRecInform adapterRecMenu = new AdapterRecInform(this);
        rec.setLayoutManager(new GridLayoutManager(this,2));
        rec.setAdapter(adapterRecMenu);
    }

}