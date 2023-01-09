package com.destination.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destination.Adapters.AdapterUsersChat;
import com.destination.R;

public class UsersChats extends AppCompatActivity {

    RecyclerView rec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_chats);

        rec     = findViewById(R.id.rec);

        Init();
    }

    public void  Init()
    {
        AdapterUsersChat adapterUsersChat = new AdapterUsersChat(this);
        rec.setLayoutManager(new LinearLayoutManager(this));
        rec.setAdapter(adapterUsersChat);
    }
}