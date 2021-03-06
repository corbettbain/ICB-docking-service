package com.jiaqu.icb.pojo.user;

import com.corbett.annotation.CheckParam;
import com.corbett.entity.ReturnMessage;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_t.id
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_t.user_name
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_t.password
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_t.age
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_t.id
     *
     * @return the value of user_t.id
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_t.id
     *
     * @param id the value for user_t.id
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_t.user_name
     *
     * @return the value of user_t.user_name
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_t.user_name
     *
     * @param userName the value for user_t.user_name
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_t.password
     *
     * @return the value of user_t.password
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_t.password
     *
     * @param password the value for user_t.password
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_t.age
     *
     * @return the value of user_t.age
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_t.age
     *
     * @param age the value for user_t.age
     *
     * @mbggenerated Wed Nov 23 11:43:57 CST 2016
     */
    public void setAge(Integer age) {
        this.age = age;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", age=" + age + "]";
	}

	public User(Integer id, String userName, String password, Integer age) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
    
    public ReturnMessage checkParam(){
    	ReturnMessage returnMessage = new ReturnMessage();
    	returnMessage.setFlag(1);
    	returnMessage.setMessage("ssd");
		return returnMessage;
    }
	
}