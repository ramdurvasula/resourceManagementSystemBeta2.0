package com.htcadvjava.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htcadvjava.test.model.Allocation;
import com.htcadvjava.test.model.Employee;
import com.htcadvjava.test.model.Project;
import com.htcadvjava.test.model.Role;
import com.htcadvjava.test.repository.AllocationRepository;
import com.htcadvjava.test.repository.EmployeeRepository;
import com.htcadvjava.test.repository.ProjectRepository;
import com.htcadvjava.test.repository.RoleRepository;

@Controller
public class AllocationController {

	@Autowired
	AllocationRepository repository;
	@Autowired
	EmployeeRepository empRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	ProjectRepository projectRepository;
	
	@GetMapping("allocation")
	public String enterAllocation(ModelMap modelMap) {
		
		List<Employee> empList = new ArrayList<Employee>();
		List<Role> roleList = new ArrayList<Role>();
		List<Project> projectList = new ArrayList<Project>();
		
		for(Project projects : projectRepository.findAll()) {
			projectList.add(projects);				
		}
		
		for(Role roles : roleRepository.findAll()) {
			roleList.add(roles);				
		}
		
		for(Employee emp : empRepository.findAll()) {
			empList.add(emp);
		}
		
		modelMap.addAttribute("projectList", projectList);
		modelMap.addAttribute("roleList", roleList);
		modelMap.addAttribute("empList",empList);
		return "allocationDetails";
	}
	
	@PostMapping("/addAllocation")
	public String addRole(@ModelAttribute Allocation allocation,ModelMap modelMap) {
		
		List<Allocation> allocationList = new ArrayList<Allocation>();
		
		repository.save(allocation);
		
		for(Allocation allocations : repository.findAll()) {
			allocationList.add(allocations);				
		}
		
		modelMap.addAttribute("allocationList", allocationList);
		return "showAllocations";
	}
}
