package com.xworkz.general.service;

import com.xworkz.general.dto.DrivingLicenseDTO;
import com.xworkz.general.repository.DrivingLicenseRepository;
import com.xworkz.general.repository.DrivingLicenseRepositoryImpl;

public class DrivingLicenseServiceImpl implements DrivingLicenseService{


    @Override
    public String validateAndSave(DrivingLicenseDTO drivingLicenseDTO) {
        DrivingLicenseRepository drivingLicenseRepository = new DrivingLicenseRepositoryImpl();
        drivingLicenseRepository.save(drivingLicenseDTO);
        return "Failed";
    }
}
