# Circular Dependencies

- Hat-hati dengan circular dependencies
- Circular dependencies adalah kasus dimana sebuah `lingkaran dependency` terjadi
- Misalnya Bean A membutuhkan Bean B, dan Bean B membutuhkan Bean C, dan ternyata Bean C membutuhkan Bean A
- Jika terjadi cyclic seperti ini, maka secara otomatis Spring bsia mendeteksinya, dan akan menganggap bahwa itu adalah error
