package com.formation.sprformation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class HelloContact {

    ContactRepository contactRepository;

    public HelloContact(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("/api/contact/{email}")
    private Contact getContact(@PathVariable String email){
        return contactRepository.findById(email).get();
    }
    @PostMapping("/api/contact")
    private Contact saveContact(@RequestBody Contact c){
        return contactRepository.save(c);
    }

    @GetMapping("/api/contact")
    private List<Contact> getAllContact(){
        return contactRepository.findAll();
    }
}
