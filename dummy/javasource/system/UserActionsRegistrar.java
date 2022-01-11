package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(fakedata.actions.GenerateApp.class);
    registrator.registerUserAction(fakedata.actions.GenerateArtist.class);
    registrator.registerUserAction(fakedata.actions.GenerateCat.class);
    registrator.registerUserAction(fakedata.actions.GenerateCommerce.class);
    registrator.registerUserAction(fakedata.actions.GenerateCountry.class);
    registrator.registerUserAction(fakedata.actions.GenerateDateBetween.class);
    registrator.registerUserAction(fakedata.actions.GenerateDecimalBetween.class);
    registrator.registerUserAction(fakedata.actions.GenerateFakeString.class);
    registrator.registerUserAction(fakedata.actions.GenerateName.class);
    registrator.registerUserAction(fakedata.actions.GenerateNumberBetween.class);
    registrator.registerUserAction(fakedata.actions.GenerateNumberDigits.class);
    registrator.registerUserAction(fakedata.actions.GenerateQuote.class);
    registrator.registerUserAction(fakedata.actions.GenerateRandomColorHex.class);
    registrator.registerUserAction(fakedata.actions.GenerateRandomRegexString.class);
    registrator.registerUserAction(fakedata.actions.GenerateRandomString.class);
    registrator.registerUserAction(fakedata.actions.GenerateRandomStringFromFaker.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
