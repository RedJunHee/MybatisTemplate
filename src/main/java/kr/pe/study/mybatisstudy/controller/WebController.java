package kr.pe.study.mybatisstudy.controller;

import kr.pe.study.mybatisstudy.dao.Customer;
import kr.pe.study.mybatisstudy.dao.Person;
import kr.pe.study.mybatisstudy.mapper.Sales;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@MapperScan("kr.pe.study.mybatisstudy.mapper")
@Controller
public class WebController {

    @Autowired
    Sales SalesService;


    @ResponseBody
    @RequestMapping("/allCustomer")
    public String getAllCustomer() {

        List<Customer> customerList = SalesService.getAllCustomer();

        for(Customer customer : customerList)
            System.out.println(customer.toString());

        return "aa";
    }

    @ResponseBody
    @RequestMapping("/customer")
    public String getCustomer(@Param("customerID") int customerID) {

        Customer customer = SalesService.getCustomer(customerID);

            System.out.println(customer.toString());

        return "aa";
    }

    @ResponseBody
    @RequestMapping("/customerFromObjectInput")
    public String getCustomerFromObjectInput(@Param("customerID") int customerID) {

        Customer customer = SalesService.getCustomerFromObjectInput(new Customer(customerID,null,null,null,null,null,null));

        System.out.println(customer.toString());

        return "aa";
    }

    @ResponseBody
    @RequestMapping("/customerOfPerson")
    public String getCustomerOfPerson(@Param("customerID") int customerID
                                    ,@Param("personID") int personID) {

        Object customer = SalesService.getCustomerOfPerson(new Customer(customerID,personID,null,null,null,null,null));

        System.out.println(customer.toString());

        return "aa";
    }




}
