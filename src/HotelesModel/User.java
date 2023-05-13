/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesModel;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author guzka
 */
public class User {
    String photo;
    String identificationCard;
    String firstName;
    String lastName;
    String secondSurname;
    String middleName;
    String username;
    String password;
    Date  birthdate;
    String gender;
    String phoneNumber;
    String nationality;
    String country;
    String state;
    String canton;
    String district;
    int idUserType;
    int idHotelAdmin;

    
    public User(String firstName, String username, String password) {
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        // add idUser
    }
    
    

    public User( String firstName, String lastName, String secondSurname, String middleName, String photo, 
            String identificationCard, String username, String password, Date birthdate, 
            String gender, String phoneNumber, String nationality, String country, String state, String canton, String district, int idUserType, int idHotelAdmin ) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.gender = gender;
        this.photo = photo;
        this.middleName = middleName;
        this.secondSurname = secondSurname;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
        this.identificationCard = identificationCard;
        this.birthdate = birthdate;
        this.country = country;
        this.state = state;
        this.canton = canton;
        this.district = district;
        this.idUserType = idUserType;
        this.idHotelAdmin = idHotelAdmin;
    }

        public int getIdHotelAdmin() {
        return idHotelAdmin;
    }

    public void setIdHotelAdmin(int idHotelAdmin) {
        this.idHotelAdmin = idHotelAdmin;
    }

    public int getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
     // constr de usuario paso un string
}
