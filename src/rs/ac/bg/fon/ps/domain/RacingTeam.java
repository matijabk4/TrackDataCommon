/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;
import java.sql.ResultSet;

/**
 *
 * @author Matija
 */
public class RacingTeam implements GenericEntity{

    private int id;
    private String sponsor;
    private double budget;
    private String name;
    private String generalManager;
    private String headquarters;

    public RacingTeam() {
    }

    public RacingTeam(int id, String sponsor, double budget, String name, String generalManager, String headquarters) {
        this.id = id;
        this.sponsor = sponsor;
        this.budget = budget;
        this.name = name;
        this.generalManager = generalManager;
        this.headquarters = headquarters;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeneralManager() {
        return generalManager;
    }

    public void setGeneralManager(String generalManager) {
        this.generalManager = generalManager;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getTableName() {
        return "TEAM";
    }

    @Override
    public String getColumnNamesForInsert() {
         return "id,sponsor,budget,name,generalmanager,headquarters";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(",")
                .append("'").append(sponsor).append("',")
                .append(budget)
                .append(", '").append(name).append("',")
                .append("'").append(generalManager).append("',")
                .append("'").append(headquarters).append("'");
                
        return sb.toString();
    }

    @Override
    public void setId(Long id) {
        System.out.println(id);
        this.id = Integer.valueOf(String.valueOf(id));
    }

    @Override
    public void setValues(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnNameForDelete() {
        return "id";
    }

    @Override
    public String getIDForDelete() {
        return String.valueOf(id);
    }

    

}
