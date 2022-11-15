import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		String q1="Which of the following option leads to the portability and security of Java?\n"
				 +"(a)Bytecode is executed by JVM\n(b)The applet makes the Java code secure and portable\n(c)Use of exception handling\n(d)Dynamic binding between objects\n";
		String q2="Which of the following is not a Java features?\n"
				+"(a)Dynamic\n(b)Architecture Neutra\n(c)Use of pointers\n(d)Object-oriented\n";
		String q3=" _____ is used to find and fix bugs in the Java programs?\n"
				+"(a)JVM\n(b)JRE\n(c)JDK\n(d)JDB\n";
		String q4=" What is the return type of the hashCode() method in the Object class?\n"
				+"(a)Object\n(b)int\n(c)long\n(d)void\n";
		String q5=" An interface with no fields or methods is known as a ______?\n"
				+"(a)Runnable Interface\n(b)Marker Interface\n(c)Abstract Interface\n(d)CharSequence Interface\n";
				
		Question[]question= {
				new Question(q1,"a"),
				new Question(q2,"c"),
				new Question(q3,"d"),
				new Question(q4,"b"),
				new Question(q5,"b"),
		};
		takeTest(question);
	}
		
		public static void takeTest(Question[]question) {
			int Score=0;
			Scanner input=new Scanner(System.in);
			
			for(int i=0;i<question.length;i++)
			{
				System.out.println(question[i].prompt);
				String answer=input.nextLine();
				if(answer.equals(question[i].answer))
				{
					Score++;
				}
			}
			System.out.println("You got: "+Score+"/"+question.length);
		}
				
}

