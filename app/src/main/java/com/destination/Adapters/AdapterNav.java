package com.destination.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;


import com.destination.Fragments.FragmentAccount;
import com.destination.Fragments.FragmentHome;
import com.destination.Fragments.FragmentMenuService;
import com.destination.Fragments.FragmentSavedLocation;
import com.destination.Fragments.FragmentSearch;
import com.destination.R;
import com.destination.UI.Home;

import java.util.Locale;


public class AdapterNav extends RecyclerView.Adapter<AdapterNav.Holder> {
    Context context;
    int lastPosition = 0;
    FragmentManager fm;
    SharedPreferences shard;
    public static String URL;
    private int [] Nave = new int[]{R.string.Home,R.string.search, R.string.Menu, R.string.SavedLocation, R.string.Account};



    public AdapterNav(Context context, FragmentManager fm) {
        this.context = context;
        this.fm = fm;

    }
    public Holder onCreateViewHolder(ViewGroup viewGroup, int position) {
        return new Holder(LayoutInflater.from(this.context).inflate(R.layout.item_nav, viewGroup, false));
    }

    public void onBindViewHolder(Holder holder, @SuppressLint("RecyclerView") final int position) {

        // handle action click on adapter

        holder.Name.setText(Nave[position]);

        if (position == lastPosition)
        {
            holder.Name.setBackgroundResource(R.drawable.back_logout2);

        }else {
            holder.Name.setBackgroundResource(R.drawable.back_logout);

        }

        holder.Name.setText(Nave[position]);
        holder.Name.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                lastPosition = position;
                notifyDataSetChanged();
                Handle_Click(position);
            }
        });

    }

    public int getItemCount() {
        return Nave.length;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Handle_Click(int Position_Click)
    {
        if (Position_Click == 0)
        {
            LoadFragment(new FragmentHome());
        }
        else if (Position_Click == 1)
        {
            LoadFragment(new FragmentSearch());
        }

        else if (Position_Click == 2)
        {
            LoadFragment(new FragmentMenuService());
        }else if(Position_Click == 3)
        {
            LoadFragment(new FragmentSavedLocation());
        }else if (Position_Click == 4)
        {
            LoadFragment(new FragmentAccount());
        }

        Home.drawer.close();
    }

    public void LoadFragment(Fragment fragment)
    {

        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.nav_host_fragment, fragment);
        transaction.commit();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView Name ;

        public Holder(View itemView) {
            super(itemView);

            Name       = itemView.findViewById(R.id.textView12);

        }

    }

}