package com.halilibrahim.halilibrahim;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        CustomerCheckManager customerCheckManager = new CustomerCheckManager();
        StarbucksCustomerManager starbucksCustomerManager
                = new StarbucksCustomerManager(customerCheckManager);

        NeroCustomerManager neroCustomerManager
                = new NeroCustomerManager();

        Customer customer = new Customer();

        customer.setDateOfBirth(
                LocalDate.of(1997, 10, 19)
        );
        customer.setId(123456);
        customer.setNationalityId(11111111111L);
        customer.setFirstName("Firstname");
        customer.setLastName("Lastname");

         starbucksCustomerManager.save(customer);
        //neroCustomerManager.save(customer);











    }
}
