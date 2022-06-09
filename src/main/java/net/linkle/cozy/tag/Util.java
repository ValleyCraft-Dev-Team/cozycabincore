package net.linkle.cozy.tag;

import net.linkle.cozy.CozyCabinCore;
import net.minecraft.util.Identifier;

class Util {
    /** Make a mod identifier. */
    static Identifier modId(String path) {
        return new Identifier(CozyCabinCore.MOD_ID, path);
    }
    /** Make a common identifier. */
    static Identifier comId(String path) {
        return new Identifier("c", path);
    }
}
