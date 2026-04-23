package pl.Szatekk.lucky.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NiceCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Nie posiadasz dostępu do tej komendy!");
        }else{
            Player player = (Player) sender;
            if (player.hasPermission("Lucky.Command")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 6767, 1));
                player.sendTitle("§5§lOtrzymujesz speed sigiemko!", "§6§lPykMc.pl <3", 40, 40, 40);
                player.sendMessage(ChatColor.DARK_PURPLE + "Blukerek to sigiemka");
            }else{
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 6969, 1));
                player.sendTitle("§5§lOtrzymujesz slowness głupolku!", "§6§lPykMc.pl <3", 40, 40, 40);
                player.sendMessage(ChatColor.DARK_PURPLE + "Nie posiadasz do tego permisji! Masz kare!!!");
            }
        }
        return true;
    }
}
