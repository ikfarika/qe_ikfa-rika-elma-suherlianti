# (2)  Version Control (Git)

## versioning Control with Git

versioning berarti proses pengaturan versi atau proses pelacakan sebuah code program yang telah dibuat.

Contoh ketika melakukan pembuatan skripsi, dimana akan ada revisi. Untuk mengetahui perubahan apa yang dilakukan maka dibuat file baru atau save as agar file lama tetap ada dan file baru ada untuk melihat perubahannya terletak dimana.

> mengetahui perubahan merupakan hal penting, jadi pencatatan history jelas dalam proses pembuatan code program ini sehingga  management dalam project lebih baik lagi.

contoh tools untuk versioning control :
1. versioning control system (VCS)
2. source control manager (SCM)
3. Revision control system (RCS)
 
jenis version control system :
1. single user
2. centralized
3. distributed

## Git
Git adalah salah satu version control system populer yang banyak digunakan oleh developer-developer untuk mengembangkan suatu project atau software secara bersama - sama.
Git dapat berfungsi untuk track pada project ada perubahan apa sajakah, bagian mana yang berubah, dimana perubahan tersebut dapat digunakan parallel, collaborasi bersama developer lain, selain itu secara flow akan ada code reviewnya.
>*git repository = folder project yang menyimpan file pengerjaan dan history atau pencatatan perubahan pengerjaannya
(git akan mengetrack semua perubahan)
Suatu perubahan akan dikirim sebagai paket yaitu commit, dalam setiap commit akan ada pesannya.

### git dapat diinstall pada mac, window, juga linux

### untuk setting up pada git menggunakan 

- git init
- git clone
- git config

### saving changes

- git status
- git add
- git commit
- git diff
- git stash
- gitignore
>gitignore : digunakan untuk eksekusi file apa saja yang akan di ignore atau acuhkan atau tidak dikirimkan kedalam github

### inspecting perository and undoing

- git log
- git checkout
- git reset

### syncing

- git push
- git fetch
- git pull

### branches
> merupakan percabangan yang beridi perubahan yang terjadi pada project.
> branch master digunakan untuk product yang telah rampung
> brach developer digunakan sebagai branch utama dalam pengembangan.

- git merge, digunakan untuk menyatukan feature tambahan ke project utama atau branch master

### pull request

- digunakan ketika engineer telah menyelesaikan featurenya dan ingin digabungkan dengan project utama.

### Workflow collaboration
- merupakan alur dalam menggunakan git

- Dalam kolaborasi tim kita perlu membuat beberapa branch untuk mengoptimalkan kolaborasi

> sehingga perlu diingat :
1)Branch master hanya menerima pull request yang final dari development branch.
2)Hindari perubahan langsung pada development branch, lakukan pada branch fearture saja.