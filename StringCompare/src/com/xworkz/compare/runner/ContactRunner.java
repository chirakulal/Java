package com.xworkz.compare.runner;

import com.xworkz.compare.dto.ContactDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContactRunner {

    public static void main(String[] args) {
        Comparator<ContactDTO> contactDTO = ((o1, o2)->Integer.compare(o1.getId(), o2.getId()));

        Comparator<ContactDTO> contactDTO1 = ((o1, o2)->Integer.compare(o1.getId(), o2.getId()));
        Comparator<ContactDTO> contactDTO2 = ((o1, o2)->Integer.compare(o2.getId(), o1.getId()));

        Comparator<ContactDTO> comparator = ((o1,o2)->o1.getName().compareTo(o2.getName()));
        Comparator<ContactDTO> comparator1 =Comparator.comparing(ContactDTO::getName).thenComparing(ContactDTO::getEmail);
        Comparator<ContactDTO> comparator2 =Comparator.comparing(ContactDTO::getPhone).thenComparing(ContactDTO::getName);
        Comparator<ContactDTO> comparator3 =Comparator.comparing(ContactDTO::getDob);


                List<ContactDTO> contacts = new ArrayList<>();

                contacts.add(new ContactDTO(1, "Frank", "frank61@company.org", 9876392214L, LocalDate.of(1991, 7, 21)));
                contacts.add(new ContactDTO(2, "Nina", "nina87@yahoo.com", 9210902290L, LocalDate.of(1997, 1, 8)));
                contacts.add(new ContactDTO(3, "Eva", "eva30@outlook.com", 9871721221L, LocalDate.of(1991, 5, 7)));
                contacts.add(new ContactDTO(4, "Leo", "leo60@xmail.com", 9516273784L, LocalDate.of(1999, 2, 10)));
                contacts.add(new ContactDTO(5, "Hank", "hank66@yahoo.com", 9547902810L, LocalDate.of(2003, 5, 15)));
                contacts.add(new ContactDTO(6, "Steve", "steve17@xmail.com", 9817761892L, LocalDate.of(1992, 12, 22)));
                contacts.add(new ContactDTO(7, "Mona", "mona80@xmail.com", 9997812121L, LocalDate.of(2000, 1, 4)));
                contacts.add(new ContactDTO(8, "Paul", "paul46@yahoo.com", 9512387162L, LocalDate.of(1996, 8, 11)));
                contacts.add(new ContactDTO(9, "Rita", "rita75@xmail.com", 9888123490L, LocalDate.of(2001, 9, 27)));
                contacts.add(new ContactDTO(10, "Sam", "sammy90@outlook.com", 9312348900L, LocalDate.of(1995, 6, 3)));
                contacts.add(new ContactDTO(11, "Lily", "lily99@mail.com", 9874561230L, LocalDate.of(2002, 2, 20)));
                contacts.add(new ContactDTO(12, "John", "john11@xyz.com", 9123456780L, LocalDate.of(1994, 11, 9)));
                contacts.add(new ContactDTO(13, "Zara", "zara88@mail.com", 9543217890L, LocalDate.of(1993, 3, 5)));
                contacts.add(new ContactDTO(14, "Tom", "tom76@company.org", 9834567890L, LocalDate.of(2004, 12, 12)));
                contacts.add(new ContactDTO(15, "Daisy", "daisy65@gmail.com", 9988776655L, LocalDate.of(1990, 4, 17)));
                contacts.add(new ContactDTO(16, "Rob", "rob55@mail.com", 9643789021L, LocalDate.of(2005, 7, 8)));
                contacts.add(new ContactDTO(17, "Kim", "kimmy91@xmail.com", 9321123456L, LocalDate.of(1998, 10, 30)));
                contacts.add(new ContactDTO(18, "Ben", "ben89@gmail.com", 9487654321L, LocalDate.of(2006, 5, 19)));
                contacts.add(new ContactDTO(19, "Olive", "olive77@xyz.com", 9012345678L, LocalDate.of(1992, 6, 15)));
                contacts.add(new ContactDTO(20, "Tina", "tina98@abc.com", 9654321098L, LocalDate.of(2000, 9, 9)));


        System.out.println("1.Sort By Integer");
        contacts.stream().sorted(contactDTO).forEach(e-> System.out.println(e));


        System.out.println("2. Asc");
        contacts.stream().sorted(contactDTO1).forEach(e-> System.out.println(e));

        System.out.println("2. Dsc");
        contacts.stream().sorted(contactDTO2).forEach(e-> System.out.println(e));

        System.out.println("3.Sort by String");
        contacts.stream().sorted(comparator).forEach(e-> System.out.println(e));

        System.out.println("3.Sort by name and email");
        contacts.stream().sorted(comparator1).forEach(e-> System.out.println(e));


        System.out.println("4.sort by ph and name");
        contacts.stream().sorted(comparator2).forEach(e-> System.out.println(e));

        System.out.println("5.sort by date");
        contacts.stream().sorted(comparator3).forEach(e-> System.out.println(e));


            }
        }

