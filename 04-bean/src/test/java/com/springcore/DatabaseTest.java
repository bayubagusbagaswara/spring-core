package com.springcore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void testSingleton() {
        // create database with method static, because can not use private constructor
        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        assertSame(database1, database2); // it is same
    }
}