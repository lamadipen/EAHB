package edu.mum.ex.dao;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import edu.mum.hw2.domain.Project;
import edu.mum.hw2.domain.User;

public class ProjectDaoImplTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void create() throws ParseException {
		ProjectDaoImpl prjDaoImpl = new ProjectDaoImpl();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Project project = new Project();
		project.setDescription("This is Hibernet project");
		project.setName("Hibernet");
		project.setStartDate(formatter.parse("2015-12-1"));
		project.setEndDate(formatter.parse("2016-8-21"));
		project.setStatus("Pending");
		prjDaoImpl.create(project);
		
		//get by id
		Project resultProject= prjDaoImpl.readById(1);
		//list of project and beneficiaries
		prjDaoImpl.readProjectsBeneficiaries();
		//getting project by status
		prjDaoImpl.readProjectsByStatus();
		//search project by key
		prjDaoImpl.searchProjects("Hibernet");
		
		assertEquals("Hibernet", resultProject.getName());
		
	}
	
	

}
