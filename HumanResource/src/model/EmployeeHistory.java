/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kshetrahegde
 */
public class EmployeeHistory {
    
    private ArrayList<EmployeeInfo> history;
    
    public EmployeeHistory(){
        
        this.history = new ArrayList<EmployeeInfo>();    
}

    public ArrayList<EmployeeInfo> getHistory() {
        System.out.println(history);
        
        return history;
        
    }

    public void setHistory(ArrayList<EmployeeInfo> history) {
        this.history = history;
    }
    
    public EmployeeInfo addNewEmployee(){
        EmployeeInfo addEmployee = new EmployeeInfo();
        history.add(addEmployee);
        
        for (int i = 0; i < history.size(); i++) {
            
            System.out.println(history.get(i) + " ");
        }
        return addEmployee;
    }
    
    public void deleteEmployee(EmployeeInfo ei){
        
        history.remove(ei);
        
        
    }
    
    
    
}
