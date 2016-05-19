/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.domodule;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link DomoduleBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Antoine Besnard - Initial contribution
 */
public class DomoduleBindingConstants {

    public static final String BINDING_ID = "domodule";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_SAMPLE = new ThingTypeUID(BINDING_ID, "sample");

    // List of all Channel ids
    public final static String CHANNEL_1 = "channel1";

    public static final String PROPERTY_DOMODULE_ID = "domoduleId";

}
