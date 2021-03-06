package org.maxkey.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.mybatis.jpa.persistence.JpaBaseDomain;

@Table(name = "ORGANIZATIONS")
public class Organizations extends JpaBaseDomain implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
    private String id;
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private String fullName;
    @Column
    private String pId;
    @Column
    private String pName;
    @Column
    private String type;
    @Column
    private String xPath;
    @Column
    private String xNamePath;
    @Column
    private String level;
    @Column
    private String hasChild;
    @Column
    private String division;
    @Column
    private String country;
    @Column
    private String region;
    @Column
    private String locality;
    @Column
    private String street;
    @Column
    private String address;
    @Column
    private String contact;
    @Column
    private String postalCode;
    @Column
    private String phone;
    @Column
    private String fax;
    @Column
    private String email;
    @Column
    private String sortOrder;
    @Column
    private String description;

    /**
     * 
     */
    private static final long serialVersionUID = 5085413816404119803L;

    public Organizations() {
        // TODO Auto-generated constructor stub
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getxPath() {
        return xPath;
    }

    public void setxPath(String xPath) {
        this.xPath = xPath;
    }

    public String getxNamePath() {
        return xNamePath;
    }

    public void setxNamePath(String xNamePath) {
        this.xNamePath = xNamePath;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getHasChild() {
        return hasChild;
    }

    public void setHasChild(String hasChild) {
        this.hasChild = hasChild;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Organizations [id=" + id + ", code=" + code + ", name=" + name + ", fullName=" + fullName + ", pId="
                + pId + ", pName=" + pName + ", type=" + type + ", xPath=" + xPath + ", xNamePath=" + xNamePath
                + ", level=" + level + ", hasChild=" + hasChild + ", division=" + division + ", country=" + country
                + ", region=" + region + ", locality=" + locality + ", street=" + street + ", address=" + address
                + ", contact=" + contact + ", postalCode=" + postalCode + ", phone=" + phone + ", fax=" + fax
                + ", email=" + email + ", sortOrder=" + sortOrder + ", description=" + description + "]";
    }

}
