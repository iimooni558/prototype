package com.destination.Adapters;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.destination.Fragments.FragmentMenuService;
import com.destination.R;
import com.destination.UI.AddAlert;
import com.destination.UI.AddEvent;
import com.destination.UI.AddRating;
import com.destination.UI.Home;
import com.destination.UI.Inform;
import com.destination.UI.UsersChats;


public class AdapterRecMenu extends RecyclerView.Adapter<AdapterRecMenu.Holder> {
    Context context;
    int lastPosition = 0;
    FragmentManager fm;
    SharedPreferences shard;
    public static String URL;
    private int [] list = new int[]{R.string.chat,R.string.Share_info,R.string.Tour,R.string.Alternative_route,
            R.string.Call, R.string.inform};

    private int [] Pic = new int[]{R.drawable.chat,R.drawable.share_information,R.drawable.tour,R.drawable.alternative_route,
            R.drawable.call, R.drawable.inform};

    public AdapterRecMenu(Context context) {
        this.context = context;
        this.fm = fm;

    }
    public Holder onCreateViewHolder(ViewGroup viewGroup, int position) {
        return new Holder(LayoutInflater.from(this.context).inflate(R.layout.item_menu, viewGroup, false));
    }

    public void onBindViewHolder(Holder holder, final int position) {

        // handle action click on adapter

        holder.Name.setText(list[position]);
        holder.img.setImageResource(Pic[position]);

        holder.Name.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {

                Handle_Click(position);

            }
        });

    }

    public int getItemCount() {
        return list.length;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Handle_Click(int Position_Click)
    {
        if (Position_Click == 0)
        {
            context.startActivity(new Intent(context, UsersChats.class));

        }
        else if (Position_Click == 1)
        {
            context.startActivity(new Intent(context, AddRating.class));
        }
        else if (Position_Click == 2)
        {
            context.startActivity(new Intent(context, AddEvent.class));

        } else if (Position_Click == 3)
        {
            context.startActivity(new Intent(context, AddAlert.class));

        }else if (Position_Click == 4)
        {
           // context.startActivity(new Intent(context, AddAlert.class));
        }
        else if (Position_Click == 5)
        {
            context.startActivity(new Intent(context, Inform.class));
        }
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView Name ;
        ConstraintLayout lay;
        ImageView img;
        public Holder(View itemView) {
            super(itemView);

            Name       = itemView.findViewById(R.id.textView9);
            lay        = itemView.findViewById(R.id.constraintLayout2);
            img        = itemView.findViewById(R.id.imageView);

        }

    }

}