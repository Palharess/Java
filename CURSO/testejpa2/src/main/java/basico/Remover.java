package basico;

import entity.PessoasEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Remover {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        PessoasEntity p_r = em.find(PessoasEntity.class, 4);

        if(p_r != null){
            em.getTransaction().begin();
            em.remove(p_r);

            em.getTransaction().commit();
        }
        else{
            throw new RuntimeException("Esse usuário não está na tabela!");
        }
    }
}
