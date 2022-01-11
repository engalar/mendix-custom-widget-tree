// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fakedata.proxies;

public class Node
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject nodeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FakeData.Node";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		PartID("PartID"),
		Manufacturer("Manufacturer"),
		_Root("_Root"),
		_HasChildren("_HasChildren"),
		Node_Root("FakeData.Node_Root"),
		Children("FakeData.Children");

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

	public Node(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FakeData.Node"));
	}

	protected Node(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nodeMendixObject)
	{
		if (nodeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FakeData.Node", nodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FakeData.Node");

		this.nodeMendixObject = nodeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Node.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static fakedata.proxies.Node initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fakedata.proxies.Node.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fakedata.proxies.Node initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fakedata.proxies.Node(context, mendixObject);
	}

	public static fakedata.proxies.Node load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fakedata.proxies.Node.initialize(context, mendixObject);
	}

	public static java.util.List<fakedata.proxies.Node> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fakedata.proxies.Node> result = new java.util.ArrayList<fakedata.proxies.Node>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FakeData.Node" + xpathConstraint))
			result.add(fakedata.proxies.Node.initialize(context, obj));
		return result;
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
	 * @return value of PartID
	 */
	public final java.lang.String getPartID()
	{
		return getPartID(getContext());
	}

	/**
	 * @param context
	 * @return value of PartID
	 */
	public final java.lang.String getPartID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PartID.toString());
	}

	/**
	 * Set value of PartID
	 * @param partid
	 */
	public final void setPartID(java.lang.String partid)
	{
		setPartID(getContext(), partid);
	}

	/**
	 * Set value of PartID
	 * @param context
	 * @param partid
	 */
	public final void setPartID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String partid)
	{
		getMendixObject().setValue(context, MemberNames.PartID.toString(), partid);
	}

	/**
	 * @return value of Manufacturer
	 */
	public final java.lang.String getManufacturer()
	{
		return getManufacturer(getContext());
	}

	/**
	 * @param context
	 * @return value of Manufacturer
	 */
	public final java.lang.String getManufacturer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Manufacturer.toString());
	}

	/**
	 * Set value of Manufacturer
	 * @param manufacturer
	 */
	public final void setManufacturer(java.lang.String manufacturer)
	{
		setManufacturer(getContext(), manufacturer);
	}

	/**
	 * Set value of Manufacturer
	 * @param context
	 * @param manufacturer
	 */
	public final void setManufacturer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String manufacturer)
	{
		getMendixObject().setValue(context, MemberNames.Manufacturer.toString(), manufacturer);
	}

	/**
	 * @return value of _Root
	 */
	public final java.lang.Boolean get_Root()
	{
		return get_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of _Root
	 */
	public final java.lang.Boolean get_Root(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames._Root.toString());
	}

	/**
	 * Set value of _Root
	 * @param _root
	 */
	public final void set_Root(java.lang.Boolean _root)
	{
		set_Root(getContext(), _root);
	}

	/**
	 * Set value of _Root
	 * @param context
	 * @param _root
	 */
	public final void set_Root(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean _root)
	{
		getMendixObject().setValue(context, MemberNames._Root.toString(), _root);
	}

	/**
	 * @return value of _HasChildren
	 */
	public final java.lang.Boolean get_HasChildren()
	{
		return get_HasChildren(getContext());
	}

	/**
	 * @param context
	 * @return value of _HasChildren
	 */
	public final java.lang.Boolean get_HasChildren(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames._HasChildren.toString());
	}

	/**
	 * Set value of _HasChildren
	 * @param _haschildren
	 */
	public final void set_HasChildren(java.lang.Boolean _haschildren)
	{
		set_HasChildren(getContext(), _haschildren);
	}

	/**
	 * Set value of _HasChildren
	 * @param context
	 * @param _haschildren
	 */
	public final void set_HasChildren(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean _haschildren)
	{
		getMendixObject().setValue(context, MemberNames._HasChildren.toString(), _haschildren);
	}

	/**
	 * @return value of Node_Root
	 */
	public final fakedata.proxies.Root getNode_Root() throws com.mendix.core.CoreException
	{
		return getNode_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Node_Root
	 */
	public final fakedata.proxies.Root getNode_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		fakedata.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Node_Root.toString());
		if (identifier != null)
			result = fakedata.proxies.Root.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Node_Root
	 * @param node_root
	 */
	public final void setNode_Root(fakedata.proxies.Root node_root)
	{
		setNode_Root(getContext(), node_root);
	}

	/**
	 * Set value of Node_Root
	 * @param context
	 * @param node_root
	 */
	public final void setNode_Root(com.mendix.systemwideinterfaces.core.IContext context, fakedata.proxies.Root node_root)
	{
		if (node_root == null)
			getMendixObject().setValue(context, MemberNames.Node_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Node_Root.toString(), node_root.getMendixObject().getId());
	}

	/**
	 * @return value of Children
	 */
	public final java.util.List<fakedata.proxies.Node> getChildren() throws com.mendix.core.CoreException
	{
		return getChildren(getContext());
	}

	/**
	 * @param context
	 * @return value of Children
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<fakedata.proxies.Node> getChildren(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<fakedata.proxies.Node> result = new java.util.ArrayList<fakedata.proxies.Node>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Children.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(fakedata.proxies.Node.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Children
	 * @param children
	 */
	public final void setChildren(java.util.List<fakedata.proxies.Node> children)
	{
		setChildren(getContext(), children);
	}

	/**
	 * Set value of Children
	 * @param context
	 * @param children
	 */
	public final void setChildren(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<fakedata.proxies.Node> children)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (fakedata.proxies.Node proxyObject : children)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Children.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return nodeMendixObject;
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
			final fakedata.proxies.Node that = (fakedata.proxies.Node) obj;
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
		return "FakeData.Node";
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