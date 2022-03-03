package kr.pe.study.mybatisstudy.dao;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/*
CurrencyCode	nchar	no	6
Name	Name	no	100
ModifiedDate	datetime	no	8
*/
public class SalesDTO {
    String currencyCode;
    String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    LocalDate modifiedDate;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public SalesDTO(String currencyCode, String name, LocalDate modifiedDate) {
        this.currencyCode = currencyCode;
        this.name = name;
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "SalesDTO{" +
                "currencyCode='" + currencyCode + '\'' +
                ", name='" + name + '\'' +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
