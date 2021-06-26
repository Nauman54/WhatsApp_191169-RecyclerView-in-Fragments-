package com.example.whatsapp_191169;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.whatsapp_191169.Fragments.CallFragment;
import com.example.whatsapp_191169.Fragments.ChatFragment;
import com.example.whatsapp_191169.Fragments.StatusFragment;

public class MainActivity extends AppCompatActivity {

    Button btn_chat, btn_status, btn_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btn_chat = findViewById(R.id.btn_chat);
        btn_status = findViewById(R.id.btn_status);
        btn_call = findViewById(R.id.btn_call);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new ChatFragment()).commit();

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new ChatFragment()).commit();
            }
        });

        btn_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new StatusFragment()).commit();
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new CallFragment()).commit();
            }
        });

    }
}