package week2;

/**
 * @author JiHong Jang
 * @since 2014.03.02
 */
public class MyException extends Exception {
    private final int ERR_CODE;

    public MyException() {
        ERR_CODE = 100;
    }

    public MyException(String message) {
        this(message, 100);
    }


    MyException(String message, int errCode) {
        super(message);
        this.ERR_CODE = errCode;
    }

    public int getErrCode() {
        return ERR_CODE;
    }
}
