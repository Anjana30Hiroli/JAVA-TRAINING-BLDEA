package com.bldea.crorepathiapp.package1;

import java.util.Scanner;

public class Crorepathiapp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Crorepathi Game");
		System.out.println("Lets welcome our first candidate");
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=sc.next();
		System.out.println("What is your age?");
		int age=sc.nextInt();
		System.out.println("What is your city?");
		String city=sc.next();
		System.out.println("What is your state?");
		String state=sc.next();

		Candidate c1=new Candidate(name,age,city,state);

		System.out.println("Congratulations for making it till here Mr/Ms. "+c1.getName());
		System.out.println("The rules of game:");
		System.out.println("1.There will be 10 questions which rewards a specific amount in "+"incremental order");
		System.out.println("2.The game will contain 3 life line."
				+"(audiance phone,50-50 and skip the question)");
		System.out.println("3.You can quit the game at any step.");
		System.out.println("Please type 1 if you wish to see the reward per question"+"else any other number");
		int type_1=sc.nextInt();
		if(type_1==1) {
			System.out.println("Question-1:5000\n"+
					"Question-2:10000\n"+
					"Question-3:20000\n"+
					"Question-4:40000\n"+
					"Question-5:80000\n"+
					"Question-6:160000\n"+
					"Question-7:640000\n"+
					"Question-8:1250000\n"+
					"Question-9:2500000\n"+
					"Question-10:1 Crore");
			System.out.println("Do you wish to continue??(type:yes/no)");
		}
		else {
			System.out.println("Do you wish to continue??(type:yes/no)");
		}
		String type_2=sc.next();

		if(type_2.equalsIgnoreCase("yes")==true) {
			System.out.println("Lets begin the game");
			System.out.println("Here is 1st question");
			boolean res1=questions.fetchQuestion1(c1.getName());
			if(res1==true)
			{
				System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
				System.out.println("here is your next question");		
				boolean res2=questions.fetchQuestion2(c1.getName());
				if(res2==true) {
					System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
					System.out.println("Hers is your next question");
					boolean res3=questions.fetchQuestion3(c1.getName());
					if(res3==true) {
						System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
						System.out.println("Hers is your next question");
						boolean res4=questions.fetchQuestion4(c1.getName());
						if(res4==true) {
							System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
							System.out.println("Hers is your next question");
							boolean res5=questions.fetchQuestion5(c1.getName());
							if(res5==true) {
								System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
								System.out.println("Hers is your next question");
								boolean res6=questions.fetchQuestion6(c1.getName());
								if(res6==true) {
									System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
									System.out.println("Hers is your next question");
									boolean res7=questions.fetchQuestion7(c1.getName());
									if(res7==true) {
										System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
										System.out.println("Hers is your next question");
										boolean res8=questions.fetchQuestion8(c1.getName());
										if(res8==true) {
											System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
											System.out.println("Hers is your next question");
											boolean res9=questions.fetchQuestion9(c1.getName());
											if(res9==true) {
												System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());
												System.out.println("Hers is your next question");
												boolean res10=questions.fetchQuestion10(c1.getName());
												if(res10==true) {
													System.out.println("congrulations!!your answer is correct .\n"+"you have won Rs."+c1.getAmount());

												}
												else {
													System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());
												}
											}
											else {
												System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());
											}
										}
										else {
											System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());

										}	
									}	
									else {
										System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());

									}	
								}	
								else {
									System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());

								}	
							}	
							else {
								System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());

							}	
						}	
						else {
							System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());

						}	
					}	
					else {
						System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());

					}	
				}	
				else {
					System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());

				}	
			}	
			else {
				System.out.println("we are sorry!! your answer is wrong\n"+"you have won rs."+c1.getAmount());

			}	
		}	
		else {
			System.out.println("Thank you for coming.All the best");
		}
	}
}




