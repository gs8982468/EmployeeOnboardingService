package com.employee.controller;

import com.employee.DTO.EmployeeRegistration.EmployeeRegistrationRequest;
import com.employee.DTO.EmployeeRegistration.EmployeeRegistrationResponse;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRegistrationController {
    public static final String contextEndpoint= "/internal/sg-platform/employerOnboardingService/v1/candidate";


    @RequestMapping(value = contextEndpoint+"/registration", method = RequestMethod.PUT)
    public EmployeeRegistrationResponse registerEmployee(@RequestBody EmployeeRegistrationRequest employeeRegistrationRequest){
        return new EmployeeRegistrationResponse();
    }

}
