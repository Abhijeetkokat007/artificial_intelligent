import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ProblemSolver {
static Map<String, String> problemDict = new HashMap<>();
static {
problemDict.put("Printer not working", "Check that it's turned on and connected to the
network");
problemDict.put("Can't log in", "Make sure you're using the correct username and password");
problemDict.put("Software not installing", "Check that your computer meets the system
requirements");
problemDict.put("Internet connection not working", "Restart your modem or router");
problemDict.put("Email not sending", "Check that you're using the correct email server
settings");
}
static String handleRequest(String userInput) {
if (userInput.equalsIgnoreCase("exit")) {
return "Goodbye!";
} else if (problemDict.containsKey(userInput)) {
return problemDict.get(userInput);
} else {
return "I'm sorry, I don't know how to help with that problem.";
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String userInput;
while (true) {
System.out.print("What's the problem? Type 'exit' to quit.\n ");
userInput = scanner.nextLine();
String response = handleRequest(userInput);
System.out.println(response);
if (response.equals("Goodbye!")) {
break;
}
}
scanner.close();
}
}