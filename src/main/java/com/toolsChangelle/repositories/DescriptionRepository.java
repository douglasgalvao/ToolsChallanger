package com.toolsChangelle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toolsChangelle.entities.Description;
@Repository
public interface DescriptionRepository extends JpaRepository<Description, Long> {}
