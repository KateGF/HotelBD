/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesModel;

/**
 *
 * @author josep
 */
public class Reservation {
    private int idUser;
    private int idPayment;
    private int idPenalty;

    public Reservation(int idReservation, int idUser, int idPayment, int idPenalty) {
        this.idUser = idUser;
        this.idPayment = idPayment;
        this.idPenalty = idPenalty;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getIdPenalty() {
        return idPenalty;
    }

    public void setIdPenalty(int idPenalty) {
        this.idPenalty = idPenalty;
    }
}
