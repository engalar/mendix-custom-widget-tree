// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fakedata.proxies;

public class Name
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject nameMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FakeData.Name";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FirstName("FirstName"),
		FullName("FullName"),
		LastName("LastName"),
		Name("Name"),
		NameWithMiddle("NameWithMiddle"),
		Prefix("Prefix"),
		Suffix("Suffix"),
		Title("Title"),
		UserName("UserName");

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

	public Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FakeData.Name"));
	}

	protected Name(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nameMendixObject)
	{
		if (nameMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FakeData.Name", nameMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FakeData.Name");

		this.nameMendixObject = nameMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Name.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static fakedata.proxies.Name initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fakedata.proxies.Name.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fakedata.proxies.Name initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fakedata.proxies.Name(context, mendixObject);
	}

	public static fakedata.proxies.Name load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fakedata.proxies.Name.initialize(context, mendixObject);
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
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
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
	 * @return value of NameWithMiddle
	 */
	public final java.lang.String getNameWithMiddle()
	{
		return getNameWithMiddle(getContext());
	}

	/**
	 * @param context
	 * @return value of NameWithMiddle
	 */
	public final java.lang.String getNameWithMiddle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NameWithMiddle.toString());
	}

	/**
	 * Set value of NameWithMiddle
	 * @param namewithmiddle
	 */
	public final void setNameWithMiddle(java.lang.String namewithmiddle)
	{
		setNameWithMiddle(getContext(), namewithmiddle);
	}

	/**
	 * Set value of NameWithMiddle
	 * @param context
	 * @param namewithmiddle
	 */
	public final void setNameWithMiddle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String namewithmiddle)
	{
		getMendixObject().setValue(context, MemberNames.NameWithMiddle.toString(), namewithmiddle);
	}

	/**
	 * @return value of Prefix
	 */
	public final java.lang.String getPrefix()
	{
		return getPrefix(getContext());
	}

	/**
	 * @param context
	 * @return value of Prefix
	 */
	public final java.lang.String getPrefix(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Prefix.toString());
	}

	/**
	 * Set value of Prefix
	 * @param prefix
	 */
	public final void setPrefix(java.lang.String prefix)
	{
		setPrefix(getContext(), prefix);
	}

	/**
	 * Set value of Prefix
	 * @param context
	 * @param prefix
	 */
	public final void setPrefix(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String prefix)
	{
		getMendixObject().setValue(context, MemberNames.Prefix.toString(), prefix);
	}

	/**
	 * @return value of Suffix
	 */
	public final java.lang.String getSuffix()
	{
		return getSuffix(getContext());
	}

	/**
	 * @param context
	 * @return value of Suffix
	 */
	public final java.lang.String getSuffix(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Suffix.toString());
	}

	/**
	 * Set value of Suffix
	 * @param suffix
	 */
	public final void setSuffix(java.lang.String suffix)
	{
		setSuffix(getContext(), suffix);
	}

	/**
	 * Set value of Suffix
	 * @param context
	 * @param suffix
	 */
	public final void setSuffix(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String suffix)
	{
		getMendixObject().setValue(context, MemberNames.Suffix.toString(), suffix);
	}

	/**
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of UserName
	 */
	public final java.lang.String getUserName()
	{
		return getUserName(getContext());
	}

	/**
	 * @param context
	 * @return value of UserName
	 */
	public final java.lang.String getUserName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UserName.toString());
	}

	/**
	 * Set value of UserName
	 * @param username
	 */
	public final void setUserName(java.lang.String username)
	{
		setUserName(getContext(), username);
	}

	/**
	 * Set value of UserName
	 * @param context
	 * @param username
	 */
	public final void setUserName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String username)
	{
		getMendixObject().setValue(context, MemberNames.UserName.toString(), username);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return nameMendixObject;
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
			final fakedata.proxies.Name that = (fakedata.proxies.Name) obj;
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
		return "FakeData.Name";
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
