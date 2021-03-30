/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matija
 */
public class Race implements GenericEntity{

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

    @Override
    public String getTableName() {
        return "RACE";
    }

    @Override
    public String getColumnNamesForInsert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInsertValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValues(ResultSet rs) {
        try {
            id=(rs.getInt("id"));
            track=(rs.getString("track"));
            date=(rs.getDate("date"));
            name=(rs.getString("name"));
            totalLaps=(rs.getInt("totallaps"));
        } catch (SQLException ex) {
            Logger.getLogger(Rider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getColumnNameForDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIDForDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIDForEdit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
