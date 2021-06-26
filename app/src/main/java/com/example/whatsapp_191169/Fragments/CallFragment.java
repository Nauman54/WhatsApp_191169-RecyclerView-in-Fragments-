package com.example.whatsapp_191169.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp_191169.Adapters.CallRecyclerViewAdapter;
import com.example.whatsapp_191169.Models.Call;
import com.example.whatsapp_191169.R;

import java.util.ArrayList;
import java.util.List;

public class CallFragment extends Fragment {

    List<Call> callList = new ArrayList<>();
    RecyclerView callRecyclerView;
    CallRecyclerViewAdapter callRecyclerAdapter;

    public CallFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_call, container, false);

        callRecyclerView=view.findViewById(R.id.call_recyclerView);

        callList.add(new Call("Ubaid Zahoor","Today, 11:33 am",R.drawable.img_ubaid,R.drawable.outgoingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Ubaid Zahoor","24 June, 11:11 am",R.drawable.img_ubaid,R.drawable.missedcall_icon,R.drawable.call_icon));
        callList.add(new Call("Ubaid Zahoor","24 June, 11:02 am",R.drawable.img_ubaid,R.drawable.incomingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Afaq Ahmed","23 June, 10:55 pm",R.drawable.img_afaq,R.drawable.outgoingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Ehtisham Ahmed","23 June, 7:24 pm",R.drawable.img_ehtisham,R.drawable.incomingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Ehtisham Ahmed","23 June, 11:04 pm",R.drawable.img_ehtisham,R.drawable.missedcall_icon,R.drawable.call_icon));
        callList.add(new Call("Ehtisham Ahmed","22 June, 5:37 pm",R.drawable.img_ehtisham,R.drawable.incomingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Afaq Ahmed","22 June, 11:37 pm",R.drawable.img_afaq,R.drawable.outgoingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Ehtisham Ahmed","18 June, 7:24 pm",R.drawable.img_ehtisham,R.drawable.incomingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Ehtisham Ahmed","17 June, 5:00 pm",R.drawable.img_ehtisham,R.drawable.outgoingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Ubaid Ahmed","17 June, 2:56 pm",R.drawable.img_ubaid,R.drawable.missedcall_icon,R.drawable.call_icon));
        callList.add(new Call("Moin Ud Din","15 June, 12:12 pm",R.drawable.img_moin,R.drawable.outgoingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Taha Khan","15 June, 11:54 am",R.drawable.img_taha,R.drawable.outgoingcall_icon,R.drawable.call_icon));
        callList.add(new Call("Afaq Ahmed","14 June, 8:56 am",R.drawable.img_afaq,R.drawable.missedcall_icon,R.drawable.call_icon));

        callRecyclerAdapter = new CallRecyclerViewAdapter(callList,getContext());
        callRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        callRecyclerView.setHasFixedSize(true);
        callRecyclerView.setAdapter(callRecyclerAdapter);

        return view;
    }
}