package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		List<Friend> list = new ArrayList<Friend>();
		
		list.add( new Friend("짱구") );
		list.add( new Friend("철수") );
		list.add( new Friend("유리") );
		list.add( new Friend("훈이") );
		list.add( new Friend("맹구") );
		
		int idx = (int)(Math.random() * 4 + 1);
		
		System.out.println(list.get(idx).pickLeader());
				
	}
}