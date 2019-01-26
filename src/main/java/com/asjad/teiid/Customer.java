package com.asjad.teiid;

import org.teiid.spring.annotations.SelectQuery;

import javax.persistence.*;

@Entity
@Table(name="all_customers")
@SelectQuery("SELECT id, name, ssn FROM postgresDS.Customer "
        +"UNION ALL "
        +"SELECT id, name, ssn FROM mysqlDS.Customer")
public class Customer {

    @Id
    @GeneratedValue
    long id;

    @Column
    String name;

    @Column
    String ssn;

    public Customer() {}

    public Customer(int id, String name, String ssn) {
        this.id = id;
        this.name = name;
        this.ssn= ssn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}