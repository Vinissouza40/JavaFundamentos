package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s ="Bom dia X!!";
		s = s.replace("X"," Senhora" );
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);

		String x = "Teste".toUpperCase();

		System.out.println(x);
		
		String y = "Bom dia Y ".replace("Y", "Gui").toUpperCase().concat("!!!");
		
		System.out.println(y);

		int a = 3;
		
		System.out.println(a);
	}

}
