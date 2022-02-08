package com.springcore.data;

import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MultiFoo {

    @Getter
    private List<Foo> foos;

    // parameter ObjectProvider
    public MultiFoo(ObjectProvider<Foo> objectProvider) {
        // jika mau ambil object provider satu saja
        // objectProvider.getIfAvailable();

        // jika mau ambil semuanya
        foos = objectProvider.stream().collect(Collectors.toList());
    }
}
