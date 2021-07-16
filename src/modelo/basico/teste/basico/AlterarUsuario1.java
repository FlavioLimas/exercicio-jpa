package modelo.basico.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

    public static void main(String[] args) {
        EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager entityManager = eManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Usuario usuario = entityManager.find(Usuario.class, 7L);
        usuario.setNome("Leonardo");
        usuario.setEmail("leonardo@lanche.com.br");
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();

        entityManager.close();
        eManagerFactory.close();
    }
    
}
