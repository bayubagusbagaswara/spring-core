# Lazy Bean

- Secara default, Bean di Spring akan dibuat ketika aplikasi Spring pertama kali berjalan/running
- Oleh karena itu, kadang ketika aplikasi Spring pertama berjalan akan sedikit lambat
- Hal ini dikarenakan `semua bean akan dibuat di awal`
- Namun jika kita mau, kita juga bisa membuat sebuah bean menjadi lazy (malas), dimana bean tidak akan dibuat, sampai memang diakses atau dibutuhkan
- Untuk membuat sebuah bean menjadi lazy, kita bisa tambahkan annotation `@Lazy` pada bean tersebut