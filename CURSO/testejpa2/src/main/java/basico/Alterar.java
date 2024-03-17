package basico;

import entity.PessoasEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Alterar {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        PessoasEntity pessoa = em.find(PessoasEntity.class, 2);
        em.detach(pessoa);
        pessoa.setNome("Leo");





        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
