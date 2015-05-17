/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.securebpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.securebpmn2.CompositeItemAwareElementAction;
import org.eclipse.securebpmn2.Securebpmn2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Item Aware Element Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeItemAwareElementActionTest extends
		ItemAwareElementActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeItemAwareElementActionTest.class);
	}

	/**
	 * Constructs a new Composite Item Aware Element Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeItemAwareElementActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Item Aware Element Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeItemAwareElementAction getFixture() {
		return (CompositeItemAwareElementAction) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Securebpmn2Factory.eINSTANCE
				.createCompositeItemAwareElementAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CompositeItemAwareElementActionTest
