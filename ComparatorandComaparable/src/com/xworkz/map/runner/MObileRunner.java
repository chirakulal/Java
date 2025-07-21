package com.xworkz.map.runner;

import com.xworkz.map.dto.MobileDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MObileRunner {

    public static void main(String[] args) {

        Comparator<MobileDTO> mobiledto = new Comparator<MobileDTO>() {
            @Override
            public int compare(MobileDTO o1, MobileDTO o2) {
                if(o1.getBatteryLife()>o2.getBatteryLife()){
                    return 1;
                } else if (o1.getBatteryLife()==o2.getBatteryLife()) {
                    return 0;
                }else {
                    return -1;
                }
            }
        };
        List<MobileDTO> mobile = new ArrayList<>();
        mobile.add(new MobileDTO("vivo",5));
        mobile.add(new MobileDTO("opppo",4));
        mobile.add(new MobileDTO("nokia",9));
        mobile.add(new MobileDTO("redmi",3));

        mobile.forEach(e-> System.out.println(e));

        System.out.println("---------------------------------------------------------------");

        Collections.sort(mobile, mobiledto);
        mobile.forEach(e-> System.out.println(e));
    }
}
