package com.xworkz.compare.runner;

import com.xworkz.compare.dto.ContactDTO;
import com.xworkz.compare.dto.EmailDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmailRunner {

    public static void main(String[] args) {
        Comparator<EmailDTO> DTO = ((o1, o2)->Integer.compare(o1.getId(), o2.getId()));

        Comparator<EmailDTO> DTO1 = ((o1, o2)->Integer.compare(o1.getId(), o2.getId()));
        Comparator<EmailDTO> DTO2 = ((o1, o2)->Integer.compare(o2.getId(), o1.getId()));

        Comparator<EmailDTO> comparator = ((o1,o2)->o1.getEmailAddress().compareTo(o2.getEmailAddress()));
        Comparator<EmailDTO> comparator1 =Comparator.comparing(EmailDTO::getEmailAddress).thenComparing(EmailDTO::getDomain);
        Comparator<EmailDTO> comparator2 =Comparator.comparing(EmailDTO::getDomain);


        List<EmailDTO> emails = new ArrayList<>();

        emails.add(new EmailDTO(1, "john.doe@gmail.com", "gmail.com", true, "AdminPanel"));
        emails.add(new EmailDTO(2, "jane.smith@yahoo.com", "yahoo.com", false, "UserAPI"));
        emails.add(new EmailDTO(3, "alice.wonder@outlook.com", "outlook.com", true, "SignupService"));
        emails.add(new EmailDTO(4, "bob.builder@protonmail.com", "protonmail.com", false, "MobileApp"));
        emails.add(new EmailDTO(5, "clark.kent@dailyplanet.com", "dailyplanet.com", true, "AdminPanel"));
        emails.add(new EmailDTO(6, "diana.prince@amazon.org", "amazon.org", true, "WebPortal"));
        emails.add(new EmailDTO(7, "bruce.wayne@wayneenterprises.com", "wayneenterprises.com", false, "UserAPI"));
        emails.add(new EmailDTO(8, "tony.stark@starkindustries.com", "starkindustries.com", true, "CRMTool"));
        emails.add(new EmailDTO(9, "steve.rogers@avengers.com", "avengers.com", true, "UserAPI"));
        emails.add(new EmailDTO(10, "natasha.romanoff@shield.org", "shield.org", false, "WebPortal"));
        emails.add(new EmailDTO(11, "peter.parker@dailybugle.net", "dailybugle.net", true, "MobileApp"));
        emails.add(new EmailDTO(12, "barry.allen@ccpd.gov", "ccpd.gov", true, "UserAPI"));
        emails.add(new EmailDTO(13, "arthur.curry@atlantis.org", "atlantis.org", false, "SignupService"));
        emails.add(new EmailDTO(14, "victor.stone@starlabs.com", "starlabs.com", true, "AdminPanel"));
        emails.add(new EmailDTO(15, "selina.kyle@gothamcity.com", "gothamcity.com", true, "CRMTool"));
        emails.add(new EmailDTO(16, "lex.luthor@luthorcorp.com", "luthorcorp.com", false, "MobileApp"));
        emails.add(new EmailDTO(17, "lois.lane@dailyplanet.com", "dailyplanet.com", true, "UserAPI"));
        emails.add(new EmailDTO(18, "harley.quinn@arkham.org", "arkham.org", false, "SignupService"));
        emails.add(new EmailDTO(19, "joker@chaos.com", "chaos.com", true, "WebPortal"));
        emails.add(new EmailDTO(20, "hank66@yahoo.com", "yahoo.com", true, "UserAPI"));

        System.out.println("1.Sort By Integer");
        emails.stream().sorted(DTO).forEach(e-> System.out.println(e));


        System.out.println("2. Asc");
        emails.stream().sorted(DTO1).forEach(e-> System.out.println(e));

        System.out.println("2. Dsc");
        emails.stream().sorted(DTO2).forEach(e-> System.out.println(e));

        System.out.println("3.Sort by String");
        emails.stream().sorted(comparator).forEach(e-> System.out.println(e));

        System.out.println("3.Sort by name and email");
        emails.stream().sorted(comparator1).forEach(e-> System.out.println(e));

        System.out.println("3.Sort by domain");
        emails.stream().sorted(comparator2).forEach(e-> System.out.println(e));
    }
}
