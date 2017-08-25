package sample.logic;

import sample.helper.Base;

public class Booking extends Base{
	
	public void checkweborderDetails()
	{
		click(locator("userName"));
		click(locator("password"));
		click(locator("LOGIN"));
		click(locator("alertMessage"));
		click(locator("className_WebOrderImage"));
		click(locator("xpath_WebOrderImageOld"));
		click(locator("xpath_WebOrderTextLink"));
		click(locator("xpath_WebOrderWord"));
		click(locator("xpath_WebOrderRequiredError"));
		click(locator("xpath_WORequiredError"));
		click(locator("xpath_WONoRBOPartnerDropdown"));
        click(locator("xpath_WONoRBOPartnerName "));
    	click(locator("xpath_WONoRBOConfiguredError"));
		click(locator("xpath_WOPartnerDropdown"));
		click(locator("xpath_WOPartnerName"));
		click(locator("xpath_WORBODropdown"));
		click(locator("xpath_WORBOName"));
		click(locator("xpath_WOProductLineDropdown"));
		click(locator("xpath_WOProductLineName"));
		click(locator("xpath_WOSenderEmail"));
		click(locator("xpath_WOEmailSubject"));
		click(locator("xpath_WOEmailBody"));
		click(locator("xpath_WOOrderBrowseField"));
		click(locator("xpath_WOBrowseButton"));
		click(locator("xpath_WOOrderBrowseField"));
		click(locator("xpath_WOBrowseButton"));
		click(locator("xpath_WOAdditionalBrowseField1"));
		click(locator("xpath_WOAdditionalBrowseField2"));
		click(locator("xpath_WOConfirmationOK"));
		click(locator("xpath_WOSave"));
		click(locator("xpath_WOCancel"));
		click(locator("xpath_WOUploading"));
		click(locator("xpath_WORequiredError")); 
		click(locator("xpath_WOBlankSenderEmailError"));
		click(locator("xpath_WOBlankEmailSubjectError"));
		click(locator("xpath_WOBlankEmailBodyError"));
		click(locator("xpath_WOBlankOrderFileError")); 
		click(locator("xpath_WOInvalidSenderEmailError")); 
		click(locator("xpath_WOInvalidEmailSubjectError")); 
		click(locator("xpath_WOInvalidOrderFileError"));
		click(locator("xpath_WOInvalidOrderFileErrorOK"));
		click(locator("xpath_WOInvalidOrderFileErrorCross"));
		click(locator("xpath_WOOrderFileName"));
		click(locator("xpath_WOOrderFileType"));
		click(locator("xpath_WOAdditionalFileName"));
		click(locator("xpath_WOAdditionalFileType"));
		click(locator("xpath_WODeleteOrderFileType"));
		click(locator("xpath_WODeleteAdditionalFileType"));
}

	public void checkdetails()
	{
		click(locator("order"));
		click(locator("orderdetails"));
		click(locator("orderdetails"));		
	}
}
