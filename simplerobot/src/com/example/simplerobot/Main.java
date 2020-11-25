package com.example.simplerobot;

import java.util.Scanner;

import Dao.Machine;
import Dao.User;
import Util.anwser;

public class Main {

    public static void main(String[] args) {
	// write your code here
    	
    	Machine machine=new Machine(new anwser());
    	Scanner scanner=new Scanner(System.in) ;
    	System.out.println("ÄãºÃ,ÓÃ»§");
    	String question;
    	while(true) {
    		
    		question=scanner.nextLine();
    			
    		machine.setAnswer(question);
    		machine.getAnswer();
    	}
    	
    	
    }
}
