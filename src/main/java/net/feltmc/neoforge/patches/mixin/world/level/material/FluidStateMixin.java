package net.feltmc.neoforge.patches.mixin.world.level.material;

import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.common.extensions.IForgeFluidState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FluidState.class)
public class FluidStateMixin implements IForgeFluidState {
}
