package com.Doctor.DoctorsDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctors_details_info")
public class DoctorsDetails {
    @Id
    private String doctorId;
    private String doctorName;
    private String doctorPhno;
    private String doctorAddress;
    private String doctorSpecialization;
    private String doctorGender;
    private String doctorage;
    private String doctorRatings;
    
   public DoctorsDetails(){

    }

    public DoctorsDetails(String doctorId, String doctorName, String doctorPhno, String doctorAddress,
            String doctorSpecialization, String doctorGender, String doctorage, String doctorRatings) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorPhno = doctorPhno;
        this.doctorAddress = doctorAddress;
        this.doctorSpecialization = doctorSpecialization;
        this.doctorGender = doctorGender;
        this.doctorage = doctorage;
        this.doctorRatings = doctorRatings;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorPhno() {
        return doctorPhno;
    }

    public void setDoctorPhno(String doctorPhno) {
        this.doctorPhno = doctorPhno;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }

    public String getDoctorGender() {
        return doctorGender;
    }

    public void setDoctorGender(String doctorGender) {
        this.doctorGender = doctorGender;
    }

    public String getDoctorage() {
        return doctorage;
    }

    public void setDoctorage(String doctorage) {
        this.doctorage = doctorage;
    }

    public String getDoctorRatings() {
        return doctorRatings;
    }

    public void setDoctorRatings(String doctorRatings) {
        this.doctorRatings = doctorRatings;
    }
    
}
