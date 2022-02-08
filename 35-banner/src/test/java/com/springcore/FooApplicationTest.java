package com.springcore;

import com.springcore.application.FooApplication;
import com.springcore.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {

    // kita tidak bikin application context manual, karena sudah dihandle oleh SpringBootTest
    // dan untuk ambil bean dari application context cukup autowired,
    // lalu spring akan inject tipe bean yang kita butuhkan
    @Autowired
    Foo foo;

    @Test
    void testSpringBoot() {
        Assertions.assertNotNull(foo);
    }
}
