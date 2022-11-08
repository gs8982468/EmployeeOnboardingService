package com.employee.controller;

import com.employee.DTO.EmployeeRegistration.EmployeeRegistrationResponse;
import com.employee.DTO.EmployeeRegistration.OfferLetterRequestDTO;
import com.employee.DTO.EmployeeRegistration.OfferLetterResponseDTO;
import com.employee.Service.OfferLeter.OfferLetterProcessIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferLetterProcessingController {
    public static final String contextEndpoint= "/internal/sg-platform/employerOnboardingService/v1/candidate";

    @Autowired
    private OfferLetterProcessIf offerLetterProcessIf;


    @RequestMapping(value = contextEndpoint+"/offerLetter/process", method = RequestMethod.POST)
    public OfferLetterResponseDTO registerEmployee(@RequestBody OfferLetterRequestDTO employeeRegistrationRequest){

        OfferLetterResponseDTO offerLetterResponseDTO =  offerLetterProcessIf.processOfferLetter(employeeRegistrationRequest);

        return offerLetterResponseDTO;
    }

}
