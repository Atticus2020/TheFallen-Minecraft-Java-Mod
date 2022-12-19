package com.darkmdance.thefallenmod.blocks;


import javafx.geometry.VerticalDirection;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class LucidWood extends Block {

    private static final DirectionProperty FACING = DirectionalBlock.FACING;
    public LucidWood() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.WOOD)
                .harvestLevel(1)
                .harvestTool(ToolType.AXE));

    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getNearestLookingDirection=().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));

    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate((mirrorIn.toRotation(state.get(FACING))));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}