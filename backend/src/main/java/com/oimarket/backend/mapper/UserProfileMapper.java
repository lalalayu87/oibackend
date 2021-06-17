package com.oimarket.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.oimarket.backend.model.UserProfile;

@Mapper
public interface UserProfileMapper {
	
	@Select("SELECT * FROM UserProfile WHERE id=#{id}")
	UserProfile getUserProfile(@Param("id") String id);
	
	@Select("SELECT * FROM UserProfile")
	List<UserProfile> getUserProfileList();
	
	@Select("INSERT INTO UserProfile VALUES(#{id}, #{name}, #{phone}, #{address})")
	Integer insertUserProfile(@Param("id") String id, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);
	
	@Select("UPDATE UserProfile SET name=#{name}, phone=#{phone}, address=#{address} WHERE id=${id}")
	Integer updateUserProfile(@Param("id") String id, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);

	@Select("DELETE FROM UserProfile WHERE id=#{id}")
	Integer deleteUserProfile(@Param("id") String id);
}
