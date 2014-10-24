package com.plsakr.moneycraft.proxy;

import com.moneycraft.atm.TileEntityATMEntity;
import com.moneycraft.atm.TileEntityATMRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	public void registerProxies(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityATMEntity.class, new TileEntityATMRenderer());
	}

}
