package net.modders.crafting_recipe_mod.item;

import org.antlr.v4.parse.ANTLRParser.finallyClause_return;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modders.crafting_recipe_mod.CraftingRecipeMod;
import net.modders.crafting_recipe_mod.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, CraftingRecipeMod.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette", 
        () -> new Item(new Item.Properties().food(ModFoods.BAGUETTE)));

    public static final RegistryObject<BlockItem> powereddispencer = ITEMS.register("powereddispencer", 
        () -> new BlockItem(ModBlocks.powereddispencer.get(), 
            new Item.Properties()
        ));
}
