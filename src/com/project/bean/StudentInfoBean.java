package com.project.bean;
/**
 * @author 杨阳
 * 学生详细信息表的bean对象
 * */
public class StudentInfoBean {
	//主键ID
	private int id;
	//年龄
	private int age;
	//性别
	private String sex;
	// 电话
	private String phone;
	// 住址
	private String address;
	// 紧急联系人
	private String contacts;
	// 与紧急联系人的关系
	private String relation;
	// 紧急联系人的电话号码
	private String contactsPhone;
	// 证件照
	private String photo;
	// 学历
	private String education;
	// 专业
	private String profession;
	// 从业经历
	private String experience;
	// 简单信息
	private StudentBean stu;
	// 毕业院校
	private String school;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getContactsPhone() {
		return contactsPhone;
	}
	public void setContactsPhone(String contactsPhone) {
		this.contactsPhone = contactsPhone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public StudentBean getStu() {
		return stu;
	}
	public void setStu(StudentBean stu) {
		this.stu = stu;
	}
	
}
