package com.example.whatsapp_191169.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp_191169.Models.Call;
import com.example.whatsapp_191169.R;

import java.util.List;

public class CallRecyclerViewAdapter extends RecyclerView.Adapter<CallRecyclerViewAdapter.ViewHolder> {

    List<Call> callList;
    Context context;

    public CallRecyclerViewAdapter(List<Call> callList, Context context) {
        this.callList = callList;
        this.context = context;
    }

    @NonNull
    @Override
    public CallRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallRecyclerViewAdapter.ViewHolder holder, int position) {
        Call call = callList.get(position);
        holder.call_name.setText(call.getCall_name());
        holder.call_message.setText(call.getCall_message());
        holder.call_photo.setImageResource(call.getCall_photo());
        holder.call_state.setImageResource(call.getCall_state());
        holder.call_show.setImageResource(call.getCall_show());
    }

    @Override
    public int getItemCount() {
        return callList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView call_name, call_message;
        ImageView call_photo, call_state, call_show;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            call_name=itemView.findViewById(R.id.call_name);
            call_message=itemView.findViewById(R.id.call_message);
            call_photo=itemView.findViewById(R.id.call_photo);
            call_state=itemView.findViewById(R.id.call_state);
            call_show=itemView.findViewById(R.id.call_show);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    callList.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    return true;
                }
            });

        }

        @Override
        public void onClick(View v) {

        }

    }
}
