package com.kh.git;

import com.kh.git.animal.Dog;

public class HelloGit {

	public static void main(String[] args) {
		System.out.println("HelloGit!!!");
		System.out.println("버젼관리의 첫 시작입니다.");
		System.out.println("이클립스의 깃연결은 신기하군요.");
		
		//Dog 기능 추가 
		Dog dog = new Dog();
		dog.bark();
		
	}
}
