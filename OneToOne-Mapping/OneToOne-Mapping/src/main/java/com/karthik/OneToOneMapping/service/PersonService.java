package com.karthik.OneToOneMapping.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.OneToOneMapping.entities.Passport;
import com.karthik.OneToOneMapping.entities.Person;
import com.karthik.OneToOneMapping.repository.PassportRepository;
import com.karthik.OneToOneMapping.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepo;

//	@Autowired
//	private PassportRepository passPortRepo;

	public void saveData() {
		Person p = new Person();
		p.setPersonName("KARTHIK");
		p.setPersonGender("MALE");

		Passport pp = new Passport();
		pp.setPassportNum("JK3642687632");
		pp.setIssueDate(LocalDate.now());
		pp.setExpireDate(LocalDate.now().plusYears(10));

		p.setPassport(pp);
		pp.setPerson(p);
		
		personRepo.save(p);

	}
	
	public void delete() {
		
		personRepo.deleteById(1);
	}
}
