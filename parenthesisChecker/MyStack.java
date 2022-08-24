
package question;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class MyStack{
	
	private Character[] a; // array of items
	
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

	public MyStack() {
		Character [] a = new Character[4];
		this.a = a;
	}
	
	public boolean isEmpty() {
		boolean tmp = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				tmp = false;
				break;
			}
		}
		return tmp;
	}
	
	
	public int size() {
		
			int tmp = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != null) {
					tmp++;
				}
			}
		return tmp;
		
		
	}
	
	public void resize() {
		Character [] newa = new Character[2*a.length];
		for (int i =0; i<size(); i++) {
			newa[i] = a[i];
		}
		a = newa;
	}
	
	
	public void push(char n) {
		a[size()] = n;
	}
	
	
	public char pop() {
		int l = size();
		char b = a[l-1];
		a[l-1] = null;
		return b;
	}
	
	
	public char peek() {
		return a[size()-1];
	}

	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	
}

