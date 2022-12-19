package com.darkmdance.thefallenmod.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PellucidRose extends Block {

    public PellucidRose() {
        super(Block.Properties.create(Material.PLANTS)
                .hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.PLANT)
                .harvestLevel(1)

        );

    }
}
