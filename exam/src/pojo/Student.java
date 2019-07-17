package pojo;

import com.alibaba.excel.annotation.ExcelProperty;

public class Student {
	@ExcelProperty(index=0,value="姓名")
  private String username;
	@ExcelProperty(index=1,value="问题")
  private String question;
	@ExcelProperty(index=2,value="回答")
  private String answer;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String username, String question, String answer) {
	super();
	this.username = username;
	this.question = question;
	this.answer = answer;
}
  
  
}
