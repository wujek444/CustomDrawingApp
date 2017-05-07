package com.example.jrwoj.customdrawingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private DrawingView drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawView = (DrawingView)findViewById(R.id.drawing);
    }
    public void paintClicked(View view){
        //use chosen color
        String color = view.getTag().toString();
        drawView.setColor(color);
    }
    public void resetClicked(View view){
        drawView.resetCanvas();
    }
}
