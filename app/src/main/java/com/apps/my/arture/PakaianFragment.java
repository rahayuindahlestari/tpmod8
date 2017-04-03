package com.apps.my.arture;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PakaianFragment extends Fragment {

    private String provinsi;

    public PakaianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_detail, container, false);

        Intent in = getActivity().getIntent();
        provinsi = in.getStringExtra("Provinsi");

        TextView namaMakan = (TextView) view.findViewById(R.id.namaMakanan);
        TextView deskripsi = (TextView) view.findViewById(R.id.isiDeskripsi);
        ImageView gambarMakan = (ImageView) view.findViewById(R.id.fotoMakanan);

        if(provinsi.equals("Jawa Barat")) {
            gambarMakan.setImageResource(R.drawable.kebaya);
            namaMakan.setText("Kebaya");
            deskripsi.setText("Pakaian khas suku sunda yang sering kita kenal yaitu kebaya. Kebaya merupakan pakaian khas Jawa Barat yang sangat terkenal, sehingga kini kebaya bukan hanya menjadi pakaian khas sunda saja tetapi sudah menjadi pakaian adat nasinal. Itu merupakan suatu bukti bahwa kebudayaan daerah merupakan bagian dari kebudayaan nasional.");
        }else if(provinsi.equals("Jawa Tengah")) {
            gambarMakan.setImageResource(R.drawable.dodotan);
            namaMakan.setText("Dodotan");
            deskripsi.setText("Ciri khas busana pengantin Jawa Tengah pada umumnya merupakan busana dodotan atau kemben dengan kain batik yang langsung dibalutkan pada tubuh pengantin wanita tanpa mengenakan kebaya terlebih dahulu. Pengantin pria pun tak mengenakan beskap melainkan celana dan kain batik.");
        }else if(provinsi.equals("Jawa Timur")) {
            gambarMakan.setImageResource( R.drawable.mantenan);
            namaMakan.setText("Mantenan");
            deskripsi.setText("Baju Mantenan Sesuai dengan namanya, baju ini umumnya hanya dikenakan pada saat resepsi pernikahan adat Jawa Timuran oleh para mempelai. Baik untuk mempelai laki-laki maupun untuk mempelai wanita, baju mantenan ini memiliki corak warna yang sama, yaitu warna hitam sebagai dasar dan warna merah sebagai motif hiasannya.");
        }else if(provinsi.equals("Yogyakarta")) {
            gambarMakan.setImageResource(R.drawable.dodotan);
            namaMakan.setText("Dodotan");
            deskripsi.setText("Pada umumnya Yogyakarta memiliki pakaian adat yang sama dengan Jawa Tengah. Busana dodotan atau kemben dengan kain batik yang langsung dibalutkan pada tubuh pengantin wanita tanpa mengenakan kebaya terlebih dahulu. Pengantin pria pun tak mengenakan beskap melainkan celana dan kain batik.");
        }else if(provinsi.equals("Jakarta")) {
            gambarMakan.setImageResource(R.drawable.ujungserong);
            namaMakan.setText("Ujung Serong");
            deskripsi.setText("Baju ujung serong terdiri atas dalaman kemeja putih, jas tutup berwarna gelap, batik geometris yang dikenakan dipinggang sebatas lutut, dan celana pantolan yang warnanya sama dengan jas. Aksesoris pelengkapnya yaitu tutup kepala berupa kopiah, kuku macan, pisau raut atau senjata semacam badik yang diselipkan dipinggang, jam rantai untuk hiasan saku, serta alas kaki berupa sepatu pantopel.");
        }else if(provinsi.equals("Bali")) {
            gambarMakan.setImageResource(R.drawable.payasmadya);
            namaMakan.setText("Payas Madya");
            deskripsi.setText("Baju Bali Pria Madya (sedang), baju bali pria ini biasanya terdiri dari Baju, Kampuh + umpal, Kain panjang, Sabuk, Alas kaki (optional) atau bisa juga terdiri atas Destar, Selempot, Kain panjang,Sabuk,Alas kaki Sedangkan untuk wanita, komposisi payas madya antara lain Baju kebaya, Kain wastra, Sesenteng, Sabuk stagen,  Alas kaki.");
        }else if(provinsi.equals("Nusa Tenggara Timur")) {
            gambarMakan.setImageResource(R.drawable.sukurote);
            namaMakan.setText("Pakaian Adat Suku Rote");
            deskripsi.setText("Pakaian adat Suku Rote merupakan simbol pakaian adat NTT di kancah nasional. Pakaian ini dipilih karena memiliki desain yang sangat unik dan sarat nilai filosofis. Salah satu keunikannya terletak pada desain Ti’i langga. Ti’i langga adalah sebuah penutup kepala dengan bentuk seperti topi sombrero khas Meksiko yang dibuat dari daun lontar kering.");
        }else if(provinsi.equals("Maluku")) {
            gambarMakan.setImageResource(R.drawable.kainsalele);
            namaMakan.setText("Kain Salele");
            deskripsi.setText("Nama pakaian adat Maluku adalah baju cele atau kain salele. Baju cele adalah baju sederhana yang mewakili karakteristik adat suku-suku di Kepulauan Maluku. Baju cele adalah baju berwarna merah terang bermotif garis-garis geometris warna emas atau perak yang dibuat dari kain tebal. Untuk wanita, umumnya baju cele dipadukan dengan kain kebaya atau sarung tenun dengan warna yang sama.");
        }

        return view;
    }

}
