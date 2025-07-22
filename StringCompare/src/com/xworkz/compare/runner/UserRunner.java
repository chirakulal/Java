package com.xworkz.compare.runner;

import com.xworkz.compare.dto.ContactDTO;
import com.xworkz.compare.dto.UserDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserRunner {

    public static void main(String[] args) {
        Comparator<UserDTO> DTO = ((o1, o2)->Integer.compare(o1.getId(), o2.getId()));

        Comparator<UserDTO> DTO1 = ((o1, o2)->Integer.compare(o1.getId(), o2.getId()));
        Comparator<UserDTO> DTO2 = ((o1, o2)->Integer.compare(o2.getId(), o1.getId()));

        Comparator<UserDTO> comparator = ((o1,o2)->o1.getName().compareTo(o2.getName()));
        Comparator<UserDTO> comparator1 =Comparator.comparing(UserDTO::getName).thenComparing(UserDTO::getEmail);
        Comparator<UserDTO> comparator2 =Comparator.comparing(UserDTO::getPhone).thenComparing(UserDTO::getName);
        List<UserDTO> users = new ArrayList<>();

        users.add(new UserDTO(1, "Alice Johnson", "alice.johnson@gmail.com", 9876543210L, true));
        users.add(new UserDTO(2, "Bob Smith", "bob.smith@yahoo.com", 9123456789L, false));
        users.add(new UserDTO(3, "Charlie Brown", "charlie.brown@outlook.com", 9988776655L, true));
        users.add(new UserDTO(4, "Daisy Clark", "daisy.clark@gmail.com", 9898989898L, true));
        users.add(new UserDTO(5, "Ethan Davis", "ethan.davis@hotmail.com", 9765432109L, false));
        users.add(new UserDTO(6, "Fiona Adams", "fiona.adams@gmail.com", 9001122334L, true));
        users.add(new UserDTO(7, "George White", "george.white@yahoo.com", 9988998899L, true));
        users.add(new UserDTO(8, "Hannah Lee", "hannah.lee@protonmail.com", 9554433221L, false));
        users.add(new UserDTO(9, "Ian Moore", "ian.moore@gmail.com", 9234567890L, true));
        users.add(new UserDTO(10, "Jill Brooks", "jill.brooks@yahoo.com", 9871234567L, false));
        users.add(new UserDTO(11, "Kyle Evans", "kyle.evans@aol.com", 9112233445L, true));
        users.add(new UserDTO(12, "Laura Scott", "laura.scott@gmail.com", 9445566778L, true));
        users.add(new UserDTO(13, "Mike Turner", "mike.turner@zoho.com", 9336677889L, false));
        users.add(new UserDTO(14, "Nina Adams", "nina.adams@hotmail.com", 9009876543L, true));
        users.add(new UserDTO(15, "Oscar Hill", "oscar.hill@yahoo.com", 9877766554L, true));
        users.add(new UserDTO(16, "Paula Green", "paula.green@gmail.com", 9123344556L, false));
        users.add(new UserDTO(17, "Quinn Miller", "quinn.miller@rediffmail.com", 9225566778L, true));
        users.add(new UserDTO(18, "Rachel Young", "rachel.young@outlook.com", 9111222333L, true));
        users.add(new UserDTO(19, "Steve King", "steve.king@gmail.com", 9446677889L, false));
        users.add(new UserDTO(20, "Tina Bell", "tina.bell@yahoo.com", 9333445566L, true));

        System.out.println("1.Sort By Integer");
        users.stream().sorted(DTO).forEach(e-> System.out.println(e));


        System.out.println("2. Asc");
        users.stream().sorted(DTO1).forEach(e-> System.out.println(e));

        System.out.println("2. Dsc");
        users.stream().sorted(DTO2).forEach(e-> System.out.println(e));

        System.out.println("3.Sort by String");
        users.stream().sorted(comparator).forEach(e-> System.out.println(e));

        System.out.println("3.Sort by name and email");
        users.stream().sorted(comparator1).forEach(e-> System.out.println(e));


        System.out.println("4.sort by ph and name");
        users.stream().sorted(comparator2).forEach(e-> System.out.println(e));

    }
}
