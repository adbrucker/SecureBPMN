/* Copyright 2012-2015 SAP SE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.aniketos.securebpmn.xacml.pdp.runtimeEvaluation;

import eu.aniketos.securebpmn.xacml.api.autho.AttributeIdentifier;

import com.sun.xacml.attr.AttributeValue;

/**
 * This interface provides a function which allows to retreive
 * attributes which are "known" at evaluation time, i.e., where
 * a value can be provided for a given AttributeIdentifier.
 *
 *
 */
public interface KnownAttrStore {

    /**
     * returns the given attributeValue or null, if no value is available
     * @param attrId
     * @return
     */
    AttributeValue getAttributeValue(AttributeIdentifier attrId);

    void setAttributeValue(AttributeIdentifier attrId, AttributeValue attr);

}
