package com.hybrid.mapper;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.hybrid.MosaicWeb2Application;
import com.hybrid.domain.Dept2;

public class DeptMapperTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MosaicWeb2Application.class, args);
	try {
		DeptMapper2 mapper = ctx.getBean(DeptMapper2.class);
		
		mapper.delete(55);
		/*
		 *  Insert
		 */
		mapper.insert(new Dept2(55, "총무부", "서울"));
		
		Dept2 d = mapper.selectByDeptno(55);
		System.out.println("Insert ==> " + d);
		
		List<Dept2> depts = mapper.selectAll();
		depts.forEach(dept -> {
			System.out.println(dept);
		});
		
		/*
		 *  Update
		 */
		mapper.update(new Dept2(55, "총무부2", "부산"));
		
		d = mapper.selectByDeptno(55);
		System.out.println("Update ==> " + d);
		
		depts = mapper.selectAll();
		depts.forEach(dept -> {
			System.out.println(dept);
		});
		
		/*
		 *  Delete
		 */
		mapper.delete(55);
		
		d = mapper.selectByDeptno(55);
		System.out.println("Delete ==> " + d);
		
		depts = mapper.selectAll();
		depts.forEach(dept -> {
			System.out.println(dept);
		});
	}
	finally{
		ctx.close();
	}
	}

}
