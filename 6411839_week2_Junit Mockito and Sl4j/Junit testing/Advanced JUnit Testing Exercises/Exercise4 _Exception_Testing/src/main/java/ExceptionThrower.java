public class ExceptionThrower {
    public void throwException() {
        System.out.println("1. Inside throwException()");
        throw new IllegalArgumentException("Invalid argument passed!");
    }
}