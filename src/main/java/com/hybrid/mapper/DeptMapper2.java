package com.hybrid.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hybrid.domain.Dept2;

@Mapper
public interface DeptMapper2 {

	@Select("select * from dept")
	List<Dept2> selectAll();
	
	@Select("select * from dept where deptno=#{deptno}")
	Dept2 selectByDeptno(int deptno);
	
	@Insert("insert into dept "
			+ " values" 
			+ " (" 
			+ "#{deptno}, "
			+ "#{dname}, "
			+ "#{loc} "
			+ ")")
	int insert(Dept2 dept);
	
	@Update("update dept "
			+ "set dname=#{dname}, "
			+ "loc=#{loc} "
			+ "where deptno=#{deptno}")
	int update(Dept2 dept);
	
	@Delete("delete from dept where deptno=#{deptno}")
	int delete(int deptno);
}
