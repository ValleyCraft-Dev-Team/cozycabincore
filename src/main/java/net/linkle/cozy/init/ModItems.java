package net.linkle.cozy.init;

import static net.linkle.cozy.init.ModGroups.CABIN_GROUP;
import static net.minecraft.item.Items.GLASS_BOTTLE;

import net.linkle.cozy.item.PineTarItem;
import net.linkle.cozy.item.PitchBottleItem;
import net.linkle.cozy.item.ItemIcon;
import net.linkle.cozy.util.Reg;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;

public class ModItems {
    
    public static final Item OAK_SIGN = new SignItem(settings().maxCount(16), ModBlocks.REDWOOD_SIGN, ModBlocks.REDWOOD_WALL_SIGN);
    public static final Item PINE_TAR = new PineTarItem(settings());
    public static final Item PITCH_BOTTLE = new PitchBottleItem(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE));

    //icons

    public static final Item HOME_ICON = new ItemIcon();
    public static final Item HONEY_ICON = new ItemIcon();
    public static final Item CABIN_ICON = new ItemIcon();

    public static void initialize() {
        Reg.register("pine_sap", PINE_TAR);
        Reg.register("pitch_bottle", PITCH_BOTTLE);
        Reg.register("redwood_sign", OAK_SIGN);

        //icons

        Reg.register("home_icon", HOME_ICON);
        Reg.register("honey_icon", HONEY_ICON);
        Reg.register("cabin_icon", CABIN_ICON);
    }

    private static Item.Settings settings() {
        return new Item.Settings().group(CABIN_GROUP);
    }
}
