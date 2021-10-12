package com.bridgelabz.AddressBookApp.repository;

import com.bridgelabz.AddressBookApp.entity.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Layer that implements interface
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 13/10/2021
 */
@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Integer> {
}
