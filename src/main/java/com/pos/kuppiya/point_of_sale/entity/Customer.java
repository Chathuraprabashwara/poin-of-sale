package com.pos.kuppiya.point_of_sale.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.springframework.data.util.QTypeContributor;

import java.util.ArrayList;

@Entity
@Table(name = "customer")
@Type
public class Customer {
    @Id
    @Column(name = "cutomer_id", length = 45)
    private int customerId;

    @Column(name = "customer_name", length = 45, nullable = false)
    private String customerName;

    @Column(name = "customer_address", length = 150)
    private String getCustomerAddress;

    @Column(name = "custom_salary", length = 25)
    private double customerSalary;

    @Column(name = "contact_numbers", columnDefinition = "json")
    private ArrayList<String> contactNumbers;

}
