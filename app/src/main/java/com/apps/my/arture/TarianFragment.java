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
public class TarianFragment extends Fragment {

    private String provinsi;

    public TarianFragment() {
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
            gambarMakan.setImageResource(R.drawable.tarimerak);
            namaMakan.setText("Tari Merak");
            deskripsi.setText("Tari merak diciptakan oleh seorang tokoh seni Raden Tjetjep Somantri pada tahun 1950. Namun dalam perjalanan waktu dan sejarah Tari Merak ini mengalami beberapa kali revisi diantaranya Tari Merak yang telah dibuat ulang oleh Irawati Durban pada tahun 1965. Dinamakan tari merak karena tarian ini menggambarkan kecantikan dan keindahan burung merak. Para penari tarian tradisional ini menggunakan kostum yang juga mirip dengan bulu burung merak.");
        }else if(provinsi.equals("Jawa Tengah")) {
            gambarMakan.setImageResource(R.drawable.bedhayaketawang);
            namaMakan.setText("Bedhaya Ketawang");
            deskripsi.setText("Bedhaya Ketawang yang mengandung arti di setiap masing-masing kata. ‘bedhaya’ yang artinya penari wanita dan ‘ketawang’ artinya langit. Bila disatukan Bedhaya Ketawang ini mengandung arti penari wanita dari istana langit. Tarian ini dipertunjukan untuk acara resmi saja, yang bertujuan untuk menghibur. ");
        }else if(provinsi.equals("Jawa Timur")) {
            gambarMakan.setImageResource(R.drawable.reogponorogo);
            namaMakan.setText("Reog Ponorogo");
            deskripsi.setText("Reog Ponorogo merupakan kesenian dan tradisi dari Jawa Timur yang merupakan seni tari yang dibawakan oleh beberapa orang pemain dengan penari inti menggunakan topeng kepala singa yang diatasnya terdapat makota bulu-bulu merak dengan berat topeng bisa mencapai 50 kg. Yang unik dari Topeng singa Reog Ponorogo ini adalah bawa penari yang membawa topeng seberat 50 kg tersebut mengandalkan kekuatan gigi.");
        }else if(provinsi.equals("Yogyakarta")) {
            gambarMakan.setImageResource(R.drawable.tarigolek);
            namaMakan.setText("Tari Golek Ayun-Ayun");
            deskripsi.setText("Penari golek ayun-ayun mengenakan balutan baju beludru hitam serasi dipadankan dengan bawahan kain batik putih. Mahkota merak bersayap merah muda tambah mempercantik penampilan sang penari Tarian ini dapat disaksikan setiap hari Minggu di Pendapa (Bangsal) Sri Manganti, Keraton Jogjakarta dari pukul 10.00 WIB sampai dengan 12.00 WIB.");
        }else if(provinsi.equals("Jakarta")) {
            gambarMakan.setImageResource( R.drawable.tarilenggang);
            namaMakan.setText("Tari Lenggang Nyai");
            deskripsi.setText("Tari Lenggang Nyai adalah tari kreasi baru yang terinspirasi dari kisah Nyai Dasimah. Tarian Lenggang Nyai ini telah diciptakan oleh Wiwik Widiastuti pada tahun 199, menceritakan tentang hidup seorang wanita (Nyai Dasimah) yang berhasil keluar dari ikatan perkawinan yang telah merenggut kebebasannya. Tari Lenggang Nyai masih dipengaruhi oleh budaya Cina seperti halnya tari cokek.");
        }else if(provinsi.equals("Bali")) {
            gambarMakan.setImageResource(R.drawable.tarikecak);
            namaMakan.setText("Tari Kecak");
            deskripsi.setText("Tarian kecak diciptakan oleh Wayan Limbak dan Walter Spies pada tahun 1930 oleh seniman Jerman, tarian ini menceritakan epic Ramayana dan rata-rata semua penarinya adalah laki – laki. Jumlah penari yang membawakan Tari Kecak bisa berjumlah puluhan bahkan lebih. Para penari yang duduk melingkar dan menyerukan “cak” sembari mengangkat kedua lengan. Hal tersebut menggambarkan tentara kera saat membantu Rama melawan Rahwana.");
        }else if(provinsi.equals("Nusa Tenggara Timur")) {
            gambarMakan.setImageResource(R.drawable.tarikataga);
            namaMakan.setText("Tari Kataga");
            deskripsi.setText("Tari Kataga adalah tarian khas Kabupaten Sumba Barat, Nusa Tenggara Timur (NTT) yang bernuansa peperangan. Tari Kataga adalah tarian perang dari Kabupaten Sumba Barat, NTT, yang dilakukan oleh sejumlah penari pria dengan mengenakan kostum / pakaian tradisional khas NTT dilengkapi dengan senjata tradisional berupa pedang dan perisai.");
        }else if(provinsi.equals("Maluku")) {
            gambarMakan.setImageResource(R.drawable.tarikatreji);
            namaMakan.setText("Tari Katreji");
            deskripsi.setText("Tari Katreji termasuk tari pergaulan daerah Maluku yang sering ditampilkan pada acara pelantikan pejabat di Maluku seperti pelantikan Kepala Desa, Bupati maupun Gubernur. Tarian ini dipercaya merupakan salah satu produk akulturasi budaya dari penjajah pada masa lalu (Belanda dan Portugis) serta budaya lokal Maluku.Perpaduan tersebut masih nampak terdapat dalam aba-aba yang menggunakan bahasa Belanda maupun Portugis serta ragam pola gerak tariannya.");
        }

        return view;
    }

}
