package com.xworkz.general.service;

import com.xworkz.general.dto.BirthCertificateDTO;
import com.xworkz.general.repository.BirthCertificateRepository;
import com.xworkz.general.repository.BirthCertificateRepositoryImpl;

public class BirthCertificateServiceImpl implements BirthCertificateService{


    @Override
    public String validateAndSave(BirthCertificateDTO birthCertificateDTO) {

        BirthCertificateRepository birthCertificateRepository = new BirthCertificateRepositoryImpl();
        birthCertificateRepository.save(birthCertificateDTO);
        return "Failed";
    }
}
