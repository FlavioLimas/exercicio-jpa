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
        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.persist(novoUsuario1);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
