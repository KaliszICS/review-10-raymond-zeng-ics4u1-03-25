public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String pyramid(int num){
		String drawing = "";
		for (int i = 0; i  <  num; i++) {
            for (int j = num-1; j  >  i; j--) {
                drawing +=(" ");
            }
            for (int k = 0; k  <= i; k++) {
                drawing +=("*");
				if (k < i){drawing += " ";}
            }
            if (i<num-1){drawing +=("\n");}
        }
		return drawing;
    }

	public static String square(int num){
		String drawing = "";
		for (int i = 0; i < num; i++){
			if (i == 0){
				for (int j = 0;j < num;j++){
					drawing += "*";}}
			else if (i == num-1){
				for (int j = 0;j < num;j++){
						drawing += "*";}}
			else {drawing += "*";
				for (int k = 2;k < num;k++){
				drawing += " ";
				if (k == num-1){drawing += "*";}}}
			if (i < num - 1){drawing += "\n";}}
		return drawing;
			}	
		public static boolean hasLowercase(String word){
			for (int i = 0; i < word.length(); i++) {
				if (Character.isLowerCase(word.charAt(i))) {
					return true; 
				}
			}
			return false;
	}
}

