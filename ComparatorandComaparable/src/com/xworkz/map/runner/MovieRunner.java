package com.xworkz.map.runner;

import com.xworkz.map.dto.MovieDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieRunner {

    public static void main(String[] args) {
        Comparator<MovieDTO> comparator = new Comparator<MovieDTO>() {
            @Override
            public int compare(MovieDTO o1, MovieDTO o2) {
                if(o1.getRating()>o2.getRating()){
                    return 1;
                } else if (o1.getRating()==o2.getRating()){
                    return 0;
                }else {
                    return -1;
                }
            }
        };
        List<MovieDTO> list = new ArrayList<>();
        list.add(new MovieDTO("3idiots",4.8));
        list.add(new MovieDTO("makki",4.7));
        list.add(new MovieDTO("magadheera",4.3));
        list.add(new MovieDTO("premam",4.4));

        list.forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------------");

        Collections.sort(list,comparator);
        list.forEach(e-> System.out.println(e));
    }
}
