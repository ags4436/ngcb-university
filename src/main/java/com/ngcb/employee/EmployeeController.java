package com.ngcb.employee;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/getEmployee")
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping("/getEmployeeById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return employee.toString()+" Saved Successfully";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        if(employeeRepository.existsById(employee.getEmpId())){
            employeeRepository.save(employee);
            return employee.toString()+" Updated Successfully";
        }
        return "Invalid Employee Id̥";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        if(employeeRepository.existsById(id)){
            Optional<Employee> employeeData = Optional.of(new Employee());
            employeeData = employeeRepository.findById(id);
            employeeRepository.deleteById(id);
            return employeeData.toString() + "Deleted Successfully";
        }
        return "Invalid Employee Id̥";
    }

}
