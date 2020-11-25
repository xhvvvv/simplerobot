package Dao;

import Util.Anwser_change;

public class Machine {
	private Anwser_change anwser_change;
	private String Answer=null;
	
	
	public Machine(Anwser_change anwser_change) {
		
		this.anwser_change = anwser_change;
		
	}

	
	
	
	public void setAnwser_change(Anwser_change anwser_change) {
		this.anwser_change = anwser_change;
	}

	public String getAnswer() {
		String  Machine_Answer=anwser_change.ChangeType(Answer);
		System.out.println(Machine_Answer);
		return Machine_Answer;
	}
	public void setAnswer(String Answer) {
		
		this.Answer=Answer;
	}
	
	
	
	
}
