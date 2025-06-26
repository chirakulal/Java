package com.xworkz.cover.service;

import com.xworkz.cover.dto.SignUpDto;
import com.xworkz.cover.repository.SignUpImpl;
import com.xworkz.cover.repository.SignUpRepositoryImpl;

public class SignUpServiceImpl implements SIgnUpService {
    @Override
    public String validate(SignUpDto signUpDto) {
        if(signUpDto!=null) {
            String email = signUpDto.getEmail();
            if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                System.out.println("Email is invalid");
                return "Please enter a valid email address";
            }
            String userID = signUpDto.getUserId();
            if (userID == null || userID.length() < 3 || userID.length() > 20) {
                System.out.println("UserId is not valid");
                return "Please enter valid UserId";
            }
            String password = signUpDto.getPassword();
            if (password == null || password.length() < 3 || password.length() > 20) {
                System.out.println("Password is not strong");
                return "please enter valid password";
            }
            String confirmPassword = signUpDto.getConfirmPassword();
            if (confirmPassword == null || !confirmPassword.equals(password)) {
                System.out.println("Password does not match");
                return "Password does not match";
            }
            SignUpImpl signUp = new SignUpRepositoryImpl();
            String result = signUp.save(signUpDto);
            System.out.println(result);



        }


        return "Submitted Successfully";


    }

    @Override
    public String check(String userId, String password) {

        if(userId!=null || password!=null){
           SignUpImpl signUp = new SignUpRepositoryImpl();
           SignUpDto signUpDto =signUp.check(userId,password);
           if(userId.equals(signUpDto.getEmail()) && password.equals(signUpDto.getPassword()) ){
               System.out.println("the signin is valid");
               return "Login is Successfully";
           }

            }else {
            System.out.println("email or password is pointed to null");

        }



        return null;
    }


}
