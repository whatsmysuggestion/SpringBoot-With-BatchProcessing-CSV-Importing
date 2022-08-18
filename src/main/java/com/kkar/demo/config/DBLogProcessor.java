package com.kkar.demo.config;
 
import org.springframework.batch.item.ItemProcessor;

import com.kkar.demo.model.Employee;
 
public class DBLogProcessor implements ItemProcessor<Employee, Employee>
{
    public Employee process(Employee employee) throws Exception
    {
        System.out.println("Inserting employee : " + employee);
        return employee;
    }
}