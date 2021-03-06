package com.linmalu.MiniGames.Game10;

import org.bukkit.Material;
import org.bukkit.block.Block;

import com.linmalu.MiniGames.Main;
import com.linmalu.MiniGames.Data.MapData;

public class MG10_World
{
	@SuppressWarnings("deprecation")
	public MG10_World()
	{
		MapData md = Main.getMain().getGameData().getMapData();
		for(int y = 10; y < md.getMapHeight(); y++)
		{
			for(int x = md.getX1(); x <= md.getX2(); x++)
			{
				for(int z = md.getZ1(); z <= md.getZ2(); z++)
				{
					if(y == 10 || (x == md.getX1() || x == md.getX2() || z == md.getZ1() || z == md.getZ2()))
					{
						Block block = md.getWorld().getBlockAt(x, y, z);
						block.setType(Material.GOLD_BLOCK);
						block.setData((byte)0);
					}
				}
			}
		}
	}
}
