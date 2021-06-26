package com.example.whatsapp_191169.Models;

public class Status {

    String status_name, status_message;
    int status_photo;

    public Status() {
    }

    public Status(String status_name, String status_message, int status_photo) {
        this.status_name = status_name;
        this.status_message = status_message;
        this.status_photo = status_photo;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public int getStatus_photo() {
        return status_photo;
    }

    public void setStatus_photo(int status_photo) {
        this.status_photo = status_photo;
    }
}
