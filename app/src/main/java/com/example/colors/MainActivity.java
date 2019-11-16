package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll1 = findViewById(R.id.ll1);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //
    public boolean onOptionsItemSelected (MenuItem item) {
        String st = item.getTitle().toString();
        if(st.equals("Red")){
            ll1.setBackgroundColor(Color.RED);}

        if(st.equals("Blue")){
            ll1.setBackgroundColor(Color.BLUE);}

        if(st.equals("Green")){
            ll1.setBackgroundColor(Color.GREEN);}
        return true;
    }

    public void Next(View view) {
        Intent p1= new Intent(this,Extra.class);
        startActivity(p1);
    }
}
