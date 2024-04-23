package me.rowanscripts.doublelife.commands;

import me.rowanscripts.doublelife.data.SaveHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class listPairs {

    public static boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.getOnlinePlayers().forEach(p -> {
            Player soulMate = SaveHandler.getSoulmate(p);
            if (soulMate != null) {
                sender.sendMessage(ChatColor.GREEN + p.getName() + " is paired with " + soulMate.getName());
            }
        });

        return true;
    }

}
