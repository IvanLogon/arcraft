package com.ivanlogon.arcraft.registry;

import com.ivanlogon.arcraft.Arcraft;
import com.ivanlogon.arcraft.research.items.Brush;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Arcraft.MODID);

    public static final RegistryObject<Item> BRUSH = ITEMS.register("brush",
            () -> new Brush(ArcraftTab.instance));

    public static class ArcraftTab extends CreativeModeTab {
        public static final ArcraftTab instance = new ArcraftTab(CreativeModeTab.TABS.length, "arcraft");

        private ArcraftTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BRUSH.get());
        }
    }
}
