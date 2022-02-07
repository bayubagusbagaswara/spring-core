# Pengenalan Spring Framework

- Spring Framework adalah framework paling populer di Java
- Saking populernya, Spring Framework sampai mengalahkan popularitas Java Enterprise sendiri
- Spring Framework dibuat sekitar tahun 2003 oleh Rod Johnson, yang dibuat sebagai alternative Java Enterprise
- Spring Framework semakin populer karena sangat ringan dan mudah digunakan dibandingkan Java Enterprise
- https://spring.io/

# Pengenalan Spring Boot

- Spring Boot merupakan framework untuk mempermudah pembuatan aplikasi Spring Framework
- Dahulu untuk menggunakan Spring Framework, untuk pemula tidaklah mudah, karena terlalu banyak yang harus dilakukan sebelum bisa membuat aplikasi
- Spring Boot menjadikan kompleksitas tersebut ditangani secara otomatis oleh Spring Boot, sehingga kita bisa membuat aplikasi Spring Framework secara cepat tanpa harus melakukan pengaturan apapun
- Spring Boot sekarang sudah menjadi salah satu framework wajib ketika kita ingin membuat aplikasi Spring Framework

# Kenapa Menggunakan Spring?

- Tidak bisa dipungkiri, saat ini Spring adalah satu-satunya framework paling populer di Java
- Belum ada yang bisa menandingi popularitas di Java
- Saking populernya, bahkan banyak perusahaan pindah ke JVM karena ingin menggunakan Spring-nya, bukan Java
- Dengan banyaknya bahasa yang bisa berjalan di atas JVM, seperti Kotlin, Groovy dan Scala, maka secara programmer punya banyak pilihan bahasa pemrograman ketikan menggunakan Spring
- Spring juga sudah banyak sekali diadopsi di banyak perusahaan, baik itu skala besar atau kecil

# Ekosistem Pendukung

- Spring memiliki ekosistem pendukung yang sangat besar
- Spring sendiri tidaklah digunakan untuk menggantikan framework yang sudah ada, melainkan menjahit framework-framework yang sudah ada, menjadi framework yang saling terintegrasi
- Spring bisa digunakan terintegrasi dengan baik dengan Bean Validation, Java Persistence API, Servlet dan lain-lain
- Selain itu, Spring juga bisa diintegrasikan dengan teknologi yang tidak standar bawaan Java, seperti MongoDB, Consul, Vault, Cassandra, dan lain-lain

# Inversion of Control

- Inversion of Control (IoC) merupakan `prinsip dalam pembuatan perangkat lunak`, dimana kita melakukan pemindahan kontrol untuk objek atau program ke sebuah container di framework
- Tidak seperti biasanya ketika kita membuat aplikasi, dimana kita selalu melakukannya secara manual. Dalam IoC, kita menyerahkan banyak pekerjaan ke container IoC
- `Container IoC` memiliki kontrol untuk melakukan eksekusi program kita, memanajemen object pada program kita, dan melakukan abstraction terhadap program kita
- Saat menggunakan framework IoC, kita biasanya akan mengikuti cara kerja framework tersebut

# Spring Inversion of Control

- `Spring` bisa dibilang adalah `framework yang mengadopsi prinsip IoC`, dimana kita akan menyerahkan banyak sekali pekerjaan dalam program kita ke Spring
- Kode program kita akan mengikuti cara kerja Spring
- Jadi semua kode program kita akan dimasukkan kedalam Spring Container
- ApplicationContext adalah containernya Spring IoC

# Application Context

- ApplicationContext adalah sebuah interface `representasi container IoC di Spring`
- ApplicationContext adalah `inti dari Spring Framework`
- Karena ApplicationContext adalah sebuah interface, maka banyak sekali class implementasinya, secara garis besar dibagi menjadi 2 jenis implementasi, `XML dan Annotation`
- Pada versi Spring 3, XML masih menjadi pilihan utama. Namun sekarang sudah banyak orang beralih dari XML ke Annotation. Bahkan Spring Boot pun merekomendasikan agar menggunakan Annotation untuk membuat aplikasi Spring

# Configuration

- Untuk membuat ApplicationContext dengan menggunakan Annotation, pertama kali yang kita perlukan adalah membuat `Configuration Class`
- Configuration Class adalah sebuah class yang terdapat annotation `@Configuration` pada class tersebut

# Membuat Application Context

- Selanjutnya, setelah membuat Class Configuration, kita bisa menggunakan class `AnnotationConfigApplicationContext` untuk membuat ApplicationContext
