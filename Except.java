class MyException extends Exception
{
    public MyException(String msg){
        super(msg);
        System.out.println();
    }
}

public class Except {
    public static void main(String[] args) throws MyException {
        int i = 0;
        int j = 1;
        // throw new MyException("Cant divide by zero");

        try {
            int k = j / i;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("okay");
        }
    }
}
