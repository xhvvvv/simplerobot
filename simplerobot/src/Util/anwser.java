package Util;

public class anwser implements Anwser_change {

	@Override
	public String ChangeType(String words) {
		// TODO Auto-generated method stub
		char[] word = words.toCharArray();
		int size=word.length;
		for(int i=0;i<size;i++) {
			switch(word[i]) {
				case  'Äã':
					word[i]='ÎÒ';
					break;
				case 'ÎÒ' :
					word[i]='Äã';
					break;
				case 63 :
					word[i]=33;
					break;
				case 65311 :
					word[i]=33;
					break;
				case 'Âð' :
					word[i]=' ';	
					break;
			
			}
				
				
		}
		words=new String(word);
		
		return words;
	}

}
