/**
 * 
 */
package com.dotedlabs.app.utils;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * -------------------------------------------------------------------------
 * This document is a part of the source code and related artifacts for
 * Image Editor application, an application to images.
 * 
 * http://www.dotedlabs.com
 * 
 * Copyright © 2015 DotedLabs
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * -------------------------------------------------------------------------
 * 
 * @author SANDEEP K NAIR | sandeepsuvit@gmail.com
 * 
 *         Feb 21, 2015 | 2:26:42 PM | 2015
 * 
 *         LayoutUtils.java | com.dotedlabs.app.utils
 * 
 *         Notes: 
 */

/**
 * <Code modification record>
 * No.	Modified by	(ID)	Date (YYYY-DDMM)	[BUG-ID]	Description
 * -------------------------------------------------------------------------
 * 
 */
public enum LayoutUtils {
	INSTANCE;

	/**
	 * Initialize windows based layout
	 */
	public void initializeForSystemLayout() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Get list of all components in the reference structure
	 * 
	 * @param container
	 * @return
	 */
	public Component[] getComponents(Component container) {
		ArrayList<Component> list = null;
		try {
			list = new ArrayList<Component>(
					Arrays.asList(((Container) container).getComponents()));
			for (int index = 0; index < list.size(); index++) {
				for (Component currentComponent : getComponents(list.get(index))) {
					list.add(currentComponent);
				}
			}
		} catch (ClassCastException e) {
			list = new ArrayList<Component>();
		}
		return list.toArray(new Component[list.size()]);
	}

}
