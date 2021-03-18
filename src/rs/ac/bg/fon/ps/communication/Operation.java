/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.Serializable;

/**
 *
 * @author Matija
 */
public enum Operation implements Serializable{
    LOGIN,
    ADD_RIDER,
    GET_ALL_RIDERS,
    DELETE_RIDER,
    EDIT_RIDER,
    ADD_TEAM,
    GET_ALL_TEAMS,
    DELETE_TEAM,
    EDIT_TEAM,
    ADD_RACE,
    GET_ALL_RACES,
    GET_RACE_ITEMS,
    SAVE_RACE_RESULT,
    UPDATE_RACE_INFO,
    EDIT_RACE,
    EDIT_RACE_ITEMS,
    SERVER_SHUTDOWN,
    LOGOUT,
    LOGOUT_ALL
}
