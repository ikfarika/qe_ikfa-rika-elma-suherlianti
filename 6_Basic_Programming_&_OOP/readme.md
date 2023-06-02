# (6) Basic Programming & OOP

## materi 1 : introduction basic programming

- JAVA, Bahasa pemrograman java adalah bahasa pemrograman yang berorientasi pada objek, program  java tersusun dari bagian yang disebut dengan kelas, kelas sendiri terdiri dari berbagai metode yang melakukan pekerjaan dan mengembalikan informasi setelah menyelesaikan tugasnya.

### mengapa bahasa pemrograman java dipergunakan
1. Bahasa yang digunakan sederhana, karena sintaks yang digunakan mirip dengan c++
2. Hanya fokus pada objek
3. Pengamanan yang cukup ketat, terdapat 3 lapis pengamanan sebagai pelindung sistem dari penyalahgunaan orang-orang yan tidak bertanggungjawab
4. Dapat dipakai pada sistem operasi manapun, bahasa java termasuk platform independent
5. Menggunakan sistem exception handling, dapat memisahkan bagian pengamanan kesalahan dan bagian kode normal
6. Mendukung native methode, fungsi yang ditulis di bahasa lain khususnya di c dan c++ yang memungkinkan programmer dapat menulis berbagai fungsi yang bisa dilakukan dengan cepat dibandingkan fungsi lain.
7. Terdapat garbage collector, mengumpulkan sampah secara otomatis   
8. Daftar pustaka yang lengkap, programmer dapat membuat aplikasi sesuai yang diinginkan
9. GUI
10. Penyempurnaan dari c++
11. Bisa digunakan diberbagai platform

### tools yang dipakai pada java programming
1. JDK, java development kit merupakan komponen inti dari java digunakan untuk proses  developing, debugging, juga monitoring. Di dalamnya terdapat JRE atau java runtime environment untuk mendukung aplikasi java agar dapat dijalankan.
2. IDE, tools untuk membantu developer membantu membuat aplikasi (contoh : open jdk, intellij, eclipse, BlueJ)

### basic programming

1. tipe data :
- Integer(int), tipe data numerik apabila bertemu dengan bilangan bulat, mengenal bilangan positif dan negatif. contoh : 100, 10.
- Float, biasa digunakan untuk menandai nilai yang presisi, seperti ketelitian tunggal dengan menggunakan penyimpanan 32 bit, memiliki kemampuan yang lebih cepat jika digunakan pada prosesor-prosesor tertentu dan memakai penyimpanan yang lebih kecil. Tipe ini akan bermasalah apabila terlalu memiliki nilai terlalu kecil dan terlalu besar, karena pada penerapannya menjadi tidak akurat. Contoh : 0.2, 0.05.
- Double, memiliki tingkat ketelitian secara ganda dengan menggunakan penyimpanan 64 bit, memberikan kemampuan menghitung matematis lebih cepat dari float. Contoh : 0.03234, 0.0015.
- String, terdiri dari kmpulan karakter dengan panjang tertentu dan sering disebut tipe data dasar. Contoh : “alterra”, “id”.
- Char, untuk menyimpan 1 huruf, angka, tanda baca, simbol, atau spasi kosong. Contoh : ‘A’, ‘z’.
- Boolean, tipe data yang memiliki 2 nilai (true atau false). Contoh : true, false.

2. branching
- if then
- if then else
- switch

3. looping
- for
- while
- do-while

4. input-output

5. operator
- Operator assignment : untuk memberikan suatu nilai kedalam variabel, mengunakan tanda samadengan (=)
- Operator aritmatika : (+), (-), (*), (/) (*kalau bilangan desimal bisa pakai float)
- Unary : (+), (-), (++), (--), (!)
- Equality dan relational : (==), (!=), (>), (>=), (<), (<=)
- Conditional : (&&), (||)

## materi 2 :  object oriented programming

- Pentingnya oop, Pemrograman berorientasi pada objek. Pada oop fungsi dan variabel dibungkus dalam sebuah objek atau kelas yang dapat saling berinteraksi sehingga membentuk sebuah program. Oop bertujuan untuk mempermudah pengembangan sebuah program. Programmer harus mampu meminimalisir program dan membuatnya tertata rapih selain itu juga untuk mempercepat pembuatan aplikasi sehingga dengan oop akan memudahkan dalam memaintenance code dalam program yang di produksi.

### komponen penting dalam oop:

1. kelas
- bertugas untuk mengumpulkan prosedur atau fungsi dan variabel dalam satu tempat.
- Kelas merupakan blueprint dari suatu objek atau cetakan untuk membuat objek.
- Kelas akan mempresentasikan objek yang akan dibuat(membuat kelas = sesuaikan dengan objek yang akan dibuat).
- Penamaan kelas menggunakan aturan pascal case yaitu diawali dengan huruf kapital tanpa menggunakan spasi apabila terdiri dari dua kata.
- Berisi dari beberapa kumpulan definisi variabel dan fungsi yang menggambarkan sebuah objek

2. Objek, sebuah variabel yang merupakan wujud dari kelas. Sebuah onjek juga digambarkan dengan variabel dan method.
3. Atribut, merupakan bagian dari sebuah kelas yang masih berhubungan erat dengan kelas tersebut, dapat disebut juga sebagai properti. Penggunaan atribut berlaku dari kurung kurawal sampai sebelum kurung kurawal akhir. Penulisannya kata pertama dengan huruf kecil kata kedua dengan huruf kapital tanpa spasi.
4. Access modifier:
- Public, membuat method dan class dapat diakses dari mana saja.
- Private, tidak dapat diberikan kepada kelas jadi hanya dapat diakses oleh member kelas saja.
- Protected, hanya dapat diaksses oleh kelas itu sendiri dan subkelasnya dan juga package yang sama.
