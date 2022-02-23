package com.halilibrahim.halilibrahim;

public class StarbucksCustomerManager extends CustomerManager  {


    private CustomerCheckManager _customerCheckManager;
    public StarbucksCustomerManager(
            CustomerCheckManager customercheckmanager){
        _customerCheckManager= customercheckmanager;

    }

    public void save(Customer customer) {
        System.out.println("Starbucks Customer Service");

       /* if(_customerCheckManager.CheckIfRealPerson(customer)){
            System.out.println("Checked");

            saveData(customer);

        }else{

            throw new RuntimeException("Not a Valid Person!");
        }*/



        try {
            if(_customerCheckManager.CheckIfRealPerson(customer)){

                saveData(customer);

            }else{
                System.out.println("Couldn't saved");

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't saved");

        }


    }



}
