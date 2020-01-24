package com.github.lotear.nobodyhere;

import org.bukkit.entity.Player;

public class NobodyherePlayer
{
    private Player bukkitPlayer;

    private int killcooltime;

    public NobodyherePlayer(Player onlinePlayer)
    {
        this.killcooltime = 300;
        setPlayer(onlinePlayer);
    }

    private void setPlayer(Player onlinePlayer)
    {
        if(onlinePlayer != null)
        {
            this.bukkitPlayer = onlinePlayer;
        }
    }
}
