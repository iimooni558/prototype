package com.destination.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.destination.R;
import com.destination.UI.ChatUI;

import java.util.ArrayList;


public class AdapterUsersChat extends RecyclerView.Adapter<AdapterUsersChat.Holder> {

    Context context;
    int lastPosition;
   // ArrayList<UsersModel> users;
  //  FirebaseAuth auth;
    public AdapterUsersChat(Context context //, ArrayList<UsersModel> users
    ) {
        this.context        = context;
     //   this.users          = users;
     //   auth                = FirebaseAuth.getInstance();

    }

    public Holder onCreateViewHolder(ViewGroup viewGroup, int position) {
        return new Holder(LayoutInflater.from(this.context).inflate(R.layout.item_users_chat, viewGroup, false));
    }

    public void onBindViewHolder(Holder holder, final int position) {

       //holder.Title.setText(users.get(position).getName());

        holder.Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, ChatUI.class)
                      //  .putExtra("ID_rec",users.get(position).getId())
                     //   .putExtra("Name_Recive",users.get(position).getName())
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });

    }

    public int getItemCount() {
        return 10;
                //users.size();
    }


    class Holder extends RecyclerView.ViewHolder {
        TextView Title , delete;
        ImageView img;
        public Holder(View itemView) {
            super(itemView);

            Title       = itemView.findViewById(R.id.textView6);
            delete        = itemView.findViewById(R.id.textView7);
        }

    }

}