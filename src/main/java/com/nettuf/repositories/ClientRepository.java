package com.nettuf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nettuf.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
