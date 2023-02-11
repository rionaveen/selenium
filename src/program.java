
public class program {
	
	public static void main(String[] args) {
		String s ="my name is java";
		String rev="";
		String[] split = s.split(" ");
		//char[] ch = s.toCharArray();
		
			for (int i = split.length-1; i>=0; i--) {
				rev=rev+split[i]+"*";
				String ch = split.toString();
				if(ch.charAt(0)) {
					String upperCase = s.toUpperCase();
				}
				System.out.println(ch[i]);
				
				
			}
			System.out.println(rev);
		}
	}
 