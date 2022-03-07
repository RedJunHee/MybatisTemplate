package kr.pe.study.mybatisstudy.controller;

import kr.pe.study.mybatisstudy.dao.Customer;
import kr.pe.study.mybatisstudy.repository.Sales;
import org.apache.ibatis.annotations.Param;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@MapperScan("kr.pe.study.mybatisstudy.repository")
@Controller
public class WebController {

    @Autowired
    Sales SalesService;
    private final Logger logger = LogManager.getLogger(WebController.class);

    @ResponseBody
    @RequestMapping("/allCustomer")
    public String getAllCustomer() {
        logger.info("getAllCustomer");
        List<Customer> customerList = SalesService.getAllCustomer();

        for(Customer customer : customerList)
            System.out.println(customer.toString());

        return "aa";
    }

    @ResponseBody
    @RequestMapping("/customer")
    public String getCustomer(@Param("customerID") int customerID) {
        logger.info("info-getCustomer");

        Customer customer = SalesService.getCustomer(customerID);

        System.out.println(customer.toString());

        return "aa";
    }

    @ResponseBody
    @RequestMapping("/customerFromObjectInput")
    public String getCustomerFromObjectInput(@Param("customerID") int customerID) {
        logger.info("getCustomerFromObjectInput");
        Customer customer = SalesService.getCustomerFromObjectInput(new Customer(customerID,null,null,null,null,null,null));

        System.out.println(customer.toString());

        return "aa";
    }

}
