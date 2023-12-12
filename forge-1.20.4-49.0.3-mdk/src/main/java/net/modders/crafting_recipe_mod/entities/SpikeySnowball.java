package net.modders.crafting_recipe_mod.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.modders.crafting_recipe_mod.item.ModItems;

public class SpikeySnowball extends ThrowableItemProjectile{

    public SpikeySnowball(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        //TODO Auto-generated constructor stub
    }

    public SpikeySnowball(Level pLevel) {
        super(ModEntities.spikeysnow.get(),pLevel);
        //TODO Auto-generated constructor stub
    }

    public SpikeySnowball(Level pLevel, LivingEntity LivingEntit) {
        super(ModEntities.spikeysnow.get(), LivingEntit, pLevel);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.SPIKEYSNOWBALLITEM.get();
    }

    // @Override 
    // protected void onHitBlock(BlockHitResult pBlock){
    //     if(!this.level().isClientSide){
    //         this.level().broadcastEntityEvent(this, ((byte) 3));
    //         this.level().setBlock(blockPosition(), getBlockStateOn(), BASE_TICKS_REQUIRED_TO_FREEZE)
    //     }
        
    // }
    
}
