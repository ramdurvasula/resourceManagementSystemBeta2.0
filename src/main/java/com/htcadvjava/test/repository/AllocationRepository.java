package com.htcadvjava.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.htcadvjava.test.model.Allocation;

public interface AllocationRepository extends CrudRepository<Allocation, Integer> {
	

}
