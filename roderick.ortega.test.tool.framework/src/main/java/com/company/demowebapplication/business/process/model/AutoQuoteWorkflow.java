package com.company.demowebapplication.business.process.model;

import com.company.common.interfaces.process.DataLoadableInterface;
import com.company.common.types.VerificationParameters;
import com.company.common.utils.Verifiable;
import com.company.demowebapplication.data.AutomobileInstantQuotePageDto;
import com.company.demowebapplication.data.LandingPageDto;
import com.company.demowebapplication.enums.AutomobileTypeEnum;
import com.company.demowebapplication.enums.DrivingRecordTypeEnum;
import com.company.demowebapplication.enums.FinancialInfoTypeEnum;
import com.company.demowebapplication.enums.GenderTypeEnum;
import com.company.demowebapplication.enums.ServiceTypeEnum;
import com.company.demowebapplication.interfaces.pages.AutomobileInstantQuotePageInterface;
import com.company.demowebapplication.interfaces.pages.LandingPageInterface;
import com.company.demowebapplication.interfaces.workflows.AutoQuoteWorkflowInterface;

public class AutoQuoteWorkflow extends AbstractSiteWorkflow implements AutoQuoteWorkflowInterface, DataLoadableInterface {

	private LandingPageInterface lp;
	private AutomobileInstantQuotePageInterface aiqp;
	private LandingPageDto lpDto = this.getDto().getLandingPageDto();
	private AutomobileInstantQuotePageDto aiqpDto = this.getDto().getAutomobileInstantQuotePageDto();
	
	@Override
	public void login() throws Exception {
		lp.setEmail(lpDto.getEmail());
		lp.setPassword(lpDto.getPassword());
		lp.selectService(ServiceTypeEnum.AUTO_QUOTE);
	}

	@Override
	public void enterDataToForm() throws Exception {
		aiqp.setZipCode(aiqpDto.getZipCode());
		aiqp.setEmail(aiqpDto.getEmail());
		aiqp.selectAutomobileType(AutomobileTypeEnum.CAR);
		aiqp.selectNext();
		aiqp.setAge(aiqpDto.getAge());
		aiqp.selectGender(GenderTypeEnum.MALE);
		aiqp.selectDrivingRecord(DrivingRecordTypeEnum.EXCELLENT);
		aiqp.selectNext();
		aiqp.setYear(aiqpDto.getYear());
		aiqp.selectMake(aiqpDto.getMake());
		aiqp.selectModel(aiqpDto.getModel());
		aiqp.selectFinancialInfo(FinancialInfoTypeEnum.OWN);
		aiqp.selectNext();
	}

	@Override
	public void verifySubmittedData() throws Exception {
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedZipCode(), aiqpDto.getZipCode(), "Verify Zip Code"));
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedAge(), aiqpDto.getAge(), "Verify Age"));
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedGender(), aiqpDto.getGender(), "Verify Gender"));
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedDrivingRecord(), aiqpDto.getDrivingRecord(), "Verify Driving Record"));
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedAutomobileType(), aiqpDto.getAutomobileType(), "Verify Automobile Type"));
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedYear(), aiqpDto.getYear(), "Verify Year"));
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedMake(), aiqpDto.getMake(), "Verify Make"));
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedModel(), aiqpDto.getModel(), "Verify Model"));
		Verifiable.continueOnError(new VerificationParameters(aiqp.getDisplayedFinancialInfo(), aiqpDto.getFinancialInfo(), "Verify Financial Info"));
	}
	
}
