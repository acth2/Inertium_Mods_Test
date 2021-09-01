package fr.anewplayerfr.test.constructor.outils;

import fr.anewplayerfr.test.Main;
import net.minecraft.item.ItemSword;

public class InterniumSwordC extends ItemSword
{

	public InterniumSwordC(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		
		this.setCreativeTab(Main.interTabs);
	}
	
}
