package org.aleksandrail.protect.commands;

import org.aleksandrail.protect.Main;
import org.aleksandrail.protect.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Twitter implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public Twitter(Main plugin){
		this.plugin = plugin;
		plugin.getCommand("Twitter").setExecutor(this);
	}
	
@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("§cOnly players can execute this command!");
			return true;
		}
		
		Player p = (Player) sender;
		p.sendMessage(Utils.chat(plugin.getConfig().getString("twitter_message")));
			return true;	
	}	
	
}
