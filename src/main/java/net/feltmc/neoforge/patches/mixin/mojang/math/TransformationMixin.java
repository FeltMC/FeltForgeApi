package net.feltmc.neoforge.patches.mixin.mojang.math;

import com.mojang.math.Transformation;
import net.minecraftforge.common.extensions.IForgeTransformation;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Transformation.class)
public class TransformationMixin implements IForgeTransformation {
}
