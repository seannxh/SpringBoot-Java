package com.learningjava.learn_spring_framework.configandbean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
record Person (String name, int age, Address address, int height) {};
record Address (String city, String state) {}
public class HelloWorldConfig {

    @Bean
    public String name(){
        return "Sean";
    }

    @Bean
    public int age(){
        return 21;
    }

//    @Bean
//    public Person person1(){
//        var person = new Person("mar", 21, new Address ("New York City", "New York") );
//        return person;
//    }
    @Bean(name = "addressBean")
    @Primary
    public Address address1(){
        return new Address("Dallas", "Texas");
    }
    @Bean
    @Qualifier("QualifiedChicago")
    public Address address2(){
        return new Address("Chicago", "Ohio");
    }
//    @Bean
//    public Person person2newCall(){
//        return new Person(name(), age(), address1());
//    }
//    @Bean
//    public Person Person3Param (String name, int age, Address address1){
//        return new Person(name, age, address1);
//
//    }
    @Bean
    public int height(){
        return 194;
    }
    @Bean
    public int height2(){
        return 160;
    }
    @Bean
    @Primary
    public Person Person4Param (String name, int age, @Qualifier("QualifiedChicago") Address address, int height){
        return new Person(name, age, address, height);

    }
    @Bean
    public Person Person5Param (String name, int age,  Address address, int height2){
        return new Person(name, age, address, height2);

    }
}
