package net.linkle.cozy.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.util.SignType;

@Mixin(SignType.class)
public interface SignTypeMixin {
    @Invoker("register")
    static SignType register(SignType type) {
        throw new AssertionError();
    }
}
