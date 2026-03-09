package de.scholle.lux.bukkit;

import de.scholle.lux.bukkit.serverlist.ServerListBootstrap;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class LuxBukkitPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        int pluginId = 29817;
        new Metrics(this, pluginId);
        saveDefaultConfig();
        new ServerListBootstrap(this).enable();
    }
}
