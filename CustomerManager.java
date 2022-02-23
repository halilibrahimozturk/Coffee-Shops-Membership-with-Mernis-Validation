package com.halilibrahim.halilibrahim;

public abstract class CustomerManager {

    protected CustomerManager(){}

    public  void saveData(Customer customer){

        System.out.println(
                "Saved to Database:" + "\n"
                + "First Name: "+customer.getFirstName() + "\n"
                +  "Last Name: "+customer.getLastName()+ "\n"
                + "Nationality ID: "+customer.getNationalityId()+ "\n"
                + "Date Of Birth: "+customer.getDateOfBirth()+ "\n"
                + "Customer ID: " + customer.getId()
        ) ;
    }

}
