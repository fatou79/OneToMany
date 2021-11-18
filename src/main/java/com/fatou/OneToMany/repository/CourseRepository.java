package com.fatou.OneToMany.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fatou.OneToMany.entity.Course;
import com.fatou.OneToMany.entity.Review;

@Repository
@Transactional
public class CourseRepository {
	private Logger fatou = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	EntityManager em;
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	public Course save(Course course) {
		if(course == null) {
			em.persist(course);
		}else {
			em.merge(course);
		}
		return course;
	}
	
	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course);
	}
	
	public void addReviewsforCourses(Long courseId, List<Review> reviews) {
		Course course = findById(courseId);
		fatou.info("your Course Review is -> {}" , course.getReviews());
		
		for(Review review : reviews) {
			course.addReviews(review);
			review.setCourse(course);
			em.persist(review);
			
			
			
			
		}
		
	}
	
	
	

}
