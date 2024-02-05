package lesson4.homework.task4;

public class PhoneNumber {

    private static String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        String regex = "\\+994-(50|51|55|77|99|10)-\\d{3}-\\d{2}-\\d{2}$";

        if (phoneNumber.matches(regex)) {
            this.phoneNumber = phoneNumber;
            System.out.println("Phone number has been set to: " + phoneNumber);
        } else {
            System.out.println("Invalid phone number format.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {

        PhoneNumber validPhoneNumber = new PhoneNumber("+994-51-587-45-67");
        PhoneNumber InvalidPhoneNumber = new PhoneNumber("+995-51-587-45-67");


    }

}
