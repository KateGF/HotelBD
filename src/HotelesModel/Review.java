/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesModel;

/**
 *
 * @author josep
 */
public class Review {
    private int star;
    private int idReservation;

    public Review(int idReview, int star, int idReservation) {
        this.star = star;
        this.idReservation = idReservation;
    }




    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }
}
