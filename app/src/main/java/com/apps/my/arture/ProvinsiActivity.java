package com.apps.my.arture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.apps.my.arture.model.Provinsi;

import java.util.ArrayList;

public class ProvinsiActivity extends AppCompatActivity {

    private String[] kategori = new String[]{"Makanan Daerah","Tarian Daerah","Pakaian Adat"};
    private String provinsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi);

        ListView listProv = (ListView) findViewById(R.id.activity_provinsi);

        final ArrayList<Provinsi> prov = new ArrayList<Provinsi>();
        prov.add(new Provinsi(R.drawable.jawa_barat,"Jawa Barat"));
        prov.add(new Provinsi(R.drawable.jawa_timur,"Jawa Timur"));
        prov.add(new Provinsi(R.drawable.jawa_tengah,"Jawa Tengah"));
        prov.add(new Provinsi(R.drawable.jogjakarta,"Yogyakarta"));
        prov.add(new Provinsi(R.drawable.jakarta,"Jakarta"));
        prov.add(new Provinsi(R.drawable.bali,"Bali"));
        prov.add(new Provinsi(R.drawable.ntt,"Nusa Tenggara Timur"));
        prov.add(new Provinsi(R.drawable.maluku,"Maluku"));

        ProvinsiAdapter adapter = new ProvinsiAdapter(this, prov);
        listProv.setAdapter(adapter);

        listProv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ProvinsiActivity.this, Kategori2Activity.class);
                switch (position){
                    case 0:
                        intent.putExtra("Kategori",kategori);
                        intent.putExtra("Provinsi","Jawa Barat");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("Kategori",kategori);
                        intent.putExtra("Provinsi","Jawa Timur");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("Kategori",kategori);
                        intent.putExtra("Provinsi","Jawa Tengah");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("Kategori",kategori);
                        intent.putExtra("Provinsi","Yogyakarta");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("Kategori",kategori);
                        intent.putExtra("Provinsi","Jakarta");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("Kategori",kategori);
                        intent.putExtra("Provinsi","Bali");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("Kategori",kategori);
                        intent.putExtra("Provinsi","Nusa Tenggara Timur");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("Kategori",kategori);
                        intent.putExtra("Provinsi","Maluku");
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
