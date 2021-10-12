package com.bridgelabz.AddressBookApp.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Layer that contains entities in database
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 13/10/2021
 */
@Entity
@Data
public class AddressBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
}
