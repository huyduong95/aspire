package FW.OTPManagement;

import static FW.Common.CommonFunction.getDataFromConfig;

public class OTPManagement {

    private String otpCode = "";

    public String getOtpCode() {
        return otpCode;
    }

    public void setOtpCode(String otpCode) {
        this.otpCode = otpCode;
    }

    public static String generateOTP() {
        // Do not function to generate OTP
        // Get it from json data file
        String otpCode = getDataFromConfig("OTP_CODE");
        return otpCode;
    }
}
