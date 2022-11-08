package com.employee.Service.OfferLeter;

import com.employee.DTO.EmployeeRegistration.OfferLetterRequestDTO;
import com.employee.DTO.EmployeeRegistration.OfferLetterResponseDTO;
import org.springframework.stereotype.Component;

@Component
public interface OfferLetterProcessIf {
    OfferLetterResponseDTO processOfferLetter(OfferLetterRequestDTO employeeRegistrationRequest);
}

