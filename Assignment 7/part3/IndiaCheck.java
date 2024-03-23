package part3;

public class IndiaCheck {

    public static void main(String[] args) {
        try {
            for (String arg : args) {
                validateInd(arg);
                System.out.println("All good");
            }
        } catch (NOMATCHEXCEP e) {
            System.out.println(e);
        }
    }

    private static void validateInd(String arg) throws NOMATCHEXCEP {
        if (!"india".equalsIgnoreCase(arg)) {
            throw new NOMATCHEXCEP("The String entered is not \"india\"", 10, arg);
        }
    }
}

class NOMATCHEXCEP extends Exception
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