package Day44;


import java.util.*;

public class Dice {

	public static void main(String[] args) {
		Job job1= new Job();
		Job job2= new Job("Developer");
		Job job3= new Job("appale", "sdet", 40221.2);
		
		System.out.println(job1);
		System.out.println(job2);
		System.out.println(job3);
		
		
		ArrayList<Job>jobList= new ArrayList<>();
		
		jobList.add(job3);
		
		jobList.add(new Job("Scrum Master", "google", 123000));
		
		jobList.add(new Job("Sdet", "FradieMac", 115000));
		
		jobList.add(new Job("BA", "Leidos", 98000));
		
		jobList.add(new Job("Senior QA Tester", "Delata", 150.000));
		
		
		System.out.println(jobList);
		
		
		
		int max=0;
		for (int i = 0; i < jobList.size(); i++) {
			if(max<jobList.get(i).getSalary()) {
				max=i;
			}
			
		}
		Job bestJob = jobList.get(max);
		System.out.println("Highest Salary: " + bestJob.toString());
		
		System.out.println(job3.getTitle());
		System.out.println(job1.getSalary());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
