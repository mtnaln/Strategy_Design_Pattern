package com.metin.strategy.example1;

public class CryptA implements Crypt {

    public void encrypt(String text) {
        System.out.println(text + " is encrypting using CryptA");
    }

    public void decrypt(String text) {
        System.out.println(text + " is decrypting using CryptA");
    }
}
