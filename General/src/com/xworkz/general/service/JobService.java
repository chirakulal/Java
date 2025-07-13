package com.xworkz.general.service;

import com.xworkz.general.dto.JobDTO;

public interface JobService {

    String validateAndSave(JobDTO jobDTO);
}
