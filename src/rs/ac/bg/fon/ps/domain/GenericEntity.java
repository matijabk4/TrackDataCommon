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
public interface GenericEntity extends Serializable{

    String getTableName();

    String getColumnNamesForInsert();

    String getInsertValues();

    void setId(Long id);

    void setValues(ResultSet rs);

    String getColumnNameForDelete();

    String getIDForDelete();

    public int getIDForEdit();

}
