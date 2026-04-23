package pl.Szatekk.lucky;

import org.bukkit.plugin.java.JavaPlugin;
import pl.Szatekk.lucky.commands.NiceCommand;

public final class Lucky extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin został włączony!");
        getCommand("lucky").setExecutor(new NiceCommand());
    }
}
