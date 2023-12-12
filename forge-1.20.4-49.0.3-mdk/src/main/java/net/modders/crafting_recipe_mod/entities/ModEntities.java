package net.modders.crafting_recipe_mod.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modders.crafting_recipe_mod.CraftingRecipeMod;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = 
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftingRecipeMod.MODID);

    public static final RegistryObject<EntityType<SpikeySnowball>> spikeysnow = 
        ENTITY_TYPE.register("spikeysnowball", () -> EntityType.Builder
            .<SpikeySnowball>of(SpikeySnowball::new, MobCategory.MISC)
            .sized(0.5f, 0.5f)
            .build("bullet")
        );
}
