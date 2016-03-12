package com.brainacad.oop.testnest2_11_1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by m18 on 09.03.2016.
 */
public class MyPhone {
    MyPhoneBook phoneBook;

    public MyPhone() {
    }

    public void swichOn() {
        System.out.print("Loading PhoneBook records... ");
        MyPhoneBook newMPhoneBook = new MyPhoneBook();
        newMPhoneBook.addPhoneNumber("Jon", "0988252952");
        newMPhoneBook.addPhoneNumber("Killy", "0661252912");
        newMPhoneBook.addPhoneNumber("Fob", "0551255512");
        newMPhoneBook.addPhoneNumber("Joi", "0752225112");
        newMPhoneBook.addPhoneNumber("Bob", "0751111115");
        newMPhoneBook.addPhoneNumber("Jully", "0771111117");
        newMPhoneBook.addPhoneNumber("Mia", "0779981255");
        newMPhoneBook.addPhoneNumber("Marry", "0779771511");
        newMPhoneBook.addPhoneNumber("Jeneffer", "0755981123");
        newMPhoneBook.addPhoneNumber("Rebbeka", "0767181255");
        phoneBook = newMPhoneBook;
        System.out.println("OK");
    }

    public void call(int i) {
        System.out.println("Calling to " + phoneBook.phoneNumbers[i]);
    }

    protected static class PhoneNumber {
        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", phone: " + phone;
        }
    }

    public class MyPhoneBook {
        private int index = 0;
        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

        public void addPhoneNumber(String name, String phone) {
            if (index < 10) {
                PhoneNumber phoneNumber = new PhoneNumber(name, phone);
                phoneNumbers[index] = phoneNumber;
                index++;
            } else {
                System.out.println("Место в записной книжке закончилось");
            }
        }

        public void printPhoneBook() {
            for (PhoneNumber phoneNumber : phoneNumbers) {
                if (phoneNumber != null) System.out.println(phoneNumber);
            }
        }

        //Lab 2.11.2:
        public void sortByName() {
            Comparator comparatorByName = (o1, o2) -> {
                PhoneNumber phoneNumber1 = (PhoneNumber) o1;
                PhoneNumber phoneNumber2 = (PhoneNumber) o2;
                return phoneNumber1.getName().compareTo(phoneNumber2.getName());
            };
            Arrays.sort(phoneNumbers, comparatorByName);
        }

        public void sortByPhoneNumber() {
            Comparator<PhoneNumber> comparatorByPhoneNumber = new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber phoneNumber1, PhoneNumber phoneNumber2) {
                    int number1 = Integer.parseInt(phoneNumber1.phone);
                    int number2 = Integer.parseInt(phoneNumber2.phone);
                    return number1 - number2;
                }
            };
            Arrays.sort(phoneNumbers, comparatorByPhoneNumber);
        }
    }
}

