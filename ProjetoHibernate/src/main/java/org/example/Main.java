package org.example;

import dominio.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "Guilherme", "gh@gmail.com");
        Pessoa p2 = new Pessoa(2, "Biju", "biju@gmail.com");
        Pessoa p3 = new Pessoa(3, "Malu", "balu@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
