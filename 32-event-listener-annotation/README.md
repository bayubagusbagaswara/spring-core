# Event Listener Annotation

- Selain menggunakan interface ApplicationListener, kita juga bisa menggunakan Annotation untuk membuat Listener
- Ini lebih flexible dibanding menggunakan interface ApplicationListener
- Kita bisa menggunakan annotation `@EventListener`

# Cara Kerja Event Listener Annotation?

- Annotation @EventListener bekerja dengan menggunakan Bean Post Processor bernama `EventListenerMethodProcessor`
- EventListenerMethodProcessor mendeteksi jika ada bean yang memiliki method dengan annotation `@EventListener`, maka secara `otomatis` akan `membuat listener` baru, lalu meregistrasikannya ke `ApplicationContext.addApplicationListener(listener)`