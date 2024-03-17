package basico;

import entity.PessoasEntity;
import jakarta.persistence.*;

public class NovaPessoa {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        PessoasEntity pessoa = new PessoasEntity();
        pessoa.setNome("Jjjj");
        em.persist(pessoa);
        transaction.commit();
        em.close();
        emf.close();

    }
}
