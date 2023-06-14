package com.rempler.rfd.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.level.BlockGetter;

public abstract class BaseGenerator extends HorizontalDirectionalBlock implements EntityBlock {

    private static final VoxelShape RENDER_SHAPE = Shapes.join(
            box(0.0D,  0.0D, 0.0D, 16.0D,  4.0D, 16.0D),
            box(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            BooleanOp.OR);

    protected BaseGenerator(int lightLevel) {
        super(Properties.of() // Material.GLASS is required to help with the neighbor block rendering through the glass
                .sound(SoundType.STONE)
                .strength(2.0f)
                .lightLevel((light) -> lightLevel)
                .pushReaction(PushReaction.BLOCK)
        );
    }

    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return RENDER_SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
}
