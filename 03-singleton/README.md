# Singleton

- Singleton adalah salah satu Design Patterns untuk pembuatan object
- Dimana sebuah object hanya dibuat `satu kali` saja
- Dan saat kita membutuhkan object tersebut, maka kita hanya akan `menggunakan object yang sama`
- https://refactoring.guru/design-patterns/singleton

# Membuat Singleton di Java

- Ada banyak cara membuat singleton object di Java
- Cara yang paling sering digunakan adalah membuat class yang berisikan `static method` untuk membuat object dirinya sendiri
- Selanjutnya constructor nya dibuat private, agar tidak bisa diakses dari luar
- Sehingga user terpaksa menggunakan method static tersebut ketika ingin membuat object nya