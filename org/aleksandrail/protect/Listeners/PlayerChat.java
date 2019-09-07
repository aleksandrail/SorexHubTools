package org.aleksandrail.protect.Listeners;

import org.aleksandrail.protect.Main;
import org.aleksandrail.protect.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public PlayerChat(Main plugin){
	this.plugin = plugin;
	
	Bukkit.getPluginManager().registerEvents(this, plugin);	
	}
		
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onChat(AsyncPlayerChatEvent e){	
		Player p = e.getPlayer();	
		if(p.hasPermission("Sorex.chat")){
			e.setFormat(Utils.chat(plugin.getConfig().getString("chat_format").replace("%player%", p.getName()).replace("%message%", e.getMessage())));			
			}else {
				e.setCancelled(true);
				p.sendMessage(Utils.chat(plugin.getConfig().getString("nopermission_chat")));	
			}
		}	
	}
