/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesModel;

/**
 *
 * @author josep
 */
public class Room {
    private String name;
    private int capacity;
    private double recommendedPrice;
    private int idHotel;
    private int idRoomCategory;
    
    public Room(String name, int capacity, double recommendedPrice, int idHotel, int idRoomCategory) {
        this.name = name;
        this.capacity = capacity;
        this.recommendedPrice = recommendedPrice;
        this.idHotel = idHotel;
        this.idRoomCategory = idRoomCategory;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRecommendedPrice() {
        return recommendedPrice;
    }

    public void setRecommendedPrice(double recommendedPrice) {
        this.recommendedPrice = recommendedPrice;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public int getIdRoomCategory() {
        return idRoomCategory;
    }

    public void setIdRoomCategory(int idRoomCategory) {
        this.idRoomCategory = idRoomCategory;
    }
}
