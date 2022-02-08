# Factory Bean

- Kadang ada kasus dimana sebuah class misal bukanlah milik kita, misal class `third party library`
- Sehingga agak sulit jika kita harus menambahkan annotation pada class tersebut
- Pada kasus seperti ini, cara terbaik untuk `membuat bean nya adalah dengan menggunakan @Bean method`
- Atau di Spring, kita juga bisa menggunakan `@Component`, namun kita perlu wrap dalam class `Factory Bean`