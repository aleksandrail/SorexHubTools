package org.aleksandrail.protect.Listeners;

import org.aleksandrail.protect.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Interact implements Listener {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public Interact(Main plugin){
	this.plugin = plugin;
	
	Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	public void onInteract(PlayerInteractEntityEvent e) {
		e.setCancelled(true);
		Player p = e.getPlayer();
		p.sendMessage("§cYou cannot use that on hub.");
	}
}
