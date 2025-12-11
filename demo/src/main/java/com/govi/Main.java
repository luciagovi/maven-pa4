package com.govi;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona = new Persona("Paco", "Pepe", 25, "paco@pepe.com");
        Gson gson = new Gson();
        String json = gson.toJson(persona);
        System.out.println(json);

    }
}