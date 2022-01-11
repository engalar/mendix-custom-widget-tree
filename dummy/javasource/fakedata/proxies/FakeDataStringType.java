// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fakedata.proxies;

public enum FakeDataStringType
{
	CompanyName(new java.lang.String[][] { new java.lang.String[] { "en_US", "Company Name" } }),
	AppName(new java.lang.String[][] { new java.lang.String[] { "en_US", "App Name" } }),
	HashMD5(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hash : MD5" } }),
	HashSHA1(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hash : SHA1" } }),
	HashSHA256(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hash : SHA256" } }),
	HashSHA512(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hash : SHA512" } }),
	Chuck_Norris_Fact(new java.lang.String[][] { new java.lang.String[] { "en_US", "Chuck Norris Fact" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private FakeDataStringType(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
