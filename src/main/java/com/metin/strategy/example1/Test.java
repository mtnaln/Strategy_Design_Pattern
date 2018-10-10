package com.metin.strategy.example1;

public class Test {

    public static void main(String[] args) {

        Crypt cryptA = new CryptA();
        cryptA.encrypt("\"Yusuf\"");
        cryptA.decrypt("\"Yusuf\"");

        System.out.println();

        Crypt cryptB = new CryptB();
        cryptB.encrypt("\"Metin\"");
        cryptB.decrypt("\"Metin\"");

        System.out.println();

        Crypt cryptC = new CryptC();
        cryptC.encrypt("\"Dilek\"");
        cryptC.decrypt("\"Dilek\"");
    }
}
