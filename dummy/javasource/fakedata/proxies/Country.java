// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fakedata.proxies;

public class Country
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject countryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FakeData.Country";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Capital("Capital"),
		CountryCode2("CountryCode2"),
		CountryCode3("CountryCode3"),
		Currency("Currency"),
		CurrencyCode("CurrencyCode"),
		Flag("Flag");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Country(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FakeData.Country"));
	}

	protected Country(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject countryMendixObject)
	{
		if (countryMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FakeData.Country", countryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FakeData.Country");

		this.countryMendixObject = countryMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Country.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static fakedata.proxies.Country initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fakedata.proxies.Country.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fakedata.proxies.Country initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fakedata.proxies.Country(context, mendixObject);
	}

	public static fakedata.proxies.Country load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fakedata.proxies.Country.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Capital
	 */
	public final java.lang.String getCapital()
	{
		return getCapital(getContext());
	}

	/**
	 * @param context
	 * @return value of Capital
	 */
	public final java.lang.String getCapital(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Capital.toString());
	}

	/**
	 * Set value of Capital
	 * @param capital
	 */
	public final void setCapital(java.lang.String capital)
	{
		setCapital(getContext(), capital);
	}

	/**
	 * Set value of Capital
	 * @param context
	 * @param capital
	 */
	public final void setCapital(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String capital)
	{
		getMendixObject().setValue(context, MemberNames.Capital.toString(), capital);
	}

	/**
	 * @return value of CountryCode2
	 */
	public final java.lang.String getCountryCode2()
	{
		return getCountryCode2(getContext());
	}

	/**
	 * @param context
	 * @return value of CountryCode2
	 */
	public final java.lang.String getCountryCode2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CountryCode2.toString());
	}

	/**
	 * Set value of CountryCode2
	 * @param countrycode2
	 */
	public final void setCountryCode2(java.lang.String countrycode2)
	{
		setCountryCode2(getContext(), countrycode2);
	}

	/**
	 * Set value of CountryCode2
	 * @param context
	 * @param countrycode2
	 */
	public final void setCountryCode2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String countrycode2)
	{
		getMendixObject().setValue(context, MemberNames.CountryCode2.toString(), countrycode2);
	}

	/**
	 * @return value of CountryCode3
	 */
	public final java.lang.String getCountryCode3()
	{
		return getCountryCode3(getContext());
	}

	/**
	 * @param context
	 * @return value of CountryCode3
	 */
	public final java.lang.String getCountryCode3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CountryCode3.toString());
	}

	/**
	 * Set value of CountryCode3
	 * @param countrycode3
	 */
	public final void setCountryCode3(java.lang.String countrycode3)
	{
		setCountryCode3(getContext(), countrycode3);
	}

	/**
	 * Set value of CountryCode3
	 * @param context
	 * @param countrycode3
	 */
	public final void setCountryCode3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String countrycode3)
	{
		getMendixObject().setValue(context, MemberNames.CountryCode3.toString(), countrycode3);
	}

	/**
	 * @return value of Currency
	 */
	public final java.lang.String getCurrency()
	{
		return getCurrency(getContext());
	}

	/**
	 * @param context
	 * @return value of Currency
	 */
	public final java.lang.String getCurrency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Currency.toString());
	}

	/**
	 * Set value of Currency
	 * @param currency
	 */
	public final void setCurrency(java.lang.String currency)
	{
		setCurrency(getContext(), currency);
	}

	/**
	 * Set value of Currency
	 * @param context
	 * @param currency
	 */
	public final void setCurrency(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String currency)
	{
		getMendixObject().setValue(context, MemberNames.Currency.toString(), currency);
	}

	/**
	 * @return value of CurrencyCode
	 */
	public final java.lang.String getCurrencyCode()
	{
		return getCurrencyCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrencyCode
	 */
	public final java.lang.String getCurrencyCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CurrencyCode.toString());
	}

	/**
	 * Set value of CurrencyCode
	 * @param currencycode
	 */
	public final void setCurrencyCode(java.lang.String currencycode)
	{
		setCurrencyCode(getContext(), currencycode);
	}

	/**
	 * Set value of CurrencyCode
	 * @param context
	 * @param currencycode
	 */
	public final void setCurrencyCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String currencycode)
	{
		getMendixObject().setValue(context, MemberNames.CurrencyCode.toString(), currencycode);
	}

	/**
	 * @return value of Flag
	 */
	public final java.lang.String getFlag()
	{
		return getFlag(getContext());
	}

	/**
	 * @param context
	 * @return value of Flag
	 */
	public final java.lang.String getFlag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Flag.toString());
	}

	/**
	 * Set value of Flag
	 * @param flag
	 */
	public final void setFlag(java.lang.String flag)
	{
		setFlag(getContext(), flag);
	}

	/**
	 * Set value of Flag
	 * @param context
	 * @param flag
	 */
	public final void setFlag(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String flag)
	{
		getMendixObject().setValue(context, MemberNames.Flag.toString(), flag);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return countryMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final fakedata.proxies.Country that = (fakedata.proxies.Country) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "FakeData.Country";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}