/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.pioneeravr.protocol;

import org.openhab.binding.pioneeravr.internal.protocol.Response.ResponseType;

/**
 * The base interface for an AVR command.
 *
 * @author Antoine Besnard
 *
 */
public interface AvrCommand {

    /**
     * Represent a CommandType of command requests.
     *
     * @author Antoine Besnard
     *
     */
    public interface CommandType {

        /**
         * Return the command of this command type for the given zone.
         *
         * The first zone number is 1.
         *
         * @return
         */
        public String getCommand(int zone);

        /**
         * Return the name of the command type.
         *
         * @return
         */
        public String name();

        /**
         * Return the expected response type to this request. May be null if no response is expected.
         *
         * @return
         */
        public ResponseType getExpectedResponse();
    }

    /**
     * Return the command to send to the AVR.
     *
     * @return
     */
    public String getCommand();

    /**
     * Return the number of the zone this command will be sent to.
     *
     * @return
     */
    public int getZone();

    /**
     * Return the the command type of this command.
     *
     * @return
     */
    public CommandType getCommandType();

    /**
     * Return true if a response is expected for this command, else false.
     *
     * @return
     */
    public boolean isResponseExpected();

}
