package com.metin.strategy.example1;

public class CryptB implements Crypt {

    public void encrypt(String text) {
        System.out.println(text + " is encrypting using CryptB");
    }

    public void decrypt(String text) {
        System.out.println(text + " is decrypting using CryptB");
    }
}
