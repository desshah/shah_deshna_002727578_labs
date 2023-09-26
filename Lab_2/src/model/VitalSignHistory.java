/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author deshna
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history; 
// this ArrayList named history stores previous VitalSigns records.
   
    // creating a constructor for VitalSigns history
    public VitalSignHistory() {
        this.history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    } 
    
    // this method creats new empty vitalSigns and object history is added to this and inturn stored in ArrayList
    public VitalSigns addNewVitals() {
        VitalSigns newVitals = new VitalSigns();
        history.add(newVitals);
        return newVitals;
    }
    
    public void deleteVitals(VitalSigns vs) {
        history.remove(vs);
    }
}
