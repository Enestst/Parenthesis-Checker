
package question;

public class ParanthesisChecker {
	

	public boolean isCorrect(String javaCode) { 
		
		//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
		MyStack arr = new MyStack();
		boolean cr = true;
		int chstr = 0;
		int maxsize = 4;
		for (int i =0; i < javaCode.length();i++) {
			
			if (javaCode.charAt(i) == '\"') {
				chstr++;
			}
			if (chstr % 2 == 0) {
				if (javaCode.charAt(i) == '(' || javaCode.charAt(i) == '{') {
					
					arr.push(javaCode.charAt(i));
					if (arr.size() == maxsize) {
						arr.resize();
						maxsize = maxsize*2;
						
					}
				
			} else if (javaCode.charAt(i) == ')' || javaCode.charAt(i) == '}') {	
				if (arr.isEmpty()) {
					cr = false;
					break;
					
					
				} else {
					if (arr.peek() == '(') {
						if (javaCode.charAt(i) != ')') {
							cr = false;
							break;
							
						} else {
							arr.pop();
						}
						
					} else if(arr.peek() == '{') {
						if (javaCode.charAt(i) != '}') {
							cr = false;
							break;
							
							
						}
						else {
							arr.pop();
						}
					} 
				}
			} 
			
			
			
			}
		
		}
		if (chstr % 2 != 0) {
			return false;
		} else if (cr) {
			if (arr.isEmpty()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

		//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
		
	}
	
}


