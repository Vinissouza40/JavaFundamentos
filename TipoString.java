package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola Pessoal".charAt(0));
		
		String s = "Boa Tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s +"!!!");
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
	}
}
