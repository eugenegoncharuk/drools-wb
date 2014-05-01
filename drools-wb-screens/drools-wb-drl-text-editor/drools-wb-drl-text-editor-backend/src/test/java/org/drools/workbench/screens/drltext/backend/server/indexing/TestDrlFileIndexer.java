/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.workbench.screens.drltext.backend.server.indexing;

import javax.enterprise.context.ApplicationScoped;

import org.drools.workbench.screens.drltext.type.DRLResourceTypeDefinition;
import org.uberfire.io.IOService;

/**
 * Test indexer that simply loads Properties from the file
 */
@ApplicationScoped
public class TestDrlFileIndexer extends DrlFileIndexer implements TestIndexer<DRLResourceTypeDefinition> {

    @Override
    public void setIOService( final IOService ioService ) {
        this.ioService = ioService;
    }

    @Override
    public void setResourceTypeDefinition( final DRLResourceTypeDefinition type ) {
        this.drlType = type;
    }

}
