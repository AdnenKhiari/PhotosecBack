package com.formation.sprformation;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class Hello {

     Integer age = -1;
     Member personne1;

    MemberRepository memberRepository;
    List<String> asami = List.of("adnen","khalil","etc");

    public Hello(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @GetMapping("/api")
    public String hello(){
        return "hello";
    }

    @GetMapping("/api/{name}/{lastname}")
    public String sayAName(@PathVariable("name") String name1 ,@PathVariable("lastname") String name2){
        return "hello " + name1.toUpperCase() + " - " + name2;
    }

    @GetMapping("/api/index/{place}")
    public String getPlace(@PathVariable Integer place ){
        return asami.get(place);
    }

    @PostMapping("/api/r2/send")
    public Member sendSmth(@RequestBody Member var ){
        personne1 = var;
        memberRepository.save(personne1);
        return personne1;
    }

    @PatchMapping("/api/r2/update")
    public Member updateSmth(@RequestBody Member var ){
        memberRepository.save(var);
        return personne1;
    }

    @DeleteMapping("/api/r2/delete")
    public Member deleteSmth(@RequestBody Member var ){
        memberRepository.delete(var);
        return personne1;
    }

    @GetMapping("/api/r2/get/{nom}")
    public Member sendSmth(@PathVariable String nom){
        return memberRepository.findById(nom).get();
    }

    @GetMapping("/api/r2/get/all")
    public List<Member> sendSmth(){
        return memberRepository.findAll();
    }

}
