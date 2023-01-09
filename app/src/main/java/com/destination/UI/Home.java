package com.destination.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.destination.Adapters.AdapterNav;
import com.destination.Fragments.FragmentHome;
import com.destination.R;

public class Home extends AppCompatActivity {

    public static DrawerLayout drawer;
    RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawer       = findViewById(R.id.drawer_layout);
        rec         = findViewById(R.id.rec_menu);

        FragmentHome frag = new FragmentHome();
        LoadFragment(frag);

        FragmentManager manager = getSupportFragmentManager();
        AdapterNav nav = new AdapterNav(this, manager);
        rec.setLayoutManager(new LinearLayoutManager(this));
        rec.setAdapter(nav);

    }

    public void toogle(View view)
    {
        drawer.openDrawer(GravityCompat.START);
    }

    public void LoadFragment(Fragment fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment , fragment);
        transaction.commit();
    }

    public void Logout(View view)
    {
        startActivity(new Intent(this,Login.class));
    }

}