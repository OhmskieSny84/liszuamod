
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.licealiadus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.licealiadus.block.RoslinachoraBlock;
import net.mcreator.licealiadus.block.KwiatseraBlock;
import net.mcreator.licealiadus.LicealiadusMod;

public class LicealiadusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LicealiadusMod.MODID);
	public static final RegistryObject<Block> ROSLINACHORA = REGISTRY.register("roslinachora", () -> new RoslinachoraBlock());
	public static final RegistryObject<Block> KWIATSERA = REGISTRY.register("kwiatsera", () -> new KwiatseraBlock());
}
