/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Matija
 */
public class Race implements Serializable{

    private int id;
    private String track;
    private Date date;
    private String name;
    private int totalLaps;
    private List<RaceItem> items;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    

    public Race() {
        this.items = new ArrayList<>();
    }

    public Race(int id, String track, Date date, String name, int totalLaps, List<RaceItem> items, Timestamp createdOn, Timestamp updatedOn) {
        this.id = id;
        this.track = track;
        this.date = date;
        this.name = name;
        this.totalLaps = totalLaps;
        this.items = items;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

   

    

    

    public int getTotalLaps() {
        return totalLaps;
    }

    public void setTotalLaps(int totalLaps) {
        this.totalLaps = totalLaps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(List<RaceItem> items) {
        this.items = items;
    }

    public List<RaceItem> getItems() {
        return items;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

   

}
