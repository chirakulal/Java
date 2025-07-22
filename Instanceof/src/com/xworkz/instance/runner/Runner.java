package com.xworkz.instance.runner;

import com.xworkz.instance.dto.UserDTO;

import java.io.*;

public class Runner {
    public static void main(String[] args) {

        // ✅ Original Object
        UserDTO original = new UserDTO(101, "Chirashree", "chirashree@mail.com", 9876543210L, true);
        System.out.println("Original: " + original);

        // ✅ Clone
        UserDTO cloned = original.clone();
        System.out.println("Cloned  : " + cloned);

        // ✅ Serialize the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(original);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ✅ Deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            UserDTO deserialized = (UserDTO) ois.readObject();
            System.out.println("Deserialized: " + deserialized);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
