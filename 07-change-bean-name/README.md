# Mengubah Nama Bean

- Secara default, nama bean akan diambil dari nama method yang membuat sebuah object bean nya
- Namun, kadan-kadang kita tidak ingin menggunakan nama method untuk nama bean
- Saat project kita sudah besar, kadang bisa jadi nama method nya sama, walaupun ini bean nya berbeda.
- Dan di Spring, `nama bean itu unik`, `tidak boleh sama`
- Jika kita ingin mengubah nama bean, maka kita bisa menggunakan method `value()` milik annotation @Bean