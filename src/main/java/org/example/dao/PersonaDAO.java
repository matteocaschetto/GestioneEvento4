package org.example.dao;

import org.example.entities.Persona;

import javax.persistence.EntityManager;

public class PersonaDAO {

    private EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save (Persona p){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public Persona getById(long id){
        return em.find(Persona.class, id);
    }

    public void remove(Persona p){
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
}
