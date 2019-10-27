package com.anisa.camera;

import java.util.ArrayList;

public class CameraData {
    private static String[] bandNames = {
            "Sony",
            "Canon",
            "Olympus",
            "Minolta",
            "Panasonic",
            "Samsung",
            "FujiFilm",
            "Nikon",
            "Lumix",
            "Kodak"
    };

    private static String[] bandDetails = {
            "Pionir kamera mirroles full frame Sony ini sudah cukup berumur juga kamu lagi mencari kamera dengan ukuran sensor 35mm atau full frame dengan spesifikasi utama seperti kemampuan rekam vidio full HD diframe rate 60 fps. sistem fokus yang didukung 117 titik fokus phase detection dan 25 contrast detection plus kemampuan foto berturut turut turut mecapai 5fps membuat kamera inni cukup worthed dengan harga jual saat ini sekitar Rp. 15.000.000 untuk paket body only",
            "Kamera jenis ini merupakan kamera digital paling simpel. Dengan ukurannya yang tidak telalu besar dan pas di kantong atau biasa disebut kamera saku, menjadikan kamera ini banyak dipilih untuk pengguna yang membutuhkan kamera yang hanya sekedar mendapat foto saja. Dengan fitur standar namun memiliki mobilitas tinggi. Kamera ini juga tidak mempunyai shoot mode dialer.",
            "Olympus mempermudah pengguna untuk membuat foto long exposure melalui fitur Live Composite secara mudah tanpa harus khawatir fotonya over exposure. Begini penjelasannya.\n" + "Pada kamera konvensional, untuk membuat foto long exposure bukan perkara mudah. Kesalahan eksposur ketika mengukur kecepatan rana membuat hasil foto yang tidak menyenangkan. Dan untuk membuat yang sesuai bisa butuh waktu dari beberapa menit hingga berjam-jam. Belum lagi proses editing di komputer yang memakan waktu.",
            "Minolta Co., Ltd. adalah perusahaan produsen kamera, aksesoris kamera, mesin fotokopi, faks, dan printer laser dari Jepang. Minolta didirikan di Osaka, Jepang, pada tahun 1928 dengan nama Nichi-Doku Shashinki Shōten (日独写真機商店, yang berarti toko kamera Jepang-Jerman). Nama Minolta ini awalnya terkenal dengan lensa pertama autofokus SLR yang terintegrasi. Namun kemudian pada tahun 1933 mulai memproduksi kamera bernama Minolta, sebagai tiruan dari Plaubel Makina.Pada tahun 2003 Minolta merger dengan Konica membentuk Konica Minolta. Pada 19 January 2006 Konica Minolta mengumumkan bahwa akan keluar dari industri fotografi, dan akan menjual sebagian bisnis kameranya ke Sony.",
            "Kamera DSLM (Digital Single Lens Mirrorless) memiliki Kualitas Gambar Terbaik, Kemampuan Perekaman Video 4K/60p, dan 6K PHOTO. Kamera DSLM (Digital Single Lens Mirrorless) menampilkan Sensor 20,3 Megapiksel, I.S.",
            "Samsung sendiri sebenarnya tidak memproduksi kamera DSLR saja namun berbagai jenis kamera yang saat ini tengah banyak dicari oleh orang seperti kamera digital atau kamera saku dan kamera mirroless. Kali ini kami akan membahas mengenai harga kamera DSLR Samsung dengan harapan bisa membantu anda dalam mencari kamera DSLR yang sesuai dengan kebutuhan fotografi anda.",
            "Beli Kamera Mirrorless Fujifilm di Plazakamera.com sangat mudah dan tidak ribet. Pilih kamera yang Anda suka dan lakukan sistem pembayaran secara online. Atau, jika Anda ingin merasakan langsung kamera-kamera ini dan untuk transaksi yang lebih aman, Anda dapat juga membeli kamera ini dengan mendatangi showroom (toko fisik) Plazakamera.com yang beralamatkan di Jalan Mangkunegoro No. 11 Surabaya dan Showroom Cabang kami di Jakarta yaitu di Rukan Green Garden blok A14 no.43 Jl. Panjang Alteri Kedoya, Jakarta Barat.",
            "Mengenal Kamera Nikon Dan Jenis-Jenisnya – Nikon adalah salah satu merek kamera yang banyak di gemari oleh masyarakat di seluruh dunia. Karena merek kamera Nikon ini dalam dunia fotografi sudah memiliki jaminan mutu yang bagus, sehingga kamera ini banyak di gunakan dalam dunia fotografi.",
            "Lumix mempermudah pengguna untuk membuat foto long exposure melalui fitur Live Composite secara mudah tanpa harus khawatir fotonya over exposure. Begini penjelasannya.\\n\" + \"Pada kamera konvensional, untuk membuat foto long exposure bukan perkara mudah. Kesalahan eksposur ketika mengukur kecepatan rana membuat hasil foto yang tidak menyenangkan. Dan untuk membuat yang sesuai bisa butuh waktu dari beberapa menit hingga berjam-jam. Belum lagi proses editing di komputer yang memakan waktu.",
            "kamera kodak mempermudah pengguna untuk membuat foto long exposure melalui fitur Live Composite secara mudah tanpa harus khawatir fotonya over exposure. Begini penjelasannya.\\n\" + \"Pada kamera konvensional, untuk membuat foto long exposure bukan perkara mudah. Kesalahan eksposur ketika mengukur kecepatan rana membuat hasil foto yang tidak menyenangkan. Dan untuk membuat yang sesuai bisa butuh waktu dari beberapa menit hingga berjam-jam. Belum lagi proses editing di komputer yang memakan waktu."
    };

    private static int[] bandImages = {
            R.drawable.sony,
            R.drawable.canon,
            R.drawable.olympus,
            R.drawable.minolta,
            R.drawable.panasonic,
            R.drawable.samsung,
            R.drawable.fujifilm,
            R.drawable.nikon,
            R.drawable.fujifilm,
            R.drawable.canon
    };

    private static String[] bandGenres = {
            "Microless camera",
            "Semi Pro DSLR",
            "Medium format DSLR",
            "Bridge Camera",
            "Boutique Camera",
            "Prosumer",
            "Microless camera",
            "Bridge Camera",
            "Medium format DSLR",
            "Pro DSLR"
    };

    static ArrayList<Camera> getListData(){
        ArrayList<Camera> list = new ArrayList<>();
        for (int position = 0; position < bandNames.length; position++){
            Camera camera = new Camera();
            camera.setGenre(bandGenres[position]);
            camera.setName(bandNames[position]);
            camera.setDetail(bandDetails[position]);
            camera.setPhoto(bandImages[position]);
            list.add(camera);
        }
        return list;
    };
}
