/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.Serializable;
import rs.ac.bg.fon.ps.domain.User;

/**
 *
 * @author Matija
 */
public class Request implements Serializable{
    private Operation operation;
    private Object argument;
    private Object argument1;

    public Request() {
    }

    public Request(Operation operation, Object argument, Object argument1) {
        this.operation = operation;
        this.argument = argument;
        this.argument1 = argument1;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Object getArgument() {
        return argument;
    }

    public void setArgument(Object argument) {
        this.argument = argument;
    }

    public Object getArgument1() {
        return argument1;
    }

    public void setArgument1(Object argument1) {
        this.argument1 = argument1;
    }

    
   
   
    
}
