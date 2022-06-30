package com.example.sumaa2numere.Services;

import com.example.sumaa2numere.Entities.Numar;

import java.util.Random;

public class NumarService {


    public Numar getRandomNumber(){
        Random rand = new Random();
        int numar_random = rand.nextInt(100);
        Numar numar = new Numar(numar_random);
        return numar;
    }
}
