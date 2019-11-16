package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Extra extends AppCompatActivity {

    LinearLayout ll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
        ll2 = findViewById(R.id.ll2);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,40,"purple");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("Red")) {
            ll2.setBackgroundColor(Color.RED);
        }

        else if (st.equals("Blue")) {
            ll2.setBackgroundColor(Color.BLUE);
        }

        else if (st.equals("Green")) {
            ll2.setBackgroundColor(Color.GREEN);
        }
        else{
            ll2.setBackgroundColor(Color.MAGENTA);
        }
        return true;
    }

    public void Back(View view) {
        finish();
    }
}
