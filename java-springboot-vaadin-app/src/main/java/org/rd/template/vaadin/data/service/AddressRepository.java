package org.rd.template.vaadin.data.service;

import org.rd.template.vaadin.data.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}