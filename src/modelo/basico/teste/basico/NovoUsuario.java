package modelo.basico.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Andre", "andre@lanche.com.br");
        Usuario novoUsuario1 = new Usuario("Rodrigo", "rodrigo@lanche.com.br");
        Usuario novoUsuario2 = new Usuario("Carlos", "carlos@lanche.com.br");
        Usuario novoUsuario3 = new Usuario("Arthur", "arthur@lanche.com.br");
        Usuario novoUsuario4 = new Usuario("Djalma", "djalma@lanche.com.br");
        Usuario novoUsuario5 = new Usuario("Lulu", "lulu@lanche.com.br");
        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.persist(novoUsuario1);
        em.persist(novoUsuario2);
        em.persist(novoUsuario3);
        em.persist(novoUsuario4);
        em.persist(novoUsuario5);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
