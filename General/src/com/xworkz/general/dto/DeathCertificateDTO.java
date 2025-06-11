package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class DeathCertificateDTO implements Serializable {


    private String name;
    private String cause;
    private LocalDate date;
    private LocalTime time;
    private int ageAtDeath;
    private String certifyBy;
    private String hospitalName;
    private String mannerOfDeath;


    public DeathCertificateDTO(){

    }

    @Override
    public String toString() {
        return "DeathCertificateDTO{" +
                "name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", ageAtDeath=" + ageAtDeath +
                ", certifyBy='" + certifyBy + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", mannerOfDeath='" + mannerOfDeath + '\'' +
                '}';
    }

    public DeathCertificateDTO(String name, String cause, LocalDate date, LocalTime time, int ageAtDeath, String certifyBy, String hospitalName, String mannerOfDeath) {
        this.name = name;
        this.cause = cause;
        this.date = date;
        this.time = time;
        this.ageAtDeath = ageAtDeath;
        this.certifyBy = certifyBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath = mannerOfDeath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
