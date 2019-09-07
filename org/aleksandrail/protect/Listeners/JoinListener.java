package org.aleksandrail.protect.Listeners;

import org.aleksandrail.protect.Main;
import org.aleksandrail.protect.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinListener implements Listener {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	
	public JoinListener(Main plugin) {
		this.plugin = plugin;
		
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler
    public void onJoin(final PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(p.hasPermission("sorex.staff")){
			e.setJoinMessage(Utils.chat(plugin.getConfig().getString("staffjoin_message").replace("%player%", p.getName())));	
		}else {
			e.setJoinMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("%player%", p.getName())));	
		}
	}	
    @EventHandler
    public void onQuit(final PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if(p.hasPermission("sorex.staff")){
			e.setQuitMessage(Utils.chat(plugin.getConfig().getString("staffquit_message").replace("%player%", p.getName())));
		}else {
		
			e.setQuitMessage(Utils.chat(plugin.getConfig().getString("quit_message").replace("%player%", p.getName())));
		}
    }
}