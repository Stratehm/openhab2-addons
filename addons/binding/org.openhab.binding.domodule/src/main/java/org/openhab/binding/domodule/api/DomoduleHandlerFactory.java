package org.openhab.binding.domodule.api;

import java.util.Set;

import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;

public interface DomoduleHandlerFactory {

    Set<ThingTypeUID> getSupportedThings();

    ThingHandler createHandler(Thing thing);

}
