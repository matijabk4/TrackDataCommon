/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;
import java.sql.Time;

/**
 *
 * @author Matija
 */
public class RaceItem implements Serializable{
    private Race race;
    private int raceNumber;
    private Rider rider;
    private int startPosition;
    private int numberOfLaps;
    private double averageSpeed;
    private double topSpeed;
    private Time fastestLap;
    private int finishPosition;
    private RacingTeam team;

    public RaceItem() {
    }

    public RaceItem(Race race, int raceNumber, Rider rider, int startPosition, int numberOfLaps, double averageSpeed, double topSpeed, Time fastestLap, int finishPosition, RacingTeam team) {
        this.race = race;
        this.raceNumber = raceNumber;
        this.rider = rider;
        this.startPosition = startPosition;
        this.numberOfLaps = numberOfLaps;
        this.averageSpeed = averageSpeed;
        this.topSpeed = topSpeed;
        this.fastestLap = fastestLap;
        this.finishPosition = finishPosition;
        this.team = team;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(int raceNumber) {
        this.raceNumber = raceNumber;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getNumberOfLaps() {
        return numberOfLaps;
    }

    public void setNumberOfLaps(int numberOfLaps) {
        this.numberOfLaps = numberOfLaps;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Time getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(Time fastestLap) {
        this.fastestLap = fastestLap;
    }

    public int getFinishPosition() {
        return finishPosition;
    }

    public void setFinishPosition(int finishPosition) {
        this.finishPosition = finishPosition;
    }

    public RacingTeam getTeam() {
        return team;
    }

    public void setTeam(RacingTeam team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return team.getId()+""+rider.getID()+""+race.getId();
    }

    

    
    
}
