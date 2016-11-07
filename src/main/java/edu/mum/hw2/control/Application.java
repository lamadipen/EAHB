package edu.mum.hw2.control;

import java.nio.file.*;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.mum.hw2.domain.Project;
import edu.mum.hw2.domain.Task;


public class Application {

	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("cs544");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {

		addMovies();
		printMoviesReport();
		emf.close();
	}

	private static void printMoviesReport() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.createQuery("from Movie").getResultList().forEach(System.out::println);
	}

	private static void addMovies() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			Project suman = new Project();
			/**
			suman.setCharacter("hero");
			suman.setRating(5);
			suman.setName("SUperMAN");
			Task movie = new Task();
			List<Project> sumanActs = new ArrayList<Project>();
			sumanActs.add(suman);
			movie.setActors(sumanActs);
			movie.setCover(Files.readAllBytes(Paths.get("Pics/p.jpg")));
			movie.setName("Khatra Movie 1");
			movie.setRating(1);
			em.persist(movie);

			**/
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive())) tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen())) em.close();
		}
	}

}
