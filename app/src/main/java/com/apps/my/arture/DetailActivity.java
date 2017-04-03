package com.apps.my.arture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.defaultValue;

public class DetailActivity extends AppCompatActivity {

    private String nama, deskrip;
    private int gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent in = getIntent();
        nama = in.getStringExtra("nama");
        gambar = in.getIntExtra("gambar",defaultValue);
        deskrip = in.getStringExtra("deskripsi");


        TextView namaMakan = (TextView)findViewById(R.id.namaMakanan);
        TextView deskripsi = (TextView)findViewById(R.id.isiDeskripsi);
        ImageView gambarMakan = (ImageView)findViewById(R.id.fotoMakanan);

        namaMakan.setText(nama);
        deskripsi.setText(deskrip);
        gambarMakan.setImageResource(gambar);
    }
}
