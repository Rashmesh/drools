/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.traits.core.common;

import org.drools.core.common.NamedEntryPoint;
import org.drools.core.common.NamedEntryPointFactory;
import org.drools.core.common.ReteEvaluator;
import org.drools.core.reteoo.EntryPointNode;
import org.drools.core.rule.EntryPointId;

public class TraitNamedEntryPointFactory implements NamedEntryPointFactory {

    @Override
    public NamedEntryPoint createNamedEntryPoint(EntryPointNode addedNode, EntryPointId id, ReteEvaluator reteEvaluator) {
        return new TraitNamedEntryPoint(id, addedNode, reteEvaluator);
    }
}
