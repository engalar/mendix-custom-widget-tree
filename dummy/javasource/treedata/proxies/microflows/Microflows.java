// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package treedata.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the TreeData module
	public static boolean afterStartup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "TreeData.AfterStartup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean cALC_HasChildren(IContext context, treedata.proxies.TreeNode _treeNode)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TreeNode", _treeNode == null ? null : _treeNode.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "TreeData.CALC_HasChildren", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.Long cALC_SetChildCount(IContext context, treedata.proxies.Set _set)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Set", _set == null ? null : _set.getMendixObject());
			return (java.lang.Long)Core.execute(context, "TreeData.CALC_SetChildCount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void clearAllData(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TreeData.ClearAllData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treedata.proxies.Set createNodeChildrenSet(IContext context, treedata.proxies.Set _set, java.lang.Long _nodesPerLevel, java.lang.Long _depth, treedata.proxies.TreeNode _parent)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Set", _set == null ? null : _set.getMendixObject());
			params.put("NodesPerLevel", _nodesPerLevel);
			params.put("Depth", _depth);
			params.put("Parent", _parent == null ? null : _parent.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeData.CreateNodeChildrenSet", params);
			return result == null ? null : treedata.proxies.Set.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treedata.proxies.Set createNodeParentSet(IContext context, treedata.proxies.Set _set, java.lang.Long _nodesPerLevel, java.lang.Long _depth, treedata.proxies.TreeNode _parent)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Set", _set == null ? null : _set.getMendixObject());
			params.put("NodesPerLevel", _nodesPerLevel);
			params.put("Depth", _depth);
			params.put("Parent", _parent == null ? null : _parent.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeData.CreateNodeParentSet", params);
			return result == null ? null : treedata.proxies.Set.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treedata.proxies.TreeNode createNodeWithoutParent(IContext context, treedata.proxies.Set _set, treedata.proxies.TreeNode _parent)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Set", _set == null ? null : _set.getMendixObject());
			params.put("Parent", _parent == null ? null : _parent.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeData.CreateNodeWithoutParent", params);
			return result == null ? null : treedata.proxies.TreeNode.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treedata.proxies.TreeNode createNodeWithParent(IContext context, treedata.proxies.Set _set, treedata.proxies.TreeNode _parent, java.lang.Long _level)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Set", _set == null ? null : _set.getMendixObject());
			params.put("Parent", _parent == null ? null : _parent.getMendixObject());
			params.put("Level", _level);
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeData.CreateNodeWithParent", params);
			return result == null ? null : treedata.proxies.TreeNode.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treedata.proxies.Set createRandomSetNodeChildren(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeData.CreateRandomSetNodeChildren", params);
			return result == null ? null : treedata.proxies.Set.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treedata.proxies.Set createRandomSetParentNode(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeData.CreateRandomSetParentNode", params);
			return result == null ? null : treedata.proxies.Set.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treedata.proxies.TreeNode> dS_GetChildrenFromNodeWithParent(IContext context, treedata.proxies.TreeNode _treeNode)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TreeNode", _treeNode == null ? null : _treeNode.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeData.DS_GetChildrenFromNodeWithParent", params);
			java.util.List<treedata.proxies.TreeNode> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treedata.proxies.TreeNode>();
				for (IMendixObject obj : objs)
					result.add(treedata.proxies.TreeNode.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treedata.proxies.TreeNode> dS_GetNodeWithChildren(IContext context, treedata.proxies.TreeNode _treeNode)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TreeNode", _treeNode == null ? null : _treeNode.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeData.DS_GetNodeWithChildren", params);
			java.util.List<treedata.proxies.TreeNode> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treedata.proxies.TreeNode>();
				for (IMendixObject obj : objs)
					result.add(treedata.proxies.TreeNode.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}