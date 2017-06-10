package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by ValkSam on 09.06.2017.
 */
@Component
@PropertySource({"classpath:/p.properties"})
public class MyCommandLineRunner implements CommandLineRunner {

  @Value("${aaa}")
  String aaa; ////из application.properties. application.properties находит самсотоятельно

  @Value("${bbb}")
  String bbb; //чтобы увидеть надо @PropertySource({"classpath:/p.properties" : В отличие от application.properties не найдет самостоятельно

  @Value("${ccc}")
  String ccc;

//  @Value("${ddd}")
//  String ddd;  //java -jar demo-0.0.1-SNAPSHOT.jar --ddd=444

  @Value("${eee}")
  String eee; //из config/application.properties.  Имя config - важно: чтобы нашло самостоятельно

  @Value("${fff}")
  String fff; // bp put("spring.config.location", "classpath:/params/override.properties"); самостоятельно не найдет application.properties т.к. не в корне и не в config/

  @Autowired
  MyProperties myProperties;

  public void run(String... args) {
    System.out.println("===================================================");
    System.out.println(aaa);
    System.out.println(bbb);
    System.out.println(ccc);
//    System.out.println(ddd);
    System.out.println(eee);
    System.out.println(fff);
    System.out.println("---------");
    System.out.println(myProperties.getKkk());
    System.out.println(myProperties.getZzz());
    System.out.println(myProperties.getVvv());
    System.out.println(myProperties.getHhh());
    myProperties.setHhh(1234);
    System.out.println(myProperties.getHhh());
    System.out.println("---------");
    System.out.println("===================================================");
  }

}