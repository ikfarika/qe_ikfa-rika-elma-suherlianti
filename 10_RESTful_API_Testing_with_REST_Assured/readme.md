# section 10 - RESTful API Testing with REST Assured

## materi 1: restful api testing

- Rest atau representational state transfer merupakan standar arsitenktur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web. Umumnya menggunakan HTTP sebagai protokol untuk komunikasi data. Rest juga merupakan salah satu implementasi dari web service sebagai standar yang digunakan untuk pertukaran data antara aplikasi maupun sistem.
- Rest API berisi aturan atau batasan yang dapat membatasi programmer untuk mengakses atau melakukan tindakan-tindakan tertentu pda sebuah data base. Jika API adalah penghubung, maka rest yang membuat aturan sesuai keinginan programmer dalam merancang web service. Sederhananya, terdapat permintaan dan respon pada data yang dikirimkan ataupun yang diterima.

### fundamental api integrasi
1. Mobile app
2. Api server
3. Ext process
4. Api testing

### test process dari sebuah api :
1. Pertama definisikan API yang akan kita test
2. Inputkan data yang dibutuhkan, baik header maupun body requestnya.
3. Kirim request ke server.
4. Dan lakukan validasi terhadap respon yang diberikan.

### test piramid
1. Unit testing, pengujian perangkat lunak yang menguji setiap unit atau komponen sebuah perangkat lunak. Unit testing dilakukan saat masa pengembangan atau saat menuliskan code program dari sebuah perangkat lunak oleh developer. Unit dapat berupa : function, method, prosedur, maupun objek. Tujuan : untuk memvalidasi setiap unit dari perangkat lunak agar dapat berjalan sesuai yang diharapkan.
2. Komponen testing, merupakan jenis pengujian perangkat lunak dimana pengujian dilakukan pada setipa komponen individu secara terpisah tanpa mengintegrasikan dengan komponen lain. Merupakan salah satu jenis testing yang sering dilakukan oleh QE.
3. Integration testing, pengujian dari hasil penggabungan unit-unit yang ada didalam software. Biasanya QEmenguji bagaimana unit-unit tersebut bekerja sebagai satu kombinasi. Sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran ketika terjadi kesalahan error atau bug.
4. UI test atau end-to-end test, test yang paling dekat dengan interaksi pengguna pada aplikasi web. User input harus memicu tindakan yang tepat, data harus disajikan kepada pengguna, status ui harus berubah seperti apa yang diharapkan.

- hal penting berdasarkan tes piramid :
1. Semakin tinggi level semakin sedikit tes yang harus dilakukan, karena semakin tinggi level untuk membuat test case memerlukan biaya yang lebih mahal.
2. Penulisan test setiap level berbeda dari tingkat detilnya. Fokus pada unit test, yang perlu menulis banyak unit test kecil dan cepat untuk mencakup semua cabang pernyataan kondisi input dan output fungsinya.
3. Meskipun dapat menampilkan semua aplikasi dan koneksi dari ujung ke ujung, tidak semua juga dapt dilakukan uji tesnya.

### BDD dengan cucumber
1. tulis story, dengan gherkin sintaks (given, when, than)
2. map steps to java, konfigurasi skrip stepnya dan validasi
3. configure sstories,
4. run stories
5. view reports



## materi 2 : rest assured

- teknologi open source yang sangat banyak digunakan untuk Pengujian Otomasi REST API, ini didasarkan pada perpustakaan berbasis java.
- Rest Assured berinteraksi dengan Rest API dalam mode klien tanpa kepala, kita dapat meningkatkan permintaan yang sama dengan menambahkan lapisan yang berbeda untuk membentuk permintaan dan membuat permintaan HTTP melalui kata kerja HTTPS yang berbeda ke server.
> Clients, pengguna yang ingin mengakses informasi dari web. Klien dapat berupa orang atau software yang menggunakan API.
> Resources, informasi yang diberikan oleh aplikasi yang berbeda kepada klien mereka. Dapat berupa gambar, vidio, teks, angka, jenis data lainnya. Mesin yang memberikan resources ke klien disebut server.

### rest assured :
1. support for bdd/gherkin
2. support for http methods
3. user of hamcrest matches for checks
4. user gpath for selecting element from json response.
