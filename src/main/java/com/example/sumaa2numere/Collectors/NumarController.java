package com.example.sumaa2numere.Collectors;


import com.example.sumaa2numere.Entities.Numar;
import com.example.sumaa2numere.Services.NumarService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NumarController {

    @GetMapping("/getRandomNumber")
    Numar getRandomNumber(){
        return (new NumarService()).getRandomNumber();
    }
}
