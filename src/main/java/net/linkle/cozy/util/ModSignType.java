package net.linkle.cozy.util;

import net.linkle.cozy.mixin.SignTypeInvoker;
import net.minecraft.util.SignType;

public class ModSignType extends SignType {
    public static final ModSignType REDWOOD = new ModSignType("redwood");
    
    public ModSignType(String name) {
        super(name);
    }
    
    public static void intialize() {
        SignTypeInvoker.register(REDWOOD);
    }
}
