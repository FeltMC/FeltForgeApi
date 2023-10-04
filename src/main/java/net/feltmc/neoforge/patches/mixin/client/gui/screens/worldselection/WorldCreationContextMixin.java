package net.feltmc.neoforge.patches.mixin.client.gui.screens.worldselection;

import net.minecraft.client.gui.screens.worldselection.WorldCreationContext;
import net.minecraft.core.LayeredRegistryAccess;
import net.minecraft.core.Registry;
import net.minecraft.server.RegistryLayer;
import net.minecraft.server.ReloadableServerResources;
import net.minecraft.world.level.WorldDataConfiguration;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.WorldDimensions;
import net.minecraft.world.level.levelgen.WorldOptions;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(WorldCreationContext.class)
public class WorldCreationContextMixin implements net.feltmc.neoforge.patches.interfaces.WorldCreationContextInterface {
	@Shadow
	@Final
	private WorldOptions options;
	
	@Shadow
	@Final
	private Registry<LevelStem> datapackDimensions;
	
	@Shadow
	@Final
	private WorldDimensions selectedDimensions;
	
	@Shadow
	@Final
	private LayeredRegistryAccess<RegistryLayer> worldgenRegistries;
	
	@Shadow
	@Final
	private ReloadableServerResources dataPackResources;
	
	@Override
	public WorldCreationContext withDataConfiguration(WorldDataConfiguration dataConfiguration) {
		return new WorldCreationContext(this.options, this.datapackDimensions, this.selectedDimensions, this.worldgenRegistries,
			this.dataPackResources, dataConfiguration);
	}
}
