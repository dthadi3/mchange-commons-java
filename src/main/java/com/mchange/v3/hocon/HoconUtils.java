/*
 * Distributed as part of mchange-commons-java v.0.2.5
 *
 * Copyright (C) 2013 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of EITHER:
 *
 *     1) The GNU Lesser General Public License (LGPL), version 2.1, as 
 *        published by the Free Software Foundation
 *
 * OR
 *
 *     2) The Eclipse Public License (EPL), version 1.0
 *
 * You may choose which license to accept if you wish to redistribute
 * or modify this work. You may offer derivatives of this work
 * under the license you have chosen, or you may provide the same
 * choice of license which you have been offered here.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You should have received copies of both LGPL v2.1 and EPL v1.0
 * along with this software; see the files LICENSE-EPL and LICENSE-LGPL.
 * If not, the text of these licenses are currently available at
 *
 * LGPL v2.1: http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 *  EPL v1.0: http://www.eclipse.org/org/documents/epl-v10.php 
 * 
 */

package com.mchange.v3.hocon;

import java.util.*;
import com.mchange.v2.cfg.*;
import com.typesafe.config.*;

public final class HoconUtils
{
    public static class PropertiesConversion
    {
	Properties  properties;
	Set<String> unrenderable;
    }

    public static PropertiesConversion configToProperties( Config config )
    {
	Set<Map.Entry<String,ConfigValue>> entries = config.entrySet();

	Properties  properties = new Properties();
	Set<String> unrenderable = new HashSet<String>();

	for( Map.Entry<String,ConfigValue> entry : entries )
	{
	    String path = entry.getKey();
	    String value = null;
	    try
	    { value = config.getString( path ); }
	    catch( ConfigException.Missing e )
	    { unrenderable.add( path ); }

	    if ( value != null )
		properties.setProperty( path, value );
	}

	PropertiesConversion out = new PropertiesConversion();
	out.properties = properties;
	out.unrenderable = unrenderable;
	return out;
    }
    
    private HoconUtils()
    {}
}