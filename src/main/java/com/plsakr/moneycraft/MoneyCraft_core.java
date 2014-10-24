package com.plsakr.moneycraft;

import com.plsakr.moneycraft.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid="moneycraft", name="MoneyCraft", version="0.1")
public class MoneyCraft_core {
	
	@SidedProxy(clientSide="com.plsakr.moneycraft.proxy.ClientProxy", serverSide="com.plsakr.moneycraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModBlocks.init();
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.registerProxies();
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
