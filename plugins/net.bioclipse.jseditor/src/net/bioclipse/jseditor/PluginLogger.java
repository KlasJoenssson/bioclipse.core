package net.bioclipse.jseditor;

import org.apache.log4j.Logger;

/*
 * This file is part of the Bioclipse JavaScript Editor Plug-in.
 * 
 * Copyright (c) 2008-2009 Johannes Wagener.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Johannes Wagener - initial API and implementation
 */
public class PluginLogger {
	
	private static final Logger logger = Logger.getLogger(Activator.class);
	
	public static void log(String text) {
		logger.warn("JavaScript Editor Plug-in: " + text);
	}
}
