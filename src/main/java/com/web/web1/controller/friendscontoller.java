package com.web.web1.controller;

import com.web.web1.model.friends;
import com.web.web1.service.friendsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class friendscontoller {

    @GetMapping("/friends")
    public String dude(){
        return ("we just friends buh with benefits, hee!");
    }

    @Autowired
    com.web.web1.service.friendsservice friendsservice;
    @GetMapping("/buddies")
    public ResponseEntity<List<friends>> get(){
       List<friends> friends=  friendsservice.findAll();
       return new ResponseEntity<List<friends>>(friends, HttpStatus.OK);
    }

}

