// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fakedata.proxies;

public enum QuoteType
{
	Back_to_the_future(new java.lang.String[][] { new java.lang.String[] { "en_US", "Back to the future" } }),
	Chuck_Norris(new java.lang.String[][] { new java.lang.String[] { "en_US", "Chuck Norris" } }),
	Friends(new java.lang.String[][] { new java.lang.String[] { "en_US", "Friends" } }),
	Game_of_Thrones(new java.lang.String[][] { new java.lang.String[] { "en_US", "Game of Thrones" } }),
	Harry_Potter(new java.lang.String[][] { new java.lang.String[] { "en_US", "Harry Potter" } }),
	Hitchhikers_Guide_To_The_Galaxy(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hitchhikers Guide To The Galaxy" } }),
	Hobbit(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hobbit" } }),
	How_I_Met_Your_Mother(new java.lang.String[][] { new java.lang.String[] { "en_US", "How I Met Your Mother" } }),
	Rick_And_Morty(new java.lang.String[][] { new java.lang.String[] { "en_US", "Rick And Morty" } }),
	Yoda(new java.lang.String[][] { new java.lang.String[] { "en_US", "Yoda" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private QuoteType(java.lang.String[][] captionStrings)
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