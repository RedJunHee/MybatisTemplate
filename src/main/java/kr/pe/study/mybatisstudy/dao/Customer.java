package kr.pe.study.mybatisstudy.dao;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Class       : Customer
 * Author      : 조 준 희
 * Description : Class Description
 * History     : [2022-03-04] - 조 준희 - Class Create
 */
public class Customer {
    Integer customerID;
    Integer personID;
    Integer storeID;
    Integer territoryID;
    String accountNumber;
    String rowguid;
    LocalDateTime modifiedDate;

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", personID='" + personID + '\'' +
                ", storeID='" + storeID + '\'' +
                ", territoryID='" + territoryID + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", rowguid='" + rowguid + '\'' +
                ", modifiedDate=" + modifiedDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                '}';
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public Integer getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Integer territoryID) {
        this.territoryID = territoryID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Customer(Integer customerID, Integer personID, Integer storeID, Integer territoryID, String accountNumber, String rowguid, LocalDateTime modifiedDate) {
        this.customerID = customerID;
        this.personID = personID;
        this.storeID = storeID;
        this.territoryID = territoryID;
        this.accountNumber = accountNumber;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }
}
