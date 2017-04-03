package com.apps.my.arture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KategoriActivity extends AppCompatActivity {

    private String[] kategori;
    private String provinsi;
    int gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        Intent in = getIntent();
        kategori = in.getStringArrayExtra("Kategori");
        provinsi = in.getStringExtra("Provinsi");

        ListView listKategori = (ListView) findViewById(R.id.activity_kategori);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,kategori);

        listKategori.setAdapter(adapter);

        listKategori.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(KategoriActivity.this, DetailActivity.class);
                switch (position){
                    case 0:
                        if(provinsi.equals("Jawa Barat")){
                            gambar = R.drawable.surabi;
                            intent.putExtra("nama","Surabi");
                            intent.putExtra("gambar",gambar);
                            intent.putExtra("deskripsi","Surabi merupakan jajanan pasar tradisional yang berasal dari Indonesia. Ada dua jenis serabi, yaitu serabi manis yang menggunakan kinca (gula merah cair) dan serabi asin dengan atau tanpa taburan oncom yang telah dibumbui di atasnya. Di Bandung, serabi biasa dijajakan di pagi hari dan dimasak menggunakan tungku sehingga menghasilkan rasa yang khas.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jawa Timur")){
                            gambar = R.drawable.cingur;
                            intent.putExtra("nama","Rujak Cingur");
                            intent.putExtra("gambar",gambar);
                            intent.putExtra("deskripsi","Rujak Cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama daerah asalnya Surabaya. Cingur sendiri berrati mulut. Makanan ini memang menyajikan mulut sapi. Biasanya dihidangkan dengan sayuran kemudian diberi bumbu yang terbuat dari olahan petis udang, air matang, gula/gula merah, cabai, kacang tanah yang digoreng, bawang goreng, garam dan irisan tipis-tipis pisang biji hijau yang masih muda (pisang klutuk).");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jawa Tengah")) {
                            gambar = R.drawable.lumpia;
                            intent.putExtra("nama", "Lumpia");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi","Lunpia adalah makanan khas Jawa Tengah khususnya kota Semarang. Makanan ini berisi rebung, telur, dan daging udang. Setelah dibungkus bisa dimakan langsung, bisa juga digoreng. ");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Yogyakarta")){
                            gambar = R.drawable.gudeg;
                            intent.putExtra("nama","Gudeg");
                            intent.putExtra("gambar",gambar);
                            intent.putExtra("deskripsi","Nasi Gudeg, makanan khas D.I. Yogyakarta yang terbuat dari nangka muda yang dimasak dengan santan. Gudeg dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tahu dan sambal goreng krecek.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jakarta")) {
                            gambar = R.drawable.keraktelor;
                            intent.putExtra("nama", "Kerak Telor");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Kerak Telor adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Bali")) {
                            gambar = R.drawable.ayambetutu;
                            intent.putExtra("nama", "Ayam Betutu");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Salah satu makanan khas Bali adalah ayam betutu. Ayam betutu adalah lauk yang terbuat dari ayam yang utuh yang berisi bumbu, kemudian dipanggang dalam api sekam.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Nusa Tenggara Timur")) {
                            gambar = R.drawable.catemakjagung;
                            intent.putExtra("nama", "Catemak Jagung");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Catemak Jagung adalah makanan khas Nusa Tenggara Timur. Catemak jagung adalah makanan penutup yang terbuat dari jagung, labu lilin, dan kacang hijau yang dimasak dengan bumbu masak penyedap rasa. ");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Maluku")) {
                            gambar = R.drawable.ikanasap;
                            intent.putExtra("nama", "Ikan Asap");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Ikan Asar adalah ikan cakalang atau tongkol yang dipanggang dengan asap. Karena proses pembuatannya diasap, terkadang disebut juga ikan asap.");
                            startActivity(intent);
                            break;
                        }

                    case 1:
                        if(provinsi.equals("Jawa Barat")) {
                            gambar = R.drawable.tarimerak;
                            intent.putExtra("nama", "Tari Merak");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Tari merak diciptakan oleh seorang tokoh seni Raden Tjetjep Somantri pada tahun 1950. Namun dalam perjalanan waktu dan sejarah Tari Merak ini mengalami beberapa kali revisi diantaranya Tari Merak yang telah dibuat ulang oleh Irawati Durban pada tahun 1965. Dinamakan tari merak karena tarian ini menggambarkan kecantikan dan keindahan burung merak. Para penari tarian tradisional ini menggunakan kostum yang juga mirip dengan bulu burung merak.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jawa Tengah")) {
                            gambar = R.drawable.bedhayaketawang;
                            intent.putExtra("nama", "Bedhaya Ketawang");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Bedhaya Ketawang yang mengandung arti di setiap masing-masing kata. ‘bedhaya’ yang artinya penari wanita dan ‘ketawang’ artinya langit. Bila disatukan Bedhaya Ketawang ini mengandung arti penari wanita dari istana langit. Tarian ini dipertunjukan untuk acara resmi saja, yang bertujuan untuk menghibur. ");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jawa Timur")) {
                            gambar = R.drawable.reogponorogo;
                            intent.putExtra("nama", "Reog Ponorogo");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Reog Ponorogo merupakan kesenian dan tradisi dari Jawa Timur yang merupakan seni tari yang dibawakan oleh beberapa orang pemain dengan penari inti menggunakan topeng kepala singa yang diatasnya terdapat makota bulu-bulu merak dengan berat topeng bisa mencapai 50 kg. Yang unik dari Topeng singa Reog Ponorogo ini adalah bawa penari yang membawa topeng seberat 50 kg tersebut mengandalkan kekuatan gigi.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Yogyakarta")) {
                            gambar = R.drawable.tarigolek;
                            intent.putExtra("nama", "Tari Golek Ayun-Ayun");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Penari golek ayun-ayun mengenakan balutan baju beludru hitam serasi dipadankan dengan bawahan kain batik putih. Mahkota merak bersayap merah muda tambah mempercantik penampilan sang penari Tarian ini dapat disaksikan setiap hari Minggu di Pendapa (Bangsal) Sri Manganti, Keraton Jogjakarta dari pukul 10.00 WIB sampai dengan 12.00 WIB.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jakarta")) {
                            gambar = R.drawable.tarilenggang;
                            intent.putExtra("nama", "Tari Lenggang Nyai");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Tari Lenggang Nyai adalah tari kreasi baru yang terinspirasi dari kisah Nyai Dasimah. Tarian Lenggang Nyai ini telah diciptakan oleh Wiwik Widiastuti pada tahun 199, menceritakan tentang hidup seorang wanita (Nyai Dasimah) yang berhasil keluar dari ikatan perkawinan yang telah merenggut kebebasannya. Tari Lenggang Nyai masih dipengaruhi oleh budaya Cina seperti halnya tari cokek.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Bali")) {
                            gambar = R.drawable.tarikecak;
                            intent.putExtra("nama", "Tari Kecak");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Tarian kecak diciptakan oleh Wayan Limbak dan Walter Spies pada tahun 1930 oleh seniman Jerman, tarian ini menceritakan epic Ramayana dan rata-rata semua penarinya adalah laki – laki. Jumlah penari yang membawakan Tari Kecak bisa berjumlah puluhan bahkan lebih. Para penari yang duduk melingkar dan menyerukan “cak” sembari mengangkat kedua lengan. Hal tersebut menggambarkan tentara kera saat membantu Rama melawan Rahwana.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Nusa Tenggara Timur")) {
                            gambar = R.drawable.tarikataga;
                            intent.putExtra("nama", "Tari Kataga");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Tari Kataga adalah tarian khas Kabupaten Sumba Barat, Nusa Tenggara Timur (NTT) yang bernuansa peperangan. Tari Kataga adalah tarian perang dari Kabupaten Sumba Barat, NTT, yang dilakukan oleh sejumlah penari pria dengan mengenakan kostum / pakaian tradisional khas NTT dilengkapi dengan senjata tradisional berupa pedang dan perisai.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Maluku")) {
                            gambar = R.drawable.tarikatreji;
                            intent.putExtra("nama", "Tari Katreji");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Tari Katreji termasuk tari pergaulan daerah Maluku yang sering ditampilkan pada acara pelantikan pejabat di Maluku seperti pelantikan Kepala Desa, Bupati maupun Gubernur. Tarian ini dipercaya merupakan salah satu produk akulturasi budaya dari penjajah pada masa lalu (Belanda dan Portugis) serta budaya lokal Maluku.Perpaduan tersebut masih nampak terdapat dalam aba-aba yang menggunakan bahasa Belanda maupun Portugis serta ragam pola gerak tariannya.");
                            startActivity(intent);
                            break;
                        }

                    case 2:
                        if(provinsi.equals("Jawa Barat")) {
                            gambar = R.drawable.kebaya;
                            intent.putExtra("nama", "Kebaya");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Pakaian khas suku sunda yang sering kita kenal yaitu kebaya. Kebaya merupakan pakaian khas Jawa Barat yang sangat terkenal, sehingga kini kebaya bukan hanya menjadi pakaian khas sunda saja tetapi sudah menjadi pakaian adat nasinal. Itu merupakan suatu bukti bahwa kebudayaan daerah merupakan bagian dari kebudayaan nasional.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jawa Tengah")) {
                            gambar = R.drawable.dodotan;
                            intent.putExtra("nama", "Dodotan");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Ciri khas busana pengantin Jawa Tengah pada umumnya merupakan busana dodotan atau kemben dengan kain batik yang langsung dibalutkan pada tubuh pengantin wanita tanpa mengenakan kebaya terlebih dahulu. Pengantin pria pun tak mengenakan beskap melainkan celana dan kain batik.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jawa Timur")) {
                            gambar = R.drawable.mantenan;
                            intent.putExtra("nama", "Mantenan");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Baju Mantenan Sesuai dengan namanya, baju ini umumnya hanya dikenakan pada saat resepsi pernikahan adat Jawa Timuran oleh para mempelai. Baik untuk mempelai laki-laki maupun untuk mempelai wanita, baju mantenan ini memiliki corak warna yang sama, yaitu warna hitam sebagai dasar dan warna merah sebagai motif hiasannya.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Yogyakarta")) {
                            gambar = R.drawable.dodotan;
                            intent.putExtra("nama", "Dodotan");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Pada umumnya Yogyakarta memiliki pakaian adat yang sama dengan Jawa Tengah. Busana dodotan atau kemben dengan kain batik yang langsung dibalutkan pada tubuh pengantin wanita tanpa mengenakan kebaya terlebih dahulu. Pengantin pria pun tak mengenakan beskap melainkan celana dan kain batik.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Jakarta")) {
                            gambar = R.drawable.ujungserong;
                            intent.putExtra("nama", "Ujung Serong");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Baju ujung serong terdiri atas dalaman kemeja putih, jas tutup berwarna gelap, batik geometris yang dikenakan dipinggang sebatas lutut, dan celana pantolan yang warnanya sama dengan jas. Aksesoris pelengkapnya yaitu tutup kepala berupa kopiah, kuku macan, pisau raut atau senjata semacam badik yang diselipkan dipinggang, jam rantai untuk hiasan saku, serta alas kaki berupa sepatu pantopel.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Bali")) {
                            gambar = R.drawable.payasmadya;
                            intent.putExtra("nama", "Payas Madya");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Baju Bali Pria Madya (sedang), baju bali pria ini biasanya terdiri dari Baju, Kampuh + umpal, Kain panjang, Sabuk, Alas kaki (optional) atau bisa juga terdiri atas Destar, Selempot, Kain panjang,Sabuk,Alas kaki Sedangkan untuk wanita, komposisi payas madya antara lain Baju kebaya, Kain wastra, Sesenteng, Sabuk stagen,  Alas kaki.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Nusa Tenggara Timur")) {
                            gambar = R.drawable.sukurote;
                            intent.putExtra("nama", "Pakaian Adat Suku Rote");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Pakaian adat Suku Rote merupakan simbol pakaian adat NTT di kancah nasional. Pakaian ini dipilih karena memiliki desain yang sangat unik dan sarat nilai filosofis. Salah satu keunikannya terletak pada desain Ti’i langga. Ti’i langga adalah sebuah penutup kepala dengan bentuk seperti topi sombrero khas Meksiko yang dibuat dari daun lontar kering.");
                            startActivity(intent);
                            break;
                        }else if(provinsi.equals("Maluku")) {
                            gambar = R.drawable.kainsalele;
                            intent.putExtra("nama", "Kain Salele");
                            intent.putExtra("gambar", gambar);
                            intent.putExtra("deskripsi", "Nama pakaian adat Maluku adalah baju cele atau kain salele. Baju cele adalah baju sederhana yang mewakili karakteristik adat suku-suku di Kepulauan Maluku. Baju cele adalah baju berwarna merah terang bermotif garis-garis geometris warna emas atau perak yang dibuat dari kain tebal. Untuk wanita, umumnya baju cele dipadukan dengan kain kebaya atau sarung tenun dengan warna yang sama.");
                            startActivity(intent);
                            break;
                        }
                    }
                }
        });
    }
}
