import static java.lang.System.out;
import java.time.*;
import java.util.*;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner input = new Scanner(System.in)) {
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++) {
				String s = input.nextLine();
				double v = Double.parseDouble(s.substring(0, s.indexOf(":")));
				s = s.substring(s.indexOf(":")+1);
				double d = Double.parseDouble(s);
				double r = d/v;
				if(r<=1) {
					out.println("SWERVE");
				} else if(r<=5) {
					out.println("BRAKE");
				} else {
					out.println("SAFE");
				}
			}
		}

	}

}

