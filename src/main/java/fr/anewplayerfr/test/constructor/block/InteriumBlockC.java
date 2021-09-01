package fr.anewplayerfr.test.constructor.block;

import fr.anewplayerfr.test.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InteriumBlockC extends Block
{

	public InteriumBlockC(String name, Material materialIn)
	{
		super(materialIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(4.6F);
		this.setHarvestLevel("pickaxe", 4);
		
		this.setCreativeTab(Main.interTabs);
	}
	
}
