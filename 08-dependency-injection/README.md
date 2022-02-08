# Dependency Injection

- Saat kita membuat object, sudah pasti kita sering membuat object yang tergantung dengan object lain
- Dependency Injection (DI) adalah teknik dimana kita bisa mengotomatisasi proses pembuatan object yang tergantung dengan object lain, atau kita sebut `dependencies`
- Dependencies akan secara otomatis di-inject (dimasukkan) kedalam object yang membutuhkannya
- Spring Framework sejak awak dibilang sebuah framework IoC yang memang cara kerjanya mengunakan Dependency Injection

# Tanpa Dependency Injection

- Sebenarnya tanpa Dependency Injection pun, kita tetap bisa membuat aplikasi
- Namun, ketika `relasi antar dependencies sangat kompleks`, agar ribet untuk kita melakukannya jika harus manual
- Oleh karena itu, penggunaan Dependency Injection framework seperti Spring sangat membantu sekali

# Spring Dependency Injection

- Spring sejak awal dikenal dengan framework untuk Dependency Injection
- Ketika kita membuat `method untuk bean` di Spring, kita bisa `menambahkan parameter`
- Secara `otomatis` Spring akan `mencarikan bean lain` yang sesuai dengan `tipe parameter` tersebut
- Jika ternyata tidak ada bean yang cocok, maka secara otomatis akan terjadi error
- Dan jika ternyata terdapat bean lebih dari satu, secara otomatis akan terjadi error, kecuali terdapat primary bean