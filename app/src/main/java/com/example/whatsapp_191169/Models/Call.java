package com.example.whatsapp_191169.Models;

public class Call {

    String call_name, call_message;
    int call_photo, call_state, call_show;

    public Call() {
    }

    public Call(String call_name, String call_message, int call_photo, int call_state, int call_show) {
        this.call_name = call_name;
        this.call_message = call_message;
        this.call_photo = call_photo;
        this.call_state = call_state;
        this.call_show = call_show;
    }

    public String getCall_name() {
        return call_name;
    }

    public void setCall_name(String call_name) {
        this.call_name = call_name;
    }

    public String getCall_message() {
        return call_message;
    }

    public void setCall_message(String call_message) {
        this.call_message = call_message;
    }

    public int getCall_photo() {
        return call_photo;
    }

    public void setCall_photo(int call_photo) {
        this.call_photo = call_photo;
    }

    public int getCall_state() {
        return call_state;
    }

    public void setCall_state(int call_state) {
        this.call_state = call_state;
    }

    public int getCall_show() {
        return call_show;
    }

    public void setCall_show(int call_show) {
        this.call_show = call_show;
    }
}
