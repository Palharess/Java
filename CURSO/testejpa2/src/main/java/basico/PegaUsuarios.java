package basico;

import entity.PessoasEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PegaUsuarios {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from PessoasEntity u";
        TypedQuery<PessoasEntity> query = em.createQuery(jpql, PessoasEntity.class);
        List<PessoasEntity> lista = query.getResultList();

        for(PessoasEntity p: lista) System.out.println(p.getNome());
        em.close();
        emf.close();
    }
}
