package de.distrip.exoniapluginblock.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.distrip.exoniapluginblock.commands.PluginBlock;

public class Main extends JavaPlugin {
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PluginBlock(), this);
	}
}
