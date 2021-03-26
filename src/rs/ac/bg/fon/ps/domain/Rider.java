/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matija
 */
public class Rider implements GenericEntity{

    private Long ID;
    private String firstname;
    private String surname;
    private String nationality;
    private Integer racingNum;
    private MotorcycleMake motorcycle;

    public Rider() {
    }

    public Rider(Long JMBG, String firstname, String surname, String nationality, Integer racingNum, MotorcycleMake motorcycle) {
        this.ID = JMBG;
        this.firstname = firstname;
        this.surname = surname;
        this.nationality = nationality;
        this.racingNum = racingNum;
        this.motorcycle = motorcycle;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getRacingNum() {
        return racingNum;
    }

    public void setRacingNum(Integer racingNum) {
        this.racingNum = racingNum;
    }

    public MotorcycleMake getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(MotorcycleMake motorcycle) {
        this.motorcycle = motorcycle;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.ID);
        hash = 17 * hash + Objects.hashCode(this.firstname);
        hash = 17 * hash + Objects.hashCode(this.surname);
        hash = 17 * hash + Objects.hashCode(this.nationality);
        hash = 17 * hash + Objects.hashCode(this.racingNum);
        hash = 17 * hash + Objects.hashCode(this.motorcycle);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rider other = (Rider) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getFirstname()+" "+getSurname();
    }

    @Override
    public String getTableName() {
        return "RIDER";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "id,firstname,surname,nationality,motorcyclemake,racingnumber,created_on";
    }

    @Override
    public String getInsertValues() {
        StringBuilder sb = new StringBuilder();
        sb.append(ID).append(",")
                .append("'").append(firstname).append("',")
                .append("'").append(surname).append("',")
                .append("'").append(nationality).append("',")
                .append("'").append(motorcycle).append("',")
                .append(racingNum).append(", '").append(new java.sql.Timestamp(new java.util.Date().getTime())).append("'");
                
        return sb.toString();
    }

    @Override
    public void setId(Long id) {
        this.ID = id;
    }

    @Override
    public void setValues(ResultSet rs) {
        try {
            ID=(rs.getLong("id"));
            firstname=(rs.getString("firstname"));
            surname=(rs.getString("surname"));
            nationality=(rs.getString("nationality"));
            motorcycle=(MotorcycleMake.valueOf(rs.getString("motorcyclemake")));
            racingNum=(rs.getInt("racingnumber"));
        } catch (SQLException ex) {
            Logger.getLogger(Rider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getColumnNameForDelete() {
        return "id";
    }

    @Override
    public String getIDForDelete() {
        return ID.toString();
    }

   

}
