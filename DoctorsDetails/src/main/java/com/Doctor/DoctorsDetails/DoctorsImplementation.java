package com.Doctor.DoctorsDetails;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DoctorsImplementation implements DoctorsService{

    DoctorsRepository doctorsRepository;
    
    public DoctorsImplementation(DoctorsRepository doctorsRepository) {
        this.doctorsRepository = doctorsRepository;
    }

    @Override
    public String createDoctorsDetails(DoctorsDetails doctorsDetails) {
        doctorsRepository.save(doctorsDetails);
        return "Created Successfully";
    }

    @Override
    public String updateDoctorsDetails(DoctorsDetails doctorsDetails) {
        doctorsRepository.save(doctorsDetails);
        return "Updated Successfully";
    }

    @Override
    public String deleteDoctorsDetails(String doctorId) {
        doctorsRepository.deleteById(doctorId);
        return "Deleted Successfully";
    }

    @Override
    public DoctorsDetails getDoctorsDetails(String doctorId) { 
        return doctorsRepository.findById(doctorId).get();
    }

    @Override
    public List<DoctorsDetails> getAllDoctorsDetails() {
        return doctorsRepository.findAll();
    }  
    
}
