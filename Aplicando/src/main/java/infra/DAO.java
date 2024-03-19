package infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DAO <E>{
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("default");
        }catch (Exception e){

        }
    }
    public DAO(){
        this(null);
    }

    public DAO(Class<E> classe){
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> abrirT(){
        em.getTransaction().begin();
        return this;
    }
    public DAO<E> fecharT(){
        em.getTransaction().commit();
        return this;
    }
    public DAO<E> incluir(E entidade){
        em.persist(entidade);
        return this;
    }
    public DAO<E> incluirAtomico(E entidade){
        return this.abrirT().incluir(entidade).fecharT();

    }
    public E obterClienteId(Object id){
        return em.find(classe, id);
    }
    public List<E> obterTodos(int qtd, int deslocamento){
        if(classe == null){
            throw new UnsupportedOperationException("Classe nula.");
        }
        String jpql = "Select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qtd);
        query.setFirstResult(deslocamento);
        return query.getResultList();

    }
    public void fechar(){
        em.close();
    }
}
