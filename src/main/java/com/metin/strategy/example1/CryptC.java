package com.metin.strategy.example1;

public class CryptC implements Crypt {

    public void encrypt(String text) {
        System.out.println(text + " is encrypting using CryptC");
    }

    public void decrypt(String text) {
        System.out.println(text + " is decrypting using CryptC");
    }
}
