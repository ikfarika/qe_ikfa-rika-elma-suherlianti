# (3) Testing Documentation & Test Case & Tracking Management Tools

## materi 1 : Testing Documentation

### Test scenario
- merupakan dokumen yang berisi sekumpulan langkah-langkah sistematis yang disusun oleh software tester agar sistem yang akan dites dapat memenuhi ketentuan yang diinginkan oleh user. Test skenario merupakan tingkatan tertinggi dalam sebuah test case

### Tujuan :
1)Memudahkan developer dan tester untuk melakukan testing
2)Menjadi dasar pengembangan bagi pengerjaan project
3)Sebagai dasar klient menyesuaikan dengan requirement

### tools yang dapat digunakan
- google spreadsheet

### kriteria test scensrio yang baik :
1) Inline system requirment, sistem requirment adalah kunci sehingga kita dapat menyusun skenario test sesuai flow yang telah ditentukan 
2) Give conteks, user bersikap seolah-olah perlu melakukan hal tersebut 
3) Give details, memberikan rincian secara spesifik hal-hal yang perlu diketahui oleh user 
4) Crystal clear - easy to understand, berikan penjelasan secara detil terkait test step berikut spesifikasi result sehingga memudahkan kita dalam proses testing 
5) user dapat melakukan apa saja sesuai dengan requirment yang ada 
6) Koheren, antara skenario satu dengan yang lain juga step satu dan selanjutnya harus berkesinambungan 
7) Proof, lengkapi dengan hasil yang didapatkan dari skenario yang dilakukan, seperti : resultnya passed atau failed 
8) Konsisten, penggunaan kata harus konsisten, jika ingin menggunakan kata fill email di awal maka step selanjutnya juga gunakan perintah yang sama 
9) End user mind - dont assume, seperti dalam pembuatan notifikasi kita harus memastikan kalau klien menginginkan notifikasi berupa pop-up message atau lead message. 

### contoh test scenario 
(pada halaman masuk gmail)
- Cek fitur login, apakah telah berfungsi dengan baik
- Cek fitur forgot email
- Cek fitur creat new account

### test case

- merupakan suatu rancangan atau rangkaian mengenai tindakan yang dilakukan oleh software tester untuk melakukan verifikasi terhadap fitur atau fungsi tertentu dari sebuah software. Test case bertindak sebagai titik awal dalam pelaksanaan pengujian dari sebuah sistem, dari test case ini dapat diketahui apakah fitur berjalan normal atau tidak.
- tujuannya, Memastikan bahwa suatu sistem dapat dijalankan dengan baik sesuai dengan kebutuhan awal serta mampu memberikan respon jika terjadi suatu masukkan yang tidak valid.
- beberapa komponen test case diantaranya, test case id, description, condition, dan status.
 
### hal-hal yang perlu diperhatikan saat pengerjaan test case :

1. Testcase dibuat sederhana dan transparan, penguji membuat dengan penjelasan yang ringkas dan jelas agar orang lain dapat mengeksekusi. Menggunakan bahasa yang mudah dipahami, sehingga membantu pemahaman pengujian menjadi mudah dan pelaksanaan test menjadi lebih cepat.
2. Test case dibuat dengan end user in mind, sehingga software tester harus mampu membuat kasus uji dengan mengingat perspektif dari pengguna akhir.
3. Hindari pengulangan kasus uji, usahakan tidak membuat pengujian yang berulang, jika sebuah test case diperlukan untuk mengeksekusi beberapa test case lain penguji dapat memanggil test case tersebut kedalam kolom recognition.
4. Pengujian harus berdasarkan ketentuan dan dokumen spesifikasi, pastikan bahwa pengujian sudah mencakup semuanya. Software tester dapat menggunakan tools untuk memastikan bahwa tidak ada fungsi yang belum teruji.
5. Test case harus dapat diidentifikasi, nama dari test case id harus dapat diidentifikasi untuk memudahkan software tester dalam pelacakan eror atau mengidentifikasikan persyaratan perangkat lunak pada tahap berikutnya.
6. Dalam membuat test case, test case harus menghasilkan hasil pengujian yang sama dalam setiap kali pengujiannya, tidak peduli siapa pengujinya.
7. Detail review, test case yang dibuat harus dapat ditinjau oleh orang lain, hal ini memungkinkan orang lain menemukan sebuah cacat yang terlewatkan.

### contoh test case
(pada test scenario terdapat pengujian fungsi dari fitur login)
1. Enter valid email dan valid password (positif test case)
2. Enter valid email dan invalid password (negatif test case)
3. Enter invalid email dan valid password (negatif test case)
4. Enter invalid email dan invalid password (negatif test case)



## materi 2 : Test Case Management Tools

- merupakan situs atau software yang digunakan oleh tester untuk menyimpan informasi terkait bagaimana pengujian produk harus dilakukan, perencanaan kegiatan pengujian serta dokumen terkait laporan status kegiatan penjamin kualitas produk.

### test case dibutuhkan karena :
1) untuk Plan dan estimasi, plan dan estimasi yang tester buat akan diinformasikan didalam sebuah test plan, dimana test plan itu berisi tentang fitur apa saja yang akan dites, fitur apa saja yang tidak di tes, hal-hal apa saja yang berhubungan dalam tes tersebut, berapa banyak sumber daya yang dibutuhkan dan informasi dari jadwal itu sendiri.
2) Monitoring dan controlling, kita dapat memonitoring proses collecting, recording, serta reporting, juga dapat mengontrol data-data yang telah dibuat dalam suatu tempat.
3) Reporting dan integrasi dengan tools lain, sehingga tidak perlu lagi membuat dokumen report secara manual, serta dengan tools ini dapat diintegrasikan dengan tools lain seperti jira, flag, dan lainnya. Contoh : jira, pivotal, redmine, jenkins, travis CI.

- beberapa test case management tools yang ada : 1) testRail, 2) testLink, 3) Zephyr, 4) Qtest, 5) practiTest, 6) TClab

## materi 3 : Tracking Management Tools

- merupakan sebuah software yang digunakan dalam mengolah suatu proyek atau development software agar bisa berjalan secara efisien dan efektif.
- contoh tools: 1)JIRA software, 2)Trello
- JIRA software merupakan salah satu tools yang banyak digunakan. Dikembangkan oleh Atlasian sebagai salah satu alat bantu dengan tujuan : pelacakan bug, pelacakan isuue, dan project management.
- beberapa fitur unggulan dari JIRA software yaitu : 1) Fitur test assingment, untuk mengetahui sejauh mana project telah dikerjakan, 2) Scrum dan kanban, metode pada project management, 3) Road maps, anggota dapat lebih fokus dengan apa yang sedang dikerjakannya juga tim leader memegang control penuh untuk dapat memantau perkembangan prosesnya sehingga mempermudah pengambilan keputusan, 4) Konektifitas dengan aplikasi lain, 5) Fitur pelaporan dengan visualisasi menarik sehingga mempermudah pemangku kebijakan memberikan solusinya.


