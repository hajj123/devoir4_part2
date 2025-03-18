package com.example.devoir4;

import com.example.devoir4.entity.Employee;
import jakarta.persistence.PersistenceContext;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;

@Stateless(name = "aaaEJB")
public class aaaBean {

  @PersistenceContext(unitName = "default")
  public EntityManager em;

  public aaaBean() {
  }

  public String abc() {
    Employee e = new Employee();
    e.setId((short) 5555);
    e.setNom("Bill Gates");
    e.setAge("40");
    //em.persist(e);

    // Récupère l’employee dans la BD par sa clé primaire
    Employee e1 = em.find(Employee.class, (short) 5555);
    System.out.println(e1.getId());

    return "abc" + e;
  }
}