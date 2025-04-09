package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Antibiotic;
import com.xworkz.inheritence.internal.Medicine;

public class Injection {

    public void inject(Medicine medicine){
        medicine.storeProperly();
        medicine.prescribe();
        medicine.measureDosage();
        medicine.consume();
        medicine.checkExpiry();
        if(medicine instanceof Antibiotic){
            Antibiotic antibiotic = (Antibiotic) medicine;
            antibiotic.mix();
        }
    }
}
