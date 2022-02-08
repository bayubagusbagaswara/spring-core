# Inheritance

- Saat kita mengakses bean, kita bisa langsung menyebutkan tipe class bean tersebut, atau bisa juga dengan parent class atau parent interface bean
- Misalnya jika kita memiliki interface bernama MerchantService, lalu kita memiliki bean dengan object implementasi class nya adalah MerchantServiceImpl, maka untuk mengakses bean nya, kita tidak hanya bisa menggunakan tipe MerchantServiceImpl, namun juga bisa dengan MerchantService
- Namun perlu berhati-hati, jika misal MerchantService memiliki `banyak bean turunan`, pastikan tidak terjadi error duplicate