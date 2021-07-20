package com.example.magic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class MagicianController {
    Logger log = LoggerFactory.getLogger(MagicianController.class);

    @Autowired
    MagicianService magicianService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Magician magician){
        Magician magician1 = magicianService.save(magician);
        log.info("saved magician {}", magician1.getName());
        return new ResponseEntity<Magician>(magician1, HttpStatus.OK);
    }
}
