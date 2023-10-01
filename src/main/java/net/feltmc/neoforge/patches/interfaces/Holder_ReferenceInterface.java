package net.feltmc.neoforge.patches.interfaces;

import net.feltmc.neoforge.FeltVars;
import net.minecraft.core.Holder;

public interface Holder_ReferenceInterface<T> {
	
	default Holder.Reference.Type getType() {
		throw new RuntimeException(FeltVars.mixinOverrideException);
	}
	
}
