package com.xworkz.external;

import com.xworkz.internal.IdCard;

public class Customer {

    public void student(){
        System.out.println("Running student in Customer");
        IdCard idCard = new IdCard();
        idCard.setMaterial("Plastic");
        String color1 = "red";
        String color2 ="blue";

        String[] colors ={color1,color2};
        idCard.setColor(colors);

        idCard.setWeight(20);
        idCard.setDesignedBy("Av");

        System.out.println(idCard.getMaterial());
        System.out.println(idCard.getColor());
        System.out.println(idCard.getWeight());
        System.out.println(idCard.getDesignedBy());

    }

    public void teacher(){
        System.out.println("Running Teacher in Customer");
        IdCard idCard = new IdCard();
        idCard.setMaterial("Plastic");
        String color1 = "red";
        String color2 ="blue";

        String[] colors ={color1,color2};
        idCard.setColor(colors);

        idCard.setWeight(20);
        idCard.setDesignedBy("Av");

        System.out.println("Running student in Customer");
        IdCard idCard1 = new IdCard();
        idCard1.setMaterial("Paper");
        String color3 = "yellow";
        String color4 ="blue";

        String[] colors1 ={color3,color4};
        idCard1.setColor(colors1);

        idCard1.setWeight(20);
        idCard1.setDesignedBy("Av");

        IdCard[] idCards ={idCard1,idCard};
        for (IdCard idCar : idCards) {
            System.out.println(idCar.getMaterial());
            System.out.println(idCar.getColor());
            System.out.println(idCar.getWeight());
            System.out.println(idCar.getDesignedBy());
        }




        }
        public  void employee(IdCard idCard){
            if(idCard!=null) {
                System.out.println(idCard.getMaterial());
                System.out.println(idCard.getColor());
                System.out.println(idCard.getWeight());
                System.out.println(idCard.getDesignedBy());
            }
    }

    public void  Lectures(IdCard[] idCards){
        if(idCards!=null){
            for(IdCard idCar: idCards){
                System.out.println(idCar.getMaterial());
                System.out.println(idCar.getColor());
                System.out.println(idCar.getWeight());
                System.out.println(idCar.getDesignedBy());
            }
        }
    }
}
