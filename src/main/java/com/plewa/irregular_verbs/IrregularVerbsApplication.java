package com.plewa.irregular_verbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class IrregularVerbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrregularVerbsApplication.class, args);
	}

//	Scanner scan = new Scanner(System.in);
//
//        System.out.println("""
//                Hello!:)
//                Choose what kind version of irregular verbs you are interested:
//
//                1. Show me all irregular verbs with translation (PL)
//                2. Let's test myself and fill missing irregular verbs in 2nd and 3rd form.
//                3. Choose amount of irregular verbs to practice.
//                """);
//
//	int chooseMethd = scan.nextInt();
//
//        switch (chooseMethd) {
//		case 1 -> printAllIrregularVerbsPL();
//		case 2 -> fillSecondAndThirdVerbALL();
//		case 3 -> fillSecondAndThirdVerbWithLimit();
//	}

}
