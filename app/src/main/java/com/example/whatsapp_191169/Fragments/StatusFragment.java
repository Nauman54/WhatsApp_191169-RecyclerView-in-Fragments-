package com.example.whatsapp_191169.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp_191169.Adapters.ChatRecyclerViewAdapter;
import com.example.whatsapp_191169.Adapters.StatusRecyclerViewAdapter;
import com.example.whatsapp_191169.Models.Chat;
import com.example.whatsapp_191169.Models.Status;
import com.example.whatsapp_191169.R;

import java.util.ArrayList;
import java.util.List;

public class StatusFragment extends Fragment {

    List<Status> statusList = new ArrayList<>();
    RecyclerView statusRecyclerView;
    StatusRecyclerViewAdapter statusRecyclerAdapter;

    public StatusFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);

        statusRecyclerView=view.findViewById(R.id.status_recyclerView);
        statusList.add(new Status("Nauman Ahmed","11:41 am",R.drawable.img_nauman));
        statusList.add(new Status("Ehtisham Ahmed","11:50 am",R.drawable.img_ehtisham));
        statusList.add(new Status("Afaq Ahmed","11:50 am",R.drawable.img_afaq));
        statusList.add(new Status("Ubaid Zahoor","11:50 am",R.drawable.img_ubaid));
        statusList.add(new Status("Moin Ud Din","11:50 am",R.drawable.img_moin));
        statusList.add(new Status("Taha Khan","11:50 am",R.drawable.img_taha));

        statusRecyclerAdapter=new StatusRecyclerViewAdapter(statusList,getContext());
        statusRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        statusRecyclerView.setHasFixedSize(true);
        statusRecyclerView.setAdapter(statusRecyclerAdapter);

        return view;
    }
}