package aatherf.plugin.join;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(this , this);
		
	}
	
	@Override
	public void onDisable() {
		
		
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		if (p.hasPlayedBefore()){
			
			e.setJoinMessage(ChatColor.YELLOW + p.getName() + ChatColor.GREEN + "joined");
			
		}else {
			
			e.setJoinMessage(ChatColor.YELLOW + p.getName() + ChatColor.GREEN + " welcome to the my server!");
			
			
		}
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		
		Player p = e.getPlayer();
		e.setQuitMessage(ChatColor.YELLOW + p.getName() + ChatColor.DARK_GREEN + " left the server :(");
		
	}
	
}
