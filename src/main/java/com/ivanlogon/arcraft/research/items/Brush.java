package com.ivanlogon.arcraft.research.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class Brush extends Item {

    public Brush(CreativeModeTab tab) {
        super(new Item.Properties()
                        .durability(256)
                        .tab(tab));
    }
    

}
