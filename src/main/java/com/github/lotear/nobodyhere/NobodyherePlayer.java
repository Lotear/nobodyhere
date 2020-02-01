package com.github.lotear.nobodyhere;

import org.bukkit.entity.Player;

public class NobodyherePlayer
{
    private Player bukkitPlayer;

    private  String name;

    private int killcooltime;

    private boolean isMurder;

    public NobodyherePlayer(Player onlinePlayer)
    {
        this.killcooltime = 300;
        setPlayer(onlinePlayer);
    }

    void setPlayer(Player onlinePlayer)
    {
        if(onlinePlayer != null)
        {
            this.bukkitPlayer = onlinePlayer;
            this.name = onlinePlayer.getName();
        }
        else
        {
            this.bukkitPlayer = null;
        }
    }

    public void onDeath(NobodyherePlayer killer)
    {
        if(killer.isMurder)
        {
            //killer.killcooltime = ; 시간 초기화
        }
    }

}
