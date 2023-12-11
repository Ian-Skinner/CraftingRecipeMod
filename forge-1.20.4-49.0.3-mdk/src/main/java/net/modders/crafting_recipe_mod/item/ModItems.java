package net.modders.crafting_recipe_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modders.crafting_recipe_mod.CraftingRecipeMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, CraftingRecipeMod.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette", 
        () -> new Item(new Item.Properties().food(ModFoods.BAGUETTE)));
}
