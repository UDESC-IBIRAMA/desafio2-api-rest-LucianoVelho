/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Veiculo;

/**
 *
 * @author lucia
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

   public List<Veiculo> findQuilometragem(int quilometragem) {
       Query query = getEntityManager().createQuery("Select v from Veiculo v where v.quilometragem = :quilometragem ");
        query.setParameter("quilometragem", quilometragem );
        return query.getResultList();
    }
   public List<Veiculo> findCor (String cor){
        Query query = getEntityManager().createQuery("Select v from Veiculo v where v.cor = :cor ");
        query.setParameter("cor", cor );
        return query.getResultList();
    }
    public List<Veiculo> findMotor (String motor){
        Query query = getEntityManager().createQuery("Select v from Veiculo v where v.motor = :motor ");
        query.setParameter("motor", motor );
        return query.getResultList();
    }
       public List<Veiculo> findTipo (String tipo){
        Query query = getEntityManager().createQuery("Select v from Veiculo v where v.tipo = :tipo ");
        query.setParameter("tipo", tipo );
        return query.getResultList();
    }

   public List<Veiculo> findCorMotor(String cor, String motor) {
        Query query = getEntityManager().createQuery("Select v from Veiculo v where v.cor = :cor and v.motor = :motor ");
        query.setParameter("cor", cor );
        query.setParameter("motor", motor);
        return query.getResultList();   
    }

   public List<Veiculo> findCorQuilometragem(String cor, int quilometragem) {
       Query query = getEntityManager().createQuery("Select v from Veiculo v where v.cor = :cor and v.quilometragem = :quilometragem ");
        query.setParameter("cor", cor );
        query.setParameter("quilometragem", quilometragem);
        return query.getResultList();  
    }

  public  List<Veiculo> findCorTipo(String cor, String tipo) {
           Query query = getEntityManager().createQuery("Select v from Veiculo v where v.cor = :cor and v.tipo = :tipo ");
        query.setParameter("cor", cor );
        query.setParameter("tipo", tipo);
        return query.getResultList();  
    }
   public List<Veiculo> findMotorQuilometragem(String motor, int quilometragem) {
       Query query = getEntityManager().createQuery("Select v from Veiculo v where v.motor = :motor and v.quilometragem = :quilometragem ");
        query.setParameter("motor", motor );
        query.setParameter("quilometragem", quilometragem);
        return query.getResultList();  
    }

   public List<Veiculo> findMotorTipo(String motor, String tipo) {
        Query query = getEntityManager().createQuery("Select v from Veiculo v where v.motor = :motor and v.tipo = :tipo ");
        query.setParameter("motor", motor );
        query.setParameter("tipo", tipo);
        return query.getResultList(); 
    }

   public List<Veiculo> findQuilometragemTipo(int quilometragem, String tipo) {
        Query query = getEntityManager().createQuery("Select v from Veiculo v where v.quilometragem = :quilometragem and v.tipo = :tipo ");
        query.setParameter("quilometragem", quilometragem );
        query.setParameter("tipo", tipo);
        return query.getResultList();  
    }

   public List<Veiculo> findQuilometragemTipo(int quilometragem, String tipo, String motor) {
         Query query = getEntityManager().createQuery("Select v from Veiculo v where v.quilometragem = :quilometragem and v.tipo = :tipo and v.motor = :motor");
        query.setParameter("quilometragem", quilometragem );
        query.setParameter("tipo", tipo);
        query.setParameter("motor", motor);
        return query.getResultList();   
    }

   public List<Veiculo> findCorQuilometragemTipo(String cor, int quilometragem, String tipo) {
         Query query = getEntityManager().createQuery("Select v from Veiculo v where v.cor = :cor and v.quilometragem = :quilometragem and v.tipo = :tipo ");
        query.setParameter("cor", cor );
        query.setParameter("quilometragem", quilometragem);
        query.setParameter("tipo", tipo);
        return query.getResultList(); 
    }

   public List<Veiculo> findCorQuilometragemMotor(String cor, int quilometragem, String motor) {
        Query query = getEntityManager().createQuery("Select v from Veiculo v where v.cor = :cor and v.quilometragem = :quilometragem and v.motor = :motor ");
        query.setParameter("cor", cor );
        query.setParameter("quilometragem", quilometragem);
        query.setParameter("motor", motor);
        return query.getResultList();
    }

   public List<Veiculo> findCorTipoMotor(String cor, String tipo, String motor) {
       Query query = getEntityManager().createQuery("Select v from Veiculo v where v.cor = :cor and v.tipo = :tipo and v.motor = :motor ");
        query.setParameter("cor", cor );
        query.setParameter("tipo", tipo);
        query.setParameter("motor", motor);
        return query.getResultList();  
    }

  public  List<Veiculo> findCorTipoMotorQuilometragem(String cor, String tipo, String motor, int quilometragem) {
           Query query = getEntityManager().createQuery("Select v from Veiculo v where v.cor = :cor and v.tipo = :tipo and v.motor = :motor and v.quilometragem  = :quilometragem");
        query.setParameter("cor", cor );
        query.setParameter("tipo", tipo);
        query.setParameter("motor", motor);
        query.setParameter("quilometragem", quilometragem);
        return query.getResultList(); 
    }

   public List<Veiculo> findMontadoraNome(String montadora_nome) {
        Query query = getEntityManager().createQuery("Select v from Veiculo v Left join v.montadora m where m.nome = :nome ");
        query.setParameter("montadora_nome", montadora_nome );
        return query.getResultList();
    }

    List<Veiculo> findModeloNome(String modelo_nome) {
         Query query = getEntityManager().createQuery("Select v from Veiculo v Left join v.modelo m where m.nome = :nome ");
        query.setParameter("modelo_nome", modelo_nome );
        return query.getResultList();
    }
    
}
