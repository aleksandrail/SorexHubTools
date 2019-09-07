package org.aleksandrail.protect.Listeners;

import org.aleksandrail.protect.Main;
import org.aleksandrail.protect.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {
	

	@SuppressWarnings("unused")
	private Main plugin;
	
	public BlockBreak(Main plugin){
	this.plugin = plugin;
	
	Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("sorex.break")){
			e.setCancelled(false);
		}else {
		e.setCancelled(true);
		p.sendMessage(Utils.chat(plugin.getConfig().getString("blockbreak_message")));
		
		}
	}
}
