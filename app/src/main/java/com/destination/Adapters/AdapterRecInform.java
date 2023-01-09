package com.destination.Adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.destination.R;


public class AdapterRecInform extends RecyclerView.Adapter<AdapterRecInform.Holder> {
    Context context;
    int lastPosition = 0;
    FragmentManager fm;
    SharedPreferences shard;
    public static String URL;
    private int [] list = new int[]{R.string.crowd,R.string.police,R.string.accident,R.string.construction,
            R.string.Speed, R.string.closed};

    private int [] Pic = new int[]{R.drawable.crowd,R.drawable.police_car,R.drawable.accident,R.drawable.construction,
            R.drawable.speed_traps, R.drawable.closed_road};


    public AdapterRecInform(Context context) {
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

        if (Position_Click == 5)
        {

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