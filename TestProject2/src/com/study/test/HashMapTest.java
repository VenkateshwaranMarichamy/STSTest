package com.study.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		User u1 = new User("venkat", 27);
		User u2 = new User("Rajvel",28);
		User u3 = u2;
		
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		
		//toString: com.study.test.User@48140564 - Hexcode version of hash value
		System.out.println("toString: " + u1);
		System.out.println("hashCode: " + u1.hashCode());
		System.out.println("hashCode: " + System.identityHashCode(u1));
		
		HashMap<User,User> usersMap = new HashMap<User,User>();
		
		//HashMap<User,int> intMap = new HashMap<User,int>();
		
		usersMap.put(u1,u1);
		usersMap.put(u1, u1);
		usersMap.put(u1, u2);
		usersMap.put(u2, u2);
		usersMap.put(u2, u2);
		usersMap.put(u2, u3);
		usersMap.put(u3, u3);
		//usersMap.put(u3, u1);
		
		Set<Map.Entry<User, User>> usersSet = usersMap.entrySet();
        System.out.println("---------: Users :----------");
        for (Map.Entry<User, User> user : usersSet) {
            System.out.println("Name : " + user.getKey().hashCode() + " " + " Number : " + user.getValue().hashCode());
        }
        
        System.out.println(Arrays.asList(usersMap)); // method 1
        System.out.println(Collections.singletonList(usersMap)); // method 2
        
        usersMap.forEach((key, value) -> System.out.println(key.getName() +" " +key.hashCode()+" " + value.getName()));

        
	}

}
