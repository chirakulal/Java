package com.xworkz.chira.service;

import com.xworkz.chira.dto.RegisterDto;
import com.xworkz.chira.repository.RegisterRepository;
import com.xworkz.chira.repository.RegisterRepositoryImpl;

public class RegisterServiceImpl implements RegisterService{
    @Override
    public String validate(RegisterDto registerDto) {
        System.out.println("Connected to service");

        RegisterRepository repository = new RegisterRepositoryImpl();
        repository.save(registerDto);

        return "Connected";
    }
}
