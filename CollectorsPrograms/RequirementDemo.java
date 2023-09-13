package com.CollectorsPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RequirementDemo {

	public static void main(String[] args) {
		List<Employee1> employeeList = new ArrayList<Employee1>();

		employeeList.add(new Employee1(1, "Jamalbi", 30, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee1(2, "Harsha", 23, "Male", "Fullstack developer", 2015, 95000.0));
		employeeList.add(new Employee1(3, "Bhasker", 27, "Male", "Java Developer", 2012, 90000.0));
		employeeList.add(new Employee1(4, "Somesh", 22, "Male", "HR", 2017, 70000.0));
		employeeList.add(new Employee1(5, "Pravallika", 22, "Female", "Java Developer", 2022, 50000.0));
		employeeList.add(new Employee1(6, "Prasanth", 24, "Male", "Fullstack Developer", 2020, 75000.0));
		employeeList.add(new Employee1(7, "Akila", 25, "Female", "sales", 2018, 90000.0));
		employeeList.add(new Employee1(8, "Sai Krishna", 27, "Male", "Development", 2019, 50000.0));
		employeeList.add(new Employee1(9, "Yuva Teja", 24, "Male", "HR", 2020, 80000.0));
		employeeList.add(new Employee1(10, "Uma", 23, "Female", "Sales", 2019, 75000.0));
		employeeList.add(new Employee1(11, "Shiva kumar", 32, "Male", "Development", 2011, 95000.0));
		employeeList.add(new Employee1(12, "Chandini", 24, "Female", "Infrastructure",  2021, 80000.0));
		employeeList.add(new Employee1(13, "Chandu", 25, "Male", "HR", 2021, 60000.0));
		employeeList.add(new Employee1(14, "Mounika", 26, "Female", "Infrastructure", 2021, 50000.0));
		employeeList.add(new Employee1(15, "likitha", 24, "Female", "Sales", 2022, 55000.0));
		
		//1.How many male and female employees are there in the organization ?
		Map<String, Long> map1 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
		System.out.println(map1);
		
		System.out.println("=======================================================");
		
		//2.name of all departments in the organization ?
		employeeList.stream().map(Employee1::getDepartment).distinct().forEach(i->System.out.println(i));
		
		System.out.println("=======================================================");
		
		//3.What is the average age of male and female employees ?
		Map<String, Double> emp2 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.averagingInt(Employee1::getAge)));
		System.out.println(emp2);
		
		System.out.println("=======================================================");
		
		//4.Get the details of highest paid employee in the organization ?
		Optional<Employee1> map3 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)));
		System.out.println(map3);
		if(map3.isPresent()) {
			System.out.println(map3.get().getName());
		}
		
		System.out.println("=======================================================");
		
		//5. Get the names of all employees who have joined after 2015 ?
		employeeList.stream().filter(e->e.getYearOfJoining()>2015).forEach(i->System.out.println(i.getName()));
		
		System.out.println("=======================================================");
		
		//6.count the number of employees in each department ?
		Map<String, Long> map4 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
		System.out.println(map4);
		
		
		System.out.println("=======================================================");
		
		//7. What is the average salary of each department ?
		Map<Double, Double> map5 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getSalary,Collectors.averagingDouble(Employee1::getSalary)));
		System.out.println(map5);
		
		System.out.println("=======================================================");
		//8. Get the details of youngest male employee in the Development department ?
		Optional<Employee1> map6 = employeeList.stream().filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development")).min(Comparator.comparing(Employee1::getAge));
		if(map6.isPresent()) {
			System.out.println(map6.get());
		}
		
		System.out.println("=======================================================");
		//9.Who has the most working experience in the organization ?
		Optional<Employee1> map7 = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee1::getYearOfJoining)));
		if(map7.isPresent()) {
			System.out.println(map7.get());
		}
		
		System.out.println("=======================================================");
		//10.How many male and female employees are there in the Sales team ?
		Map<String, Long> map8 = employeeList.stream().filter(e -> e.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
        System.out.println(map8);
		
		System.out.println("=======================================================");
		//11.What is the average salary of male and female employees ?
		Map<String, Double> map9 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingDouble(Employee1::getSalary)));
		System.out.println(map9);

		System.out.println("======================================================");
		//12.List down the names of all employees in each department?
		Map<String, Map<String, List<Employee1>>> m1= employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.groupingBy(Employee1::getName)));
		System.out.println(m1);
		
		System.out.println("=======================================================");
		//13.What is the average salary and total salary of the whole organization ?
		double avg=employeeList.stream().collect(Collectors.averagingDouble(Employee1::getSalary));
		System.out.println(avg);
		
		System.out.println("=======================================================");
		//14.Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?
		System.out.println("----younger are equal to 25 years------");
		employeeList.stream().filter(e -> e.age<= 25).map(e -> e.name).forEach(name -> System.out.println(name));

		System.out.println("-----greater than 25 years------");
	    employeeList.stream().filter(e -> e.age> 25).map(e -> e.name).forEach(name -> System.out.println(name));
		
		System.out.println("=======================================================");
		//Who is the oldest employee in the organization?
		Map<Integer, Optional<Employee1>> m2= employeeList.stream().collect(Collectors.groupingBy(Employee1::getAge,Collectors.maxBy(Comparator.comparingInt(Employee1::getAge))));
		System.out.println(m2);
		
	}

}
