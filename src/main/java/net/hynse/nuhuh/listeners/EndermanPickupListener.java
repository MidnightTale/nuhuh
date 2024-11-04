package net.hynse.nuhuh.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.entity.EntityType;

public class EndermanPickupListener implements Listener {
    
    @EventHandler
    public void onEndermanPickup(EntityChangeBlockEvent event) {
        if (event.getEntity().getType() == EntityType.ENDERMAN) {
            event.setCancelled(true);
        }
    }
}
