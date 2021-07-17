package com.example.magic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MagicianService {
    @Autowired
    MagicianRepo magicianRepo;
    public Magician save(Magician magician){
        return magicianRepo.save(magician);
    }
}
