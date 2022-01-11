// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fakedata.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the FakeData module
	public static void clearAllTreeData(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "FakeData.ClearAllTreeData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static fakedata.proxies.Root createNodesForRoot(IContext context, fakedata.proxies.Root _root, fakedata.proxies.Node _parentNode, java.lang.Long _levels, java.lang.Long _childrenPerLevel)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Root", _root == null ? null : _root.getMendixObject());
			params.put("ParentNode", _parentNode == null ? null : _parentNode.getMendixObject());
			params.put("Levels", _levels);
			params.put("ChildrenPerLevel", _childrenPerLevel);
			IMendixObject result = (IMendixObject)Core.execute(context, "FakeData.CreateNodesForRoot", params);
			return result == null ? null : fakedata.proxies.Root.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static fakedata.proxies.Node createRandomNode(IContext context, fakedata.proxies.Root _root, fakedata.proxies.Node _parentNode, boolean _hasChildren)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Root", _root == null ? null : _root.getMendixObject());
			params.put("ParentNode", _parentNode == null ? null : _parentNode.getMendixObject());
			params.put("HasChildren", _hasChildren);
			IMendixObject result = (IMendixObject)Core.execute(context, "FakeData.CreateRandomNode", params);
			return result == null ? null : fakedata.proxies.Node.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}