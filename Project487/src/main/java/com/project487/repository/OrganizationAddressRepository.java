package com.project487.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project487.domain.OrganizationAddress;

@Repository
public interface OrganizationAddressRepository extends MongoRepository<OrganizationAddress, Long> {

}
