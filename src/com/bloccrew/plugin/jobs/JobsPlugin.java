package com.bloccrew.plugin.jobs;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class JobsPlugin extends JavaPlugin{
    public final Logger logger = Logger.getLogger("Minecraft");
    public final PluginDescriptionFile pdf = this.getDescription();
    
    public void onEnable(){
        logger.info("["+pdf.getAuthors().get(0)+"] ["+pdf.getName()+"] "pdf.getName()+" v"+pdf.getVersion()+" has been enabled!");
    }
    
    @Override
    public void onDisable(){
        logger.info("["+pdf.getAuthors().get(0)+"] ["+pdf.getName()+"] "pdf.getName()+" v"+pdf.getVersion()+" has been disabled!");
    }

    
    public void onCommand(){
        
    }
}
