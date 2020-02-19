package de.distrip.exoniapluginblock.commands;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PluginBlock implements Listener {
	@EventHandler
	public void onPlugin(PlayerCommandPreprocessEvent event) {
		Player player = event.getPlayer();
		String[] block = event.getMessage().substring(1).split(" ");
		if (!player.hasPermission("exoniablock.validate")) {
			if (block[0].startsWith("plugins") || block[0].startsWith("version") || block[0].startsWith("bukkit")
					|| block[0].startsWith("?") || block[0].startsWith("help") || block[0].startsWith("me")
					|| block[0].startsWith("pl") || block[0].startsWith("pex")) {
				if (block[0].startsWith("pl")) {
					if (!block[0].startsWith("plot")) {
						player.sendMessage(" §cx §7Denied. §c- §7ExoniaBlock");
						event.setCancelled(true);
					}
				} else {
					player.sendMessage(" §cx §7Denied. §c- §7ExoniaBlock");
					event.setCancelled(true);
				}
			}
		}
	}
}

/*
 * Es soll blockiert werden: /pl /plugins /version /bukkit /? /help /pex /me
 */
