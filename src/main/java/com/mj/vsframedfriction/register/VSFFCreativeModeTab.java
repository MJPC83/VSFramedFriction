package com.mj.vsframedfriction.register;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;


public class VSFFCreativeModeTab {

    public static final CreativeModeTab VSFF_TAB = new CreativeModeTab("vsfftab") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(BlockRegister.CUSTOM_FRICTION_BLOCK.get());
        }
    };
}
