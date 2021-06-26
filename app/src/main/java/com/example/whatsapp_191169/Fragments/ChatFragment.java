package com.example.whatsapp_191169.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp_191169.Adapters.ChatRecyclerViewAdapter;
import com.example.whatsapp_191169.Models.Chat;
import com.example.whatsapp_191169.R;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    List<Chat> chatList = new ArrayList<>();
    RecyclerView chatRecyclerView;
    ChatRecyclerViewAdapter chatRecyclerAdapter;


    public ChatFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        chatRecyclerView=view.findViewById(R.id.chat_recyclerView);
        chatList.add(new Chat("Nauman Ahmed","Hi, This is Nauman","11:41 am",R.drawable.img_nauman));
        chatList.add(new Chat("Ehtisham Ahmed","Ehtisham here!","11:50 am",R.drawable.img_ehtisham));
        chatList.add(new Chat("Afaq Ahmed","Afaq here!","11:55 am",R.drawable.img_afaq));
        chatList.add(new Chat("Ubaid Zahoor","Ubaid here!","12:25 pm",R.drawable.img_ubaid));
        chatList.add(new Chat("Moin Ud Din","Moin here!","1:15 pm",R.drawable.img_moin));
        chatList.add(new Chat("Taha Khan","Taha here!","2:49 pm",R.drawable.img_taha));

        chatRecyclerAdapter=new ChatRecyclerViewAdapter(chatList,getContext());
        chatRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        chatRecyclerView.setHasFixedSize(true);
        chatRecyclerView.setAdapter(chatRecyclerAdapter);

        return view;
    }
}