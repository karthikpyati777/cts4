package com.karthik.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.entities.Address;
import com.karthik.entities.Employee;
import com.karthik.repo.AddressRepository;
import com.karthik.repo.EmplyeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmplyeeRepository empRepo;

	@Autowired
	private AddressRepository addRepo;

	public void deleteEmp() {
		empRepo.deleteById(1);
	}

	public void getAddrData() {
		Optional<Address> findAddress = addRepo.findById(1);
	}

	public void getEmpData() {
		Optional<Employee> findEmployee = empRepo.findById(1);
	}

	public void saveData() {

		Employee emp = new Employee();
		emp.setEmpName("karthiik");
		emp.setEmpSalry(45000.23);

		Address a1 = new Address();
		a1.setCityName("BANGALORE");
		a1.setStateName("KARNATAKA");
		a1.setTypeOfResidence("PRESENT");
		a1.setEmp(emp);

		Address a2 = new Address();
		a2.setCityName("Bellary");
		a2.setStateName("Andra Pradesh");
		a2.setTypeOfResidence("Perminent");
		a2.setEmp(emp);

		List<Address> addrList = Arrays.asList(a1, a2);
		emp.setAddress(addrList);
		empRepo.save(emp);

	}
}
