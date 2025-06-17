package com.xworkz.caste.service;

import com.xworkz.caste.dto.CasteDTO;
import com.xworkz.caste.repository.CasteRepository;
import com.xworkz.caste.repository.CasteRepositoryImpl;

public class CasteServiceImpl implements CasteService {
    @Override
    public String validate(CasteDTO casteDTO) {

        CasteRepository casteRepository = new CasteRepositoryImpl();
        casteRepository.save(casteDTO);
        return "Failed";
    }
}
