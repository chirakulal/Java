package com.xworkz.instance.dto;

import java.io.Serializable;

public class UserDTO  implements Cloneable, Serializable {



        private int id;
        private String name;
        private String email;
        private long phone;
        private boolean active;

        // Constructor
        public UserDTO(int id, String name, String email, long phone, boolean active) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.active = active;
        }

        // Override toString for easy display
        @Override
        public String toString() {
            return "UserDTO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phone=" + phone +
                    ", active=" + active +
                    '}';
        }

        // Implement clone()
        @Override
        public UserDTO clone() {
            try {
                return (UserDTO) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Clone not supported");
            }
        }
    }


