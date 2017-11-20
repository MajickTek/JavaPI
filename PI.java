public class PI {

    public static void main(String[] args) {
        // Prints Math.PI and the extended Math.PI to the terminal window.
        System.out.println("Standard Math.PI: "+Math.PI);
        System.out.println("Extended Math.PI:"+java.math.BigDecimal(Math.PI));
        System.out.println("Used java.math.BigDecimal to extend Math.PI to the system's legnth");
    }

}
