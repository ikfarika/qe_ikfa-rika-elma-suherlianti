# (8) RESTful API Introduction & Testing

## materi 1 : basic of API testing

- API adalah Aplication Programming Interface, merupakan suatu penghubung yang memungkinkan suatu aplikasi untuk berinteraksi dengan aplikasi lainnya dan berbagi data. Tujuan dari penggunaan API, untuk mempercepat proses development dengan menyediakan function secara  terpisah sehingga defeloper tidak perlu membuat fitur yang serupa. API berperan sebagai penerima pesan dari pengguna dan memberi tahu sistem apa yang harus dilakukan lalu memberikan respon yang sesuai untuk permintaan tersebut.
- Workflow sebuah API : Pengunjung melakukan pemesanan layanan kepada pelayan, kemudian pelayan menyampaikan permintaan tersebut kepada chef. Chef membuatkan permintaan pengunjung tersebut, setelah selesai diberikan kepada pelayan untuk diberikan kepada pengunjung tersebut.
> client sebagai pengunjung restoran, API sebagai pelayan, dan sistem/server sebagai chef.

- restAPI, rest atau representational state transfer = standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web. Umumnya menggunakan HTTP sebagai protokol untuk komunikasi data. restAPI berisi aturan atau batasan yang dapat membatasi programmer untuk mengakses atau melakukan tindakan - tindakan tertentu pada sebuah database. Data yang digunakan dalam restAPI umumnya JSON.
- HTTP, dirancang untuk memungkinkan komunikasi antar klien dan server yang berfungsi sebagai protokol respon dari permintaan antara klien
- method pada HTTP : Resource = url, (1)GET = untuk membaca data, (2)PUT = untuk membuat/mengganti data, (3)POST = membuat data baru, (4)DELETE = menghapus data.
- JSON = java script object notation adalah sebuah format data yang digunakan untuk pertukaran dan penyimpanan data, json merupakan bagian dari java script, json dapat dibaca dengan bahasa permrograman c, c++, python dan banyak lagi sehingga membuat json menjadi bahasa yang ideal untuk pertukaran data antar aplikasi.

### HTTP response code =
1. 200 OK, request yang dikirim sukses.
2. 201 created, resource yang dikirim berhasil dan sukses dibuat. Biasanya untuk method post dan put.
3. 400 bad request, data yang di request tidak sesuai atau ada salah dalam formatnya.
4. 404 not found, resource yang diperlukan tidak ditemukan.
5. 401 unauthorized, ketika tidak melakkan autentikasi terlebih dulu sebelum melakukan request.
6. 405 method not allowed, salah menatuh http methodnya.
7. 500 internal, eror yang terjadi karena kesalan pada server.

## materi 2 : API Testing

- API testing merupakan test yang dilakukan pada layer dimana = menggambarkan bagaimana respon dari web tanpa atau sebelum ui nya siap.
  Dengan tujuan meluaskan cakupan testing dan melakukan testing sedini mungkin dimana ui belum sepenuhnya siap diikuti testing.
- tiga bagian API testing, (1) Fungtionality, tes untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum, (2) Load test, menguji kekuatan suatu sistem apakah mampu mengolah data dari beban yang diberikan, (3) Security, tes untuk menguji keamanan dari suatu sistem.
- tools : postman, rest-assured, frisby.js, apache jmeter.

### perbedaan unit test dan API test
1. Unit test dilakukan oleh developer, API tes dilakukan oleh software tester.
2. Unit test functionalitasnya terpisah, sedangkan API test tidak.
3. Pada unit test developer dapat mengakses source code, namun pada API test tidak. 
4. Scope unit tes terbatas, sedangkan API tes scopenya lebih luas. 
5. Unit tes dilakukan sebelum bild, API tes dilakukan setelah build. 

### proses API testing :
1. Melakukan spesifikasi rivew, untuk mereview spesifikasi API dan dokumen. 
2. Spesifikasi development, untuk memastikan detail dokumen. 
3. Framework development, memilih tools apa yang akan dipakai untuk APPI test nanti. 
4. Test case development, membuat tes skenario dan tes casenya. 
5. Execituon dan report, eksekusi dan membuat reportnya.