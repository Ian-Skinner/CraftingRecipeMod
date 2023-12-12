package net.modders.crafting_recipe_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;


public class powereddispencer extends DispenserBlock {
    private static final Logger LOGGER = LogUtils.getLogger();


    public powereddispencer(Properties properties) {
        super(properties);
    }


    @Override
    protected void dispenseFrom(ServerLevel p_52665_, BlockState p_301828_, BlockPos p_52666_) {
        super.dispenseFrom(p_52665_, p_301828_, p_52666_);
        super.dispenseFrom(p_52665_, p_301828_, p_52666_);
    }

    
}
