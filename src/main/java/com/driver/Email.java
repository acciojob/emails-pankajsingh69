package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
            if(oldPassword.equals(password)){
                if(isValid(newPassword)){
                    System.out.println("Password changed successfully");
                }else{
                    System.out.println("The new password is not valid");
                }
            }else{
                System.out.println("The given password does not match the current password!");
            }
    }
    public boolean isValid(String password){
        boolean capitals = false;
        boolean smalls = false;
//        int charcount = 0;
        boolean isdigit = false;
        boolean special = false;

        if(password.length() < 8){
            return false;
        }

        for(int i = 0; i<password.length(); i++){
            char x = password.charAt(i);

            if((x >= 'A') && (x <= 'Z')){
                capitals = true;
            } else if ((x >= 'a') && (x <= 'z')) {
                smalls = true;
            } else if ((x >= '0') && (x <= '9')) {
                isdigit = true;
            }else {
                special = true;
            }
        }

        if(capitals && smalls && isdigit && special){
            return true;
        }else return false;
    }
}
