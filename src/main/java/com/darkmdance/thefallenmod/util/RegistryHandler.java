package com.darkmdance.thefallenmod.util;

import com.darkmdance.thefallenmod.TheFallenMod;
import com.darkmdance.thefallenmod.blocks.BlockItemBase;
import com.darkmdance.thefallenmod.blocks.CrystalCore;
import com.darkmdance.thefallenmod.blocks.LucidWood;
import com.darkmdance.thefallenmod.blocks.PellucidRose;
import com.darkmdance.thefallenmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheFallenMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheFallenMod.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items Only Below
    public static final RegistryObject<Item> DENSE_SHARD = ITEMS.register("dense_shard", ItemBase::new);

    //Blocks Only Below
    public static final RegistryObject<Block> CRYSTAL_CORE = BLOCKS.register("crystal_core", CrystalCore::new);
    public static final RegistryObject<Block> PELLUCID_ROSE = BLOCKS.register("pellucid_rose", PellucidRose::new);
    public static final RegistryObject<Block> LUCID_WOOD = BLOCKS.register("lucid_wood", LucidWood::new);

    //Block Items Only Below
    public static final RegistryObject<Item> CRYSTAL_CORE_ITEM = ITEMS.register("crystal_core", () -> new BlockItemBase(CRYSTAL_CORE.get()));
    public static final RegistryObject<Item> PELLUCID_ROSE_ITEM = ITEMS.register("pellucid_rose", () -> new BlockItemBase(PELLUCID_ROSE.get()));
    public static final RegistryObject<Item> LUCID_WOOD_ITEM = ITEMS.register("lucid_wood", () -> new BlockItemBase(LUCID_WOOD.get()));
}
