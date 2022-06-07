package net.linkle.cozy.init;

import static net.linkle.cozy.init.C_Groups.CABIN_GROUP;
import static net.minecraft.item.Items.GLASS_BOTTLE;

import net.linkle.cozy.item.PineTarItem;
import net.linkle.cozy.item.PitchBottleItem;
import net.linkle.cozy.util.Reg;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;

public class C_Items {
    
    public static final Item OAK_SIGN = new SignItem(settings().maxCount(16), C_Blocks.REDWOOD_SIGN, C_Blocks.REDWOOD_WALL_SIGN);
    public static final Item PINE_TAR = new PineTarItem(settings().maxCount(64));
    public static final Item PITCH_BOTTLE = new PitchBottleItem(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE));

    public static void intialize() {
        Reg.register("pine_sap", PINE_TAR);
        Reg.register("pitch_bottle", PITCH_BOTTLE);
        Reg.register("redwood_sign", OAK_SIGN);
    }

    private static Item.Settings settings() {
        return new Item.Settings().group(CABIN_GROUP);
    }
}
