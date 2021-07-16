package modelo.basico.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {
        EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager entityManager = eManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.getTransaction().commit();

        entityManager.close();
        eManagerFactory.close();
    }
    
}
