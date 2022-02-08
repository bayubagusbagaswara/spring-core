# Bean

- Saat sebuah object kita masukkan kedalam SpringContainer IoC (ApplicationContext), maka kita sebut object tersebut adalah `Bean`
- Secara default, `bean merupakan singleton`, artinya jika kita mengakses bean yang sama, maka dia akan mengembalikan object yang sama. Kita juga bisa mengubahnya jika tidak ingin singleton

# Membuat Bean

- Untuk membuat bean, kita bisa membuat sebuah method di dalam class Configuration
- Selajutnya nama method tersebut akan menjadi nama bean nya, dan return object nya menjadi object bean nya
- Method tersebut perlu kita tambahkan annotation @Bean, untuk menandakan bahwa itu adalah bean
- Secara otomatis Spring akan mengeksekusi method tersebut, dan return value nya akan dijadikan object bean secara otomatis, dan disimpan di container IoC

# Mengakses Bean

- Setelah kita membuat bean, secara otomatis semua object akan di-manage oleh ApplicationContext
- Untuk mengakses bean, kita bisa menggunakan method `getBean` milik ApplicationContext 
- Atau dalam arti kita akses bean yang ada di dalam container ApplicationContext