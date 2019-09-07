package org.aleksandrail.protect.Listeners;

import org.aleksandrail.protect.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallDamage implements Listener {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public FallDamage(Main plugin){
	this.plugin = plugin;
	
	Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onDamage(EntityDamageEvent e){
		e.setCancelled(true);
	}
}
