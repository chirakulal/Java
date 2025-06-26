package com.xworkz.cover.repository;

import com.xworkz.cover.dto.SignUpDto;

public interface SignUpImpl {

    String save(SignUpDto signUpDto);

    SignUpDto check(String userId,String password);
}
