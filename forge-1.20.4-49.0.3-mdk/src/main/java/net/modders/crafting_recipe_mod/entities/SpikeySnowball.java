package net.modders.crafting_recipe_mod.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.modders.crafting_recipe_mod.item.ModItems;

public class SpikeySnowball extends ThrowableItemProjectile{
    LivingEntity Thrower = null;

    public SpikeySnowball(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        //TODO Auto-generated constructor stub
    }

    public SpikeySnowball(Level pLevel) {
        super(ModEntities.SPIKEYSNOWBALL.get(),pLevel);
        //TODO Auto-generated constructor stub
    }

    public SpikeySnowball(Level pLevel, LivingEntity LivingEntit) {
        super(ModEntities.SPIKEYSNOWBALL.get(), LivingEntit, pLevel);
        Thrower = LivingEntit;
        //TODO Auto-generated constructor stub
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.SPIKEYSNOWBALLITEM.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult pEntityHitResult) {
      super.onHitEntity(pEntityHitResult);
      Entity entity = pEntityHitResult.getEntity();
      int i = entity instanceof Blaze ? 3 : 0;


      if (Thrower == null){
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), (float)i);
        return;
      }
      
      i += entity.distanceToSqr(Thrower) > 20 ? 1 : 2;

      entity.hurt(this.damageSources().thrown(this, this.getOwner()), (float)i);
   }

    // @Override 
    // protected void onHitBlock(BlockHitResult pBlock){
    //     if(!this.level().isClientSide){
    //         this.level().broadcastEntityEvent(this, ((byte) 3));
    //         this.level().setBlock(blockPosition(), getBlockStateOn(), BASE_TICKS_REQUIRED_TO_FREEZE);
    //     }
        
    // }
    
    // @Override
    // protected void onHitEntity


}
