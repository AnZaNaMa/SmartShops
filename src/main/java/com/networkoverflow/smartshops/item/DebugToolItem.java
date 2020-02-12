package com.networkoverflow.smartshops.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.StringTextComponent;

public class DebugToolItem extends Item {
    public DebugToolItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        context.getPlayer().sendMessage(new StringTextComponent("you right clicked!"));
        return ActionResultType.PASS;
    }
}