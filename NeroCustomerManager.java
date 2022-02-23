package com.halilibrahim.halilibrahim;

public class NeroCustomerManager extends CustomerManager {

    public void save(Customer customer) {
        System.out.println("Nero Customer Service");
        saveData(customer);
    }
}
