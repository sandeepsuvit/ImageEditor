/**
 * 
 */
package com.dotedlabs.app;

import java.awt.EventQueue;

import com.dotedlabs.app.controller.ApplicationController;
import com.dotedlabs.app.utils.LayoutUtils;

/**
 * -------------------------------------------------------------------------
 * This document is a part of the source code and related artifacts for
 * Image Editor application, an application to edit images.
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
 *         Feb 21, 2015 | 2:20:23 PM | 2015
 * 
 *         App.java | com.dotedlabs.app
 * 
 *         Notes: 
 */

/**
 * <Code modification record>
 * No.	Modified by	(ID)	Date (YYYY-DDMM)	[BUG-ID]	Description
 * -------------------------------------------------------------------------
 *
 */
public class App{
	

	/**
	 * Main entry point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				LayoutUtils.INSTANCE.initializeForSystemLayout();

				
				ApplicationController applicationController = new ApplicationController();
				applicationController.setVisible(true);
			}
		});
	}
	

}
