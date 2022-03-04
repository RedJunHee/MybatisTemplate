package kr.pe.study.mybatisstudy.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Class       : Person
 * Author      : 조 준 희
 * Description : Class Description
 * History     : [2022-03-04] - 조 준희 - Class Create
 */
public class Person {
    Integer BusinessEntityID;
    String PersonType;
    String NameStyle;
    String Title;
    String FirstName;
    String MiddleName;
    String LastName;
    String suffix;
    Integer emailPromotion;
    String additionalContactInfo;
    String demographics;
    String rowguid;
    LocalDateTime modifiedDate;

    @Override
    public String toString() {
        return "Person{" +
                "BusinessEntityID=" + BusinessEntityID +
                ", PersonType='" + PersonType + '\'' +
                ", NameStyle='" + NameStyle + '\'' +
                ", Title='" + Title + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", suffix='" + suffix + '\'' +
                ", emailPromotion=" + emailPromotion +
                ", additionalContactInfo='" + additionalContactInfo + '\'' +
                ", demographics='" + demographics + '\'' +
                ", rowguid='" + rowguid + '\'' +
                ", modifiedDate=" + modifiedDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                '}';
    }

    public Integer getBusinessEntityID() {
        return BusinessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        BusinessEntityID = businessEntityID;
    }

    public String getPersonType() {
        return PersonType;
    }

    public void setPersonType(String personType) {
        PersonType = personType;
    }

    public String getNameStyle() {
        return NameStyle;
    }

    public void setNameStyle(String nameStyle) {
        NameStyle = nameStyle;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getEmailPromotion() {
        return emailPromotion;
    }

    public void setEmailPromotion(Integer emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    public String getAdditionalContactInfo() {
        return additionalContactInfo;
    }

    public void setAdditionalContactInfo(String additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
    }

    public String getDemographics() {
        return demographics;
    }

    public void setDemographics(String demographics) {
        this.demographics = demographics;
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

    public Person(Integer businessEntityID, String personType, String nameStyle, String title, String firstName, String middleName, String lastName, String suffix, Integer emailPromotion, String additionalContactInfo, String demographics, String rowguid, LocalDateTime modifiedDate) {
        BusinessEntityID = businessEntityID;
        PersonType = personType;
        NameStyle = nameStyle;
        Title = title;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        this.suffix = suffix;
        this.emailPromotion = emailPromotion;
        this.additionalContactInfo = additionalContactInfo;
        this.demographics = demographics;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }
}
