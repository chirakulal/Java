package com.xworkz.general.service;

import com.xworkz.general.dto.PassportDTO;

public interface PassportService {

    String validateAndSave(PassportDTO passportDTO);
}
