package com.apps.my.arture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.my.arture.model.Provinsi;

import java.util.List;

public class ProvinsiAdapter extends ArrayAdapter {

    public ProvinsiAdapter(Context context, List<Provinsi> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_provinsi,parent,false);
        }

        Provinsi current = (Provinsi) getItem(position);

        ImageView gambar = (ImageView) convertView.findViewById(R.id.gambarProvinsi);
        gambar.setImageResource(current.getGambarProv());

        TextView nama = (TextView) convertView.findViewById(R.id.namaProvinsi);
        nama.setText(current.getNamaProv());

        return convertView;
    }
}
