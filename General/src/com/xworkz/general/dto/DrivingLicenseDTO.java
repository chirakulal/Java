package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DrivingLicenseDTO implements Serializable {


    private String name;
    private String address;
    private long mobile;
    private LocalDate appliedDate;
    private String VehicleType;

    public DrivingLicenseDTO(){

    }

    public DrivingLicenseDTO(String name, String address, long mobile, LocalDate appliedDate, String vehicleType) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.appliedDate = appliedDate;
        VehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "DrivingLicenseDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", appliedDate=" + appliedDate +
                ", VehicleType='" + VehicleType + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }
}
