# Spring Boot Application

- Sebelumnya kita selalu membuat Application Context secara manual, dan kita belum menggunakan fitur otomatis Spring Boot
- Pada saat membuat aplikasi Spring Boot, kita akan mengganti `@Configuration` utama menjadi `@SpringBootApplication`
- Isi dari `@SpringBootApplication` itu sendiri sebenarnya gabungan dari `@Configuration` dan banyak hal lain, seperti contohnya `@ComponentScan`

# Spring Application

- Selain @SpringBootApplication, untuk `membuat Application Context` nya, kita tidak perlu membuat manual, kita bisa gunakan `class SpringApplication`
- Secara otomatis SpringApplication akan membuat ApplicationContext dan melakukan hal-hal yang dibutuhkan secara otomatis

# Spring Boot Test

- Untuk membuat unit test di Spring Boot, kita bisa menggunakan annotation `@SpringBootTest(classes={YourConfiguration.class})`
- Selanjutnya kita tidak perlu mengambil bean secara manual lagi menggunakan ApplicationContext, kita bisa menggunakan DI secara langsung di unit test nya menggunakan `@Autowired`