package com.example.whatsapp_191169.Models;

import android.widget.ImageView;

public class Chat {

    String chat_name, chat_message, chat_date;
    int chat_photo;

    public Chat() {
    }

    public Chat(String chat_name, String chat_message, String chat_date, int chat_photo) {
        this.chat_name = chat_name;
        this.chat_message = chat_message;
        this.chat_date = chat_date;
        this.chat_photo = chat_photo;
    }

    public String getChat_name() {
        return chat_name;
    }

    public void setChat_name(String chat_name) {
        this.chat_name = chat_name;
    }

    public String getChat_message() {
        return chat_message;
    }

    public void setChat_message(String chat_message) {
        this.chat_message = chat_message;
    }

    public String getChat_date() {
        return chat_date;
    }

    public void setChat_date(String chat_date) {
        this.chat_date = chat_date;
    }

    public int getChat_photo() {
        return chat_photo;
    }

    public void setChat_photo(int chat_photo) {
        this.chat_photo = chat_photo;
    }
}
