# Bean Factory

- ApplicationContext adalah interface turunan dari BeanFactory
- BeanFactory merupakan kontrak untuk management bean di Spring
- Method-method yang sebelumnya kita gunakan untuk mengambil bean, sebenarnya merupakan method kontrak dari interface BeanFactory

# Listable Bean Factory

- Bean Factory hanya bisa digunakan untuk mengakses `single bean`, artinya jika terdapat bean dengan tipe yang sama, maka kita harus sebutkan satu per satu nama bean nya
- Listable Bean Factory adalah turunan dari Bean Factory yang bisa kita gunakan untuk mengakses beberapa bean sekaligus
- Dalam beberapa kasus, ini sangat berguna, seperti misal kita ingin mengambil semua bean dengan tipe tertentu
- Application Context juga merupakan turunan dari interface Listable Bean Factory