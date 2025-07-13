package com.xworkz.chira.repository;

import com.xworkz.chira.dto.RegisterDto;

public interface RegisterRepository {

    String save(RegisterDto registerDto);
}
