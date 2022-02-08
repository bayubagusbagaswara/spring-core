# Event Listener

- Spring memiliki fitur Event Listener yang bisa kita gunakan `untuk komunikasi antar class menggunakan Event`
- Event di Spring merupakan object turunan dari ApplicationEvent, sedangkan Listener di Spring merupakan turunan dari ApplicationListener
- Event ini adalah data yang dikirimnya

# Application Event Publisher

- Ketika kita ingin mengirimkan event ke listener, kita bisa menggunakan object ApplicationEventPublisher, dimana ApplicationEventPublisher juga merupakan super interface dari ApplicationContext
- Atau kita bisa menggunakan ApplicationEventPublisherAware untuk mendapatkan object ApplicationEventPublisher