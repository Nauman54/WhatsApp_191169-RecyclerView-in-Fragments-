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

public class ChatRecyclerViewAdapter extends RecyclerView.Adapter<ChatRecyclerViewAdapter.ViewHolder> {

    List<Chat> chatList;
    Context context;

    public ChatRecyclerViewAdapter(List<Chat> chatList, Context context) {
        this.chatList = chatList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatRecyclerViewAdapter.ViewHolder holder, int position) {
        Chat chat = chatList.get(position);
        holder.chat_name.setText(chat.getChat_name());
        holder.chat_message.setText(chat.getChat_message());
        holder.chat_date.setText(chat.getChat_date());
        holder.chat_photo.setImageResource(chat.getChat_photo());
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView chat_name, chat_message, chat_date;
        ImageView chat_photo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            chat_name=itemView.findViewById(R.id.chat_name);
            chat_message=itemView.findViewById(R.id.chat_message);
            chat_date=itemView.findViewById(R.id.chat_date);
            chat_photo=itemView.findViewById(R.id.chat_photo);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    chatList.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    return true;
                }
            });
        }


        @Override
        public void onClick(View v) {
            Toast.makeText(context, chatList.get(getAdapterPosition()).getChat_name(), Toast.LENGTH_LONG).show();
        }
    }

}
