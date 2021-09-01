package fr.anewplayerfr.test.constructor.outils;

import fr.anewplayerfr.test.Main;
import net.minecraft.item.ItemPickaxe;

public class InteriumPickaxeC extends ItemPickaxe
{

	public InteriumPickaxeC(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		// TODO Auto-generated constructor stub
		
		this.setCreativeTab(Main.interTabs);
	}
	
}
