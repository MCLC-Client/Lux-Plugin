package de.scholle.lux;

import org.bstats.bukkit.Metrics;
import de.scholle.lux.serverlist.ServerListBootstrap;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lux extends JavaPlugin {

    @Override
    public void onEnable() {
        int pluginId = 29817;
        new Metrics(this, pluginId);
        saveDefaultConfig();
        new ServerListBootstrap(this).enable();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
