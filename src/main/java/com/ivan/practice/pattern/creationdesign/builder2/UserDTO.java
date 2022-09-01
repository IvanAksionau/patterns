package com.ivan.practice.pattern.creationdesign.builder2;

import com.cpc.dp.builder.Address;

import java.time.LocalDate;
import java.time.Period;

//Product class
public class UserDTO {

    private String name;

    private String address;

    private String age;

    //Get builder instance
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address;
    }

    //Builder
    public static class UserDTOBuilder {

        private String firstName;

        private String lastName;

        private String age;

        private String address;

        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + " " + address.getStreet()
                    + "\n" + address.getCity() + ", " + address.getState() + " " + address.getZipcode();

            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return this.userDTO;
        }
    }
}
