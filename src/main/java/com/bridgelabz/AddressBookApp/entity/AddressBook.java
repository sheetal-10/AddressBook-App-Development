package com.bridgelabz.AddressBookApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class AddressBook {
    @Id
    private int id;
    private String name;
    private String address;
}
