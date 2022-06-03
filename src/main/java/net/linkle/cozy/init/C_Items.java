package net.linkle.cozy.init;

import static net.linkle.cozy.init.C_Groups.CABIN_GROUP;

import net.linkle.cozy.util.Reg;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;

public class C_Items {
    
    //public static final Item OAK_SIGN = new SignItem(settings().maxCount(16), C_Blocks.REDWOOD_SIGN, C_Blocks.REDWOOD_WALL_SIGN);
    
    public static void intialize() {
        //Reg.register("redwood_sign", OAK_SIGN);
    }
    
    private static Item.Settings settings() {
        return new Item.Settings().group(CABIN_GROUP);
    }
}
