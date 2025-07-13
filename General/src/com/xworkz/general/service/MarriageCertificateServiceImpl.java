package com.xworkz.general.service;

import com.xworkz.general.dto.MarriageCertificateDTO;
import com.xworkz.general.repository.MarriageCertificateRepository;
import com.xworkz.general.repository.MarriageCertificateRepositoryImpl;

public class MarriageCertificateServiceImpl implements MarriageCertificateService{

    @Override
    public String validateAndSave(MarriageCertificateDTO marriageCertificateDTO) {

        MarriageCertificateRepository marriageCertificateRepository = new MarriageCertificateRepositoryImpl();
        marriageCertificateRepository.save(marriageCertificateDTO);
        return "Failed";
    }
}
