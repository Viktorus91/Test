package exercise;

//1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:


		import java.util.*;
		public class Exercise {
		    public static void main(String[] args) { 
		    	
		    	
		       
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.		    					        
		        int a = 30;
		        int b = 7;
		        
		        int result1 = a + b;
		        System.out.println(result1);
		        
		        int result2 = a - b;
		        System.out.println(result2);
		        
		        int result3 = a * b;
		        System.out.println(result3);
		        
		        int result4 = a / b;
		        System.out.println(result4);
		        
		        int result5 = a % b;
		        System.out.println(result5);
		         
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";		            
	            if(a > b)
		            System.out.println("a > b");
		          else
		            if(a < b)
		              System.out.println("a < b");
		            else
		              System.out.println("a = b");

		        
		        
//2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
		        String str1 = "a";
		        String str2 = "b";
		         
		        if (str1 == str2) {
		            System.out.println("Строки идентичны");
		        } else {
		            System.out.println("Строки неидентичны");
		            
//Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в консоль все чётные числа. 		            
		            for (int i = 1; i <= 10; i++)
			            if (i % 2 == 0)
			                System.out.println(i);
		            

		            
		        }
		    }
		}