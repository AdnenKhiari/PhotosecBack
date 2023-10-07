package com.formation.sprformation.Controllers;

import com.formation.sprformation.EN;
import com.formation.sprformation.ENRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class Test {
    final ENRepository enRepository;
    public Test(ENRepository enRepository){
        this.enRepository = enRepository;
    }

    String lastName = "Fergha";
    @GetMapping("/again/{name}")
    public String hello(@PathVariable String name){
        return "hii " + name;
    }

    @PostMapping("/")
    public EN pp(@RequestBody String name){
        lastName = name;
        EN o1 = new EN(name);
        return enRepository.save(o1);
    }

    @GetMapping("/giveme")
    public String giveme(){
        return lastName;
    }

}
