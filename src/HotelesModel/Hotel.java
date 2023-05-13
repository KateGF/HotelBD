/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesModel;

import java.time.LocalDate;

/**
 *
 * @author josep
 */
public class Hotel {
    private String name;
    private LocalDate registerDate;
    private int idDistrict;
    private int idDiscount;

    public Hotel(String name, LocalDate registerDate, int idDistrict, int idDiscount) {
        this.name = name;
        this.registerDate = registerDate;
        this.idDistrict = idDistrict;
        this.idDiscount = idDiscount;
    }

    // Setter and getter for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    // Setter and getter for registerDate
    public LocalDate getRegisterDate() {
        return registerDate;
    }
    
    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    // Setter and getter for idDistrict
    public int getIdDistrict() {
        return idDistrict;
    }
    
    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }

    // Setter and getter for idDiscount
    public int getIdDiscount() {
        return idDiscount;
    }
    
    public void setIdDiscount(int idDiscount) {
        this.idDiscount = idDiscount;
    }
}
