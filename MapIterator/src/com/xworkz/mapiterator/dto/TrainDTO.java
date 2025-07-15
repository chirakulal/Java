package com.xworkz.mapiterator.dto;

import java.util.Objects;

public class TrainDTO {
    private String trainName;
    private int trainNumber;
    private String sourceStation;
    private String destinationStation;
    private int totalCoaches;
    private double averageSpeedKmph;
    private String trainType;
    private boolean isElectric;
    private double distanceInKms;
    private String runningDays;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrainDTO)) return false;
        TrainDTO trainDTO = (TrainDTO) o;
        return trainNumber == trainDTO.trainNumber && totalCoaches == trainDTO.totalCoaches && Double.compare(averageSpeedKmph, trainDTO.averageSpeedKmph) == 0 && isElectric == trainDTO.isElectric && Double.compare(distanceInKms, trainDTO.distanceInKms) == 0 && Objects.equals(trainName, trainDTO.trainName) && Objects.equals(sourceStation, trainDTO.sourceStation) && Objects.equals(destinationStation, trainDTO.destinationStation) && Objects.equals(trainType, trainDTO.trainType) && Objects.equals(runningDays, trainDTO.runningDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainName, trainNumber, sourceStation, destinationStation, totalCoaches, averageSpeedKmph, trainType, isElectric, distanceInKms, runningDays);
    }

    @Override
    public String toString() {
        return "TrainDTO{" +
                "trainName='" + trainName + '\'' +
                ", trainNumber=" + trainNumber +
                ", sourceStation='" + sourceStation + '\'' +
                ", destinationStation='" + destinationStation + '\'' +
                ", totalCoaches=" + totalCoaches +
                ", averageSpeedKmph=" + averageSpeedKmph +
                ", trainType='" + trainType + '\'' +
                ", isElectric=" + isElectric +
                ", distanceInKms=" + distanceInKms +
                ", runningDays='" + runningDays + '\'' +
                '}';
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public TrainDTO(String trainName, int trainNumber, String sourceStation, String destinationStation, int totalCoaches, double averageSpeedKmph, String trainType, boolean isElectric, double distanceInKms, String runningDays) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.totalCoaches = totalCoaches;
        this.averageSpeedKmph = averageSpeedKmph;
        this.trainType = trainType;
        this.isElectric = isElectric;
        this.distanceInKms = distanceInKms;
        this.runningDays = runningDays;
    }
}
