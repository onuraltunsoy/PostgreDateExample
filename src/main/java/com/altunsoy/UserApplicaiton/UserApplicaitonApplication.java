package com.altunsoy.UserApplicaiton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.altunsoy.UserApplicaiton.Model.User;
import com.altunsoy.UserApplicaiton.Repository.UserRepository;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.TimeZone;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class UserApplicaitonApplication  implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserApplicaitonApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserApplicaitonApplication.class, args);
	}
	

    @Autowired
    private UserRepository repository;
	 @Override
	    public void run(String... args) {

		 
		 	
	        log.info("StartApplication...");
	        

	        Date date = new Date(System.currentTimeMillis());
	        
	        
	        Instant nowUtc = Instant.now();
	        ZoneId asiaSingapore = ZoneId.of("Asia/Singapore");
	        ZonedDateTime nowAsiaSingapore = ZonedDateTime.ofInstant(nowUtc,asiaSingapore);
	        
	        
	        Instant instant = Instant.now();
	        OffsetDateTime offsetDateTime2 = instant.atOffset(ZoneOffset.ofHours(7));
	       

	        repository.save(new User("Onur",nowAsiaSingapore, date));
	        repository.save(new User("Ahmet",nowAsiaSingapore,date));
	        repository.save(new User("Furkan",nowAsiaSingapore,date));

	        System.out.println("\nfindAll()");
	        repository.findAll().forEach(x -> System.out.println(x));

	        System.out.println("\nfindById(1L)");
	        repository.findById(1l).ifPresent(x -> System.out.println(x));

	        System.out.println("\nfindByName('Node')");
	        repository.findByName("Node").forEach(x -> System.out.println(x));

	    }

}
