package net.minecraft.src;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class AddonUtilsObfuscationMap {
	private static Map<String, String> blockMap = new HashMap<String, String>();
	private static Map<String, String> itemMap = new HashMap<String, String>();
	
	public static void initialize() {
		blockMap.put("wood", "N");
		blockMap.put("trapdoor", "bo");
		blockMap.put("portal", "bi");
		blockMap.put("fence", "bd");
		blockMap.put("netherFence", "bF");
		blockMap.put("cobblestoneWall", "cf");
		blockMap.put("oreNetherQuartz", "ct");
		blockMap.put("sandStone", "U");
		blockMap.put("stairsSandStone", "bU");
		blockMap.put("planks", "B");
		blockMap.put("stairsWoodOak", "ax");
		blockMap.put("stairsWoodSpruce", "ca");
		blockMap.put("stairsWoodBirch", "cb");
		blockMap.put("stairsWoodJungle", "cc");
		blockMap.put("obsidian", "at");
		blockMap.put("signPost", "aH");
		blockMap.put("signWall", "aM");
		
		itemMap.put("enderPearl", "bo");
		itemMap.put("sign", "av");
	}
	
	public static String getBlockLookup(String blockName) {
		return blockMap.get(blockName);
	}
	
	public static String getItemLookup(String itemName) {
		return itemMap.get(itemName);
	}
}
