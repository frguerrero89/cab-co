package com.ghs.cabco.ms.company.persistance.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ghs.cabco.ms.company.persistance.entities.Company;

/**
 * This repository handles the database operations related to Companies.
 * @author Francisco Javier Guerrero Peláez
 */
@Repository
public interface CompanyRepo extends JpaRepository<Company, String> {

}
