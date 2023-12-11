package net.modders.crafting_recipe_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.modders.crafting_recipe_mod.CraftingRecipeMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftingRecipeMod.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("crafting_recipe_mod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BAGUETTE.get()))
                    .title(Component.translatable("creativetab.crafting_recipe_mod"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BAGUETTE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
