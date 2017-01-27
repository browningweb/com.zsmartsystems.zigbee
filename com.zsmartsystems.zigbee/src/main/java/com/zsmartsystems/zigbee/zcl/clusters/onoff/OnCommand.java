package com.zsmartsystems.zigbee.zcl.clusters.onoff;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

import java.util.Map;
import java.util.HashMap;

/**
 * <p>
 * On Command value object class.
 * </p>
 * <p>
 * Cluster: <b>On/Off</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the On/Off cluster.
 * </p>
 * <p>
 * Attributes and commands for switching devices between ‘On’ and ‘Off’ states.
 * </p>
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 * </p>
 */
public class OnCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public OnCommand() {
        genericCommand = false;
        clusterId = 6;
        commandId = 1;
        commandDirection = true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        return builder.toString();
    }

}