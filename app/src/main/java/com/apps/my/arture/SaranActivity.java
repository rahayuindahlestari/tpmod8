package com.apps.my.arture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SaranActivity extends AppCompatActivity {

    private EditText namaUser, emailUser, kategoriSaran, provinsiSaran, deskripsiSaran;
    private Button btn_kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saran);
        
        namaUser = (EditText)findViewById(R.id.namaLengkap);
        emailUser = (EditText)findViewById(R.id.email);
        kategoriSaran = (EditText)findViewById(R.id.kategori);
        provinsiSaran = (EditText)findViewById(R.id.provinsi);
        deskripsiSaran = (EditText)findViewById(R.id.deskripsi);
        btn_kirim = (Button)findViewById(R.id.submit);
        
        btn_kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SaranActivity.this, "Mohon maaf, saran anda belum bisa dikirim", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
