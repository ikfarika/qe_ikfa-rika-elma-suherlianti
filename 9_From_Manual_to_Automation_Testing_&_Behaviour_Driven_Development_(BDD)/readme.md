# section 9 - From Manual to Automation Testing & Behaviour Driven Development

## materi 1: from manual to automation testing

- Manual testing, merupakan Sebuah testing secara manual, dengan tujuan untuk ekploratory atau eksplor atau observasi fitur-fitur yang sedang dikembangkan pada aplikasi.
- Alasan dilakukannya manual tes : 
1) Eksploratory, mengeksplor fitur-fitur apa sajakah yang sudah dikembangakan pada sebuah aplikasi.
2) Velocity, secara langsung manual tes sangat cepat dilakukan apabila ditemukan bug kecil pada sebuah aplikasi.
3) Usability, untuk memastikan sebuah aplikasi dapat digunakan dengan nyaman oleh pengguna.

- Kelebihan manual testing :
1. Mendapatkan feedback secara cepat dan akurat
2. Lebih murah, karena tidak membutuhkan automation tools yang diperlukan.
3. Cocok untuk perubahan yang minor atau kecil

- Kelemahan :
1. Sering terjadi kesalahan
2. Manual testing tidak dapat direkam.

- Automation testing, merupakan pengujian yang dilakukan dengan otomatis menggunakan automation tools. Dengan tujuan utamanya yaitu efisiensi, karena cocok untuk eksekusi test case yang sangat banyak secara otomatis, dan juga untuk mengukur coverage, mengukur seberapa banyak fitur-fitur yang telah diuji.

- Alasan dilakukannya automation testing :
1. Flexibility, karena tester dapat menggunakan kemballi test yang telah dilbuat sebelumnya.
2. Velocity, karena sangat cepat untuk menguji fitur yang banyak dan cukup kompleks.
3. Coverage, mengukur seberapa banyak fitur yang telah diuji.
4. Error-avoidance, potensi terjadinya error dapat diminimalisir.

- Test case yang cocok untuk otomasi :
1. Tes case yang dieksekusi secara plural.
2. Test case yang mungkin akan sulit apabila dengan manual.
3. Test case yang memakan waktu cukup banyak jika dilakukan manual.

- Test case yang tidak cocok untuk diotomasi :
1. Test case yang baru saja dirancang dan belum dieksekusi seacara manual.
2. Test case yang mungkin memiliki kebutuhan yang sering berubah.

### Proses melakukan otomasi tes :
- Pemilihan test tool: usability, simplicity, cost
- Definisikan lingkup yang akan diotomasi.
- Lakukan perencanaan, membuat stategi otomasi dan plan lalu kembangkan script otomasi.
- Eksekusi test tersebut.
- Lakukan maintenance.

### praktek terbaik melakukan otomasi tes: 
1. detail dari scope otomasi
2. memilih otomasi tes sesuai kebutuhan
3. penuhi standar dalam penulisan script
4. pastikan mengukur metricsnya



## materi 2 : Behaviour Driven Development (BDD)

- Test driven development, TDD merupakan proses software development yang menerapkan penulisan test case sebelum developer menuliskan simulation codenya. Proses ini berfokus pada komponen-komponen dalam sistem dan test case ditulis dalam bahasa pemrograman.
- Serupa dengan TDD, BDD juga melakukan konsep test first namun dengan fokus yang berbeda. Dalam BDD test, tim developer akan menuliskan berbagai skenario yang menjelaskan behavior sistem dari kebiasaan pengguna. Skenario dituliskan dengan format bahasa yang mudah dipahami oleh seluruh stakeholder dalam pengembangan sistem.
- Tujuan utama BDD, untuk meningkatkan komunikasi dan kolaborasi antara seluruh stakeholder, tim bisnis maupun teknikal yang terlibat dalam pengembangan sistem. Hal ini membantu memastikan bahwa fitur-fitur dalam sistem dapat dipahami dengan baik oleh seluruh anggota tim. Karena komunikasi yang baik akan dapat menyatukan persepsi stakeholders yang berbeda-beda dalam suatu pemahaman dan ekspektasi yang sama. Serta fitur-fitur dapat memenuhi kebutuhan pengguna dan menghasilkan business value.
- Prinsip dasar BDD, mendeskripsikan behavior dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci. Dengan pemisalan dalam pendekatan BDD, seluruh stakeholder, teknikal maupun non-teknikal saling berkomunikasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan functional sistem yang dituliskan melalui featurefiles. Deskripsi yang ada di feature file berperan sebagai tes logic yang kemudian akan menjadi dasar quality assurance. featuresFiles pada BDD dituliskan menggunakan bahasa gherkin dengan format nberbahasa inggris yang mudah dipahami oleh siapapun.
- Secara mendasar ada tiga tahapan untuk pembuatan tes BDD :
1. Tentukan user storynya, untuk menjelakan tujuan penguna dan fungsionalitas sistem yang diharapkan.
> format penulisan narrative : as a [X] i want [Y] so that [Z].
2. Menuliskan skenario dalam feature files menggunakan gherkin sintaks berdasarkan user story nya
> format penulisan scenario menggunakan bdd : given, when, then.
3. Mengimplementasikan test case dalam step files berdasarkan skenario.

### cucumber
- Merupakan sebuah tools yang mendukung BDD, cucumber membaca semacam ketentuan yang dapat dieksekusi dimana ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi mampu melakukan apa yang dituliskan dalam ketentuan tersebut yang terdiri dari beberapa skkenario.

