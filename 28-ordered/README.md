# Ordered

- Saat kita membuat Bean Post Processor, kita bisa membuat lebih dari satu bean post processor nya
- Kadang ada kasus saat membuat beberapa Bean Post Processor, kita ingin membuat secara berurutan
- Sayangnya secara default, Spring tidak menjamin urutan eksekusinya
- Agar kita bisa menentukan urutannya, kita bisa menggunakan `interface Ordered`