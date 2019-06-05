package com.fairyland.mgr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.fairyland.mgr.entity.User;

@Repository
@Mapper
public interface UserMapper {
	
	@Select("select * from user where user_name=#{userName}")
	User findUserByName(String userName);
	
	@Select("select * from user where id=#{id}")
	List<User> findUserById(int id);
	
	@Select("SELECT * FROM user")
	public List<User> findAll();
	
	@Insert("INSERT INTO user(id,user_name,pass_word,signature) "
			+ "VALUES "
			+ "(#{id},#{userName, jdbcType=VARCHAR},#{passWord, jdbcType=VARCHAR},#{signature})")
	public int insertUser(User user);
	
	@Delete("delete from user where id=#{id}")
	public int delete(int id);
	
	@org.apache.ibatis.annotations.Update("update user set user.user_name=#{userName},user.pass_word=#{passWord},user.signature=#{signature} where user.id=#{id}")
	public int Update(User user);

}
