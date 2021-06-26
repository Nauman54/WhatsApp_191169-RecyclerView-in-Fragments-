package com.example.whatsapp_191169.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp_191169.Models.Chat;
import com.example.whatsapp_191169.Models.Status;
import com.example.whatsapp_191169.R;

import java.util.List;

public class StatusRecyclerViewAdapter extends RecyclerView.Adapter<StatusRecyclerViewAdapter.ViewHolder> {

    List<Status> statusList;
    Context context;

    public StatusRecyclerViewAdapter(List<Status> statusList, Context context) {
        this.statusList = statusList;
        this.context = context;
    }

    @NonNull
    @Override
    public StatusRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.status_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusRecyclerViewAdapter.ViewHolder holder, int position) {
        Status status = statusList.get(position);
        holder.status_name.setText(status.getStatus_name());
        holder.status_message.setText(status.getStatus_message());
        holder.status_photo.setImageResource(status.getStatus_photo());
    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView status_name, status_message;
        ImageView status_photo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            status_name=itemView.findViewById(R.id.status_name);
            status_message=itemView.findViewById(R.id.status_message);
            status_photo=itemView.findViewById(R.id.stats_photo);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    statusList.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    return true;
                }
            });

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, statusList.get(getAdapterPosition()).getStatus_name(), Toast.LENGTH_LONG).show();
        }
    }
}
