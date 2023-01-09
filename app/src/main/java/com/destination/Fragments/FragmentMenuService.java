package com.destination.Fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.destination.Adapters.AdapterRecMenu;
import com.destination.R;

public class FragmentMenuService  extends Fragment {

    RecyclerView rec;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.frag_menu_service, container, false);

        rec       = root.findViewById(R.id.rec);

        Init();

        return root;

    }


    public void Init()
    {
        AdapterRecMenu adapterRecMenu = new AdapterRecMenu(getActivity());
        rec.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rec.setAdapter(adapterRecMenu);
    }

}
