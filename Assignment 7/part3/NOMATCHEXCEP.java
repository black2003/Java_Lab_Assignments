package part3;

public class NOMATCHEXCEP extends Exception
{
    private String errorStr;
    private int lineNo;

    public NOMATCHEXCEP(String message, int lineNo, String errorStr) {
        super(message);
        this.lineNo = lineNo;
        this.errorStr = errorStr;
    }

    @Override
    public String toString() {
        return "NOMATCHEXCEP: " + getMessage() + " [lineNo=" + lineNo + ", ErrorInput=" + errorStr + "]";
    }
    
}