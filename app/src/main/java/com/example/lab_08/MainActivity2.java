package com.example.lab_08;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.view.Menu;

public class MainActivity2 extends AppCompatActivity {

    EditText txtctl;

    int nid;
    String ntxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtctl = findViewById(R.id.txt_content);

        Intent i = getIntent();
        nid = i.getIntExtra("note-id", 0);
        ntxt = i.getStringExtra("note-txt");

        txtctl.setText(ntxt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();

        switch (id)
        {
            case R.id.itm_save:{

            }
        }
        return super.onOptionsItemSelected(item);
    }
}