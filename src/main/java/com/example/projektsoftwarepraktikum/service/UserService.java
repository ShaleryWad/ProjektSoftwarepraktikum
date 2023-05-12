package com.example.projektsoftwarepraktikum.service;

import com.example.projektsoftwarepraktikum.entity.Benutzer;
import com.example.projektsoftwarepraktikum.repository.BenutzerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private BenutzerRepository userRepository;

    public Benutzer saveUser(Benutzer user) {
        return userRepository.save(user);
    }

    public List<Benutzer> findAllUsers() {
        return userRepository.findAll();
    }
}