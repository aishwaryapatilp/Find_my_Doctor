package com.Doctor.DoctorsDetails;

import java.util.List;

public interface DoctorsService {
    public String createDoctorsDetails(DoctorsDetails doctorsDetails);
    public String updateDoctorsDetails(DoctorsDetails doctorsDetails);
    public String deleteDoctorsDetails(String doctorId);
    public DoctorsDetails getDoctorsDetails(String doctorId);
    public List<DoctorsDetails> getAllDoctorsDetails();    
}
