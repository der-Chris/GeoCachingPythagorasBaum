package pythagorasBaum;

public class PythagorasBaum {
	
	public static void main(String[] args) {
		PythagorasBaum baum = new PythagorasBaum();
		baum.recursiveTree(5);
	}
	
	private int recursiveTree(int index) {
		int result = 9; // rekursiv
		if (index > 0) {
			result = (int) (Math.pow(-1, index) * (index * Math.sin((index / 2 * Math.PI) - (recursiveTree(index - 1) + 1) * Math.cos(index / 2 * Math.PI))));
		} 
		System.out.println("Debug Info: for index:[" + index + "], the result is:[" + result + "]");
		return result;
	}
}
