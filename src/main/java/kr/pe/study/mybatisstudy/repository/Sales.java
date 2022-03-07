package kr.pe.study.mybatisstudy.repository;

import kr.pe.study.mybatisstudy.dao.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Sales {
    List<Customer> getAllCustomer();
    Customer getCustomer(int customerID);
    Customer getCustomerFromObjectInput(Customer customer);
    Customer getCustomerOfPerson(Customer customer);
}
