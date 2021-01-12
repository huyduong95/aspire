package FW.PageManagement;

import FW.PageManagement.CommonPage.CommonPage;
import FW.PageManagement.registerPhonePage.RegisterPhonePage;

public class PageFactory {

    private static RegisterPhonePage registerPhonePage;
    private static CommonPage commonPage;

    public static RegisterPhonePage getRegisterPhonePage() {
        if(registerPhonePage == null) {
            registerPhonePage = new RegisterPhonePage();
        }
        return registerPhonePage;
    }

    public static CommonPage getCommonPage() {
        if(commonPage == null) {
            commonPage = new CommonPage();
        }
        return commonPage;
    }

}
