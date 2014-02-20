package com.xhighx.psetool.wizard;

import android.content.Context;
import model.AbstractWizardModel;
import model.BranchPage;
import model.MultipleFixedChoicePage;
import model.PageList;
import model.SingleFixedChoicePage;

public class FenceWizardModel extends AbstractWizardModel {
	public static final String ARG_FENCE_CATEGORY = "FENCE CATEGORY";
	public static final String ARG_FENCE_FENCE_OPTIONS = "FENCE OPTIONS";
	
	public static final String FENCE_TYPE_CHAINLINK = "Chainlink Fence";
	public static final String FENCE_TYPE_WOOD = "Wood Fence";
	public static final String FENCE_TYPE_VINYL = "Vinyl Fence";
	public static final String FENCE_TYPE_COMPOSITE = "Composite Fence";
	public static final String FENCE_TYPE_METAL = "Metal Fence";
	
	public static final String FENCE_OPTION_REMOVE_FENCE = "Remove Fence";
    public static final String FENCE_OPTION_CLEAR_DEBRIS = "height";
    public static final String FENCE_OPTION_CONCRETE_DRILL = "height";
    public static final String FENCE_OPTION_MILEAGE = "height";

	
	public FenceWizardModel(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PageList onNewRootPageList() {
		PageList plist = new PageList(
				new SingleFixedChoicePage(this, ARG_FENCE_CATEGORY)
						.setChoices(FENCE_TYPE_CHAINLINK, FENCE_TYPE_METAL, FENCE_TYPE_WOOD, FENCE_TYPE_VINYL,FENCE_TYPE_COMPOSITE)
						.setRequired(true),
				new MultipleFixedChoicePage(this, ARG_FENCE_FENCE_OPTIONS)
						.setChoices(FENCE_OPTION_REMOVE_FENCE, FENCE_OPTION_CLEAR_DEBRIS, FENCE_OPTION_CONCRETE_DRILL, FENCE_OPTION_MILEAGE)
			
				
				
				
				
				);
		return null;
	}

}
