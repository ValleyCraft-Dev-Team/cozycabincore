package net.linkle.cozy.util;

import net.linkle.cozy.mixin.SignTypeMixin;
import net.minecraft.util.SignType;

public class ModSignType extends SignType {
    public static final ModSignType REDWOOD = new ModSignType("cabin_redwood");
    
    public ModSignType(String name) {
        super(name);
    }
    
    public static void initialize() {
        SignTypeMixin.register(REDWOOD);
    }
}
