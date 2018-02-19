package br.com.fiap.exercicio;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.exercicio.Clientee;

public class Teste2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		Clientee cliente = new Clientee("lucas", new GregorianCalendar(1995, Calendar.NOVEMBER,20), "195hg", Sexo.MASCULINO, null, Status.ATIVO);
		
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}

}
