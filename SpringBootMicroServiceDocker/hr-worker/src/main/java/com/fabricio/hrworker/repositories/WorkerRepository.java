package com.fabricio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabricio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
