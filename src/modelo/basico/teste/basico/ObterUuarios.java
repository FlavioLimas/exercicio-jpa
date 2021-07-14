package modelo.basico.teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUuarios {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String hql = "SELECT u FROM Usuario u";
        TypedQuery<Usuario> query = entityManager.createQuery(hql, Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

        usuarios.forEach(
            u -> System.out.println("ID: " + u.getId() + " E-mail: " + u.getEmail())
        );
        entityManager.close();
        entityManagerFactory.close();
    }
}
