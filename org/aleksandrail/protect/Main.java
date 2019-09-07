package org.aleksandrail.protect;

import org.aleksandrail.protect.Listeners.BlockBreak;
import org.aleksandrail.protect.Listeners.BlockPlace;
import org.aleksandrail.protect.Listeners.FallDamage;
import org.aleksandrail.protect.Listeners.FoodLevelChange;
import org.aleksandrail.protect.Listeners.Interact;
import org.aleksandrail.protect.Listeners.JoinListener;
import org.aleksandrail.protect.Listeners.PlayerChat;
import org.aleksandrail.protect.Listeners.WeatherChange;
import org.aleksandrail.protect.commands.Twitter;
import org.aleksandrail.protect.commands.discord;
import org.aleksandrail.protect.commands.ts;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable(){
		System.out.println("SorexProtect enabled!");
		new BlockBreak(this);
		new BlockPlace(this);
		new JoinListener(this);
		new WeatherChange(this);
		new FoodLevelChange(this);
		new FallDamage(this);
		new PlayerChat(this);
		new Interact(this);
		new discord(this);
		new ts(this);
		new Twitter(this);
        this.saveDefaultConfig();
	}
	public void onDisable(){
		System.out.println("SorexProtect disabled!");
	}

}
