import java.*;

public class PI {

    public static void main(String[] args) {
        // Prints Math.PI and the extended Math.PI to the terminal window.
        System.out.println("Standard Math.PI: "+ Math.PI);
        System.out.println("Extended Math.PI: "+ java.lang.math.BigDecimal(Math.PI)); //this and java.math don't work
        System.out.println("Used java.math.BigDecimal to extend Math.PI to the system's legnth");
    }

}
