package org.example;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Guilherme", "gh@gmail.com");
        Pessoa p2 = new Pessoa(null, "Biju", "biju@gmail.com");
        Pessoa p3 = new Pessoa(null, "Malu", "balu@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("poggers-jpa"); // Instancia do EntityManagerFactory
        EntityManager em = emf.createEntityManager(); // Instancia do EntityManager e conexao com o banco de dados

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Persistido com sucesso!");

    }
}
