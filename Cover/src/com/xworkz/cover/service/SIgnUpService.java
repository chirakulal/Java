package com.xworkz.cover.service;

import com.xworkz.cover.dto.SignUpDto;

public interface SIgnUpService {

    String validate(SignUpDto signUpDto);

   String check(String userId, String password);
}
