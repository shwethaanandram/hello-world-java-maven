package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
<<<<<<< HEAD
        System.out.println("india");
	System.out.println("bangalore");
=======
        System.out.println("INDIA");
	System.out.println("Bangalore");
>>>>>>> 5c5e1f380ffb8a2301bfa58b261f72c943d9f932
    }
}
