package com.springcore;

import com.springcore.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanTest {

    @Test
    void testDuplicate() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        // ERROR, karena ada 2 Bean dengan tipe data yang sama yakni Foo
        // Spring akan bingung, dia mau getBean pada bean yang mana
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = applicationContext.getBean(Foo.class);
        });
    }

    @Test
    void getBean() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        // karena nama bean nya berbeda, maka kita bisa memasukkan nama bean nya, saat ingin mengambil data bean dari container
        Foo foo1 = applicationContext.getBean("foo1", Foo.class);
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2); // object foo1 dan foo2 tidak sama
    }

}
