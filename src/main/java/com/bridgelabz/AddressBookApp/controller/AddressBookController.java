package com.bridgelabz.AddressBookApp.controller;

import com.bridgelabz.AddressBookApp.dto.AddressBookDto;
import com.bridgelabz.AddressBookApp.entity.AddressBook;
import com.bridgelabz.AddressBookApp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Layer that receives various HTTP requests from client
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 13/10/2021
 */
@RestController
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    /**
     * Function to receive get request from client
     * @return list of Address
     */
    @GetMapping(value = "/addresses")
    public List<AddressBook> addresses() {
        return addressBookService.addresses();
    }

    /**
     * Function to get request from client
     * @param id unique id of the address
     * @return address with the unique id
     */
    @GetMapping(value = "/getAddress")
    public AddressBook getAddressById(@RequestParam int id) {
        return addressBookService.getAddressById(id);
    }

    /**
     * Function to receive get request from client
     * @param addressBookDto address data from client
     * @return added address in the database
     */
    @PostMapping("/addAddress")
    public AddressBook addAddress(@RequestBody AddressBookDto addressBookDto){
        return addressBookService.addAddress(addressBookDto);
    }

    /**
     * Function to receive put request from client
     * @param id unique id of the person
     * @return updated address
     */
    @PutMapping(value = "/updateAddress/{id}")
    public AddressBook updateAddress(@PathVariable int id, @RequestBody AddressBookDto addressBookDto){
        return addressBookService.updateAddress(id, addressBookDto);
    }

    /**
     * Function to receive delete request from client
     * @param id unique id of the person
     * @return String message displaying status of operation
     */
    @DeleteMapping(value = "/deleteAddress")
    public String deleteAddress(@RequestParam int id) {
        return addressBookService.deleteAddress(id);
    }
}