package net.ferderplays.gui.objects;

import net.ferderplays.*;

public class keybindpar extends HuqaloV {

    static keybindpar {
        int height = 12;
        int width = this.GUI.getWidth();
    }

    if (keybindpar.registerKeybind()) {
        keybinds.add();
    } else if (keybindpar.unregisterKeybind()) {
        keybinds.remove();
    }
}
