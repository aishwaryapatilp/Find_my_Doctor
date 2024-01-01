package com.Doctor.DoctorsDetails;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DoctorsDetails")
public class DoctorsController {

    public DoctorsController(DoctorsService doctorsService) {
        this.doctorsService = doctorsService;
    }

    DoctorsService doctorsService;

    //Read for specific doctordetails
    @GetMapping("/{doctorId}")
    public DoctorsDetails getDoctorsDetails(@PathVariable("doctorId") String doctorId) {
        // Logic to retrieve and return details for the specified doctorId
        //return doctorsDetails;
        return doctorsService.getDoctorsDetails(doctorId);
    }

    //Read for all doctordetails
    @GetMapping()
    public List<DoctorsDetails> getDoctorsDetails() {
        // Logic to retrieve and return details for the specified doctorId
        //return doctorsDetails;
        return doctorsService.getAllDoctorsDetails();
    }

    @PostMapping
    public String createDoctorsDetails(@RequestBody DoctorsDetails doctorsDetails) {
        //this.doctorsDetails = doctorsDetails;
        doctorsService.createDoctorsDetails(doctorsDetails);
        return "Created Successfully";
    }

    @PutMapping
    public String updateDoctorsDetails(@RequestBody DoctorsDetails doctorsDetails) {
        //this.doctorsDetails = doctorsDetails;
        doctorsService.updateDoctorsDetails(doctorsDetails);
        return "Updated Successfully";
    }

    @DeleteMapping("/{doctorId}")
    public String deleteDoctorDetails(@PathVariable("doctorId") String doctorId) {
        // Logic to delete the doctor details based on the doctorId
        //this.doctorsDetails = null;
        doctorsService.deleteDoctorsDetails(doctorId);
        return "Deleted Successfully";
    }
}