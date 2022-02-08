package com.springcore.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

/**
 * Doubleton artinya hanya ada maksimal 2 object yang berbeda
 * jika sudah maksimal, maka kita return object nya
 */
public class DoubletonScope implements Scope {

    private Long counter = -1L;

    private List<Object> objects = new ArrayList<>(2);

    // untuk mengambil object nya, saat si Spring melakukan getBean()
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;
        if (objects.size() == 2) {
            // jika objects udah ada 2 data objectnya, maka tinggal ambil object berdasarkan index
            int index = (int) (counter % 2); // 0 or 1
            return objects.get(index);
        } else {
            // objects belum ada 2, maka buat object baru
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    // untuk menghapus
    @Override
    public Object remove(String name) {
        if (!objects.isEmpty()) {
            // hapus object paling pertama
            return objects.remove(0);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
