package com.clicks.yogi.context_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        registerForContextMenu(btn1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo){

        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Hello");
        menu.add(0,v.getId(),1,"Aman");
        menu.add(0,v.getId(),4,"Subhadeep");
        menu.add(0,v.getId(),2,"Manimoy");
        menu.add(0,v.getId(),2,"Yogesh");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        Toast.makeText(this, "Clciked on " + item.getTitle(),
                Toast.LENGTH_SHORT).show();
        return true;
    }
}