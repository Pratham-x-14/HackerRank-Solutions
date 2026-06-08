class StrongPassword {

    public static int minimumNumber(int n, String password){
    
    boolean hasDigit = false;
    boolean hasLower = false;
    boolean hasUpper = false;
    boolean hasSpecial = false;

    String special = "!@#$%^&*()-+";

    for(char ch : password.toCharArray()) {

        if(Character.isDigit(ch)) {
            hasDigit = true;
        }
        else if(Character.isLowerCase(ch)) {
            hasLower = true;
        }
        else if(Character.isUpperCase(ch)) {
            hasUpper = true;
        }
        else if(special.indexOf(ch) != -1) {
            hasSpecial = true;
        }
    }

    int missing = 0;

    if(!hasDigit) missing++;
    if(!hasLower) missing++;
    if(!hasUpper) missing++;
    if(!hasSpecial) missing++;

    return Math.max(missing, 6 - n);
    }

}