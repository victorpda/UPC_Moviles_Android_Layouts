package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.inicio:
                Log.i("===", "Menu Inicio");
                return true;
            case R.id.productos:
                Log.i("===", "Menu Productos");
                return true;
            case R.id.servicios:
                Log.i("===", "Menu Servicios");
                return true;
            default:
                super.onOptionsItemSelected(item);
        }
        return false;
    }
}