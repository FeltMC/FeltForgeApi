package net.feltmc.neoforge.patches.interfaces;

import io.netty.channel.Channel;
import net.feltmc.neoforge.FeltVars;

public interface ConnectionInterface {
    default public Channel channel() {
        throw new RuntimeException(FeltVars.mixinOverrideException);
    }
}
