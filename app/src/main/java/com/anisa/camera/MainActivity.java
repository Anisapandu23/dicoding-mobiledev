package com.anisa.camera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBands;
    private ArrayList<Camera> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBands = findViewById(R.id.rv_bands);
        rvBands.setHasFixedSize(true);

        list.addAll(CameraData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvBands.setLayoutManager(new LinearLayoutManager(this));
        ListBandAdapter listBandAdapter = new ListBandAdapter(list);
        rvBands.setAdapter(listBandAdapter);

        listBandAdapter.setOnItemClickCallback(new ListBandAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Camera data) {
                showSelectedData(data);
            }
        });
    }

    public void showSelectedData(Camera camera){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_BAND_NAME, camera.getName());
        intent.putExtra(DetailActivity.EXTRA_BAND_GENRE, camera.getGenre());
        intent.putExtra(DetailActivity.EXTRA_BAND_DETAIL, camera.getDetail());
        intent.putExtra(DetailActivity.EXTRA_BAND_IMAGE, camera.getPhoto());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }





}
