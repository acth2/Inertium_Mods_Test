package fr.anewplayerfr.test.creativetabs;

import fr.anewplayerfr.test.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InteriumTabs extends CreativeTabs
{

	public InteriumTabs(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemInit.interium_test);
	}
	
}
