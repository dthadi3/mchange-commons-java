/*
 * Distributed as part of mchange-commons-java v.0.2.4
 *
 * Copyright (C) 2012 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 2.1, as 
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; see the file LICENSE.  If not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 */


package com.mchange.v1.lang;

import java.lang.reflect.*;
import java.util.Set;
import java.util.HashSet;

//Java 1.3 ONLY!!!
public final class Synchronizer
{
    /**
     * Creates an object that implements all the same
     * interfaces as the original object, but that
     * synchronizes all access (using the wrappers' own lock).
     */
    public static Object createSynchronizedWrapper(final Object o)
    {
	InvocationHandler handler = new InvocationHandler()
	    {
		public Object invoke(Object proxy, Method m, Object[] args) 
		    throws Throwable
		{
		    synchronized (proxy)
			{ return m.invoke( o, args ); }
		}
	    };
	Class cl = o.getClass();
	return Proxy.newProxyInstance( cl.getClassLoader(), 
				       recurseFindInterfaces(cl),
				       handler );
    }

    private static Class[] recurseFindInterfaces(Class cl)
    {
	Set s = new HashSet();
	while( cl != null )
	    {
		Class[] interfaces = cl.getInterfaces();
		for (int i = 0, len = interfaces.length; i < len; ++i)
		    s.add(interfaces[i]);
		cl = cl.getSuperclass();
	    }
	Class[] out = new Class[ s.size() ];
	s.toArray( out );
	return out;
    }

    private Synchronizer()
    {}
}
