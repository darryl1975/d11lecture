package sg.edu.nus.iss.d11lecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.d11lecture.model.Employee;


// To resolve lombok issue on VSCode
// https://bwgjoseph.com/how-to-configure-lombok-extension-to-play-well-with-vscode


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    // @RequestMapping(path = "/list", method = RequestMethod.GET)
    @GetMapping(path = "/list")
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ashley", "Chew", "ashchew@visa.com.sg"));
        employees.add(new Employee("Alicia", "Ong", "aliciaong@visa.com.sg"));
        employees.add(new Employee("Darien", "Lim", "darienlim@visa.com.sg"));
        

        return employees;
    }

}
