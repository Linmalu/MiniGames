package com.linmalu.MiniGames.Game09;

import org.bukkit.Material;
import org.bukkit.block.Block;

import com.linmalu.MiniGames.Main;
import com.linmalu.MiniGames.Data.MapData;

public class MG09_World
{
	@SuppressWarnings("deprecation")
	public MG09_World()
	{
		MapData md = Main.getMain().getGameData().getMapData();
		for(int x = md.getX1(); x <= md.getX2(); x++)
		{
			for(int z = md.getZ1(); z <= md.getZ2(); z++)
			{
				Block block = md.getWorld().getBlockAt(x, md.getMapHeight(), z);
				block.setType(Material.WOOL);
				block.setData((byte)0);
			}
		}
	}
}
