# Component

- Sebelumnya kita sudah belajar membuat dengan menggunakan method di configuration dengan annotation @Bean
- Spring juga menyediakan cara otomatis `tanpa harus` kita `membuat method @Bean`
- Kita bisa menandai sebuah class dengan annotation `@Component`
- Setelah ditandai, secara otomatis Spring akan membuatkan bean untuk class tersebut
- `@Component` hanya mendukung pembuatan satu bean
- Jadi jika kita ingin membuat beberapa bean dengan tipe data yang sama, maka kita tetap harus menggunakan @Bean method

# Component Bean Name

- Saat kita menggunakan @Component, nama bean akan secara otomatis dibuatkan oleh Spring
- Jika kita menggunakan @ComponentScan, secara otomatis bean name akan menggunakan nama class, tetapi menjadi `camelCase`
- Misalnya class CategoryService menjadi categoryService, ProdutWeb menjadi productWeb
- Jika kita menggunakan @Import, secara otomatis bean name akan menjadi `NamaClass.class.getName()`
- Namun, jika kita ingin membuat nama berbeda, kita juga bisa gunakan `@Component(value="namaBean")`

# Annotation

- Semua annotation yang sudah kita bahas di @Bean juga didukung di @Component
- Seperti misalnya @Scope, @PostConstruct, @PreDestroy, @Lazy, @Primary dan lain-lain
