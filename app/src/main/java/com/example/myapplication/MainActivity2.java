package com.example.myapplication;
import java.util.Scanner;
import android.animation.ArgbEvaluator;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout main2;
    private EditText inputa;
    private EditText inputr;
    private EditText inputg;
    private EditText inputb;
    private RadioGroup rgGravity;
    private Button send;
    private LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        inputa = (EditText) findViewById(R.id.inputa);
        inputr = (EditText)findViewById(R.id.inputr);
        inputg = (EditText)findViewById(R.id.inputg);
        inputb = (EditText)findViewById(R.id.inputb);
        rgGravity = findViewById(R.id.rgGravity);
        send = findViewById(R.id.send);
        layout = findViewById(R.id.main2);
        inputa.setOnClickListener(this);
        inputr.setOnClickListener(this);
        inputg.setOnClickListener(this);
        inputb.setOnClickListener(this);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send:
                LinearLayout.LayoutParams IParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                int btnGravity = Gravity.LEFT;
                switch (rgGravity.getCheckedRadioButtonId()) {
                    case R.id.left:
                        btnGravity = Gravity.LEFT;
                        break;

                    case R.id.right:

                        btnGravity = Gravity.RIGHT;

                        break;
                }
                int A=Integer.parseInt(inputa.getText().toString());
                int R=Integer.parseInt(inputr.getText().toString());
                int G=Integer.parseInt(inputg.getText().toString());
                int B=Integer.parseInt(inputb.getText().toString());
                send.setBackgroundColor(Color.argb(A,R,G,B));
                //some math so text shows (needs improvement for greys)
                send.setTextColor(Color.argb(0xff,255-R,255-G,255-B));
                layout.setBackgroundColor(Color.argb(A,R,G,B));
        }
    }

}
