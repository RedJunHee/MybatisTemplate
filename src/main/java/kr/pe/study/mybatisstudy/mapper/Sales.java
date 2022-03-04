package kr.pe.study.mybatisstudy.mapper;

import kr.pe.study.mybatisstudy.dao.Customer;
import kr.pe.study.mybatisstudy.dao.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Sales {
    List<Customer> getAllCustomer();
    Customer getCustomer(int customerID);
    Customer getCustomerFromObjectInput(Customer customer);
    Customer getCustomerOfPerson(Customer customer);
}
