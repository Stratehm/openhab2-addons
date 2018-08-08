/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.pioneeravr.internal.models;

import org.openhab.binding.pioneeravr.internal.channeltype.ChannelDefinitionFactory;
import org.openhab.binding.pioneeravr.internal.models.properties.ModelProperties;
import org.openhab.binding.pioneeravr.internal.models.properties.ModelPropertiesImpl;

/**
 *
 * @author Antoine Besnard
 *
 */
public class VSX921 extends AbstractModel {

    public VSX921(ChannelDefinitionFactory channelDefinitionFactory) {
        super(channelDefinitionFactory);
    }

    public static final String MODEL_NAME = "VSX-921";

    @Override
    protected ModelProperties initModelProperties() {
        ModelPropertiesImpl modelProperties = new ModelPropertiesImpl(MODEL_NAME, 2);

        // For these AVR model, keep all default values.

        return modelProperties;
    }

}