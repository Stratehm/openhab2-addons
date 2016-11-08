/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.pioneeravr.internal.protocol;

import org.openhab.binding.pioneeravr.internal.protocol.ParameterizedCommand.ParameterizedCommandType;
import org.openhab.binding.pioneeravr.internal.protocol.Response.ResponseType;
import org.openhab.binding.pioneeravr.internal.protocol.SimpleCommand.SimpleCommandType;

/**
 * Factory that allows to build IpControl commands/responses.
 *
 * @author Antoine Besnard - Initial contribution
 */
public final class RequestResponseFactory {

    /**
     * Return a ParameterizedCommand of the type given in parameter and for the given zone.
     *
     * @param command
     * @param zone
     * @return
     */
    public static SimpleCommand getIpControlCommand(SimpleCommandType command, int zone) {
        SimpleCommand result = new SimpleCommand(command, zone);
        return result;
    }

    /**
     * Return a ParameterizedCommand of the type given in parameter. The
     * parameter of the command has to be set before send.
     *
     * @param command
     * @param zone
     * @return
     */
    public static ParameterizedCommand getIpControlCommand(ParameterizedCommandType command, int zone) {
        ParameterizedCommand result = new ParameterizedCommand(command, zone);
        return result;
    }

    /**
     * Return a ParameterizedCommand of the type given in parameter. The
     * parameter of the command is set with the given paramter value.
     *
     * @param command
     * @param parameter
     * @param zone
     * @return
     */
    public static ParameterizedCommand getIpControlCommand(ParameterizedCommandType command, String parameter,
            int zone) {
        ParameterizedCommand result = getIpControlCommand(command, zone);
        result.setParameter(parameter);
        return result;
    }

    /**
     * Return a IpControlResponse object based on the given response data.
     *
     * @param responseData
     * @return
     */
    public static Response getIpControlResponse(String responseData) {
        return new Response(responseData);
    }

    /**
     * Return a IpControlResponse object based on the given type, zone and parameter.
     *
     * @param responseType
     * @param zone
     * @param parameter
     * @return
     */
    public static Response getIpControlResponse(ResponseType responseType, int zone, String parameter) {
        return new Response(responseType, zone, parameter);
    }

}
