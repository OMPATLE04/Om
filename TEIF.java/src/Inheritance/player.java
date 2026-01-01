package Inheritance;

public class player {
	String name;
	int age;
	String gender;
	//constructor
	

}
class FootBall extends player{
	int goals;
	int assist;
	public FootBall (String name , int age, String  gender , int goals, int assist) {
		this.name=name;
		this.age=age;
		this.gender =gender;
		this.goals=goals;
		this.assist=assist;
		
	}
	public int getgoals() {
		return goals;
	}
	public int getAssists() {
		return assist;
	}
	public String getName() {
		return name;
	}
}
