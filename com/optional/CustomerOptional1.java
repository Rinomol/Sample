package com.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CustomerOptional1 {
    private int id;
    private String name;
    private String email;
    private List<String> phonenumber;

    //.........generate public getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(List<String> phonenumber) {
        this.phonenumber = phonenumber;
    }

    //........generate constructor..........

    public CustomerOptional1(int id, String name, String email, List<String> phonenumber){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;

    }

    // ..................generate toString....................

    @Override
    public String toString() {
        return "CustomerOptional1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
    class OptionalDemoOne{
        public static void main(String[] args) {

//            System.out.println(new CustomerOptional1(1,"Ravi", "ravigmail.com", Arrays.asList("584658","587365")));

            //.........empty()............
            
//            Optional<Object> emptyOptional = Optional.empty();
//            System.out.println(emptyOptional);

            //...........of()......(email is present means)

//            CustomerOptional1 customerOptional1 = new CustomerOptional1(2,"Bindhu", "bindhu@gmail.com", Arrays.asList("64546757","54546575"));
//            Optional<String> emailOptional = Optional.of(customerOptional1.getEmail());
//            System.out.println(emailOptional);

            //......of()..........(email is null means)
//
//            CustomerOptional1 customerOptional1 = new CustomerOptional1(3,"Anu", null, Arrays.asList("6353585","5387655"));
//            Optional<String>emailOptionalOne = Optional.of(customerOptional1.getEmail());
//            System.out.println(emailOptionalOne);

            //......ofNullable()..........email is null means

//            CustomerOptional1 customerOptional1 = new CustomerOptional1(4,"Abi", null, Arrays.asList("3543578","673543875"));
//            Optional<String> emailOptional2 = Optional.ofNullable(customerOptional1.getEmail());
//            System.out.println(emailOptional2);

            //........ofNullable()..........email is present means

//            CustomerOptional1 customerOptional1 = new CustomerOptional1(5,"Nisha", "nisha@gmail.com", Arrays.asList("533387567", "65438379"));
//            Optional<String> emailOptional3 = Optional.ofNullable(customerOptional1.getEmail());
//            System.out.println(emailOptional3);

            //......ofNullable()..........email is present means get() method

//            CustomerOptional1 customerOptional11 = new CustomerOptional1(6,"Kala", "kala@gmail.com", Arrays.asList("56453875", "53487556"));
//            Optional<String> emailOptional4 = Optional.ofNullable(customerOptional11.getEmail());
//            System.out.println(emailOptional4.get());

            // ...............avoid NosuchElementException.............

            CustomerOptional1 customerOptional1 = new CustomerOptional1(7, "Ramya", "ramya@gmail.com", Arrays.asList("35364784","5675478356"));
//            CustomerOptional1 customerOptional1 = new CustomerOptional1(8,"Jeni", null, Arrays.asList("56432653","756436853"));
            Optional<String> emailOption = Optional.ofNullable(customerOptional1.getEmail());
            if (emailOption.isPresent()){
                System.out.println(emailOption.get());  // email value present means 'email' print in output
                System.out.println(emailOption.map(String :: toUpperCase).orElseGet(() -> "Default mail"));
            }
            else {
                System.out.println("Returns false");
                System.out.println(emailOption.orElse("default@gmail.com"));
//                System.out.println(emailOption.orElseThrow(() -> new IllegalArgumentException("Email not present")));
                System.out.println(emailOption.map(String::toUpperCase).orElseGet(() -> "Default mail"));
            }
        }
    }