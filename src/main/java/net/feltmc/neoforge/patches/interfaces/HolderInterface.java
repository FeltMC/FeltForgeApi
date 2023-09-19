package net.feltmc.neoforge.patches.interfaces;

import net.feltmc.neoforge.FeltVars;
import net.minecraft.tags.TagKey;
import net.minecraftforge.registries.tags.IReverseTag;

import java.util.function.Supplier;
import java.util.stream.Stream;

public interface HolderInterface<T> extends Supplier<T>, IReverseTag<T> {
	
	@Override
	default boolean containsTag(TagKey<T> key) {
		throw new RuntimeException(FeltVars.mixinOverrideException);
	}
	
	@Override
	default Stream<TagKey<T>> getTagKeys() {
		throw new RuntimeException(FeltVars.mixinOverrideException);
	}
	
	@Override
	default T get() {
		throw new RuntimeException(FeltVars.mixinOverrideException);
	}
	
}
