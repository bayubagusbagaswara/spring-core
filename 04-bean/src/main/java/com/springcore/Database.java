package com.springcore;

public class Database {

    private static Database database;

    public static Database getInstance() {
        // cek jika object database nya null
        if (database == null) {
            // create object database
            database = new Database();
        }

        // if not null, return database is the same object
        return database;
    }

    // private constructor
    public Database() {
    }
}
