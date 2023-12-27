package net.modders.crafting_recipe_mod.item;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modders.crafting_recipe_mod.CraftingRecipeMod;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, CraftingRecipeMod.MODID);

    public static final RegistryObject<Potion> APPLEJUICE = POTIONS.register("apple_juice", () -> new Potion(
        new MobEffectInstance(MobEffects.HEAL, 1, 1), new MobEffectInstance(MobEffects.SATURATION, 1, 1), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 2)
    ));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
