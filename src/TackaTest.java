import java.util.Scanner;


public class TackaTest {
public static void main(String[] args) {
	int x,y;
	Scanner in=new Scanner(System.in);
	x=in.nextInt();
	Scanner input=new Scanner(System.in);
	y=in.nextInt();
	Tacka tackica=new Tacka();
	Tacka tacka1=new Tacka(x,y);
	System.out.println(tacka1.toSting());
	System.out.println(tackica.toSting());
	System.out.println("Razmak izmedju dvije tacke je: "+tacka1.equals(tackica));
	
}
}
