package com.xworkz;

import com.xworkz.external.Client;
import com.xworkz.internal.Company;
import com.xworkz.internal.Department;

public class CompanyRunner {

    public static void main(String[] args) {
        Company company = new Company();


        Department department = new Department(company);
        department.display();

        Client client = new Client(company);
        client.display();
    }
}
