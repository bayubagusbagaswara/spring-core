# Constructor-based Dependency Injection

- Pertama yang bisa kita lakukan untuk Dependency Injection di @Component adalah menggunakan constructor parameter
- Kita bisa menambahkan constructor yang memiliki parameter jika membutuhkan bean lain
- Secara otomatis Spring akan mencarikan bean tersebut, dan ketika membuat bean @Component, Spring akan menggunakan bean yagn dibutuhkan di constructor
- Constructor-based Dependency Injection `hanya mendukung satu constructor`
- Jadi pastikan kita hanya membuat satu constructor

# Multiple Constructor

- Seperti di awal disebutkan bahwa Spring hanya mendukung satu constructor untuk Dependency Injection nya
- Namun bagaimana jika terdapat multiple constructor?
- Jika pasa kasus seperti ini, maka kita harus menandai constructor mana yang akan digunakan oleh Spring
- Caranya kita bisa menggunakan annotation `@Autowired`