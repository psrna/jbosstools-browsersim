/*******************************************************************************
 * Copyright (c) 2007-2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.browsersim.ui.events;

import java.util.EventObject;

/**
 * @author Ilya Buziuk (ibuziuk)
 */
public class ExitEvent extends EventObject {
	private static final long serialVersionUID = 5461813256474674858L;

	public ExitEvent(Object source) {
		super(source);
	}

}