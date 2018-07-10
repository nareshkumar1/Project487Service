package com.project487.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project487.domain.Organization;

@Repository
public interface OrganizationRepository extends MongoRepository<Organization, Long>{

	public Organization findByOrganizationId(String organizationId);
}
