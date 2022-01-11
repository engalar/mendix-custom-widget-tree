// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package fakedata.actions;

import java.util.Random;
import com.github.javafaker.Faker;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import fakedata.proxies.Commerce;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GenerateCommerce extends CustomJavaAction<IMendixObject>
{
	private java.math.BigDecimal MinPrice;
	private java.math.BigDecimal MaxPrice;
	private java.lang.Long PromotionCodeDigits;

	public GenerateCommerce(IContext context, java.math.BigDecimal MinPrice, java.math.BigDecimal MaxPrice, java.lang.Long PromotionCodeDigits)
	{
		super(context);
		this.MinPrice = MinPrice;
		this.MaxPrice = MaxPrice;
		this.PromotionCodeDigits = PromotionCodeDigits;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		Random random = new Random();
		Faker faker = new Faker(random);
		com.github.javafaker.Commerce commerce = faker.commerce();
		
		IMendixObject object = Core.instantiate(getContext(), Commerce.getType());

		object.setValue(getContext(), Commerce.MemberNames.Color.toString(), commerce.color());
		object.setValue(getContext(), Commerce.MemberNames.Department.toString(), commerce.department());
		object.setValue(getContext(), Commerce.MemberNames.Material.toString(), commerce.material());
		object.setValue(getContext(), Commerce.MemberNames.Price.toString(), commerce.price(this.MinPrice.doubleValue(), this.MaxPrice.doubleValue()));
		object.setValue(getContext(), Commerce.MemberNames.ProductName.toString(), commerce.productName());
		object.setValue(getContext(), Commerce.MemberNames.PromotionCode.toString(), commerce.promotionCode(this.PromotionCodeDigits.intValue()));

		return object;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GenerateCommerce";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
