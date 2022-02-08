# Bean Post Processor

- Bean Post Processor merupakan sebuah interface yang bisa kita gunakan untuk `memodifikasi proses pembuatan bean di ApplicationContext`
- Bean Post Processor mirip seperti `middleware/filter`, yang diakses sebelum bean di initialized dan setelah bean di initialized
- Karena sangat flexible, bahkan Bean Post Processor bisa memodifkasi hasil object bean

# Bean ID Generator

- Misal sekarang kita akan coba membuat `id unique` untuk bean
- Dimana kita akan membuat sebuah interface bernama `IdAware`, lalu memiliki method `setId(String)`
- Kita akan membuat Bean Post Processor, dimana jika bean nya implements IdAware, kita akan setId(String) nya menggunakan UUID