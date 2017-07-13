package com.user.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.apache.naming.java.javaURLContextFactory;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import com.sun.javafx.collections.MappingChange.Map;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.xml.internal.fastinfoset.sax.SystemIdResolver;

/**
 * 对数据库的数据进行操作
 * @author user
 *
 */
public class Users {
	//jdbc:mysql://localhost:3306/test2?autoReconnect=true&useUnicode=true&characterEncoding=gbk&mysqlEncoding=utf8″
    private  String url = "jdbc:mysql://localhost/ClassDesign?autoReconnect=true&useUnicode=true&characterEncoding=gbk&mysqlEncoding=utf8";
    private  String user = "root";
    private  String password = "1234567890";
    private  String Driver = "com.mysql.jdbc.Driver";
    java.util.Map<String, String> map;
    
   //读取数据
   public java.util.Map<String, String> getLogin(String un){
	   
	   try {
		   
		   
	     map = new HashMap<String,String>();
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "Select username,password from student_message where username=?";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
		preparedStatement.setString(1,un);//设置参数
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			
			map.put("username",resultSet.getString(1));
			map.put("password", resultSet.getString(2));
			
		}
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	    return map;
   }
   
 //读取数据
   boolean iscopy = false;
   public boolean Copy(String un){
	   
	   try {
		   
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "Select username from student_message where username=?";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
		preparedStatement.setString(1,un);//设置参数
		
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()){
			iscopy = true;
		}
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	    return iscopy;
   }
   
   
   boolean isMessageCopy = false;
   public boolean messageCopy(String message){
	   try {
		   
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "Select s_message from student where s_message=?";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
		preparedStatement.setString(1,message);//设置参数
		
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()){
			isMessageCopy = true;
		}
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	    return isMessageCopy;
   }
   
   
   
   boolean isNumberCopy = false;
   public boolean NumberCopy(String num){
	   
	   try {
		   
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "Select s_number from student where s_number=?";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
		preparedStatement.setString(1,num);//设置参数
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()){
			isNumberCopy =true;
		}
		
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	    return isNumberCopy;
   }
   
   
   boolean resultSet = true;
   //插入数据
 public boolean insertMessage(String name,String pd,String turename,String email,String telephone,String address){
	
	 try { 
		
		Class.forName(Driver);
		Connection connection = (Connection) DriverManager.getConnection(url,user,password);
		String sql = "insert into student_message(username,password,turename,Email,telephone,address,time) values(?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		preparedStatement.setString(1,name);
		preparedStatement.setString(2,pd);
		preparedStatement.setString(3,turename);
		preparedStatement.setString(4,email);
		preparedStatement.setString(5,telephone);
		preparedStatement.setString(6,address);
		preparedStatement.setObject(7, new java.sql.Date(System.currentTimeMillis()));
		
		resultSet = preparedStatement.execute();
		
		connection.close();
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return resultSet;
 }
 
 
 
 boolean result=true;
 //插入数据
public boolean insertStudentMessage(String name,String number,String message,String sex,String email,String special,String year,String classes){
	
	 try { 
		
		Class.forName(Driver);
		Connection connection = (Connection) DriverManager.getConnection(url,user,password);
		String sql = "insert into student(s_name,s_number,s_message,s_sex, s_email,s_special,s_year,s_class) values(?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		preparedStatement.setString(1,name);
		preparedStatement.setString(2,number);
		preparedStatement.setString(3,message);
		preparedStatement.setString(4,sex);
		preparedStatement.setString(5,email);
		preparedStatement.setString(6,special);
		preparedStatement.setString(7,year);
		preparedStatement.setString(8,classes);
		
		result = preparedStatement.execute();
		
		connection.close();
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return result;
}



//读取数据
java.util.Map<Integer,java.util.Map<Integer, String>> rowMap;
java.util.Map<Integer,String> selectMap;
public java.util.Map<Integer,java.util.Map<Integer, String>> SelectAllMessage(){
	   
	   try {
		   rowMap = new HashMap<Integer,java.util.Map<Integer, String>>();
		   
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "Select *from student";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
	    int a=1;
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			selectMap = new HashMap<Integer, String>();
			for(int i=1;i<9;i++){
				selectMap.put(i,resultSet.getString(i));
			}
			rowMap.put(a, selectMap);
			a++;
		}
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	    return rowMap;
   }

//读取数据
public java.util.Map<Integer,java.util.Map<Integer, String>> SelectMessageByMessage(String message){
	   
	   try {
		   rowMap = new HashMap<Integer,java.util.Map<Integer, String>>();
		   
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "Select *from student where s_message=?";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
		preparedStatement.setString(1,message);
	    int a=1;
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			selectMap = new HashMap<Integer, String>();
			for(int i=1;i<9;i++){
				selectMap.put(i,resultSet.getString(i));
			}
			rowMap.put(a, selectMap);
			a++;
		}
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	    return rowMap;
 }

//读取数据
public java.util.Map<Integer,java.util.Map<Integer, String>> SelectNumberByMessage(String message){
	   
	   try {
		   rowMap = new HashMap<Integer,java.util.Map<Integer, String>>();
		   
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "Select *from student where s_number=?";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
		preparedStatement.setString(1,message);
	    int a=1;
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			selectMap = new HashMap<Integer, String>();
			for(int i=1;i<9;i++){
				selectMap.put(i,resultSet.getString(i));
			}
			rowMap.put(a, selectMap);
			a++;
		}
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	    return rowMap;
}

//删除数据
boolean isDeleteNum = true;
public boolean DeleteMessage(String num){
	try {
		   
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "delete from student where  s_number=?;";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
		preparedStatement.setString(1,num);//设置参数
		
		isDeleteNum = preparedStatement.execute();
		
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return isDeleteNum;
}



//删除数据
boolean isUpDate = true;
public boolean UpDateMessage(String name,String number,String message,String sex,String email,String special,String year,String classes,String num){
	try {
		   
		Class.forName(Driver); //加载驱动
		Connection connection = (Connection) DriverManager.getConnection(url,user,password); //连接数据库
		String sql = "update student set s_name=?,s_number=?,s_message=?,s_sex=?, s_email=?,s_special=?,s_year=?,s_class=? where s_number=?;";//SQL语句
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);//准备SQL语句
		preparedStatement.setString(1,name);//设置参数
		preparedStatement.setString(2,number);
		preparedStatement.setString(3,message);
		preparedStatement.setString(4,sex);
		preparedStatement.setString(5,email);
		preparedStatement.setString(6,special);
		preparedStatement.setString(7,year);
		preparedStatement.setString(8,classes);
		preparedStatement.setString(9,num);
		
		isUpDate = preparedStatement.execute();
		
		connection.close();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return isUpDate;
}


}
