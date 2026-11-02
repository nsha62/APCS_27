package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name = "";
	int age = 0;
	String breed = "";

	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big Red Dog";
	}

	public Dog(String name) {
		this.name = name;
		age = 1;
		breed = "dog dog";
	}

	public Dog(String name, String breed) {
		this.name = name;
		age = 1;
		this.breed = breed;
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = "dog dog";
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getBreed() {
		return breed;
	}

	public boolean isSleeping() {
		int x = (int)(Math.random()*100)+1;
		if (x > 50) {
			return true;
		}
		return false;
	}

	public void bark() {
		System.out.println(name + " starts barking!");
	}
}
