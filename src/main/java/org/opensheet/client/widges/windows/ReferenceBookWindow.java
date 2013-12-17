/*******************************************************************************
 * Copyright (c) 2012 Dmitry Tikhomirov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Dmitry Tikhomirov - initial API and implementation
 ******************************************************************************/
package org.opensheet.client.widges.windows;

import com.extjs.gxt.ui.client.widget.Window;

public class ReferenceBookWindow extends Window{
	
	
	
	public ReferenceBookWindow(){
		
		setClosable(true);
		setHeight(500);
		setWidth(800);
		setFrame(true);
		setHeadingHtml("Reference Book");
		show();
		
	}

}
