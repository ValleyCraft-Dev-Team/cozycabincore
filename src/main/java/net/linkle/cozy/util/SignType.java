package net.linkle.cozy.util;

import net.linkle.cozy.mixin.SignTypeInvoker;

public class SignType extends net.minecraft.util.SignType {
    public static final SignType REDWOOD = new SignType("redwood");
    
    public SignType(String name) {
        super(name);
    }
    
    public static void intialize() {
        SignTypeInvoker.register(REDWOOD);
    }
}
