package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout main1;
    private Button input;
    private RadioGroup rgGravity;
    private Button send;
    private Button exit;
    private Button help_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        rgGravity = findViewById(R.id.rgGravity);
        send = findViewById(R.id.send);
        exit = findViewById(R.id.exit);
        help_settings = findViewById(R.id.help_settings);
        main1 = findViewById(R.id.main1);
        input.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.input:
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
        }
    }
}
  /*  public void exit(View v) {
        finish();
        System.exit(0);
    }
}*/