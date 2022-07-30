package com.study.test;

import java.util.*;
import java.util.stream.Collectors;  
public class MainClass{  
//	    int noOfCoins;
//	        
//	    public int coinChange(int[] coins, int amount) {
//	        if(amount<-1)
//	        	return -1;
//	        if(amount==0)
//	        	return 0;
//	        for(int i=coins.length-1; i>=0; i--){
//	            noOfCoins = coinChange(coins, amount-coins[i]);
//	            System.out.println("coin[i]="+coins[i]+" i="+i+" amount="+amount+" noOfCoins="+noOfCoins);
//	        }
//	        
//	        return noOfCoins;
//	    }
//	    
	public static void main(String args[]){  
		
		
		/*
		 * ArrayList<Student> al=new ArrayList<Student>(); al.add(new
		 * Student(101,"Vijay",23)); al.add(new Student(106,"Ajay",27)); al.add(new
		 * Student(105,"Jai",21));
		 * 
		 * Collections.sort(al); for(Student st:al){
		 * System.out.println(st.rollno+" "+st.name+" "+st.age); }
		 */
		
//		MainClass m=new MainClass();
//		m.coinChange(new int[]{1,2},5);
		
//		TestingFunctionalInterface tf = (n) -> n;
//		System.out.println(tf.getInt(5));
//		//new IntStream(tf.getInt(5)).stream().forEach(System.out::println);
		
		Employee e1 = new Employee(1, 100000, 20000, 0);
		Employee e2 = new Employee(2, 200000, 50000, 0);
		Employee e3 = new Employee(1, 500000, 100000, 0);
		Employee e4 = new Employee(2, 200000, 50000, 0);
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4);
		
		Set<Employee> empSettemp = empList.stream().map(e -> {e.setTaxableIncme(e.getSalary()-e.getDeductions()); return e;})
				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getEmpID))));
		empSettemp.forEach(e -> {
					if(e.getTaxableIncome()>100000 && e.getTaxableIncome()<=200000)
						e.setSlabRate(5);
				});
		
		empList.forEach(System.out::println);
		
		System.out.println("-----");
		
		empList.stream().map(e -> {e.setTaxableIncme(e.getSalary()-e.getDeductions()); return e;})
		.forEach(e -> {
			if(e.getTaxableIncome()>100000 && e.getTaxableIncome()<=200000)
				e.setSlabRate(5);
		});
		
		empList.forEach(System.out::println);
		
		System.out.println("-----");
		
		Set<Employee> empSet = empList.stream().map(e -> {e.setTaxableIncme(e.getSalary()-e.getDeductions()); return e;})
		.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getEmpID))));
		empSet.forEach(e -> {
			if(e.getTaxableIncome()>100000 && e.getTaxableIncome()<=200000)
				e.setSlabRate(5);
		});
		
		empList.forEach(System.out::println);
		
		System.out.println("-----");
		
		empSet.forEach(System.out::println);
	}  
}  
