// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testproject.proxies;

public class TestView
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testViewMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestProject.TestView";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TestView_Set("TestProject.TestView_Set"),
		SelectedNode("TestProject.SelectedNode");

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

	public TestView(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestProject.TestView"));
	}

	protected TestView(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testViewMendixObject)
	{
		if (testViewMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestProject.TestView", testViewMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestProject.TestView");

		this.testViewMendixObject = testViewMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TestView.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static testproject.proxies.TestView initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testproject.proxies.TestView.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testproject.proxies.TestView initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testproject.proxies.TestView(context, mendixObject);
	}

	public static testproject.proxies.TestView load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testproject.proxies.TestView.initialize(context, mendixObject);
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
	 * @return value of TestView_Set
	 */
	public final treedata.proxies.Set getTestView_Set() throws com.mendix.core.CoreException
	{
		return getTestView_Set(getContext());
	}

	/**
	 * @param context
	 * @return value of TestView_Set
	 */
	public final treedata.proxies.Set getTestView_Set(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		treedata.proxies.Set result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TestView_Set.toString());
		if (identifier != null)
			result = treedata.proxies.Set.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TestView_Set
	 * @param testview_set
	 */
	public final void setTestView_Set(treedata.proxies.Set testview_set)
	{
		setTestView_Set(getContext(), testview_set);
	}

	/**
	 * Set value of TestView_Set
	 * @param context
	 * @param testview_set
	 */
	public final void setTestView_Set(com.mendix.systemwideinterfaces.core.IContext context, treedata.proxies.Set testview_set)
	{
		if (testview_set == null)
			getMendixObject().setValue(context, MemberNames.TestView_Set.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TestView_Set.toString(), testview_set.getMendixObject().getId());
	}

	/**
	 * @return value of SelectedNode
	 */
	public final treedata.proxies.TreeNode getSelectedNode() throws com.mendix.core.CoreException
	{
		return getSelectedNode(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectedNode
	 */
	public final treedata.proxies.TreeNode getSelectedNode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		treedata.proxies.TreeNode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectedNode.toString());
		if (identifier != null)
			result = treedata.proxies.TreeNode.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SelectedNode
	 * @param selectednode
	 */
	public final void setSelectedNode(treedata.proxies.TreeNode selectednode)
	{
		setSelectedNode(getContext(), selectednode);
	}

	/**
	 * Set value of SelectedNode
	 * @param context
	 * @param selectednode
	 */
	public final void setSelectedNode(com.mendix.systemwideinterfaces.core.IContext context, treedata.proxies.TreeNode selectednode)
	{
		if (selectednode == null)
			getMendixObject().setValue(context, MemberNames.SelectedNode.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SelectedNode.toString(), selectednode.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testViewMendixObject;
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
			final testproject.proxies.TestView that = (testproject.proxies.TestView) obj;
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
		return "TestProject.TestView";
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
