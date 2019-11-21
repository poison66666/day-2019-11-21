/*
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            throwExceptionMethod(true);
        }catch (NullPointerException e){
            System.out.println("抛出空指针异常");
        }finally {
            System.out.println("每次得来我这一次");
        }
    }

    private static void throwExceptionMethod(boolean isThrow) {
        System.out.println("抛异常之前");
        if(isThrow){
            throw new NullPointerException();
        }
        System.out.println("抛异常之后");
    }
}
*/
class CheckedException extends Exception { }
class CheckedException2 extends Exception { }
class UncheckedException extends RuntimeException { }

public class ExceptionDemo {
    public static void throwCheckedException() throws CheckedException, CheckedException2 {
        if (true) {
            throw new CheckedException();
        } else {
            throw new CheckedException2();
        }
    }

    public static void throwUncheckedException() {
        throw new UncheckedException();
    }

    public static void main(String[] args) throws CheckedException, CheckedException2 {
        throwCheckedException();
    }
}

