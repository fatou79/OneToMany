package com.fatou.OneToMany;



import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.OneToMany.entity.Review;
import com.fatou.OneToMany.repository.CourseRepository;


@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {
	private Logger diop = LoggerFactory.getLogger(this.getClass());
	 
	@Autowired
	CourseRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Review> reviews = new ArrayList<>(List.of(new Review("5", "not bad class"),new Review("9", "Very good class"),
				new Review("10", "Excellent class")));
		
		cr.addReviewsforCourses(10001L, reviews);
	}

}
