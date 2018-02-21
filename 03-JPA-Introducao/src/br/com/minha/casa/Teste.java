package br.com.minha.casa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		Paciente paciente = new Paciente("Lucas", Sexo.MASCULINO, "Febre", new GregorianCalendar(1995, Calendar.NOVEMBER, 22 ),Status.ATIVO);
		
		em.getTransaction().begin();
		em.persist(paciente);
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}

}
