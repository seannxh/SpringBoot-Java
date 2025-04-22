package com.learningjava.learn_spring_framework;


///Spring Stereotype Annotations

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



// @Configuration - Tells Spring: "Hey, this class contains the setup for building beans (objects) we need."
// @ComponentScan - Tells Spring: "Scan this package (or current package by default) to find beans like @Component, @Service, etc."
// @Bean - Marks a method that creates and returns a bean to be managed by Spring (like manually creating something you want Spring to handle).
// @Component - Marks a class as a bean so Spring can manage it and inject it when needed.
// @Service - A special type of @Component, used specifically for business logic classes (like services or managers).

// @Component - General Annotation Applicable for any class
//- Base for all Spring Stereotype Annotations
//
//-@Service  Indicates that an annotated class has business logic
//-@Controller indicates that an annotated class is a Controller (Web Controller)
//-@Repository Indicates that an annotated class is used to retrieve and or manipulate Data in a database
// Wrapping it in repository allows AOP JDBC Java Database Connectivity
// Will give me a nicer way of saying ERROR instead of raw SQL error as a nature in @Repository

// @Primary - Says: "If there are multiple beans of the same type, use this one by default unless told otherwise."
// @Lazy - Says: "Don’t create this bean until it’s actually needed (on demand, not at startup)."
// @Qualifier("name") - Says: "Use this specific bean when there are multiple choices (overrides @Primary)."
// @Scope("prototype") - Says: "Create a new bean every time it's requested (instead of reusing one like singleton)."
// @Scope("singleton") - (default) Says: "Only make ONE bean — reuse it everywhere it's needed (shared bean)."

// Constructor Injection - You pass the dependency into the constructor. Best practice. Makes fields final and easy to test.
//public class ATM {
//    private final BankService service;
//
//    public ATM(BankService service) {
//        this.service = service;
//    }
//}
//
// Setter Injection - You pass the dependency through a setter method. Good for optional dependencies.
// public class ATM {
//    private BankService service;
//
//    @Autowired
//    public void setService(BankService service) {
//        this.service = service;
//    }
//}
//
// Field Injection - Injects directly into the field using @Autowired. Quick, but not ideal for testing.
//public class ATM {
//    @Autowired
//    private BankService service;
//}
//
// ApplicationContext Injection - You get beans manually using Spring’s context. Flexible, but tightly coupled to Spring.
//public class ATM {
//    private BankService service;
//
//    public ATM(ApplicationContext context) {
//        this.service = context.getBean(BankService.class);
//    }
//}
