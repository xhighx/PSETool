package com.xhighx.psetool.wizard;

import android.content.Context;
import model.AbstractWizardModel;
import model.BranchPage;
import model.NumberPage;
import model.PageList;
import model.SingleFixedChoicePage;

public class SidingWizardModel extends AbstractWizardModel {

	public SidingWizardModel(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PageList onNewRootPageList() {
		return new PageList(


                new BranchPage(this, "Siding")
                .addBranch("Yes",
                        new NumberPage(this, "Total Siding(SqFt)"),
                        new BranchPage(this, "Siding Type")
                        .addBranch("Cement Siding")
                        .addBranch("Vinyl Siding")
                )
                .addBranch("No"),

                new BranchPage(this,"Fascia")
                .addBranch("Yes",
                        new NumberPage(this, "Total Fascia(LnFt)"))
                .addBranch("No"),


                new BranchPage(this,"Soffit")
                .addBranch("Yes")
                .addBranch("No")

        );
	}

}
