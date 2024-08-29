public class DataTypes {

    public void checkInputDataTypes(long input) {
        try {
            System.out.printf("%d can be fitted in: \n", input);
            if (input <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (input <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (input <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (input <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
        } catch (Exception e) {
            System.out.println("can't be fitted anywhere");
        }
    }

}
