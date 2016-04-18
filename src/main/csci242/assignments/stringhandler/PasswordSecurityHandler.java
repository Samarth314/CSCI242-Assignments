package csci242.assignments.stringhandler;

/**
 * Implement a string parsing system, called StringHandler, in Java that uses
 * interfaces to specify common behavior and interface implementations to
 * specify specific behavior.
 * <p>
 * Long description.
 *
 * @author Ryan Breaker
 * @edu.uwp.cs.242.course CSCI242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 3
 * @bugs None
 */
public class PasswordSecurityHandler implements StringHandler {

    protected static final String SECURITY_LEVEL_WEAK = "weak";
    protected static final String SECURITY_LEVEL_MEDIUM = "medium";
    protected static final String SECURITY_LEVEL_STRONG = "strong";

    /**
     * Number of characters processed.
     */
    private int length = 0;
    /**
     * Flag to indicate whether a digit was found.
     */
    private boolean digit = false;
    /**
     * Flag to indicate whether a non-alphanumeric character was found.
     */
    private boolean otherCharacter = false;


    /**
     * @return the security level of the parsed password.
     */
    public String securityLevel() {
        if (length >= 8) {
            if (digit && otherCharacter)
                return SECURITY_LEVEL_STRONG;
            if (digit || otherCharacter)
                return SECURITY_LEVEL_MEDIUM;
        }
        return SECURITY_LEVEL_WEAK;
    }


    //region StringHandler methods

    /**
     * @param digit The char to verify.
     */
    @Override
    public void processDigit(char digit) {
        if (!Character.isDigit(digit)) {
            throw new IllegalArgumentException(PROCESSDIGIT_ERROR);
        }

        this.digit = true;
        length++;
    }

    /**
     * @param letter The char to verify.
     */
    @Override
    public void processLetter(char letter) {
        if (!Character.isAlphabetic(letter)) {
            throw new IllegalArgumentException(PROCESSLETTER_ERROR);
        }

        length++;
    }

    /**
     * @param other The char to verify.
     */
    @Override
    public void processOther(char other) {
        if (Character.isDigit(other) || Character.isAlphabetic(other)) {
            throw new IllegalArgumentException(PROCESSOTHER_ERROR);
        }

        otherCharacter = true;
        length++;
    }
    //endregion

    //region Getters

    /**
     * @return The password's length.
     */
    protected int getLength() {
        return length;
    }

    /**
     * @return Whether or not the password has a digit.
     */
    protected boolean getDigit() {
        return digit;
    }

    /**
     * @return Whether or not the password has a non-alphanumeric character.
     */
    protected boolean getOtherCharacter() {
        return otherCharacter;
    }
    //endregion
}