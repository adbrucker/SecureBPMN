
/*
 * @(#)PDPConfig.java
 *
 * Copyright 2003-2004 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   1. Redistribution of source code must retain the above copyright notice,
 *      this list of conditions and the following disclaimer.
 * 
 *   2. Redistribution in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *
 * Neither the name of Sun Microsystems, Inc. or the names of contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 * 
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING
 * ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
 * OR NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN MICROSYSTEMS, INC. ("SUN")
 * AND ITS LICENSORS SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE
 * AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE FOR ANY LOST
 * REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL,
 * INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY
 * OF LIABILITY, ARISING OUT OF THE USE OF OR INABILITY TO USE THIS SOFTWARE,
 * EVEN IF SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 * You acknowledge that this software is not designed or intended for use in
 * the design, construction, operation or maintenance of any nuclear facility.
 */

package com.sun.xacml;

import java.util.HashMap;
import java.util.Map;

import com.sun.xacml.finder.AttributeFinder;
import com.sun.xacml.finder.PolicyFinder;
import com.sun.xacml.finder.ResourceFinder;
import com.sun.xacml.finder.RevocationFinder;


/**
 * This class is used as a container that holds configuration
 * information for the PDP, which includes the <code>AttributeFinder</code>,
 * <code>PolicyFinder</code>, <code>ResourceFinder</code>, and the 
 * <code>RevocationFinder</code> that the PDP should use.
 *
 * @since 1.0
 * @author Seth Proctor
 * @author Marco Barreno
 * @author Ludwig Seitz
 */
public class PDPConfig
{

    //
    private AttributeFinder attributeFinder;

    //
    private PolicyFinder policyFinder;

    //
    private ResourceFinder resourceFinder;
    
    //
    private RevocationFinder revocationFinder;
    
    private Map<String, Object> customAttr = new HashMap<String, Object>();

    /**
     * Constructor that creates a <code>PDPConfig</code> from components.
     *
     * @param attributeFinder the <code>AttributeFinder</code> that the PDP
     *                        should use, or null if it shouldn't use any
     * @param policyFinder the <code>PolicyFinder</code> that the PDP
     *                     should use, or null if it shouldn't use any
     * @param resourceFinder the <code>ResourceFinder</code> that the PDP
     *                       should use, or null if it shouldn't use any
     * @param revocationFinder  The <code>RevocationFinder</code> that the PDP
     *                       should use, or null if it shouldn't use any
     */
    public PDPConfig(AttributeFinder attributeFinder,
                     PolicyFinder policyFinder,
                     ResourceFinder resourceFinder,
                     RevocationFinder revocationFinder) {
        if (attributeFinder != null) {
            this.attributeFinder = attributeFinder;
        } else {
            this.attributeFinder = new AttributeFinder();
        }

        if (policyFinder != null) {
            this.policyFinder = policyFinder;
        } else {
            this.policyFinder = new PolicyFinder();
        }

        if (resourceFinder != null) {
            this.resourceFinder = resourceFinder;
        } else {
            this.resourceFinder = new ResourceFinder();
        }
        
        if (revocationFinder != null) {
            this.revocationFinder = revocationFinder;
        } else {
            this.revocationFinder = new RevocationFinder();
        }
    }

    /**
     * Returns the <code>AttributeFinder</code> that was configured, or
     * null if none was configured
     *
     * @return the <code>AttributeFinder</code> or null
     */
    public AttributeFinder getAttributeFinder() {
        return this.attributeFinder;
    }

    /**
     * Returns the <code>PolicyFinder</code> that was configured, or
     * null if none was configured
     *
     * @return the <code>PolicyFinder</code> or null
     */
    public PolicyFinder getPolicyFinder() {
        return this.policyFinder;
    }

    /**
     * Returns the <code>ResourceFinder</code> that was configured, or
     * null if none was configured
     *
     * @return the <code>ResourceFinder</code> or null
     */
    public ResourceFinder getResourceFinder() {
        return this.resourceFinder;
    }
    
    
    /**
     * Returns the <code>RevocationFinder</code> that was configured, or
     * null if none was configured
     *
     * @return the <code>RevocationFinder</code> or null
     */
    public RevocationFinder getRevocationFinder() {
        return this.revocationFinder;
    }
    
    public void setCutomAttrs(Map<String, Object> attrs) {
    	if ( customAttr != null && customAttr.size() > 0 ) {
    		throw new RuntimeException("The custom attributes for PDPConfig may not be overwritten, if already values are stored!");
    	}
    	customAttr = attrs;
    }
    
    public void addCutomAttrs(Map<String, Object> attrs) {
    	if ( customAttr == null ) {
    		this.customAttr = attrs;
    	} else {
        	customAttr.putAll(attrs);
    	}
    }
    
    public void setCustomAttr(String key, Object value) {
    	customAttr.put(key, value);
    }
    
    public Object getCustomAttr(String key) {
    	return customAttr.get(key);
    }
    
    public Map<String, Object> getCustomAttrs() {
    	return customAttr;
    }
    
}
