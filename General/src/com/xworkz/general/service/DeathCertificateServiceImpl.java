package com.xworkz.general.service;

import com.xworkz.general.dto.DeathCertificateDTO;

public class DeathCertificateServiceImpl implements DeathCertificateService{


    @Override
    public String validateAndSave(DeathCertificateDTO deathCertificateDTO) {

        System.out.println("Saving the death in db...");
        System.out.println("WARN:connected to db");
        return "Failed";
    }
}
