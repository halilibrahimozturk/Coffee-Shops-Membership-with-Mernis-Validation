package com.halilibrahim.halilibrahim;

public class CustomerCheckManager implements ICustomerCheckService{
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        System.out.println("Checking for Validity");




        QROKPSPublicSoap mernis = new QROKPSPublicSoap();

        try {
            if(mernis.TCKimlikNoDogrula(
                    customer.getNationalityId(),
                    customer.getFirstName(),
                    customer.getLastName(),
                    customer.getDateOfBirth().getYear()
            ))
            {

                System.out.println("Valid person!");




            }
            else
            {

                System.out.println("Not a valid person!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Validation Error!");

        }






        return mernis.TCKimlikNoDogrula(
                customer.getNationalityId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getDateOfBirth().getYear()
        );
    }
}
