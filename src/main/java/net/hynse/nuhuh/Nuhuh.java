package net.hynse.nuhuh;

import net.hynse.nuhuh.listeners.EndermanPickupListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Nuhuh extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the event listener
        getServer().getPluginManager().registerEvents(new EndermanPickupListener(), this);
    }

}
