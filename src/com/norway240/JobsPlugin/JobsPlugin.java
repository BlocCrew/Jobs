package com.norway240.JobsPlugin;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class JobsPlugin extends JavaPlugin{
    public final Logger logger = Logger.getLogger("Minecraft");
    public final PluginDescriptionFile pdf = this.getDescription();
    
    public void onEnable(){
        logger.info(pdf.getName()+"v"+pdf.getVersion()+" by norway240 enabled!");
    }
    
    @Override
    public void onDisable(){
        logger.info(pdf.getName()+"v"+pdf.getVersion()+" by norway240 disabled!");
    }

    
    public void onCommand(){
        
    }
}
