/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args){
	    int x = 10;
	    int y = 12;
	    int w = 40;
	    int z = 54;
	    
if (x > y && w > z)
{
		System.out.println("A clausula And funcionou");
		System.out.println("X é maior que y e w é maior z");
}
else if (x > y ||w > z)
{
		System.out.println("A clausula OR (OU) funcionou para menor");
		System.out.println("X é maior que y e w é maior z");
}
else 
{
    System.out.println ("clausulaE e OU não são verdadeiras");
}
}
}