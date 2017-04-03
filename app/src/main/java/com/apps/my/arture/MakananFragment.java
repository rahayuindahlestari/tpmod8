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
public class MakananFragment extends Fragment {

    private String provinsi;

    public MakananFragment() {
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

        if (provinsi.equals("Jawa Barat")) {
            gambarMakan.setImageResource(R.drawable.surabi);
            namaMakan.setText("Surabi");
            deskripsi.setText("Surabi merupakan jajanan pasar tradisional yang berasal dari Indonesia. Ada dua jenis serabi, yaitu serabi manis yang menggunakan kinca (gula merah cair) dan serabi asin dengan atau tanpa taburan oncom yang telah dibumbui di atasnya. Di Bandung, serabi biasa dijajakan di pagi hari dan dimasak menggunakan tungku sehingga menghasilkan rasa yang khas.");
        } else if (provinsi.equals("Jawa Timur")) {
            gambarMakan.setImageResource(R.drawable.cingur);
            namaMakan.setText("Rujak Cingur");
            deskripsi.setText("Rujak Cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama daerah asalnya Surabaya. Cingur sendiri berrati mulut. Makanan ini memang menyajikan mulut sapi. Biasanya dihidangkan dengan sayuran kemudian diberi bumbu yang terbuat dari olahan petis udang, air matang, gula/gula merah, cabai, kacang tanah yang digoreng, bawang goreng, garam dan irisan tipis-tipis pisang biji hijau yang masih muda (pisang klutuk).");
        } else if (provinsi.equals("Jawa Tengah")) {
            gambarMakan.setImageResource(R.drawable.lumpia);
            namaMakan.setText("Lumpia");
            deskripsi.setText("Lunpia adalah makanan khas Jawa Tengah khususnya kota Semarang. Makanan ini berisi rebung, telur, dan daging udang. Setelah dibungkus bisa dimakan langsung, bisa juga digoreng. ");
        } else if (provinsi.equals("Yogyakarta")) {
            gambarMakan.setImageResource(R.drawable.gudeg);
            namaMakan.setText("Gudeg");
            deskripsi.setText("Nasi Gudeg, makanan khas D.I. Yogyakarta yang terbuat dari nangka muda yang dimasak dengan santan. Gudeg dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tahu dan sambal goreng krecek.");
        } else if (provinsi.equals("Jakarta")) {
            gambarMakan.setImageResource(R.drawable.keraktelor);
            namaMakan.setText("Kerak Telor");
            deskripsi.setText("Kerak Telor adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.");
        } else if (provinsi.equals("Bali")) {
            gambarMakan.setImageResource(R.drawable.ayambetutu);
            namaMakan.setText("Ayam Betutu");
            deskripsi.setText("Salah satu makanan khas Bali adalah ayam betutu. Ayam betutu adalah lauk yang terbuat dari ayam yang utuh yang berisi bumbu, kemudian dipanggang dalam api sekam.");
        } else if (provinsi.equals("Nusa Tenggara Timur")) {
            gambarMakan.setImageResource(R.drawable.catemakjagung);
            namaMakan.setText("Catemak Jagung");
            deskripsi.setText("Catemak Jagung adalah makanan khas Nusa Tenggara Timur. Catemak jagung adalah makanan penutup yang terbuat dari jagung, labu lilin, dan kacang hijau yang dimasak dengan bumbu masak penyedap rasa. ");
        } else if (provinsi.equals("Maluku")) {
            gambarMakan.setImageResource(R.drawable.ikanasap);
            namaMakan.setText("Ikan Asap");
            deskripsi.setText("Ikan Asar adalah ikan cakalang atau tongkol yang dipanggang dengan asap. Karena proses pembuatannya diasap, terkadang disebut juga ikan asap.");
        }
            return view;
    }
}
