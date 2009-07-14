/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.wink.jaxrs.test.params;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.wink.jaxrs.test.params.form.FormParamResource;
import org.apache.wink.jaxrs.test.params.header.HeaderParamDefaultResource;
import org.apache.wink.jaxrs.test.params.header.HeaderParamExceptionResource;
import org.apache.wink.jaxrs.test.params.query.QueryParamsExceptionResource;

/**
 * Parameters annotation test application.
 */
public class Application extends javax.ws.rs.core.Application {

    Set<Class<?>> classes = new HashSet<Class<?>>();

    public Application() {
        classes = new HashSet<Class<?>>();
        classes.add(HeaderParamResource.class);
        classes.add(MatrixParamResource.class);
        classes.add(QueryParamResource.class);
        classes.add(EncodingParamResource.class);
        classes.add(AutoDecodeParamResource.class);
        classes.add(DefaultValueResource.class);
        classes.add(CookieParamResource.class);

        classes.add(HeaderParamDefaultResource.class);
        classes.add(HeaderParamExceptionResource.class);

        classes.add(QueryParamsExceptionResource.class);

        classes.add(FormParamResource.class);

        classes.add(QueryParamNotSetResource.class);
        classes.add(MatrixParamNotSetResource.class);

        classes.add(PathSegmentResource.class);

        // classes.add(MultipleEntityParamsResource.class);

        classes = Collections.unmodifiableSet(classes);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
