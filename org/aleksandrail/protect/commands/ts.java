package org.aleksandrail.protect.commands;

import org.aleksandrail.protect.Main;
import org.aleksandrail.protect.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ts implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public ts(Main plugin){
		this.plugin = plugin;
		plugin.getCommand("teamspeak").setExecutor(this);
	}
	
@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("§cOnly players can execute this command!");
			return true;
		}
		
		Player p = (Player) sender;
		p.sendMessage(Utils.chat(plugin.getConfig().getString("ts_message")));
			return true;	
	}	
	
}
