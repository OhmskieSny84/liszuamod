
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.licealiadus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.licealiadus.world.features.plants.RoslinachoraFeature;
import net.mcreator.licealiadus.LicealiadusMod;

@Mod.EventBusSubscriber
public class LicealiadusModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, LicealiadusMod.MODID);
	public static final RegistryObject<Feature<?>> ROSLINACHORA = REGISTRY.register("roslinachora", RoslinachoraFeature::feature);
}
