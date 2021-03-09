package sec01_basicsyntax.EX03_ConsoleOutput;

/*기본적인 콘솔 출력 방법*/

public class ConsoleOutput { 
	
	public static void main(String[] ar) {
		
		// #1. System.out.println(...)
		System.out.println("안녕하세요");
		System.out.println("안녕" + "하세요");
		System.out.println(2 + 4);
		System.out.println(4.6);
		System.out.println("문자" + 1);
		System.out.println("문자" + 1 + 2);
		System.out.println(1 + 2 + "문자");
		System.out.println();
		int a = 5;
		String b = "하세요";
		System.out.println(a);
		System.out.println(b);
		System.out.println("안녕"+b);
		System.out.println(a + "안녕" + b);
		System.out.println();
		// #2. System.out.print(...)
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");
		// #3. System.out.printf(...)
		System.out.printf("%d\n", 10);
		System.out.printf("%o\n", 10);
		System.out.printf("%x\n", 10);
		System.out.printf("%s\n", "문자열 출력");
		System.out.printf("%f\n", 3.2582);
		System.out.printf("%4.2f\n", 3.2582);
		System.out.printf("%d와 %4.2f\n", 10, 3.2582);
					
	}
	
}










