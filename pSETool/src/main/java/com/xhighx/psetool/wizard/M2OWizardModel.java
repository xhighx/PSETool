/**
 * 
 */
package com.xhighx.psetool.wizard;

import model.AbstractWizardModel;
import model.BranchPage;
import model.MultipleFixedChoicePage;
import model.PageList;
import model.SingleFixedChoicePage;
import model.WindowDimensionPage;
import android.content.Context;

/**
 * @author James
 *
 */
public class M2OWizardModel extends AbstractWizardModel {
	
	/**
	 * @param context
	 */
	public M2OWizardModel(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.AbstractWizardModel#onNewRootPageList()
	 */
	@Override
	protected PageList onNewRootPageList() {
		return new PageList(
				new BranchPage(this, "Category")
					.addBranch("Window",
							
						new WindowDimensionPage(this, "Dimension")
							.setRequired(true),
							
						new BranchPage(this, "Brand")	
							.addBranch("Pella",
									
								new BranchPage(this, "Series")
									.addBranch("Thermastar",
											
										new BranchPage(this, "Type")
											.addBranch("Single Hung",
													
												new SingleFixedChoicePage(this, "Configuration")
													.setChoices("X", "XX", "XXX", "XOX")
													.setRequired(true),
												new MultipleFixedChoicePage(this, "Option")
													 .setChoices("Tempered Glass", "Obscure Glass", "DP50")
                                            )
											.addBranch("Double Hung",
                                                    new SingleFixedChoicePage(this, "Frame Type")
                                                            .setChoices("Block Frame", "Nail Fin")
                                                            .setRequired(true),
                                                    new SingleFixedChoicePage(this, "Configuration")
                                                            .setChoices("X", "XX", "XXX", "XOX")
                                                            .setRequired(true),
                                                    new MultipleFixedChoicePage(this, "Option")
                                                            .setChoices("Tempered Glass", "Obscure Glass", "DP50", "4-9/16\" Jamb", "6-9/16\" Jamb")
                                            )
											.addBranch("Fixed",

                                                    new SingleFixedChoicePage(this, "Shape")
                                                            .setChoices("Rectangle", "Arch Head", "Half Arch", "Half Circle", "Quarter Circle", "Full Circle", "Springline", "Octagon")
                                                            .setRequired(true),
                                                    new MultipleFixedChoicePage(this, "Option")
                                                            .setChoices("Tempered Glass", "Obscure Glass", "Head Expander", "Sill Adapter")
                                            )
											.addBranch("Casement",

                                                    new SingleFixedChoicePage(this, "Frame Type")
                                                            .setChoices("Block Frame", "Nail Fin")
                                                            .setRequired(true),
                                                    new SingleFixedChoicePage(this, "Configuration")
                                                            .setChoices("XX", "XO", "OX", "XOX")
                                                            .setValue("Single")
                                                            .setRequired(true),
                                                    new MultipleFixedChoicePage(this, "Option")
                                                            .setChoices("4-9/16\" Jamb", "6-9/16\" Jamb")
                                                            .setRequired(true)
                                            )
												
											.addBranch("Sliding", 
											
												new SingleFixedChoicePage(this, "Configuration")
													.setChoices("XO", "XOX")
													.setRequired(true),
												new MultipleFixedChoicePage(this, "Option")
													.setChoices("Tempered Glass", "Obscure Glass", "Head Expander", "Sill Adapter")
                                            ),
                                            new SingleFixedChoicePage(this, "Color")
											    .setChoices("White", "Almond")
											    .setRequired(true),
                                            new SingleFixedChoicePage(this, "Glazing")
											    .setChoices("Advanced Low-E", "Advanced Low-E w/ Argon", "SunDefense", "SunDefense w/ Argon", "Bronze Low-E w/ Argon")
											    .setRequired(true),
                                            new BranchPage(this, "Grid Option")
											    .addBranch("Yes",

                                                        new SingleFixedChoicePage(this, "Pattern")
                                                                .setChoices("Colonial-Standard", "Prairie Lite", "Top Valance Only", "Colonial-Custom")
                                                                .setRequired(true),
                                                        new SingleFixedChoicePage(this, "Grille")
                                                                .setChoices("3/4\" Contour", "1\" Contour")
                                                )
													
											.addBranch("No")

                                    )
									.addBranch("850 Series")
										
									.addBranch("450 Series")
                            )
										
							.addBranch("RB Atrium",
											
								new BranchPage(this, "Series")
                                        .addBranch("3100 Series")

                                        .addBranch("3201 Series")
												

                                        .addBranch("3301 Series")
												

                                        .addBranch("3500 Series"),

                                new SingleFixedChoicePage(this, "Glazing")
                                    .setChoices("Low-e", "Low-e w/ Argon", "Ulta Low-e w/ Argon")
                                    .setRequired(true)
                            )
									


                    )
                        .addBranch("Door").setRequired(true)
        );

	}
	 

}
