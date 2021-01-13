# aspire

## Precondition
1. Install JAVA
2. Instal Maven
3. Set them to PATH Variables
4. Install Chrome Browser version 87

## How it work
Please open source file in Intellij

In configuration running, import one runner using JUnit with configure bellow

Test kind: **Class**

Class: **suite.registery.RegisteryTest**

Then, click run

The Test will contains all the steps from login page -> register page -> verification Phone -> personal page -> verification Email -> business detail page.

The code not run to Onboarding NPS and meet the step waiting the approval because in step identity verficiation, I cannot bypass, it requires to upload a real ID Card from Singapore and I cant get one of those.

## Framework Structure
src.test.java:

- FW
    - Common: contains all common function class to excuted: read properties file, get random number,...
    - CoreManagement:  contains all driver management (init, findelement, assertion)
    - OTPManagement: Manage OTP Token (Get/Set OTP)
    - PageManagement: contains aLl page objectl and Page factory

- suite.registery
    - RegisteryTest: contains all test Case

config.properties

- BROWSER = Chrome
- OS = Windows
- BASE_URL = https://feature-qa.customer-frontend.staging.aspireapp.com/sg
- OTP_CODE = 1234

## Test Case

| | Test Step | Expected Result |
| ------ | ------ | ------ |
| 1 | Go to https://feature-qa.customer-frontend.staging.aspireapp.com/sg | |
| 2 | Click Registery Link | Register Page should displayed |
| 3 | Fill all required field | |
| 4 | Click Continue Button | Type OTP should displayed |
| 5 | Type OTP | Register Phone Successful Page displayed |
|   | | Verify Message 'You have successfully verified your phone number. You’re on to a great start!' should displayed |
| 6 | Click continue button | Is your business incorporated in Singapore? Page should displayed |
| 7 | Select continue button on 'Yes, my business is registered in Singapore with ACRA' option | Let’s know you better! Page should displayed |
| 8 | Select Get Started button on 'Standard Registration' option | Personal Detail Page should displayed |
| 9 | Click Get Started button | |
| 10 | Fill all required field on Personal Detail Form | |
| 11 | Click Submit button | OTP Page should displayed |
| 12 | Type OTP | Personal Detail - Business Detail Page should displayed |
| 13 | Click Get Started button | |
| 14 | Fill all required field | | 
| 15 | Click Submit button | Identity Details page should displayed |
| 16 | Verify Identity by upload ID Card | Waiting for approval page should displayed |

The test script run to 15th Test Step, then cannot continue due to not have ID Card data to verify Identity
