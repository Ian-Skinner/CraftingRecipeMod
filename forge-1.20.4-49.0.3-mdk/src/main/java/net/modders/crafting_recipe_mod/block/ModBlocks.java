package net.modders.crafting_recipe_mod.block;

import org.antlr.v4.parse.ANTLRParser.finallyClause_return;
import org.apache.commons.io.comparator.DefaultFileComparator;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.client.model.obj.ObjMaterialLibrary.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modders.crafting_recipe_mod.CraftingRecipeMod;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, CraftingRecipeMod.MODID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    // public static final RegistryObject<Block> powereddispencer = BLOCKS.register("powereddispencer",
    //     () -> new Block(BlockBehaviour.Properties.of()
    //     .explosionResistance(10)
    //     .destroyTime(2)
    //     .requiresCorrectToolForDrops()
    //     //.lightLevel(state -> state.getValue(on) ? 10 : 0)
    // ));

    public static final RegistryObject<powereddispencer> powereddispencer = BLOCKS.register("powereddispencer", 
        () -> new powereddispencer(BlockBehaviour.Properties.of()
        .explosionResistance(10)
        .destroyTime(2)
        .requiresCorrectToolForDrops()
        .lightLevel(state -> state.getValue(DispenserBlock.TRIGGERED) ? 10 : 0)
    ));
    

}
