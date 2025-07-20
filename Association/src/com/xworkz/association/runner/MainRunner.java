package com.xworkz.association.runner;

import com.xworkz.association.dto.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner {
    public static void main(String[] args) {

        ChancellorDTO chancellor1 = new ChancellorDTO("Dr. A. P. Varma", 62, "PhD in Education", "varma@eduuni.ac.in");
        ChancellorDTO chancellor2 = new ChancellorDTO("Prof. Rina Mehta", 58, "PhD in Physics", "mehta@nationaluniv.edu");
        ChancellorDTO chancellor3 = new ChancellorDTO("Dr. Nikhil Rao", 65, "PhD in Political Science", "nikhil@stateuniversity.in");
        ChancellorDTO chancellor4 = new ChancellorDTO("Dr. Sushmita Ghosh", 59, "PhD in Literature", "sushmita@centraluni.ac.in");
        ChancellorDTO chancellor5 = new ChancellorDTO("Prof. Karan Khanna", 61, "PhD in Engineering", "karan.khanna@techuni.edu");
        ChancellorDTO chancellor6 = new ChancellorDTO("Dr. Ayesha Patel", 57, "PhD in Management", "ayesha.patel@bizschool.org");
        ChancellorDTO chancellor7 = new ChancellorDTO("Prof. Rajiv Menon", 63, "PhD in Environmental Studies", "rajiv@greenuniv.ac.in");
        ChancellorDTO chancellor8 = new ChancellorDTO("Dr. Lavanya Iyer", 60, "PhD in Sociology", "lavanya@socialuniversity.edu");
        ChancellorDTO chancellor9 = new ChancellorDTO("Dr. Devansh Singh", 64, "PhD in History", "devansh@heritageuni.in");
        ChancellorDTO chancellor10 = new ChancellorDTO("Prof. Neelima Roy", 56, "PhD in Computer Science", "neelima.roy@techstate.edu");

        UniversityDTO university1 = new UniversityDTO("Indian Institute of Learning", "Delhi", 5, 1956, chancellor1);
        UniversityDTO university2 = new UniversityDTO("National Science University", "Mumbai", 7, 1962, chancellor2);
        UniversityDTO university3 = new UniversityDTO("State Research University", "Bangalore", 12, 1975, chancellor3);
        UniversityDTO university4 = new UniversityDTO("Central Humanities University", "Kolkata", 15, 1960, chancellor4);
        UniversityDTO university5 = new UniversityDTO("Institute of Technology & Innovation", "Hyderabad", 4, 1980, chancellor5);
        UniversityDTO university6 = new UniversityDTO("Global Business School", "Ahmedabad", 10, 1995, chancellor6);
        UniversityDTO university7 = new UniversityDTO("Green Earth University", "Chennai", 17, 1972, chancellor7);
        UniversityDTO university8 = new UniversityDTO("National Social Science Institute", "Pune", 20, 1968, chancellor8);
        UniversityDTO university9 = new UniversityDTO("Heritage History University", "Varanasi", 22, 1950, chancellor9);
        UniversityDTO university10 = new UniversityDTO("TechState University", "Nagpur", 8, 2000, chancellor10);

        EducationDTO education1 = new EducationDTO("B.Tech", 2015, 82.5, "Computer Science", university1);
        EducationDTO education2 = new EducationDTO("B.Sc", 2014, 75.3, "Physics", university2);
        EducationDTO education3 = new EducationDTO("BA", 2013, 70.0, "Political Science", university3);
        EducationDTO education4 = new EducationDTO("MA", 2016, 80.8, "English Literature", university4);
        EducationDTO education5 = new EducationDTO("M.Tech", 2018, 85.0, "Electronics", university5);
        EducationDTO education6 = new EducationDTO("MBA", 2017, 78.6, "Finance", university6);
        EducationDTO education7 = new EducationDTO("B.Sc", 2012, 72.2, "Environmental Science", university7);
        EducationDTO education8 = new EducationDTO("MA", 2011, 79.5, "Sociology", university8);
        EducationDTO education9 = new EducationDTO("BA", 2010, 68.7, "History", university9);
        EducationDTO education10 = new EducationDTO("B.Tech", 2019, 88.4, "Information Technology", university10);

        DetailDTO detail1 = new DetailDTO("Female", "1993-05-10", "123 MG Road, Delhi", "Indian", education1);
        DetailDTO detail2 = new DetailDTO("Male", "1992-08-22", "45 Park Street, Mumbai", "Indian", education2);
        DetailDTO detail3 = new DetailDTO("Female", "1991-11-17", "78 Residency Road, Bangalore", "Indian", education3);
        DetailDTO detail4 = new DetailDTO("Male", "1994-01-30", "12 College Road, Kolkata", "Indian", education4);
        DetailDTO detail5 = new DetailDTO("Female", "1995-03-14", "220 Banjara Hills, Hyderabad", "Indian", education5);
        DetailDTO detail6 = new DetailDTO("Male", "1993-09-08", "10 Ring Road, Ahmedabad", "Indian", education6);
        DetailDTO detail7 = new DetailDTO("Female", "1990-07-03", "90 Green Park, Chennai", "Indian", education7);
        DetailDTO detail8 = new DetailDTO("Male", "1989-12-25", "65 Model Colony, Pune", "Indian", education8);
        DetailDTO detail9 = new DetailDTO("Female", "1990-02-11", "33 Assi Ghat, Varanasi", "Indian", education9);
        DetailDTO detail10 = new DetailDTO("Male", "1996-06-20", "17 Ram Nagar, Nagpur", "Indian", education10);

        StaffDTO staff1 = new StaffDTO("Ravi Kumar", "Lecturer", "Morning", 45000.0, detail1);
        StaffDTO staff2 = new StaffDTO("Sneha Roy", "Asst. Professor", "Evening", 48000.0, detail2);
        StaffDTO staff3 = new StaffDTO("Anil Mehta", "Lab Assistant", "Morning", 35000.0, detail3);
        StaffDTO staff4 = new StaffDTO("Priya Nair", "Admin", "General", 30000.0, detail4);
        StaffDTO staff5 = new StaffDTO("Kiran Reddy", "Lecturer", "Evening", 46000.0, detail5);
        StaffDTO staff6 = new StaffDTO("Divya Sharma", "Professor", "Morning", 75000.0, detail6);
        StaffDTO staff7 = new StaffDTO("Sandeep Patil", "Assistant", "Night", 27000.0, detail7);
        StaffDTO staff8 = new StaffDTO("Neha Iyer", "Admin", "Evening", 31000.0, detail8);
        StaffDTO staff9 = new StaffDTO("Manish Agarwal", "Lecturer", "Morning", 42000.0, detail9);
        StaffDTO staff10 = new StaffDTO("Pooja Desai", "Research Assistant", "General", 40000.0, detail10);

        StaffDTO staff11 = new StaffDTO("Ajay Verma", "IT Staff", "Night", 34000.0, detail1);
        StaffDTO staff12 = new StaffDTO("Meena Shah", "Counselor", "Morning", 39000.0, detail2);
        StaffDTO staff13 = new StaffDTO("Lokesh Jain", "Lab Tech", "Evening", 36000.0, detail3);
        StaffDTO staff14 = new StaffDTO("Fatima Noor", "Admin", "General", 30000.0, detail4);
        StaffDTO staff15 = new StaffDTO("Ritika D", "Professor", "Morning", 80000.0, detail5);
        StaffDTO staff16 = new StaffDTO("Vishal R", "Guard", "Night", 22000.0, detail6);
        StaffDTO staff17 = new StaffDTO("Sanya T", "Admin", "Evening", 31000.0, detail7);
        StaffDTO staff18 = new StaffDTO("Jatin S", "Lab Staff", "Morning", 34000.0, detail8);
        StaffDTO staff19 = new StaffDTO("Kavya A", "Office Assistant", "Morning", 27000.0, detail9);
        StaffDTO staff20 = new StaffDTO("Pranav K", "Technician", "Night", 36000.0, detail10);

        StaffDTO staff21 = new StaffDTO("Arjun T", "Developer", "Morning", 55000.0, detail1);
        StaffDTO staff22 = new StaffDTO("Namrata L", "Counselor", "Evening", 41000.0, detail2);
        StaffDTO staff23 = new StaffDTO("Siddharth J", "Admin", "Night", 31000.0, detail3);
        StaffDTO staff24 = new StaffDTO("Vani S", "Support Staff", "Morning", 28000.0, detail4);
        StaffDTO staff25 = new StaffDTO("Mohit K", "Lecturer", "Evening", 46000.0, detail5);
        StaffDTO staff26 = new StaffDTO("Chitra M", "Professor", "Morning", 79000.0, detail6);
        StaffDTO staff27 = new StaffDTO("Devika P", "Reception", "General", 27000.0, detail7);
        StaffDTO staff28=new StaffDTO("Prakash G", "Technical", "Evening", 34000.0, detail8);
        StaffDTO staff29=new StaffDTO("Rohini N", "Admin", "Morning", 32000.0, detail9);
        StaffDTO staff30=new StaffDTO("Ravindra B", "Trainer", "Evening", 37000.0, detail10);

        StaffDTO staff31=new StaffDTO("Mahesh N", "Lab Support", "Evening", 33000.0, detail1);
        StaffDTO staff32=new StaffDTO("Meera I", "Trainer", "Morning", 39000.0, detail2);
        StaffDTO staff33=new StaffDTO("Tanya G", "Assistant", "Night", 27000.0, detail3);
        StaffDTO staff34=new StaffDTO("Shankar Y", "Admin", "Morning", 30000.0, detail4);
        StaffDTO staff35=new StaffDTO("Jahnavi T", "Professor", "Evening", 82000.0, detail5);
        StaffDTO staff36=new StaffDTO("Yusuf K", "Lecturer", "Morning", 49000.0, detail6);
        StaffDTO staff37=new StaffDTO("Arpita N", "Assistant", "General", 28000.0, detail7);
        StaffDTO staff38=new StaffDTO("Rajat P", "Cleaner", "Night", 24000.0, detail8);
        StaffDTO staff39=new StaffDTO("Saloni D", "Admin", "Evening", 32000.0, detail9);
        StaffDTO staff40=new StaffDTO("Keshav R", "Security", "Night", 22000.0, detail10);


        List<StaffDTO> staffList1 = new ArrayList<>(Arrays.asList(staff1,staff2,staff3,staff4));
        List<StaffDTO> staffList2 = new ArrayList<>(Arrays.asList(staff5,staff6,staff7,staff8));
        List<StaffDTO> staffList3 = new ArrayList<>(Arrays.asList(staff9,staff10,staff11,staff12));
        List<StaffDTO> staffList4 = new ArrayList<>(Arrays.asList(staff13, staff14, staff15, staff16));
        List<StaffDTO> staffList5 = new ArrayList<>(Arrays.asList(staff17, staff18, staff19, staff20));
        List<StaffDTO> staffList6 = new ArrayList<>(Arrays.asList(staff21, staff22, staff23, staff24));
        List<StaffDTO> staffList7 = new ArrayList<>(Arrays.asList(staff25, staff26, staff27, staff28));
        List<StaffDTO> staffList8 = new ArrayList<>(Arrays.asList(staff29, staff30, staff31, staff32));
        List<StaffDTO> staffList9 = new ArrayList<>(Arrays.asList(staff33, staff34, staff35, staff36));
        List<StaffDTO> staffList10 = new ArrayList<>(Arrays.asList(staff37, staff38, staff39, staff40));

        HeadOfDepartmentDTO hod1 = new HeadOfDepartmentDTO("Dr. Anjali Rao", 18, "anjali.rao@univ.edu", "Computer Science", staffList1);
        HeadOfDepartmentDTO hod2 = new HeadOfDepartmentDTO("Dr. Karthik Menon", 22, "karthik.menon@univ.edu", "Mechanical Engineering", staffList2);
        HeadOfDepartmentDTO hod3 = new HeadOfDepartmentDTO("Dr. Neha Sharma", 15, "neha.sharma@univ.edu", "Electrical Engineering", staffList3);
        HeadOfDepartmentDTO hod4 = new HeadOfDepartmentDTO("Dr. Ravi Iyer", 20, "ravi.iyer@univ.edu", "Civil Engineering", staffList4);
        HeadOfDepartmentDTO hod5 = new HeadOfDepartmentDTO("Dr. Priya Singh", 17, "priya.singh@univ.edu", "Information Technology", staffList5);
        HeadOfDepartmentDTO hod6 = new HeadOfDepartmentDTO("Dr. Manoj Pillai", 19, "manoj.pillai@univ.edu", "Electronics", staffList6);
        HeadOfDepartmentDTO hod7 = new HeadOfDepartmentDTO("Dr. Sneha Kulkarni", 16, "sneha.kulkarni@univ.edu", "Biotechnology", staffList7);
        HeadOfDepartmentDTO hod8 = new HeadOfDepartmentDTO("Dr. Arvind Kumar", 23, "arvind.kumar@univ.edu", "Chemical Engineering", staffList8);
        HeadOfDepartmentDTO hod9 = new HeadOfDepartmentDTO("Dr. Meera Nair", 21, "meera.nair@univ.edu", "Physics", staffList9);
        HeadOfDepartmentDTO hod10 = new HeadOfDepartmentDTO("Dr. Suresh Patil", 14, "suresh.patil@univ.edu", "Mathematics", staffList10);


        DepartmentDTO department1 = new DepartmentDTO("Computer Science", "Block A", 1200000.0, 40, hod1);
        DepartmentDTO department2 = new DepartmentDTO("Mechanical", "Block B", 1100000.0, 38, hod2);
        DepartmentDTO department3 = new DepartmentDTO("Civil", "Block C", 900000.0, 32, hod3);
        DepartmentDTO department4 = new DepartmentDTO("Electrical", "Block D", 1000000.0, 35, hod4);
        DepartmentDTO department5 = new DepartmentDTO("Electronics", "Block E", 950000.0, 34, hod5);
        DepartmentDTO department6 = new DepartmentDTO("IT", "Block F", 1150000.0, 37, hod6);
        DepartmentDTO department7 = new DepartmentDTO("Physics", "Block G", 800000.0, 29, hod7);
        DepartmentDTO department8 = new DepartmentDTO("Chemistry", "Block H", 850000.0, 30, hod8);
        DepartmentDTO department9 = new DepartmentDTO("Mathematics", "Block I", 700000.0, 25, hod9);
        DepartmentDTO department10 = new DepartmentDTO("Biotechnology", "Block J", 1050000.0, 36, hod10);

        PortfolioDTO portfolio1 = new PortfolioDTO("Finance", "2021-2025", "Budget Allocation", "New Delhi", department1);
        PortfolioDTO portfolio2 = new PortfolioDTO("Health", "2020-2024", "Public Health Policy", "Mumbai", department2);
        PortfolioDTO portfolio3 = new PortfolioDTO("Education", "2022-2026", "Curriculum Design", "Bangalore", department3);
        PortfolioDTO portfolio4 = new PortfolioDTO("Defense", "2021-2025", "Security Oversight", "Chennai", department4);
        PortfolioDTO portfolio5 = new PortfolioDTO("Transport", "2023-2027", "Infrastructure Planning", "Hyderabad", department5);
        PortfolioDTO portfolio6 = new PortfolioDTO("IT", "2020-2024", "Digital Services", "Pune", department6);
        PortfolioDTO portfolio7 = new PortfolioDTO("Agriculture", "2022-2026", "Farming Development", "Jaipur", department7);
        PortfolioDTO portfolio8 = new PortfolioDTO("Commerce", "2021-2025", "Trade Management", "Kolkata", department8);
        PortfolioDTO portfolio9 = new PortfolioDTO("Tourism", "2020-2024", "Tourist Promotion", "Goa", department9);
        PortfolioDTO portfolio10 = new PortfolioDTO("Environment", "2023-2027", "Pollution Control", "Thiruvananthapuram", department10);
        PortfolioDTO portfolio11 = new PortfolioDTO("Power", "2021-2025", "Energy Development", "Visakhapatnam", department1);
        PortfolioDTO portfolio12 = new PortfolioDTO("Urban Affairs", "2022-2026", "City Development", "Noida", department2);
        PortfolioDTO portfolio13 = new PortfolioDTO("Rural Development", "2020-2024", "Village Schemes", "Guwahati", department3);
        PortfolioDTO portfolio14 = new PortfolioDTO("Railways", "2023-2027", "Train Operations", "Secunderabad", department4);
        PortfolioDTO portfolio15 = new PortfolioDTO("Telecom", "2021-2025", "Network Expansion", "Gurgaon", department5);
        PortfolioDTO portfolio16 = new PortfolioDTO("Aviation", "2022-2026", "Air Transport", "Indore", department6);
        PortfolioDTO portfolio17 = new PortfolioDTO("External Affairs", "2020-2024", "International Relations", "Delhi", department7);
        PortfolioDTO portfolio18 = new PortfolioDTO("Social Justice", "2023-2027", "Equality Programs", "Amritsar", department8);
        PortfolioDTO portfolio19 = new PortfolioDTO("Youth Affairs", "2021-2025", "Youth Engagement", "Varanasi", department9);
        PortfolioDTO portfolio20 = new PortfolioDTO("Skill Development", "2022-2026", "Training Programs", "Kochi", department10);


        List<PortfolioDTO> portfolioList1 = new ArrayList<>(Arrays.asList(portfolio1, portfolio2));
        List<PortfolioDTO> portfolioList2 = new ArrayList<>(Arrays.asList(portfolio3, portfolio4));
        List<PortfolioDTO> portfolioList3 = new ArrayList<>(Arrays.asList(portfolio5, portfolio6));
        List<PortfolioDTO> portfolioList4 = new ArrayList<>(Arrays.asList(portfolio7, portfolio8));
        List<PortfolioDTO> portfolioList5 = new ArrayList<>(Arrays.asList(portfolio9, portfolio10));
        List<PortfolioDTO> portfolioList6 = new ArrayList<>(Arrays.asList(portfolio11, portfolio12));
        List<PortfolioDTO> portfolioList7 = new ArrayList<>(Arrays.asList(portfolio13, portfolio14));
        List<PortfolioDTO> portfolioList8 = new ArrayList<>(Arrays.asList(portfolio15, portfolio16));
        List<PortfolioDTO> portfolioList9 = new ArrayList<>(Arrays.asList(portfolio17, portfolio18));
        List<PortfolioDTO> portfolioList10 = new ArrayList<>(Arrays.asList(portfolio19, portfolio20));


        MinisterDTO minister1 = new MinisterDTO("Rajesh Kumar", "Progressive Party", 52, "9876543210", portfolioList1);
        MinisterDTO minister2 = new MinisterDTO("Anita Sharma", "Democratic Alliance", 48, "8765432109", portfolioList2);
        MinisterDTO minister3 = new MinisterDTO("Vikram Rao", "United Front", 55, "7654321098", portfolioList3);
        MinisterDTO minister4 = new MinisterDTO("Sangeeta Pillai", "People's Party", 46, "6543210987", portfolioList4);
        MinisterDTO minister5 = new MinisterDTO("Arjun Mehta", "National Bloc", 49, "5432109876", portfolioList5);
        MinisterDTO minister6 = new MinisterDTO("Meera Sinha", "Progressive Party", 51, "4321098765", portfolioList6);
        MinisterDTO minister7 = new MinisterDTO("Karan Verma", "United Front", 47, "3210987654", portfolioList7);
        MinisterDTO minister8 = new MinisterDTO("Pooja Iyer", "Democratic Alliance", 53, "2109876543", portfolioList8);
        MinisterDTO minister9 = new MinisterDTO("Raghav Desai", "People's Party", 44, "1098765432", portfolioList9);
        MinisterDTO minister10 = new MinisterDTO("Divya Nair", "National Bloc", 50, "9988776655", portfolioList10);

        MinisterDTO minister11 = new MinisterDTO("Nikhil Arora", "Progressive Party", 55, "7776665554", portfolioList1);
        MinisterDTO minister12 = new MinisterDTO("Tanya Singh", "Democratic Alliance", 37, "6665554443", portfolioList2);
        MinisterDTO minister13 = new MinisterDTO("Rohan Kapoor", "United Front", 50, "5554443332", portfolioList3);
        MinisterDTO minister14 = new MinisterDTO("Ishita Sen", "People's Party", 36, "4443332221", portfolioList4);
        MinisterDTO minister15= new MinisterDTO("Manoj Bhat", "National Bloc", 59, "3332221110", portfolioList5);
        MinisterDTO minister16 = new MinisterDTO("Shruti Rao", "Progressive Party", 48, "2221110099", portfolioList6);
        MinisterDTO minister17 = new MinisterDTO("Ramesh Gowda", "United Front", 51, "1110009988", portfolioList7);
        MinisterDTO minister18 = new MinisterDTO("Priya Kulkarni", "Democratic Alliance", 40, "0009998877", portfolioList8);
        MinisterDTO minister19 = new MinisterDTO("Tarun Deshpande", "People's Party", 58, "9898989898", portfolioList9);
        MinisterDTO minister20 = new MinisterDTO("Lakshmi Nair", "National Bloc", 53, "8787878787", portfolioList10);

        MinisterDTO minister21 = new MinisterDTO("Madhav Iyer", "Progressive Party", 44, "6262626262", portfolioList1);
        MinisterDTO minister22 = new MinisterDTO("Preeti Rani", "Democratic Alliance", 55, "5151515151", portfolioList2);
        MinisterDTO minister23 = new MinisterDTO("Vinay Dubey", "United Front", 39, "4040404040", portfolioList3);
        MinisterDTO minister24 = new MinisterDTO("Nisha Sen", "People's Party", 42, "3939393939", portfolioList4);
        MinisterDTO minister25 = new MinisterDTO("Karthik Menon", "National Bloc", 56, "3838383838", portfolioList5);
        MinisterDTO minister26 = new MinisterDTO("Sheetal Bhatia", "Progressive Party", 47, "3737373737", portfolioList6);
        MinisterDTO minister27 = new MinisterDTO("Girish Nayak", "United Front", 49, "3636363636", portfolioList7);
        MinisterDTO minister28 = new MinisterDTO("Chitra Mohan", "Democratic Alliance", 51, "3535353535", portfolioList8);
        MinisterDTO minister29 = new MinisterDTO("Vikas Anand", "People's Party", 40, "3434343434", portfolioList9);
        MinisterDTO minister30 = new MinisterDTO("Savita Joshi", "National Bloc", 38, "3333333333", portfolioList10);

        List<MinisterDTO> ministerList1 = new ArrayList<>(Arrays.asList(minister1, minister2, minister3));
        List<MinisterDTO> ministerList2 = new ArrayList<>(Arrays.asList(minister4, minister5, minister6));
        List<MinisterDTO> ministerList3 = new ArrayList<>(Arrays.asList(minister7, minister8, minister9));
        List<MinisterDTO> ministerList4 = new ArrayList<>(Arrays.asList(minister10, minister11, minister12));
        List<MinisterDTO> ministerList5 = new ArrayList<>(Arrays.asList(minister13, minister14, minister15));
        List<MinisterDTO> ministerList6 = new ArrayList<>(Arrays.asList(minister16, minister17, minister18));
        List<MinisterDTO> ministerList7 = new ArrayList<>(Arrays.asList(minister19, minister20, minister21));
        List<MinisterDTO> ministerList8 = new ArrayList<>(Arrays.asList(minister22, minister23, minister24));
        List<MinisterDTO> ministerList9 = new ArrayList<>(Arrays.asList(minister25, minister26, minister27));
        List<MinisterDTO> ministerList10 = new ArrayList<>(Arrays.asList(minister28, minister29, minister30));


        StateDTO state1 = new StateDTO("Avanti 1", "Arun Mishra", 14, 73267.43, ministerList10);
        StateDTO state2 = new StateDTO("Anga 2", "Ravi Verma", 24, 27653.51, ministerList9);
        StateDTO state3 = new StateDTO("Dakshin Ganga 3", "Lakshmi Raman", 28, 71522.47, ministerList9);
        StateDTO state4 = new StateDTO("Anga 4", "Deepak Singh", 18, 38268.61, ministerList5);
        StateDTO state5 = new StateDTO("Kamarupa 5", "Raghav Iyer", 12, 43568.51, ministerList6);
        List<StateDTO> stateList1= new ArrayList<>(Arrays.asList(state1,state2,state3,state4,state5));

        StateDTO state6 = new StateDTO("Magadh 6", "Kunal Joshi", 20, 52678.32, ministerList1);
        StateDTO state7 = new StateDTO("Mithila 7", "Sneha Kapoor", 22, 48952.75, ministerList2);
        StateDTO state8 = new StateDTO("Kalinga 8", "Amit Desai", 19, 60127.91, ministerList3);
        StateDTO state9 = new StateDTO("Surasena 9", "Divya Shah", 16, 34821.47, ministerList4);
        StateDTO state10 = new StateDTO("Vidarbha 10", "Neeraj Kumar", 14, 49275.63, ministerList5);
        List<StateDTO> stateList2 = new ArrayList<>(Arrays.asList(state6, state7, state8, state9, state10));

        StateDTO state11 = new StateDTO("Panchala 11", "Isha Reddy", 17, 31562.82, ministerList6);
        StateDTO state12 = new StateDTO("Kosala 12", "Ramesh Naik", 23, 53412.66, ministerList7);
        StateDTO state13 = new StateDTO("Malwa 13", "Tarun Nair", 21, 47829.50, ministerList8);
        StateDTO state14 = new StateDTO("Sindhu 14", "Priya Menon", 15, 34526.73, ministerList10);
        StateDTO state15 = new StateDTO("Vanga 15", "Vikram Rathi", 18, 45986.88, ministerList1);
        List<StateDTO> stateList3 = new ArrayList<>(Arrays.asList(state11, state12, state13, state14, state15));

        StateDTO state16 = new StateDTO("Aska 16", "Niharika Sharma", 13, 29562.44, ministerList2);
        StateDTO state17 = new StateDTO("Tosali 17", "Rohit Pillai", 20, 52546.99, ministerList4);
        StateDTO state18 = new StateDTO("Shurparaka 18", "Yash Mehta", 19, 49562.36, ministerList7);
        StateDTO state19 = new StateDTO("Mahajanapada 19", "Charu Dutta", 16, 40835.13, ministerList8);
        StateDTO state20 = new StateDTO("Harsha Pradesh 20", "Meena Sood", 22, 48231.25, ministerList9);
        List<StateDTO> stateList4 = new ArrayList<>(Arrays.asList(state16, state17, state18, state19, state20));

        StateDTO state21 = new StateDTO("Bhoja 21", "Sakshi Chauhan", 18, 37125.48, ministerList10);
        StateDTO state22 = new StateDTO("Lichchavi 22", "Harish Patel", 14, 33152.90, ministerList1);
        StateDTO state23 = new StateDTO("Kuru 23", "Alok Gupta", 25, 56329.84, ministerList2);
        StateDTO state24 = new StateDTO("Sambala 24", "Trisha Nair", 13, 27468.31, ministerList3);
        StateDTO state25 = new StateDTO("Rarh 25", "Siddharth Sen", 15, 29631.49, ministerList4);
        List<StateDTO> stateList5 = new ArrayList<>(Arrays.asList(state21, state22, state23, state24, state25));

        StateDTO state26 = new StateDTO("Gurjara 26", "Anjali Deshpande", 20, 41256.68, ministerList5);
        StateDTO state27 = new StateDTO("Tamal 27", "Manish Acharya", 18, 36459.12, ministerList6);
        StateDTO state28 = new StateDTO("Kuntala 28", "Bhavna Jain", 24, 52869.37, ministerList7);
        StateDTO state29 = new StateDTO("Dakshinapatha 29", "Vivek Mahajan", 12, 30124.44, ministerList8);
        StateDTO state30 = new StateDTO("Vallabhi 30", "Shravan Iyer", 19, 38475.79, ministerList9);
        List<StateDTO> stateList6 = new ArrayList<>(Arrays.asList(state26, state27, state28, state29, state30));

        StateDTO state31 = new StateDTO("Dandakaranya 31", "Radha Mishra", 17, 37681.92, ministerList10);
        StateDTO state32 = new StateDTO("Saurashtra 32", "Kishore Nambiar", 21, 49271.33, ministerList1);
        StateDTO state33 = new StateDTO("Konkan 33", "Naina Rathi", 16, 32268.17, ministerList2);
        StateDTO state34 = new StateDTO("Tundikera 34", "Ajay Dev", 22, 50419.88, ministerList3);
        StateDTO state35 = new StateDTO("Banga 35", "Gauri Shankar", 13, 29584.99, ministerList4);
        List<StateDTO> stateList7 = new ArrayList<>(Arrays.asList(state31, state32, state33, state34, state35));


        StateDTO state36 = new StateDTO("Ashmaka 36", "Kritika Rao", 14, 27365.55, ministerList5);
        StateDTO state37 = new StateDTO("Sibi 37", "Tarika Shetty", 20, 44578.01, ministerList6);
        StateDTO state38 = new StateDTO("Nishada 38", "Raghunath Dey", 12, 26489.60, ministerList7);
        StateDTO state39 = new StateDTO("Nanda 39", "Komal Yadav", 23, 55329.12, ministerList8);
        StateDTO state40 = new StateDTO("Chera 40", "Sandeep Kaul", 15, 31362.44, ministerList9);
        List<StateDTO> stateList8 = new ArrayList<>(Arrays.asList(state36, state37, state38, state39, state40));

        StateDTO state41 = new StateDTO("Chola 41", "Meera Sengupta", 19, 43721.99, ministerList10);
        StateDTO state42 = new StateDTO("Pandya 42", "Arvind Shekhar", 18, 42189.60, ministerList1);
        StateDTO state43 = new StateDTO("Kalabhras 43", "Nidhi Kulkarni", 13, 29468.38, ministerList2);
        StateDTO state44 = new StateDTO("Alupa 44", "Karan Bhatia", 20, 48121.79, ministerList3);
        StateDTO state45 = new StateDTO("Kadamba 45", "Jyoti Rane", 17, 38652.71, ministerList4);
        List<StateDTO> stateList9 = new ArrayList<>(Arrays.asList(state41, state42, state43, state44, state45));

        StateDTO state46 = new StateDTO("Ganga 46", "Rahul Mukherjee", 16, 39528.35, ministerList5);
        StateDTO state47 = new StateDTO("Narmada 47", "Kavya Raj", 14, 36258.81, ministerList6);
        StateDTO state48 = new StateDTO("Yamuna 48", "Tushar Sharma", 15, 34127.14, ministerList7);
        StateDTO state49 = new StateDTO("Godavari 49", "Ankita Bhatt", 22, 50269.63, ministerList8);
        StateDTO state50 = new StateDTO("Krishna 50", "Gopal Vyas", 23, 52863.39, ministerList9);
        List<StateDTO> stateList10 = new ArrayList<>(Arrays.asList(state46, state47, state48, state49, state50));

        CountryDto country1 = new CountryDto("Indoria", "New Delhiya", 1350000000L, 2.9, stateList1);
        CountryDto country2 = new CountryDto("Aurathea", "Luminara", 980000000L, 1.8, stateList2);
        CountryDto country3 = new CountryDto("Nordovia", "Frosgard", 670000000L, 3.4, stateList3);
        CountryDto country4 = new CountryDto("Zyron", "Velmora", 430000000L, 0.9, stateList4);
        CountryDto country5 = new CountryDto("Terranova", "Altaris", 1250000000L, 5.1, stateList5);
        CountryDto country6 = new CountryDto("Elvaria", "Mooncrest", 560000000L, 1.2, stateList6);
        CountryDto country7 = new CountryDto("Voltara", "Electra", 720000000L, 2.3, stateList7);
        CountryDto country8 = new CountryDto("Mystral", "Zephyria", 310000000L, 0.8, stateList8);
        CountryDto country9 = new CountryDto("Solarnia", "Ignisia", 850000000L, 2.6, stateList9);
        CountryDto country10 = new CountryDto("Caeloria", "Skyhelm", 390000000L, 1.4, stateList10);

        Collection<CountryDto> collection = new ArrayList<>(Arrays.asList(country1,country2,country3,country4,country5,country6,country7,country8,country9,country10));

        collection.forEach(e-> System.out.println(e));


        System.out.println("Get all list of chancellor");
       List<ChancellorDTO> chancellorDTOS = collection
                .stream()
                .flatMap(countryDto -> countryDto.getStates().stream())
               .flatMap(stateDTO -> stateDTO.getMinisterDTOS().stream())
               .flatMap(ministerDTO -> ministerDTO.getPortfolioDTOList().stream())
               .map(portfolioDTO -> portfolioDTO.getDepartmentDTO())
               .map(departmentDTO -> departmentDTO.getHeadOfDepartment())
               .flatMap(headOfDepartmentDTO ->headOfDepartmentDTO.getStaffDTOList().stream() )
               .map(staffDTO -> staffDTO.getDetails())
               .map(detailDTO -> detailDTO.getEducationDTO())
               .map(educationDTO -> educationDTO.getUniversityDTO())
               .map(UniversityDTO->UniversityDTO.getChancellor())
                .collect(Collectors.toList());
        chancellorDTOS.forEach(e-> System.out.println(e));


        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get all portfolio as a single list");
       List<String> portfolioDTOList =collection.stream()
                .flatMap(countryDto -> countryDto.getStates().stream())
                .flatMap(stateDTO -> stateDTO.getMinisterDTOS().stream())
                .flatMap(ministerDTO -> ministerDTO.getPortfolioDTOList().stream())
               .map(portfolioDTO ->portfolioDTO.getPortfolioName() )
               .collect(Collectors.toList());
        portfolioDTOList.forEach(e-> System.out.println(e));
        System.out.println("Total Portfolios: " + portfolioDTOList.size());

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get only university name");
     List<String> university=  collection
                .stream()
                .flatMap(countryDto -> countryDto.getStates().stream())
                .flatMap(stateDTO -> stateDTO.getMinisterDTOS().stream())
                .flatMap(ministerDTO -> ministerDTO.getPortfolioDTOList().stream())
                .map(portfolioDTO -> portfolioDTO.getDepartmentDTO())
                .map(departmentDTO -> departmentDTO.getHeadOfDepartment())
                .flatMap(headOfDepartmentDTO ->headOfDepartmentDTO.getStaffDTOList().stream() )
                .map(staffDTO -> staffDTO.getDetails())
                .map(detailDTO -> detailDTO.getEducationDTO())
                .map(educationDTO -> educationDTO.getUniversityDTO())
               .map(universityDTO ->universityDTO.getName() )
             .distinct()
                .collect(Collectors.toList());

     university.forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get all MInister");
        List<MinisterDTO> ministerDTOS =collection.stream()
                .flatMap(countryDto -> countryDto.getStates().stream())
                .flatMap(stateDTO -> stateDTO.getMinisterDTOS().stream())
                .collect(Collectors.toList());
        ministerDTOS.forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get Unique Department");
      List<DepartmentDTO> departmentDTOS =  collection
                .stream()
                .flatMap(countryDto -> countryDto.getStates().stream())
                .flatMap(stateDTO -> stateDTO.getMinisterDTOS().stream())
                .flatMap(ministerDTO -> ministerDTO.getPortfolioDTOList().stream())
                .map(portfolioDTO -> portfolioDTO.getDepartmentDTO()).distinct()
                .collect(Collectors.toList());
        departmentDTOS.forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get Staff and education");
       List<StaffDTO> staffDTOList = collection.stream()
                .flatMap(countryDto ->countryDto.getStates().stream() )
                .flatMap(stateDTO ->stateDTO.getMinisterDTOS().stream() )
                .flatMap(minister -> minister.getPortfolioDTOList().stream())
                .map(portfolio -> portfolio.getDepartmentDTO().getHeadOfDepartment())
                .flatMap(headOfDepartmentDTO ->headOfDepartmentDTO.getStaffDTOList().stream() )
                .collect(Collectors.toList());

        List<EducationDTO> educationList = collection.stream()
                .flatMap(country -> country.getStates().stream())
                .flatMap(state -> state.getMinisterDTOS().stream())
                .flatMap(minister -> minister.getPortfolioDTOList().stream())
                .map(portfolio -> portfolio.getDepartmentDTO().getHeadOfDepartment())
                .flatMap(headOfDepartmentDTO ->headOfDepartmentDTO.getStaffDTOList().stream() )
                .map(staffDTO -> staffDTO.getDetails().getEducationDTO())
                .collect(Collectors.toList());

        System.out.println("Staff details");
        staffDTOList.forEach(e-> System.out.println(e));


        System.out.println("------------------------------------------------------------------");
        System.out.println("Education details");
        educationList.forEach(e-> System.out.println(e));
    }
}

