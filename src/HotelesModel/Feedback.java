/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesModel;

/**
 *
 * @author josep
 */
public class Feedback {
    private String comment;
    private int idReservation;

    public Feedback(String comment, int idReservation) {
        this.comment = comment;
        this.idReservation = idReservation;
    }



    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }
}
