package basic_programs;

public class Static_method {
public static void main(String[] args) {
	System.out.println("Inside main method");
	Static_method.staticmethod();
}

static void staticmethod() {
	System.out.println("inside static method");
}
}
