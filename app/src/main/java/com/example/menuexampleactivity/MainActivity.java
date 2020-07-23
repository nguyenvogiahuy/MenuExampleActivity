package com.example.menuexampleactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ConstraintLayout mainLayout =
                (ConstraintLayout) findViewById(R.id.layoutView);
        switch (item.getItemId()) {
            case R.id.menu_Black:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.BLACK);
                return true;
            case R.id.menu_Yellow:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.YELLOW);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}