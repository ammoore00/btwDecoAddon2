package net.minecraft.src;

public class DecoRecipes {
	public static final DecoRecipes instance = new DecoRecipes();

	private DecoRecipes() {}

	public void addAllDecoRecipes() {
		addClayRecipes();
		addChairRecipes();
		addGlassRecipes();
		addFlowerRecipes();
		addStoneRecipes();
		addWoodRecipes();
		addDecoRecipes();
		//addLayerRecipes();
		addMortarRecipes();
		addToolRecipes();
		addCustomRecipeClasses();
	}

	private void addClayRecipes() {
		DecoDefs.unfiredTerracotta.SetCanBeCookedByKiln(true).SetItemIndexDroppedWhenCookedByKiln(DecoDefs.terracotta.blockID);
		for (int i = 0; i < 32; i++)
		{
			FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.stainedTerracotta, 8, i % 16), new ItemStack[] { new ItemStack(DecoDefs.terracotta, 8), new ItemStack(Item.dyePowder, 1, i)});
		}

		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.stainedTerracotta, 8, 3), new ItemStack[] {new ItemStack(DecoDefs.terracotta, 8), new ItemStack(FCBetterThanWolves.fcItemDung)});

		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.unfiredTerracotta, 1), new Object[] {FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, Item.clay});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.unfiredTerracotta, 1), new Object[] {FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemNetherSludge});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.unfiredTerracotta, 1), new Object[] {DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, Item.clay});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.unfiredTerracotta, 1), new Object[] {DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, DecoDefs.pileRedSand, FCBetterThanWolves.fcItemNetherSludge});

		//Sub-blocks
		FCRecipes.AddAnvilRecipe(new ItemStack(DecoDefs.terracottaSidingAndCorner, 8, 0), new Object[] {"####", '#', new ItemStack(DecoDefs.terracotta, 1, 0)});
		FCRecipes.AddAnvilRecipe(new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 8, 0), new Object[] {"####", '#', new ItemStack(DecoDefs.terracottaSidingAndCorner, 1, 0)});
		FCRecipes.AddAnvilRecipe(new ItemStack(DecoDefs.terracottaSidingAndCorner, 8, 1), new Object[] {"####", '#', new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 12), new Object[] {"M", "M", "M", 'M', new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 6, 13), new Object[] {" S ", "###", "###", '#', new ItemStack(DecoDefs.terracotta, 1, 0), 'S', new ItemStack(DecoDefs.terracottaSidingAndCorner, 8, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 4, 15), new Object[] {"###", " X ", " X ", '#', new ItemStack(DecoDefs.terracottaSidingAndCorner, 1, 0), 'X', new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracottaSidingAndCorner, 4, 12), new Object[] {"###", " X ", '#', new ItemStack(DecoDefs.terracottaSidingAndCorner, 1, 0), 'X', new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0)});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracottaSidingAndCorner, 2, 14), new Object[] {"###", "###", '#', new ItemStack(DecoDefs.terracotta, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracottaSidingAndCorner, 2, 14), new Object[] {"###", '#', new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0)});

		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.terracotta, 1, 0), new Object[] {new ItemStack(DecoDefs.terracottaSidingAndCorner, 1, 0), new ItemStack(DecoDefs.terracottaSidingAndCorner, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.terracottaSidingAndCorner, 1, 0), new Object[] {new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0), new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0), new Object[] {new ItemStack(DecoDefs.terracottaSidingAndCorner, 1, 1), new ItemStack(DecoDefs.terracottaSidingAndCorner, 1, 1)});

		//Stairs
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracottaStairs, 4, 0), new Object[]{"#  ","## ","###",'#',new ItemStack(DecoDefs.terracotta, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracottaStairs, 1, 0), new Object[]{"# ","##",'#',new ItemStack(DecoDefs.terracottaMouldingAndDecorative, 1, 0)});
		
		//Slabs
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab6, 6, 3), new Object[] {"###", '#', new ItemStack(DecoDefs.terracotta, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.terracotta, 1), new Object[] {"#", "#", '#', new ItemStack(DecoDefs.stoneSlab6, 1, 3)});

		for(int i = 0; i < 16; i++){
			//Sub blocks
			FCRecipes.AddAnvilRecipe(new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 8, 0), new Object[] {"####", '#', new ItemStack(DecoDefs.stainedTerracotta, 1, i)});
			FCRecipes.AddAnvilRecipe(new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 8, 0), new Object[] {"####", '#', new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 1, 0)});
			FCRecipes.AddAnvilRecipe(new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 8, 1), new Object[] {"####", '#', new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0)});

			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 12), new Object[] {"M", "M", "M", 'M', new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 6, 13), new Object[] {" S ", "###", "###", '#', new ItemStack(DecoDefs.stainedTerracotta, 1, i), 'S', new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 8, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 4, 15), new Object[] {"###", " X ", " X ", '#', new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 1, 0), 'X', new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 4, 12), new Object[] {"###", " X ", '#', new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 1, 0), 'X', new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0)});

			//Fences
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 2, 14), new Object[] {"###", "###", '#', new ItemStack(DecoDefs.stainedTerracotta, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 2, 14), new Object[] {"###", '#', new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0)});

			FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.stainedTerracotta, 1, i), new Object[] {new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 1, 0), new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 1, 0)});
			FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 1, 0), new Object[] {new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0), new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0), new Object[] {new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 1, 1), new ItemStack(DecoDefs.stainedTerracottaSidingAndCorner[i], 1, 1)});

			//Stairs
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracottaStairs[i], 4, 0), new Object[]{"#  ","## ","###",'#',new ItemStack(DecoDefs.stainedTerracotta, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracottaStairs[i], 1, 0), new Object[]{"# ","##",'#',new ItemStack(DecoDefs.stainedTerracottaMouldingAndDecorative[i], 1, 0)});

			//Slabs
			FCRecipes.AddRecipe(new ItemStack(i < 8 ? DecoDefs.terracottaSlab : DecoDefs.terracottaSlab2, 6, i % 8), new Object[] {"###", '#', new ItemStack(DecoDefs.stainedTerracotta, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stainedTerracotta, 1, i), new Object[] {"#", "#", '#', new ItemStack(i < 8 ? DecoDefs.terracottaSlab : DecoDefs.terracottaSlab2, 1, i % 8)});
			
			//Glazed Terracotta
			FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.glazedTerracotta[i]), new ItemStack[] {new ItemStack(DecoDefs.stainedTerracotta, 1, i)});
		}
	}

	private void addChairRecipes() {
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.oakWoodChair, 4), new Object[] {"#  ", "###","X X", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 0), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.birchWoodChair, 4), new Object[] {"#  ", "###","X X", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 2), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.spruceWoodChair, 4), new Object[] {"#  ", "###","X X", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 1), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.jungleWoodChair, 4), new Object[] {"#  ", "###","X X", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 3), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.bloodWoodChair, 4), new Object[] {"#  ", "###","X X", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 4), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.cherryWoodChair, 4), new Object[] {"#  ", "###","X X", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5)});
	}

	private void addGlassRecipes() {
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(Block.glass, 1), new ItemStack[] {new ItemStack(DecoDefs.glassChunk, 4)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.glassChunk, 4), new Object[]{new ItemStack(Block.glass, 1)});

		FCRecipes.RemoveVanillaRecipe(new ItemStack(Item.glassBottle, 3), new Object[] {"# #", " # ", '#', Block.glass});
		FCRecipes.AddRecipe(new ItemStack(Item.glassBottle, 3), new Object[] {" # ", "# #", "###", '#', DecoDefs.glassChunk});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.glassChunk, 2), new ItemStack[] {new ItemStack(Item.glassBottle, 1)});

		for (int i = 0; i < 32; i++) {
			FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.stainedGlassItem, 8, i % 16), new ItemStack[] {new ItemStack(Block.glass, 8), new ItemStack(Item.dyePowder, 1, i)});
		}

		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.stainedGlassItem, 8, 3), new ItemStack[] {new ItemStack(Block.glass, 8), new ItemStack(FCBetterThanWolves.fcItemDung)});
	}

	private void addFlowerRecipes() {
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Item.flowerPot, 1), new Object[] {"# #", " # ", '#', Item.brick});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.flowerPot, 1), new ItemStack[]{new ItemStack(FCBetterThanWolves.fcItemPileDirt), new ItemStack(FCBetterThanWolves.fcItemUrn)});
		for (int i = 0; i < 15; ++i) {
			FCRecipes.AddShapelessRecipe(new ItemStack(Block.cloth, 1, BlockCloth.getDyeFromBlock(i)), new Object[] {new ItemStack(Item.dyePowder, 1, i+16), new ItemStack(Block.cloth.blockID, 1, 0)});
			FCRecipes.AddCauldronRecipe(new ItemStack(Block.cloth, 8, BlockCloth.getDyeFromBlock(i)), new ItemStack[] {new ItemStack(Item.dyePowder, 1, i+16), new ItemStack(Block.cloth.blockID, 8, 0)});
		}

		//Fertilizer
		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.fertilizer, 2), new ItemStack[] {new ItemStack(Item.dyePowder, 1, 15), new ItemStack(FCBetterThanWolves.fcItemPotash)});

		//Flower Recipes

		// Yucca
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 10)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 0)});
		// Hyacinth
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 12)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 1)});
		// Birds of Paridise
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 14)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 2)});
		// Azalea
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 9) },	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 3)});
		// Cornflower
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 20)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 4)});
		// Lavender
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 5) },	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 5)});
		// Honeysuckle
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 1, 31),new ItemStack(Item.dyePowder, 1, 11)},new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 6)});
		// Allium
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 13)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 7)});
		// Blue Orchid
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 12)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 8)});
		// Poppy
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 1) },	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 9)});
		// Azure Bluet
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 1, 31),new ItemStack(Item.dyePowder, 1, 11)},new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 10)});
		// Daisy
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 1, 31),new ItemStack(Item.dyePowder, 1, 11)},new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 11)});
		// Peony
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 13)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 12)});
		// Lilac
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 13)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 13)});
		// Rose Bush
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 3, 1)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 14)});
		// Blue Rose
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 20)},	new ItemStack[]{new ItemStack(DecoDefs.flower, 1, 15)});
		//Black Rose
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 16)},	new ItemStack[]{new ItemStack(DecoDefs.flower2, 1, 0)});
		//Lily of the valley
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 31)},	new ItemStack[]{new ItemStack(DecoDefs.flower2, 1, 1)});
		// Tulips
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 1, 14),new ItemStack(Item.dyePowder, 1, 1)},	new ItemStack[]{new ItemStack(DecoDefs.tulip, 1, 0)});
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 9)},	new ItemStack[]{new ItemStack(DecoDefs.tulip, 1, 1)});
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 14)},	new ItemStack[]{new ItemStack(DecoDefs.tulip, 1, 2)});
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 31)},	new ItemStack[]{new ItemStack(DecoDefs.tulip, 1, 3)});
		FCRecipes.AddMillStoneRecipe(new ItemStack[]{new ItemStack(Item.dyePowder, 2, 20)},	new ItemStack[]{new ItemStack(DecoDefs.tulip, 1, 4)});

		//Cooking with dyes
		for (int i = 0; i < 16; i++)
		{
			FCRecipes.AddCauldronRecipe(new ItemStack(Block.cloth,1,BlockCloth.getDyeFromBlock(i)), new ItemStack[]{new ItemStack(Item.dyePowder,1,i+16),new ItemStack(Item.itemsList[Block.cloth.blockID], 1,0)});
		}
		//Mixing dyes
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 10), new Object[] {new ItemStack(Item.dyePowder, 1, 2), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 8), new Object[] {new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 7), new Object[] {new ItemStack(Item.dyePowder, 1, 8), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 9), new Object[] {new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 6), new Object[] {new ItemStack(Item.dyePowder, 1, 20), new ItemStack(Item.dyePowder, 1, 2)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 5), new Object[] {new ItemStack(Item.dyePowder, 1, 20), new ItemStack(Item.dyePowder, 1, 1)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 3, 13), new Object[] {new ItemStack(Item.dyePowder, 1, 20), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 9)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 12), new Object[] {new ItemStack(Item.dyePowder, 1, 20), new ItemStack(Item.dyePowder, 1, 15)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 12), new Object[] {new ItemStack(Item.dyePowder, 1, 20), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 12), new Object[] {new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 1, 15)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 3, 7), new Object[] {new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 31), new ItemStack(Item.dyePowder, 1, 15)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 3, 7), new Object[] {new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 31), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 4, 13), new Object[] {new ItemStack(Item.dyePowder, 1, 20), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 15)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 4, 13), new Object[] {new ItemStack(Item.dyePowder, 1, 20), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 4, 13), new Object[] {new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 31)});

		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 8), new Object[] {new ItemStack(Item.dyePowder, 1, 16), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 3, 7), new Object[] {new ItemStack(Item.dyePowder, 1, 16), new ItemStack(Item.dyePowder, 1, 31), new ItemStack(Item.dyePowder, 1, 15)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 3, 7), new Object[] {new ItemStack(Item.dyePowder, 1, 16), new ItemStack(Item.dyePowder, 1, 31), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 2, 8), new Object[] {new ItemStack(Item.dyePowder, 1, 16), new ItemStack(Item.dyePowder, 1, 15)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.dyePowder, 3, 7), new Object[] {new ItemStack(Item.dyePowder, 1, 16), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Item.dyePowder, 1, 15)});
	}

	private void addStoneRecipes() {
		//Stone types
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.andesiteCobbleLoose, 8), new ItemStack[] {new ItemStack(DecoDefs.dioriteCobbleLoose, 8), new ItemStack(FCBetterThanWolves.fcItemStone, 8)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.andesiteCobbleLoose, 1), new ItemStack[] {new ItemStack(DecoDefs.dioriteCobbleLoose, 1), new ItemStack(FCBetterThanWolves.fcItemStone, 1)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.dioriteCobbleLoose, 8), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLoose, 8), new ItemStack(Item.netherQuartz)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.graniteCobbleLoose, 8), new ItemStack[] {new ItemStack(DecoDefs.andesiteCobbleLoose, 8), new ItemStack(Item.netherQuartz)});

		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.stoneTypesSmooth, 1, 0), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 0)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.stoneTypesSmooth, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 1)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.stoneTypesSmooth, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 2)});

		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.graniteCobbleLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 0), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.graniteCobbleLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 0), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.andesiteCobbleLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 1), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.andesiteCobbleLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 1), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.dioriteCobbleLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 2), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.dioriteCobbleLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypes, 1, 2), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.graniteStoneBrickLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesSmooth, 1, 0), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.graniteStoneBrickLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesSmooth, 1, 0), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.andesiteStoneBrickLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesSmooth, 1, 1), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.andesiteStoneBrickLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesSmooth, 1, 1), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.dioriteStoneBrickLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesSmooth, 1, 2), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.dioriteStoneBrickLoose), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesSmooth, 1, 2), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});

		for (int i = 0; i < 3; i++) {
			FCRecipes.AddSubBlockRecipesOfType(DecoDefs.stoneTypes, i, DecoDefs.stoneTypesSidingAndCorner[i], DecoDefs.stoneTypesMouldingAndDecorative[i], true);
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesStairs[i]), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.stoneTypesMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesStairs[i], 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.stoneTypes, 1, i)});
			FCRecipes.AddSubBlockRecipesOfType(DecoDefs.stoneTypesSmooth, i, DecoDefs.stoneTypesSmoothSidingAndCorner[i], DecoDefs.stoneTypesSmoothMouldingAndDecorative[i], true);
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesSmoothStairs[i]), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.stoneTypesSmoothMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesSmoothStairs[i], 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.stoneTypesSmooth, 1, i)});
			FCRecipes.AddSubBlockRecipesOfType(DecoDefs.stoneTypesCobble, i, DecoDefs.stoneTypesCobblestoneSidingAndCorner[i], DecoDefs.stoneTypesCobblestoneMouldingAndDecorative[i], true);
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[i]), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.stoneTypesCobblestoneMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[i], 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.stoneTypesCobble, 1, i)});
			FCRecipes.AddSubBlockRecipesOfType(DecoDefs.stoneTypesStoneBrick, i, DecoDefs.stoneTypesStoneBrickSidingAndCorner[i], DecoDefs.stoneTypesStoneBrickMouldingAndDecorative[i], true);
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[i]), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.stoneTypesStoneBrickMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[i], 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, i)});
		}

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab2, 6, 0), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypes, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab2, 6, 1), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypes, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab2, 6, 2), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypes, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab2, 6, 3), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesSmooth, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab2, 6, 4), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesSmooth, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab2, 6, 5), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesSmooth, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab2, 6, 6), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesCobble, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab2, 6, 7), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesCobble, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab3, 6, 0), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesCobble, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab3, 6, 1), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab3, 6, 2), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab3, 6, 3), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypes, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab2, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypes, 1, 1), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab2, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypes, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab2, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesSmooth, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab2, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesSmooth, 1, 1), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab2, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesSmooth, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab2, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab2, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 1), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab2, 1, 7)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab3, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab3, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 1), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab3, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab3, 1, 3)});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[0], 4), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.graniteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[0], 8), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.graniteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseSlab, 4, 0), new Object[] {"XX", 'X', new ItemStack(DecoDefs.graniteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[1], 4), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.andesiteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[1], 8), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.andesiteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseSlab, 4, 1), new Object[] {"XX", 'X', new ItemStack(DecoDefs.andesiteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[2], 4), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.dioriteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[2], 8), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.dioriteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseSlab, 4, 2), new Object[] {"XX", 'X', new ItemStack(DecoDefs.dioriteCobbleLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[3], 4), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.graniteStoneBrickLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[3], 8), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.graniteStoneBrickLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseSlab, 4, 3), new Object[] {"XX", 'X', new ItemStack(DecoDefs.graniteStoneBrickLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[4], 4), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.andesiteStoneBrickLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[4], 8), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.andesiteStoneBrickLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseSlab, 4, 4), new Object[] {"XX", 'X', new ItemStack(DecoDefs.andesiteStoneBrickLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[5], 4), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.dioriteStoneBrickLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseStairs[5], 8), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.dioriteStoneBrickLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneTypesLooseSlab, 4, 5), new Object[] {"XX", 'X', new ItemStack(DecoDefs.dioriteStoneBrickLoose)});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.graniteCobbleLoose), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.andesiteCobbleLoose), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.dioriteCobbleLoose), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.graniteStoneBrickLoose), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.andesiteStoneBrickLoose), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.dioriteStoneBrickLoose), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 5)});

		//White stone brick
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.whiteStoneBrick,4,0), new Object[]{"XX","XX",'X',new ItemStack(FCBetterThanWolves.fcAestheticOpaque,1,9)});
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.whiteStoneBrick, 0, DecoDefs.whiteBrickSidingAndCorner, DecoDefs.whiteBrickMouldingAndDecorative, true);
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.whiteBrickStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.whiteBrickMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.whiteBrickStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.whiteStoneBrick)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab, 6, 5), new Object[] {"###", '#', new ItemStack(DecoDefs.whiteStoneBrick)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.whiteStoneBrick, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab, 1, 5)});

		//Sandstone
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.redSand),  new Object[] {FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemPileSand, FCBetterThanWolves.fcItemHellfireDust});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandSlab, 4), new Object[] {"XX", 'X', DecoDefs.redSand});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSand), new Object[] {"X", "X", 'X', DecoDefs.redSandSlab});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.redSand), new ItemStack[] {new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pileRedSand, 8), new ItemStack[] {new ItemStack(DecoDefs.redSand)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.redSandSlab), new ItemStack[] {new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand), new ItemStack(DecoDefs.pileRedSand)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pileRedSand, 4), new ItemStack[] {new ItemStack(DecoDefs.redSandSlab)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 4, 2), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 0)});

		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.sandStone, 4, 2), new Object[] {"##", "##", '#', Block.sandStone});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 4, 2), new Object[] {"##", "##", '#', new ItemStack(Block.sandStone, 1, 0)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(Block.sandStone, 1, 3), new ItemStack[] {new ItemStack(Block.sandStone, 1, 0)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.redSandStone, 1, 3), new ItemStack[] {new ItemStack(DecoDefs.redSandStone, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 4, 4), new Object[] {"XX", "XX", 'X', new ItemStack(Block.sandStone, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 4, 4), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 4, 6), new Object[] {"XX", "XX", 'X', new ItemStack(Block.sandStone, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 4, 6), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 2)});

		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.stoneSingleSlab, 6, 1), new Object[] {"###", '#', Block.sandStone});
		FCRecipes.AddRecipe(new ItemStack(Block.stoneSingleSlab, 6, 1), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab, 6, 0), new Object[] {"###", '#', new ItemStack(DecoDefs.redSandStone)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab4, 6, 0), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab4, 6, 1), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab4, 6, 2), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab4, 6, 3), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab4, 6, 4), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab4, 6, 5), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab4, 6, 6), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab4, 6, 7), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab5, 6, 0), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 7)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab5, 6, 1), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab5, 6, 2), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab5, 6, 3), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 7)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab5, 6, 4), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 8)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab5, 6, 5), new Object[] {"XXX", 'X', new ItemStack(Block.sandStone, 1, 9)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab5, 6, 6), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 8)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab5, 6, 7), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.redSandStone, 1, 9)});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab4, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 1, 3), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab4, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 1, 4), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab4, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab4, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 1, 3), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab4, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 1, 4), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab4, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 1, 5), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab4, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 1, 6), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab4, 1, 7)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 1, 7), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab5, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 1, 5), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab5, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 1, 6), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab5, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 1, 7), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab5, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 1, 8), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab5, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(Block.sandStone, 1, 9), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab5, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 1, 8), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab5, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStone, 1, 9), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab5, 1, 7)});

		this.RemoveSubBlockRecipes(Block.sandStone, 32767, 0, FCBetterThanWolves.fcBlockSandstoneSidingAndCorner, FCBetterThanWolves.fcBlockSandstoneMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 0, FCBetterThanWolves.fcBlockSandstoneSidingAndCorner, FCBetterThanWolves.fcBlockSandstoneMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 2, DecoDefs.sandStoneSmoothSidingAndCorner, DecoDefs.sandStoneSmoothMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 3, DecoDefs.sandStonePolishedSidingAndCorner, DecoDefs.sandStonePolishedMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 4, DecoDefs.sandStoneBrickSidingAndCorner, DecoDefs.sandStoneBrickMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 5, DecoDefs.sandStoneMossySidingAndCorner, DecoDefs.sandStoneMossyMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 6, DecoDefs.sandStoneBrickLargeSidingAndCorner, DecoDefs.sandStoneBrickLargeMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 7, DecoDefs.sandStoneBrickLargeMossySidingAndCorner, DecoDefs.sandStoneBrickLargeMossyMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 8, DecoDefs.sandStoneCrackedSidingAndCorner, DecoDefs.sandStoneCrackedMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.sandStone, 9, DecoDefs.sandStoneBrickLargeCrackedSidingAndCorner, DecoDefs.sandStoneBrickLargeCrackedMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 0, DecoDefs.redSandStoneSidingAndCorner, DecoDefs.redSandStoneMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 2, DecoDefs.redSandStoneSmoothSidingAndCorner, DecoDefs.redSandStoneSmoothMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 3, DecoDefs.redSandStonePolishedSidingAndCorner, DecoDefs.redSandStonePolishedMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 4, DecoDefs.redSandStoneBrickSidingAndCorner, DecoDefs.redSandStoneBrickMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 5, DecoDefs.redSandStoneMossySidingAndCorner, DecoDefs.redSandStoneMossyMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 6, DecoDefs.redSandStoneBrickLargeSidingAndCorner, DecoDefs.redSandStoneBrickLargeMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 7, DecoDefs.redSandStoneBrickLargeMossySidingAndCorner, DecoDefs.redSandStoneBrickLargeMossyMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 8, DecoDefs.redSandStoneCrackedSidingAndCorner, DecoDefs.redSandStoneCrackedMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.redSandStone, 9, DecoDefs.redSandStoneBrickLargeCrackedSidingAndCorner, DecoDefs.redSandStoneBrickLargeCrackedMouldingAndDecorative, true);

		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.stairsSandStone, 4), new Object[] {"#  ", "## ", "###", '#', Block.sandStone});
		FCRecipes.AddRecipe(new ItemStack(Block.stairsSandStone, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneSmoothStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.sandStoneSmoothMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneSmoothStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStonePolishedStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.sandStonePolishedMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStonePolishedStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneBrickStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.sandStoneBrickMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneBrickStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneMossyStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.sandStoneMossyMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneMossyStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneBrickLargeStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.sandStoneBrickLargeMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneBrickLargeStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneBrickLargeMossyStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.sandStoneBrickLargeMossyMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneBrickLargeMossyStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 7)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneCrackedStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.sandStoneCrackedMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneCrackedStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 8)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneBrickLargeCrackedStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.sandStoneBrickLargeCrackedMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.sandStoneBrickLargeCrackedStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.sandStone, 1, 9)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStoneMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneSmoothStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStoneSmoothMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneSmoothStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStonePolishedStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStonePolishedMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStonePolishedStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneBrickStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStoneBrickMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneBrickStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneMossyStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStoneMossyMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneMossyStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneBrickLargeStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStoneBrickLargeMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneBrickLargeStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneBrickLargeMossyStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStoneMossyMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneBrickLargeMossyStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 7)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneCrackedStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStoneCrackedMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneCrackedStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 8)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneBrickLargeCrackedStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.redSandStoneBrickLargeCrackedMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.redSandStoneBrickLargeCrackedStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(DecoDefs.redSandStone, 1, 9)});

		//Stone chiseling
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.sandStone, 1, 1), new Object[] {"#", "#", '#', new ItemStack(Block.stoneSingleSlab, 1, 1)});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.blockNetherQuartz, 1, 1), new Object[] {"#", "#", '#', new ItemStack(Block.stoneSingleSlab, 1, 7)});
		FCRecipes.RemoveAnvilRecipe(new ItemStack(Block.stoneBrick, 12, 3), new Object[] {"####", "#  #", "#  #", "####", '#', Block.stoneBrick});

		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.whiteStoneBrick, 1, 3), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.whiteStoneBrick, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.whiteStoneBrick, 1, 3), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.whiteStoneBrick, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.redSandStone, 1, 1), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.redSandStone, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.redSandStone, 1, 1), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.redSandStone, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.stoneBrick, 1, 3), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(Block.stoneBrick, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.stoneBrick, 1, 3), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(Block.stoneBrick, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.blockNetherQuartz, 1, 1), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(Block.blockNetherQuartz, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.blockNetherQuartz, 1, 1), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(Block.blockNetherQuartz, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.sandStone, 1, 1), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(Block.sandStone, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.sandStone, 1, 1), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(Block.sandStone, 1, 0)});

		FCRecipes.AddRecipe(new ItemStack(Block.sandStone), new Object[] {"X", "X", 'X', new ItemStack(Block.stoneSingleSlab, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(Block.blockNetherQuartz), new Object[] {"X", "X", 'X', new ItemStack(Block.stoneSingleSlab, 1, 7)});

		//Prismarine
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarine, 1, 0), new Object[] {"XX", "XX", 'X', DecoDefs.prismarineShard});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarine, 4, 1), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.prismarine, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarine, 2, 2), new Object[] {"XXX", "X#X", "XXX", 'X', DecoDefs.prismarineShard, '#', new ItemStack(Item.dyePowder, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarine, 2, 2), new Object[] {"XXX", "X#X", "XXX", 'X', DecoDefs.prismarineShard, '#', new ItemStack(Item.dyePowder, 1, 16)});
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.prismarine, 0, DecoDefs.prismarineSidingAndCorner, DecoDefs.prismarineMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.prismarine, 1, DecoDefs.prismarineBrickSidingAndCorner, DecoDefs.prismarineBrickMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.prismarine, 2, DecoDefs.prismarineDarkSidingAndCorner, DecoDefs.prismarineDarkMouldingAndDecorative, true);
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarineStairs,  4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.prismarine, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarineBrickStairs,  4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.prismarine, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarineDarkStairs,  4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.prismarine, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarineStairs), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.prismarineMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarineBrickStairs), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.prismarineBrickMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarineDarkStairs), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.prismarineDarkMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab, 6, 1), new Object[] {"###", '#', new ItemStack(DecoDefs.prismarine, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab, 6, 2), new Object[] {"###", '#', new ItemStack(DecoDefs.prismarine, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab, 6, 3), new Object[] {"###", '#', new ItemStack(DecoDefs.prismarine, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarine, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarine, 1, 1), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarine, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab, 1, 3)});

		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.prismarineCrystal), new ItemStack[] {new ItemStack(DecoDefs.prismarineShard), new ItemStack(Item.lightStoneDust)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.prismarineLantern), new Object[] {"XXX", "X#X", "XXX", 'X', DecoDefs.prismarineShard, '#', new ItemStack(DecoDefs.prismarineCrystal)});

		//Nether Brick
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.netherBrickRedLoose), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemNetherBrick), new ItemStack(FCBetterThanWolves.fcItemNetherBrick), new ItemStack(FCBetterThanWolves.fcItemNetherBrick), new ItemStack(FCBetterThanWolves.fcItemNetherBrick), new ItemStack(FCBetterThanWolves.fcItemNetherBrick), new ItemStack(FCBetterThanWolves.fcItemNetherBrick), new ItemStack(FCBetterThanWolves.fcItemNetherBrick), new ItemStack(FCBetterThanWolves.fcItemNetherBrick), new ItemStack(FCBetterThanWolves.fcItemHellfireDust)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.netherBrickRedLooseStairs, 4), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.netherBrickRedLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.netherBrickRedLooseStairs, 8), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.netherBrickRedLoose)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.netherBrickRedLooseSlab, 4), new Object[] {"XX", 'X', new ItemStack(DecoDefs.netherBrickRedLoose)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.netherBrick, 1, 1), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.netherBrick, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.netherBrick, 1, 1), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.netherBrick, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.netherBrick, 1, 2), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(Block.netherBrick, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.netherBrick, 1, 2), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(Block.netherBrick, 1, 0)});
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.netherBrick, 0, DecoDefs.netherBrickRedSidingAndCorner, DecoDefs.netherBrickRedMouldingAndDecorative, true);
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.netherBrickRedStairs, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.netherBrick, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.netherBrickRedStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.netherBrickRedMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab, 6, 7), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.netherBrick)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.netherBrick, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab, 1, 7)});

		//Basalt
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.basalt, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.basalt, 1, 0)});

		//Infused Stone
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.infusedStone, 1, 0), new ItemStack[] {new ItemStack(DecoDefs.basalt, 1, 0), new ItemStack(FCBetterThanWolves.fcItemSoulFlux)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.infusedStone, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.infusedStone, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStone, 1, 2), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.infusedStone, 1, 1)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.infusedStone, 1, 3), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.infusedStone, 1, 1)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.infusedStone, 1, 3), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.infusedStone, 1, 1)});
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.infusedStone, 0, DecoDefs.infusedStoneSidingAndCorner, DecoDefs.infusedStoneMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.infusedStone, 1, DecoDefs.infusedStoneSmoothSidingAndCorner, DecoDefs.infusedStoneSmoothMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.infusedStone, 2, DecoDefs.infusedStoneBrickSidingAndCorner, DecoDefs.infusedStoneBrickMouldingAndDecorative, true);
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab3, 6, 4), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.infusedStone)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStone, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab3, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab3, 6, 5), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.infusedStone, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStone, 1, 1), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab3, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab3, 6, 6), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.infusedStone, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStone, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab3, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStoneStairs, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.infusedStone, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStoneStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.infusedStoneMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStoneSmoothStairs, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.infusedStone, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStoneSmoothStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.infusedStoneSmoothMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStoneBrickStairs, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.infusedStone, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.infusedStoneBrickStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.infusedStoneBrickMouldingAndDecorative, 1, 0)});

		//Polished Stone
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.polishedStone), new ItemStack[] {new ItemStack(Block.stone)});
		FCRecipes.AddRecipe(new ItemStack(Block.stoneSingleSlab, 6, 0), new Object[] {"###", '#', new ItemStack(DecoDefs.polishedStone)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.polishedStone, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(Block.stoneSingleSlab, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.polishedStoneStairs, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.polishedStone, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.polishedStoneStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.polishedStoneMouldingAndDecorative, 1, 0)});
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.polishedStone, 0, DecoDefs.polishedStoneSidingAndCorner, DecoDefs.polishedStoneMouldingAndDecorative, true);

		//Concrete
		for (int i = 0; i < 32; i++)
		{
			FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.concretePowder,8,i % 16), new ItemStack[]{new ItemStack(Item.dyePowder,1,i),new ItemStack(Block.sand, 4), new ItemStack(Block.gravel, 4)});
			FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.concretePowder,8,i % 16), new ItemStack[]{new ItemStack(Item.dyePowder,1,i),new ItemStack(DecoDefs.redSand, 4), new ItemStack(Block.gravel, 4)});

			if (i < 16) { 
				FCRecipes.AddSubBlockRecipesOfType(DecoDefs.concrete, i, DecoDefs.concreteSidingAndCorner[i], DecoDefs.concreteMouldingAndDecorative[i], true);
				FCRecipes.AddRecipe(new ItemStack(DecoDefs.concreteStairs[i], 4, 0), new Object[]{"#  ","## ","###",'#',new ItemStack(DecoDefs.concrete, 1, i)});
				FCRecipes.AddRecipe(new ItemStack(DecoDefs.concreteStairs[i], 1, 0), new Object[]{"# ","##",'#',new ItemStack(DecoDefs.concreteMouldingAndDecorative[i], 1, 0)});
			}
		}

		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.concretePowder, 8, 3), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemDung), new ItemStack(Block.sand, 4), new ItemStack(Block.gravel, 4)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(DecoDefs.concretePowder, 8, 3), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemDung), new ItemStack(DecoDefs.redSand, 4), new ItemStack(Block.gravel, 4)});

		for (int i = 0; i < 8; i++) {
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.concreteSlab, 6, i), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.concrete, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.concreteSlab2, 6, i), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.concrete, 1, i + 8)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.concrete, 1, i), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.concreteSlab, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.concrete, 1, i + 8), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.concreteSlab2, 1, i)});
		}

		//End Stone Brick
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.endStoneBrick, 4), new Object[] {"XX", "XX", 'X', new ItemStack(Block.whiteStone)});
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.endStoneBrick, 0, DecoDefs.endStoneBrickSidingAndCorner, DecoDefs.endStoneBrickMouldingAndDecorative, true);
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.endStoneBrickStairs, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.endStoneBrick, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.endStoneBrickStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.endStoneBrickMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab6, 6, 2), new Object[] {"###", '#', new ItemStack(DecoDefs.endStoneBrick, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.endStoneBrick, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab6, 1, 2)});

		//Obsidian
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.obsidian, 1, 1), new ItemStack[] {new ItemStack(Block.obsidian, 1, 0), new ItemStack(FCBetterThanWolves.fcItemSoulFlux)});

		//Misc Subblocks
		FCRecipes.AddSubBlockRecipesOfType(Block.cobblestone, 0, DecoDefs.cobblestoneSidingAndCorner, DecoDefs.cobblestoneMouldingAndDecorative, false);
		FCRecipes.AddSubBlockRecipesOfType(Block.cobblestoneMossy, 0, DecoDefs.mossyCobblestoneSidingAndCorner, DecoDefs.mossyCobblestoneMouldingAndDecorative, false);
		FCRecipes.AddSubBlockRecipesOfType(Block.stoneBrick, 1, DecoDefs.stoneBrickMossySidingAndCorner, DecoDefs.stoneBrickMossyMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(Block.stoneBrick, 2, DecoDefs.stoneBrickCrackedSidingAndCorner, DecoDefs.stoneBrickCrackedMouldingAndDecorative, true);
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab, 6, 4), new Object[] {"###", '#', new ItemStack(FCBetterThanWolves.fcAestheticOpaque, 1, 9)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab, 6, 6), new Object[] {"###", '#', new ItemStack(Block.cobblestoneMossy)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcAestheticOpaque, 1, 9), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(Block.cobblestoneMossy, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(Block.stairsCobblestone), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.cobblestoneMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.mossyCobblestoneStairs), new Object[] {"# ", "##", '#', new ItemStack(DecoDefs.mossyCobblestoneMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.mossyCobblestoneStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Block.cobblestoneMossy)});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.stoneSingleSlab, 6, 0), new Object[] {"###", '#', Block.stone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab3, 6, 7), new Object[] {"###", '#', new ItemStack(Block.stone)});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.stoneSingleSlab, 6, 5), new Object[] {"###", '#', Block.stoneBrick});
		FCRecipes.AddRecipe(new ItemStack(Block.stoneSingleSlab, 6, 5), new Object[] {"###", '#', new ItemStack(Block.stoneBrick, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab6, 6, 0), new Object[] {"###", '#', new ItemStack(Block.stoneBrick, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneSlab6, 6, 1), new Object[] {"###", '#', new ItemStack(Block.stoneBrick, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(Block.stone, 1, 0), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab3, 1, 7)});
		FCRecipes.AddRecipe(new ItemStack(Block.stoneBrick, 1, 1), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab6, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(Block.stoneBrick, 1, 2), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.stoneSlab6, 1, 1)});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.stairsStoneBrick, 4), new Object[] {"#  ", "## ", "###", '#', Block.stoneBrick});
		FCRecipes.AddRecipe(new ItemStack(Block.stairsStoneBrick, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(Block.stoneBrick, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneBrickMossyStairs, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(Block.stoneBrick, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneBrickMossyStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.stoneBrickMossyMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneBrickCrackedStairs, 4), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(Block.stoneBrick, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.stoneBrickCrackedStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.stoneBrickCrackedMouldingAndDecorative, 1, 0)});
	}

	private void addWoodRecipes() {
		//Logs
		for (int i = 0; i < 4; i++) {
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.strippedLog, 1, i), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(Block.wood, 1, i)});
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.strippedLog, 1, i), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(Block.wood, 1, i)});
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.barkLogStripped, 1, i), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.barkLog, 1, i)});
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.barkLogStripped, 1, i), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.barkLog, 1, i)});

			FCRecipes.AddRecipe(new ItemStack(DecoDefs.barkLog, 4, i), new Object[] {"XX", "XX", 'X', new ItemStack(Block.wood, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.barkLogStripped, 4, i), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.strippedLog, 1, i)});
		}

		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.bloodLog, 1, 0), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(FCBetterThanWolves.fcBloodWood, 1)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.bloodLog, 1, 0), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(FCBetterThanWolves.fcBloodWood, 1)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.bloodLog, 1, 2), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.bloodLog, 1, 1)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.bloodLog, 1, 2), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.bloodLog, 1, 1)});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.bloodLog, 4, 1), new Object[] {"XX", "XX", 'X', new ItemStack(FCBetterThanWolves.fcBloodWood)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.bloodLog, 4, 2), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.bloodLog, 1, 0)});
		
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.cherryLog, 1, 1), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.cherryLog, 1, 0)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.cherryLog, 1, 1), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.cherryLog, 1, 0)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.cherryLog, 1, 3), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.cherryLog, 1, 2)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.cherryLog, 1, 3), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.cherryLog, 1, 2)});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.cherryLog, 4, 2), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.cherryLog, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.cherryLog, 4, 3), new Object[] {"XX", "XX", 'X', new ItemStack(DecoDefs.cherryLog, 1, 1)});
		
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.acaciaLog, 1, 1), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.acaciaLog, 1, 0)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.acaciaLog, 1, 1), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.acaciaLog, 1, 0)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.acaciaLog, 1, 3), new Object[] {new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767), new ItemStack(DecoDefs.acaciaLog, 1, 2)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoDefs.acaciaLog, 1, 3), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(DecoDefs.acaciaLog, 1, 2)});
		
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemPotash), new ItemStack[] {new ItemStack(DecoDefs.barkLog)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemPotash), new ItemStack[] {new ItemStack(DecoDefs.strippedLog)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemPotash), new ItemStack[] {new ItemStack(DecoDefs.barkLogStripped)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemPotash), new ItemStack[] {new ItemStack(DecoDefs.bloodLog)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemPotash), new ItemStack[] {new ItemStack(DecoDefs.cherryLog)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemPotash), new ItemStack[] {new ItemStack(DecoDefs.acaciaLog)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemPotash), new ItemStack[] {new ItemStack(DecoDefs.planksPainted, 6)});

		//Cherry Sub
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingDecorativeItemStubID, 6, FCItemBlockWoodMouldingDecorativeStub.GetItemDamageForType(5, 1)), new Object[] {" S ", "###", "###", '#', new ItemStack(Block.planks, 1, 5), 'S', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingDecorativeItemStubID, 1, FCItemBlockWoodMouldingDecorativeStub.GetItemDamageForType(5, 0)), new Object[] {"M", "M", "M", 'M', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingDecorativeItemStubID, 4, FCItemBlockWoodMouldingDecorativeStub.GetItemDamageForType(5, 2)), new Object[] {"###", " X ", " X ", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodSidingDecorativeItemStubID, 4, FCItemBlockWoodSidingDecorativeStub.GetItemDamageForType(5, 0)), new Object[] {"###", " X ", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodSidingDecorativeItemStubID, 6, FCItemBlockWoodSidingDecorativeStub.GetItemDamageForType(5, 1)), new Object[] {"###", "###", '#', new ItemStack(Block.planks, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodSidingDecorativeItemStubID, 2, FCItemBlockWoodSidingDecorativeStub.GetItemDamageForType(5, 1)), new Object[] {"###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.planks, 1, 5), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5), new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5), new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 5), new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.cherryStairs, 6), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(Block.planks, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.cherryStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.woodSlab, 6, 0), new Object[] {"###", '#', new ItemStack(Block.planks, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(Block.planks, 1, 5), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.woodSlab, 1, 0)});
		
		//Acacia Sub
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingDecorativeItemStubID, 6, FCItemBlockWoodMouldingDecorativeStub.GetItemDamageForType(6, 1)), new Object[] {" S ", "###", "###", '#', new ItemStack(Block.planks, 1, 5), 'S', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingDecorativeItemStubID, 1, FCItemBlockWoodMouldingDecorativeStub.GetItemDamageForType(6, 0)), new Object[] {"M", "M", "M", 'M', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingDecorativeItemStubID, 4, FCItemBlockWoodMouldingDecorativeStub.GetItemDamageForType(6, 2)), new Object[] {"###", " X ", " X ", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodSidingDecorativeItemStubID, 4, FCItemBlockWoodSidingDecorativeStub.GetItemDamageForType(6, 0)), new Object[] {"###", " X ", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodSidingDecorativeItemStubID, 6, FCItemBlockWoodSidingDecorativeStub.GetItemDamageForType(6, 1)), new Object[] {"###", "###", '#', new ItemStack(Block.planks, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodSidingDecorativeItemStubID, 2, FCItemBlockWoodSidingDecorativeStub.GetItemDamageForType(6, 1)), new Object[] {"###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Block.planks, 1, 6), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6), new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6), new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 6), new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.acaciaStairs, 6), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(Block.planks, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.acaciaStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.woodSlab, 6, 1), new Object[] {"###", '#', new ItemStack(Block.planks, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(Block.planks, 1, 6), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.woodSlab, 1, 1)});

		//Trapdoors
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.trapdoor, 1), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', Block.planks});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.trapdoor, 2), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 32767)});

		FCRecipes.AddRecipe(new ItemStack(Block.trapdoor, 1), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(Block.trapdoor, 2), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorSpruce, 1), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorSpruce, 2), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorBirch, 1), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorBirch, 2), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorJungle, 1), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorJungle, 2), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorBlood, 1), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorBlood, 2), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorCherry, 1), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorCherry, 2), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorAcacia, 1), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorAcacia, 2), new Object[] {"WW#", "WW#", '#', Item.stick, 'W', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6)});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.trapdoorIron, 2), new Object[] {"WW#", "WW#", '#', FCBetterThanWolves.fcItemRedstoneLatch, 'W', Item.ingotIron});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemNuggetIron, 12), new ItemStack(Item.goldNugget, 2)}, new ItemStack[] {new ItemStack(DecoDefs.trapdoorIron)});

		//Doors
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Item.doorWood, 1), new Object[] {"##", "##", "##", '#', Block.planks});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Item.doorWood, 1), new Object[] {"##", "##", "##", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 32767)});

		FCRecipes.AddRecipe(new ItemStack(Item.doorWood, 1), new Object[] {"##", "##", "##", '#', new ItemStack(Block.planks, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(Item.doorWood, 1), new Object[] {"##", "##", "##", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorSpruce, 1), new Object[] {"##", "##", "##", '#', new ItemStack(Block.planks, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorSpruce, 1), new Object[] {"##", "##", "##", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorBirch, 1), new Object[] {"##", "##", "##", '#', new ItemStack(Block.planks, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorBirch, 1), new Object[] {"##", "##", "##", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorJungle, 1), new Object[] {"##", "##", "##", '#', new ItemStack(Block.planks, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorJungle, 1), new Object[] {"##", "##", "##", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorBlood, 1), new Object[] {"##", "##", "##", '#', new ItemStack(Block.planks, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorBlood, 1), new Object[] {"##", "##", "##", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorCherry, 1), new Object[] {"##", "##", "##", '#', new ItemStack(Block.planks, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorCherry, 1), new Object[] {"##", "##", "##", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorAcacia, 1), new Object[] {"##", "##", "##", '#', new ItemStack(Block.planks, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.itemDoorAcacia, 1), new Object[] {"##", "##", "##", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6)});

		//Fence Gates
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.fenceGate, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', Block.planks});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.fenceGate, 1), new Object[] {"#X#", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 32767), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 32767)});

		FCRecipes.AddRecipe(new ItemStack(Block.fenceGate, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(Block.fenceGate, 1), new Object[] {"#X#", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 0), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateSpruce, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateSpruce, 1), new Object[] {"#X#", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 1), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateBirch, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateBirch, 1), new Object[] {"#X#", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 2), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateJungle, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateJungle, 1), new Object[] {"#X#", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 3), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateBlood, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateBlood, 1), new Object[] {"#X#", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 4), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 4)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateCherry, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateCherry, 1), new Object[] {"#X#", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 5)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateAcacia, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', new ItemStack(Block.planks, 1, 6)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.gateAcacia, 1), new Object[] {"#X#", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 6), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 6)});

		//Painted Planks
		for (int Index = 0; Index < 32; Index++)
		{
			FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.planksPainted,8,Index % 16), new ItemStack[]{new ItemStack(Item.dyePowder,1,Index),new ItemStack(Block.planks, 8, 32767)});
		}

		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.planksPainted, 8, 3), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemDung), new ItemStack(Block.planks, 8, 32767)});

		for (int i = 0; i < 16; i++) {
			FCRecipes.AddCauldronRecipe(new ItemStack(Block.planks,  8), new ItemStack[] {new ItemStack(DecoDefs.woodBleach), new ItemStack(DecoDefs.planksPainted, 8, i)});

			//Sub blocks
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 12), new Object[] {"M", "M", "M", 'M', new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 6, 13), new Object[] {" S ", "###", "###", '#', new ItemStack(DecoDefs.planksPainted, 1, i), 'S', new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 8, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 4, 15), new Object[] {"###", " X ", " X ", '#', new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 1, 0), 'X', new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 4, 12), new Object[] {"###", " X ", '#', new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 1, 0), 'X', new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 0)});

			//Fences
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 2, 14), new Object[] {"###", "###", '#', new ItemStack(DecoDefs.planksPainted, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 2, 14), new Object[] {"###", '#', new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 0)});

			FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.planksPainted, 1, i), new Object[] {new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 1, 0), new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 1, 0)});
			FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 1, 0), new Object[] {new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 0), new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 0)});
			FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 0), new Object[] {new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 1, 1), new ItemStack(DecoDefs.paintedPlanksSidingAndCorner[i], 1, 1)});

			//Stairs
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.paintedPlanksStairs[i], 4, 0), new Object[]{"#  ","## ","###",'#',new ItemStack(DecoDefs.planksPainted, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.paintedPlanksStairs[i], 1, 0), new Object[]{"# ","##",'#',new ItemStack(DecoDefs.paintedPlanksMouldingAndDecorative[i], 1, 0)});
		}

		for (int i = 0; i < 8; i++) {
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.planksPaintedSlab, 6, i), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.planksPainted, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.planksPaintedSlab2, 6, i), new Object[] {"XXX", 'X', new ItemStack(DecoDefs.planksPainted, 1, i + 8)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.planksPainted, 1, i), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.planksPaintedSlab, 1, i)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.planksPainted, 1, i + 8), new Object[] {"X", "X", 'X', new ItemStack(DecoDefs.planksPaintedSlab2, 1, i)});
		}

		//Pergola
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.pergola), new Object[] {" X ", "X X", " X ", 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 32767)});

		//Wood bleach and stain
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.bottleHempOil,1), new ItemStack[]{new ItemStack(Item.glassBottle), new ItemStack(FCBetterThanWolves.fcItemHempSeeds)});

		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.woodBleach), new ItemStack[] {new ItemStack(DecoDefs.bottleHempOil), new ItemStack(Item.dyePowder, 1, 15)});
		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.woodBleach), new ItemStack[] {new ItemStack(DecoDefs.bottleHempOil), new ItemStack(Item.dyePowder, 1, 31)});
		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.woodStain), new ItemStack[] {new ItemStack(DecoDefs.bottleHempOil), new ItemStack(Item.dyePowder, 1, 0)});
		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.woodStain), new ItemStack[] {new ItemStack(DecoDefs.bottleHempOil), new ItemStack(Item.dyePowder, 1, 16)});

		FCRecipes.AddCauldronRecipe(new ItemStack(Block.planks, 8, 2), new ItemStack[] {new ItemStack(DecoDefs.woodBleach), new ItemStack(Block.planks, 8, 0)});
		FCRecipes.AddCauldronRecipe(new ItemStack(Block.planks, 8, 0), new ItemStack[] {new ItemStack(DecoDefs.woodBleach), new ItemStack(Block.planks, 8, 1)});
		FCRecipes.AddCauldronRecipe(new ItemStack(Block.planks, 8, 1), new ItemStack[] {new ItemStack(DecoDefs.woodBleach), new ItemStack(Block.planks, 8, 5)});

		FCRecipes.AddCauldronRecipe(new ItemStack(Block.planks, 8, 0), new ItemStack[] {new ItemStack(DecoDefs.woodStain), new ItemStack(Block.planks, 8, 2)});
		FCRecipes.AddCauldronRecipe(new ItemStack(Block.planks, 8, 1), new ItemStack[] {new ItemStack(DecoDefs.woodStain), new ItemStack(Block.planks, 8, 0)});
		FCRecipes.AddCauldronRecipe(new ItemStack(Block.planks, 8, 5), new ItemStack[] {new ItemStack(DecoDefs.woodStain), new ItemStack(Block.planks, 8, 1)});

		//Barrels
		FCRecipes.RemoveVanillaRecipe(new ItemStack(FCBetterThanWolves.fcAestheticOpaque, 2, 11), new Object[] {"###", "#X#", "###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 32767), 'X', FCBetterThanWolves.fcItemGlue});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.barrelEmpty, 1, 1), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcAestheticOpaque, 1, 11)});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelEmpty, 2, 0), new Object[] {"###", "#X#", "###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 0), 'X', FCBetterThanWolves.fcItemGlue});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelEmpty, 2, 1), new Object[] {"###", "#X#", "###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 1), 'X', FCBetterThanWolves.fcItemGlue});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelEmpty, 2, 2), new Object[] {"###", "#X#", "###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 2), 'X', FCBetterThanWolves.fcItemGlue});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelEmpty, 2, 3), new Object[] {"###", "#X#", "###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 3), 'X', FCBetterThanWolves.fcItemGlue});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelEmpty2, 2, 0), new Object[] {"###", "#X#", "###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 4), 'X', FCBetterThanWolves.fcItemGlue});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelEmpty2, 2, 1), new Object[] {"###", "#X#", "###", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 5), 'X', FCBetterThanWolves.fcItemGlue});

		for (int i = 0; i < DecoBlockBarrelFilled.types.length; i++) {
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelFullOak, 1, i), new Object[] {"###", "#X#", "###", '#', new ItemStack(DecoBlockBarrelFilled.types[i], 1, 0), 'X', new ItemStack(DecoDefs.barrelEmpty, 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelFullSpruce, 1, i), new Object[] {"###", "#X#", "###", '#', new ItemStack(DecoBlockBarrelFilled.types[i], 1, 0), 'X', new ItemStack(DecoDefs.barrelEmpty, 1, 1)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelFullBirch, 1, i), new Object[] {"###", "#X#", "###", '#', new ItemStack(DecoBlockBarrelFilled.types[i], 1, 0), 'X', new ItemStack(DecoDefs.barrelEmpty, 1, 2)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelFullJungle, 1, i), new Object[] {"###", "#X#", "###", '#', new ItemStack(DecoBlockBarrelFilled.types[i], 1, 0), 'X', new ItemStack(DecoDefs.barrelEmpty, 1, 3)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelFullBlood, 1, i), new Object[] {"###", "#X#", "###", '#', new ItemStack(DecoBlockBarrelFilled.types[i], 1, 0), 'X', new ItemStack(DecoDefs.barrelEmpty2, 1, 0)});
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.barrelFullCherry, 1, i), new Object[] {"###", "#X#", "###", '#', new ItemStack(DecoBlockBarrelFilled.types[i], 1, 0), 'X', new ItemStack(DecoDefs.barrelEmpty2, 1, 1)});

			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoBlockBarrelFilled.types[i], 8), new ItemStack[] {new ItemStack(DecoDefs.barrelFullOak, 1, i)});
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoBlockBarrelFilled.types[i], 8), new ItemStack[] {new ItemStack(DecoDefs.barrelFullSpruce, 1, i)});
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoBlockBarrelFilled.types[i], 8), new ItemStack[] {new ItemStack(DecoDefs.barrelFullBirch, 1, i)});
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoBlockBarrelFilled.types[i], 8), new ItemStack[] {new ItemStack(DecoDefs.barrelFullJungle, 1, i)});
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoBlockBarrelFilled.types[i], 8), new ItemStack[] {new ItemStack(DecoDefs.barrelFullBlood, 1, i)});
			FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(DecoBlockBarrelFilled.types[i], 8), new ItemStack[] {new ItemStack(DecoDefs.barrelFullCherry, 1, i)});
		}

		FCRecipes.AddRecipe(new ItemStack(Block.tnt, 1), new Object[] {"GFG", "GBG", "GGG", 'B', new ItemStack(DecoDefs.barrelEmpty, 1, 32767), 'G', Item.gunpowder, 'F', FCBetterThanWolves.fcItemFuse});
		FCRecipes.AddRecipe(new ItemStack(Block.tnt, 1), new Object[] {"GFG", "GBG", "GGG", 'B', new ItemStack(DecoDefs.barrelEmpty2, 1, 32767), 'G', Item.gunpowder, 'F', FCBetterThanWolves.fcItemFuse});

		//Crates
		for (int i = 0; i < 6; i++) {
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.crate, 2, i), new Object[] {" # ", "#X#", " # ", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, i), 'X', FCBetterThanWolves.fcItemGlue});
		}

		//Signs
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Item.sign, 3), new Object[] {"###", "###", " X ", '#', Block.planks, 'X', Item.stick});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Item.sign, 3), new Object[] {"#", "X", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, 32767), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 32767)});

		for (int i = 0; i < 6; i++) {
			FCRecipes.AddRecipe(new ItemStack(Item.sign, 3, i), new Object[] {"###", "###", " X ", '#', new ItemStack(Block.planks, 1, i), 'X', Item.stick});
			FCRecipes.AddRecipe(new ItemStack(Item.sign, 3, i), new Object[] {"#", "X", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodSidingItemStubID, 1, i), 'X', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, i)});
		}
	}

	private void addDecoRecipes() {
		DecoManager.MakeStorage(FCBetterThanWolves.fcItemIngotDiamond, DecoDefs.blockDiamondium);

		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemWheat, 9), new ItemStack[]{new ItemStack(DecoDefs.hayBale)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hayBaleStairs, 8), new Object[] {"X  ", "XX ", "XXX", 'X', DecoDefs.hayBale});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemStraw, 9), new ItemStack[]{new ItemStack(DecoDefs.thatch)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.thatchStairs, 8), new Object[] {"X  ", "XX ", "XXX", 'X', DecoDefs.thatch});

		//Lanterns
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.paperWall, 4), new Object[] { "ppp", "pwp", "ppp", 'p', Item.paper, 'w', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 32767) });
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(FCBetterThanWolves.fcItemNuggetIron, 6), new ItemStack[] { new ItemStack(DecoDefs.fenceSteel, 1) });
		FCRecipes.AddAnvilRecipe(new ItemStack(DecoDefs.fenceSteel, 10), new Object[] { " X X", "XXXX", " X X", " X X", 'X', new ItemStack(Item.ingotIron) });

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.lanternPaper,1),new Object[]{"pwp","wcw","pwp",'c', new ItemStack(FCBetterThanWolves.fcItemCandle,1,32767), 'p', Item.paper, 'w', new ItemStack(FCBetterThanWolves.fcBlockWoodMouldingItemStubID, 1, 32767)});
		FCRecipes.AddAnvilRecipe(new ItemStack(DecoDefs.chandelier,2), new Object[]{" ss "," gg ","cggc","cggc",'s',Block.stone,'g',Item.goldNugget,'c', new ItemStack(FCBetterThanWolves.fcItemCandle,1,32767)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.lanternSteel,1),new Object[]{"nnn","ntn","nnn",'n',FCBetterThanWolves.fcItemNuggetIron,'t',FCBetterThanWolves.fcBlockTorchNetherBurning});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(FCBetterThanWolves.fcItemNuggetIron, 5), new ItemStack[]{new ItemStack(DecoDefs.lanternSteel,1)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack[] {new ItemStack(DecoDefs.chandelier)});

		//Paintings
		FCRecipes.RemoveVanillaRecipe(new ItemStack(Item.painting, 1), new Object[] {"###", "#X#", "###", '#', Item.stick, 'X', Block.cloth});
		FCRecipes.AddRecipe(new ItemStack(Item.painting, 1), new Object[] {"###", "#X#", "###", '#', Item.stick, 'X', new ItemStack(FCBetterThanWolves.fcItemWool, 1, 32767)});

		//Workbench
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.workbench), new Object[] {"XX","XX", 'X', Block.planks});

		//Wicker
		FCRecipes.AddAnvilRecipe(new ItemStack(FCBetterThanWolves.fcItemWickerPiece, 2), new Object[] {"X X ", " X X", "X X ", " X X", 'X', Item.reed});

		//Coarse Dirt
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.coarseDirt, 1), new ItemStack[] {new ItemStack(Block.dirt), new ItemStack(Block.gravel)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.coarseDirt), new Object[] {"X", "X", 'X', DecoDefs.coarseDirtSlab});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.coarseDirtSlab, 4), new Object[] {"XX", 'X', DecoDefs.coarseDirt});

		//Podzol
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.podzol, 9), new ItemStack[] {new ItemStack(Block.grass), new ItemStack(DecoDefs.coarseDirt), new ItemStack(DecoDefs.coarseDirt), new ItemStack(DecoDefs.coarseDirt), new ItemStack(DecoDefs.coarseDirt), new ItemStack(DecoDefs.coarseDirt), new ItemStack(DecoDefs.coarseDirt), new ItemStack(DecoDefs.coarseDirt), new ItemStack(DecoDefs.coarseDirt)});

		//Pumpkin
		FCRecipes.RemoveVanillaShapelessRecipe(new ItemStack(Block.pumpkin), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockPumpkinFresh)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(Block.pumpkin), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockPumpkinFresh), new ItemStack(FCBetterThanWolves.fcItemChiselWood, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack[] {new ItemStack(Block.pumpkin), new ItemStack(FCBetterThanWolves.fcItemChiselWood, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack(FCBetterThanWolves.fcItemChiselWood, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack(FCBetterThanWolves.fcItemChiselWood, 1, 32767)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(Block.pumpkin), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockPumpkinFresh), new ItemStack(FCBetterThanWolves.fcItemChiselStone, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack[] {new ItemStack(Block.pumpkin), new ItemStack(FCBetterThanWolves.fcItemChiselStone, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack(FCBetterThanWolves.fcItemChiselStone, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack(FCBetterThanWolves.fcItemChiselStone, 1, 32767)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(Block.pumpkin), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockPumpkinFresh), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack[] {new ItemStack(Block.pumpkin), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack(FCBetterThanWolves.fcItemChiselIron, 1, 32767)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(Block.pumpkin), new Object[] {new ItemStack(FCBetterThanWolves.fcBlockPumpkinFresh), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack[] {new ItemStack(Block.pumpkin), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkin, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});

		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkinLit, 1, 0), new Object[] {new ItemStack(DecoDefs.pumpkin, 1, 0), new ItemStack(FCBetterThanWolves.fcItemCandle, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkinLit, 1, 1), new Object[] {new ItemStack(DecoDefs.pumpkin, 1, 1), new ItemStack(FCBetterThanWolves.fcItemCandle, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.pumpkinLit, 1, 2), new Object[] {new ItemStack(DecoDefs.pumpkin, 1, 2), new ItemStack(FCBetterThanWolves.fcItemCandle, 1, 32767)});

		//Carpets
		for (int i = 0; i < 16; i++) {
			FCRecipes.AddRecipe(new ItemStack(DecoDefs.carpet, 1, i), new Object[] {"XXX", 'X', new ItemStack(FCBetterThanWolves.fcItemWool, 1, i)});

			if (i < 15) {
				FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.carpet, 12, i), new ItemStack[] {new ItemStack(DecoDefs.carpet, 12, 15), new ItemStack(Item.dyePowder, 1, i)});
				FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.carpet, 12, i), new ItemStack[] {new ItemStack(DecoDefs.carpet, 12, 15), new ItemStack(Item.dyePowder, 1, i + 16)});
				FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.carpet, 1, i), new ItemStack[] {new ItemStack(DecoDefs.carpet, 1, 15), new ItemStack(Item.dyePowder, 1, i)});
				FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.carpet, 1, i), new ItemStack[] {new ItemStack(DecoDefs.carpet, 1, 15), new ItemStack(Item.dyePowder, 1, i + 16)});
			}
		}

		//Coal Block
		DecoManager.MakeStorage(Item.coal, DecoDefs.coalBlock);
		DecoManager.MakeStorage(FCBetterThanWolves.fcItemNethercoal, DecoDefs.netherCoalBlock);

		//Bone Pillars
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.bonePillar, 2), new Object[] {"X", "X", 'X', new ItemStack(FCBetterThanWolves.fcAestheticOpaque, 1, 15)});
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.bone, 9), new ItemStack[] {new ItemStack(DecoDefs.bonePillar)});

		//Chains
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.chainItem, 1), new Object[] {"X", "X", "X", 'X', FCBetterThanWolves.fcItemNuggetIron});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(FCBetterThanWolves.fcItemNuggetIron, 2), new ItemStack[] {new ItemStack(DecoDefs.chainItem)});

		//Hedge
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.hedge, 1, 0), new ItemStack[] {new ItemStack(Block.leaves, 1, 0)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.hedge, 1, 1), new ItemStack[] {new ItemStack(Block.leaves, 1, 1)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.hedge, 1, 2), new ItemStack[] {new ItemStack(Block.leaves, 1, 2)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.hedge, 1, 3), new ItemStack[] {new ItemStack(Block.leaves, 1, 3)});

		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.hedge, 0, DecoDefs.hedgeOakSidingAndCorner, DecoDefs.hedgeOakMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.hedge, 1, DecoDefs.hedgeSpruceSidingAndCorner, DecoDefs.hedgeSpruceMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.hedge, 2, DecoDefs.hedgeBirchSidingAndCorner, DecoDefs.hedgeBirchMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.hedge, 3, DecoDefs.hedgeJungleSidingAndCorner, DecoDefs.hedgeJungleMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(FCBetterThanWolves.fcBlockBloodLeaves, 0, DecoDefs.hedgeBloodSidingAndCorner, DecoDefs.hedgeBloodMouldingAndDecorative, true);
		FCRecipes.AddSubBlockRecipesOfType(DecoDefs.cherryLeaves, 0, DecoDefs.hedgeCherrySidingAndCorner, DecoDefs.hedgeCherryMouldingAndDecorative, true);

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeOakStairs, 6), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.hedge, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeOakStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.hedgeOakMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeSpruceStairs, 6), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.hedge, 1, 1)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeSpruceStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.hedgeSpruceMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeBirchStairs, 6), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.hedge, 1, 2)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeBirchStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.hedgeBirchMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeJungleStairs, 6), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.hedge, 1, 3)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeJungleStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.hedgeJungleMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeBloodStairs, 6), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(FCBetterThanWolves.fcBlockBloodLeaves, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeBloodStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.hedgeBloodMouldingAndDecorative, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeCherryStairs, 6), new Object[] {"X  ", "XX ", "XXX", 'X', new ItemStack(DecoDefs.cherryLeaves, 1, 0)});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.hedgeCherryStairs, 1), new Object[] {"X ", "XX", 'X', new ItemStack(DecoDefs.hedgeCherryMouldingAndDecorative, 1, 0)});

		//Trees
		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.cherrySapling), new ItemStack[] {new ItemStack(Block.sapling, 1, 0), new ItemStack(DecoDefs.fertilizer, 1, 0), new ItemStack(Item.dyePowder, 1, 9)});
		FCRecipes.AddCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemTannedLeather, 1), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemDung, 1), new ItemStack(FCBetterThanWolves.fcItemScouredLeather, 1), new ItemStack(FCBetterThanWolves.fcItemBark, 3, 5)});
		FCRecipes.AddCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut, 2), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemDung, 1), new ItemStack(FCBetterThanWolves.fcItemScouredLeatherCut, 2), new ItemStack(FCBetterThanWolves.fcItemBark, 3, 5)});

		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.acaciaSapling), new ItemStack[] {new ItemStack(Block.sapling, 1, 0), new ItemStack(DecoDefs.fertilizer, 1, 0), new ItemStack(Item.dyePowder, 1, 8)});
		FCRecipes.AddCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemTannedLeather, 1), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemDung, 1), new ItemStack(FCBetterThanWolves.fcItemScouredLeather, 1), new ItemStack(FCBetterThanWolves.fcItemBark, 8, 6)});
		FCRecipes.AddCauldronRecipe(new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut, 2), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemDung, 1), new ItemStack(FCBetterThanWolves.fcItemScouredLeatherCut, 2), new ItemStack(FCBetterThanWolves.fcItemBark, 8, 6)});

		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.autumnSapling, 1, 0), new ItemStack[] {new ItemStack(Block.sapling, 1, 0), new ItemStack(DecoDefs.fertilizer, 1, 0), new ItemStack(Item.dyePowder, 1, 1)});
		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.autumnSapling, 1, 1), new ItemStack[] {new ItemStack(Block.sapling, 1, 0), new ItemStack(DecoDefs.fertilizer, 1, 0), new ItemStack(Item.dyePowder, 1, 14)});
		FCRecipes.AddCauldronRecipe(new ItemStack(DecoDefs.autumnSapling, 1, 2), new ItemStack[] {new ItemStack(Block.sapling, 1, 0), new ItemStack(DecoDefs.fertilizer, 1, 0), new ItemStack(Item.dyePowder, 1, 11)});

		//Candle dye
		for (int i = 0; i < 15; i++) {
			FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemCandle, 1, i), new Object[] {new ItemStack(Item.dyePowder, 1, i + 16), new ItemStack(FCBetterThanWolves.fcItemCandle, 1, 15)});
		}

		//Vase dye
		for (int i = 0; i < 15; i++) {
			FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcVase, 1, BlockCloth.getBlockFromDye(i)), new Object[] {new ItemStack(Item.dyePowder, 1, i + 16), new ItemStack(Item.itemsList[FCBetterThanWolves.fcVase.blockID], 1, 0)});
		}
		
		//Buttons
        FCRecipes.RemoveVanillaRecipe(new ItemStack(Block.woodenButton, 1), new Object[] {"#", "r", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 32767), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(Block.woodenButton), new Object[] {"#", "r", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 0), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonSpruce), new Object[] {"#", "r", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 1), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonBirch), new Object[] {"#", "r", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 2), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonJungle), new Object[] {"#", "r", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 3), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonBlood), new Object[] {"#", "r", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 4), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonCherry), new Object[] {"#", "r", '#', new ItemStack(FCBetterThanWolves.fcBlockWoodCornerItemStubID, 1, 5), 'r', Item.redstone});

		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonInfusedStone), new Object[] {"#", "r", '#', new ItemStack(DecoDefs.infusedStoneSidingAndCorner, 1, 1), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonGranite), new Object[] {"#", "r", '#', new ItemStack(DecoDefs.stoneTypesSidingAndCorner[0], 1, 1), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonAndesite), new Object[] {"#", "r", '#', new ItemStack(DecoDefs.stoneTypesSidingAndCorner[1], 1, 1), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonDiorite), new Object[] {"#", "r", '#', new ItemStack(DecoDefs.stoneTypesSidingAndCorner[2], 1, 1), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonSandstone), new Object[] {"#", "r", '#', new ItemStack(FCBetterThanWolves.fcBlockSandstoneSidingAndCorner, 1, 1), 'r', Item.redstone});
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.buttonRedSandstone), new Object[] {"#", "r", '#', new ItemStack(DecoDefs.redSandStoneSidingAndCorner, 1, 1), 'r', Item.redstone});
		
		//Rope and chain
       	FCRecipes.RemoveVanillaRecipe(new ItemStack(FCBetterThanWolves.fcAestheticOpaque, 1, 6), new Object[] {"###", "###", "###", '#', FCBetterThanWolves.fcItemRope});
       	DecoManager.MakeStorage(FCBetterThanWolves.fcItemRope, DecoDefs.ropeCoil);
       	DecoManager.MakeStorage(DecoDefs.chainItem, DecoDefs.chainCoil);
       	
       	//Spider eyes
       	FCRecipes.AddRecipe(new ItemStack(DecoDefs.spiderEyeSlab), new Object[] {"###", '#', DecoDefs.spiderEyeBlock});
       	FCRecipes.AddShapelessRecipe(new ItemStack(Item.spiderEye, 16), new ItemStack[] {new ItemStack(DecoDefs.spiderEyeBlock)});
       	FCRecipes.AddShapelessRecipe(new ItemStack(Item.spiderEye, 8), new ItemStack[] {new ItemStack(DecoDefs.spiderEyeSlab)});
	}
	
	private void addLayerRecipes() {
		addLayerRecipe(DecoDefs.layerDirt, FCBetterThanWolves.fcBlockDirtSlab, 0, Block.dirt, 0, FCBetterThanWolves.fcItemPileDirt, 0, true);
		addLayerRecipe(DecoDefs.layerGravel, FCBetterThanWolves.fcBlockSlabSandAndGravel, 1, Block.gravel, 0, FCBetterThanWolves.fcItemPileGravel, 0, true);
		addLayerRecipe(DecoDefs.layerSand, FCBetterThanWolves.fcBlockSlabSandAndGravel, 0, Block.sand, 0, FCBetterThanWolves.fcItemPileSand, 0, true);
	}

	private void addMortarRecipes() {
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.cobblestone), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.cobblestone), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.cobblestone), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsCobblestone), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLooseStairs), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsCobblestone), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLooseStairs), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsCobblestone), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLooseStairs), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 3), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLooseSlab), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 3), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLooseSlab), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 3), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockCobblestoneLooseSlab), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsStoneBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLooseStairs), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsStoneBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLooseStairs), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsStoneBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLooseStairs), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 5), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLooseSlab), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 5), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLooseSlab), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 5), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLooseSlab), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.brick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.brick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.brick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLooseStairs), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLooseStairs), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLooseStairs), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 4), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLooseStairs), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 4), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLooseStairs), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 4), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockBrickLooseStairs), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.netherBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.netherBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.netherBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsNetherBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLooseStairs), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsNetherBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLooseStairs), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stairsNetherBrick), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLooseStairs), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 6), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLooseSlab), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 6), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLooseSlab), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(Block.stoneSingleSlab, 1, 6), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcBlockNetherBrickLooseSlab), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.netherBrick), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.netherBrick), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.netherBrick), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.netherBrickRedStairs), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLooseStairs), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.netherBrickRedStairs), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLooseStairs), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.netherBrickRedStairs), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLooseStairs), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab, 1, 7), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLooseSlab), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab, 1, 7), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLooseSlab), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab, 1, 7), new ItemStack[] {new ItemStack(DecoDefs.netherBrickRedLooseSlab), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble), new ItemStack[] {new ItemStack(DecoDefs.graniteCobbleLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble), new ItemStack[] {new ItemStack(DecoDefs.graniteCobbleLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble), new ItemStack[] {new ItemStack(DecoDefs.graniteCobbleLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[0]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[0]), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[0]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[0]), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[0]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[0]), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab2, 1, 6), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 0), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab2, 1, 6), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 0), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab2, 1, 6), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 0), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.andesiteCobbleLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.andesiteCobbleLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.andesiteCobbleLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[1]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[1]), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[1]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[1]), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[1]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[1]), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab2, 1, 7), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 1), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab2, 1, 7), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 1), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab2, 1, 7), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 1), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.dioriteCobbleLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.dioriteCobbleLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobble, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.dioriteCobbleLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[2]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[2]), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[2]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[2]), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesCobblestoneStairs[2]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[2]), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 0), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 2), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 0), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 2), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 0), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 2), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick), new ItemStack[] {new ItemStack(DecoDefs.graniteStoneBrickLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick), new ItemStack[] {new ItemStack(DecoDefs.graniteStoneBrickLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick), new ItemStack[] {new ItemStack(DecoDefs.graniteStoneBrickLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[0]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[3]), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[0]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[3]), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[0]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[3]), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 3), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 3), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 3), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.andesiteStoneBrickLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.andesiteStoneBrickLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 1), new ItemStack[] {new ItemStack(DecoDefs.andesiteStoneBrickLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[1]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[4]), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[1]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[4]), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[1]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[4]), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 4), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 4), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 4), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});

		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.dioriteStoneBrickLoose), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.dioriteStoneBrickLoose), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrick, 1, 2), new ItemStack[] {new ItemStack(DecoDefs.dioriteStoneBrickLoose), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[2]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[5]), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[2]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[5]), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneTypesStoneBrickStairs[2]), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseStairs[5]), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 3), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 5), new ItemStack(Item.clay)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 3), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 5), new ItemStack(Item.slimeBall)});
		FCRecipes.AddStokedCauldronRecipe(new ItemStack(DecoDefs.stoneSlab3, 1, 3), new ItemStack[] {new ItemStack(DecoDefs.stoneTypesLooseSlab, 1, 5), new ItemStack(FCBetterThanWolves.fcItemNetherSludge)});
	}

	private void addToolRecipes() {
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.chiselDiamond), new ItemStack[] {new ItemStack(FCBetterThanWolves.fcItemIngotDiamond)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemStone, 2), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(FCBetterThanWolves.fcItemStoneBrick)});
		FCRecipes.AddShapelessRecipeWithSecondaryOutputIndicator(new ItemStack(FCBetterThanWolves.fcBlockStoneBrickLoose), new Object[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767), new ItemStack(Block.stone)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(FCBetterThanWolves.fcItemIngotDiamond, 1), new ItemStack[] {new ItemStack(DecoDefs.chiselDiamond, 1, 32767)});
		
		FCRecipes.AddRecipe(new ItemStack(DecoDefs.shearsDiamond), new Object[] {"X ", " X", 'X', new ItemStack(FCBetterThanWolves.fcItemIngotDiamond)});
		FCRecipes.AddStokedCrucibleRecipe(new ItemStack(FCBetterThanWolves.fcItemIngotDiamond, 2), new ItemStack[] {new ItemStack(DecoDefs.shearsDiamond, 1, 32767)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemLeatherCut, 2), new Object[] {new ItemStack(DecoDefs.shearsDiamond, 1, 32767), new ItemStack(Item.leather)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut, 2), new Object[] {new ItemStack(DecoDefs.shearsDiamond, 1, 32767), new ItemStack(FCBetterThanWolves.fcItemTannedLeather)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemScouredLeatherCut, 2), new Object[] {new ItemStack(DecoDefs.shearsDiamond, 1, 32767), new ItemStack(FCBetterThanWolves.fcItemScouredLeather)});
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemStrap, 4), new Object[] {new ItemStack(DecoDefs.shearsDiamond, 1, 32767), new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut)});
		
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.nameTag), new Object[] {new ItemStack(Item.leather), new ItemStack(FCBetterThanWolves.fcItemNuggetIron)});
		FCRecipes.AddShapelessRecipe(new ItemStack(DecoDefs.nameTag), new Object[] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemNuggetIron)});
	}

	private void addCustomRecipeClasses() {
		CraftingManager.getInstance().getRecipeList().add(new DecoRecipesLogChopping());
	}

	private void RemoveSubBlockRecipes(Block var0, int var1, int var2, Block var3, Block var4, boolean var5) {
		FCRecipes.RemoveAnvilRecipe(new ItemStack(var3, 8, 0), new Object[] {"####", '#', new ItemStack(var0, 1, var1)});
		FCRecipes.RemoveAnvilRecipe(new ItemStack(var4, 8, 0), new Object[] {"####", '#', new ItemStack(var3, 1, 0)});
		FCRecipes.RemoveAnvilRecipe(new ItemStack(var3, 8, 1), new Object[] {"####", '#', new ItemStack(var4, 1, 0)});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(var4, 1, 12), new Object[] {"M", "M", "M", 'M', new ItemStack(var4, 1, 0)});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(var4, 6, 13), new Object[] {" S ", "###", "###", '#', new ItemStack(var0, 1, var1), 'S', new ItemStack(var3, 8, 0)});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(var4, 4, 15), new Object[] {"###", " X ", " X ", '#', new ItemStack(var3, 1, 0), 'X', new ItemStack(var4, 1, 0)});
		FCRecipes.RemoveVanillaRecipe(new ItemStack(var3, 4, 12), new Object[] {"###", " X ", '#', new ItemStack(var3, 1, 0), 'X', new ItemStack(var4, 1, 0)});

		if (var5)
		{
			FCRecipes.RemoveVanillaRecipe(new ItemStack(var3, 6, 14), new Object[] {"###", "###", '#', new ItemStack(var0, 1, var1)});
			FCRecipes.RemoveVanillaRecipe(new ItemStack(var3, 2, 14), new Object[] {"###", '#', new ItemStack(var4, 1, 0)});
		}

		FCRecipes.RemoveVanillaShapelessRecipe(new ItemStack(var0, 1, var2), new Object[] {new ItemStack(var3, 1, 0), new ItemStack(var3, 1, 0)});
		FCRecipes.RemoveVanillaShapelessRecipe(new ItemStack(var3, 1, 0), new Object[] {new ItemStack(var4, 1, 0), new ItemStack(var4, 1, 0)});
		FCRecipes.RemoveVanillaShapelessRecipe(new ItemStack(var4, 1, 0), new Object[] {new ItemStack(var3, 1, 1), new ItemStack(var3, 1, 1)});
	}

	private void addLayerRecipe(Block layer, Block slab, int slabMeta, Block block, int blockMeta, Item componentItem, int componentMeta) {
		addLayerRecipe(layer, slab, slabMeta, block, blockMeta, componentItem, componentMeta, false);
	}
	
	private void addLayerRecipe(Block layer, Block slab, int slabMeta, Block block, int blockMeta, Item componentItem, int componentMeta, boolean fixSlabRecombine) {
		if (fixSlabRecombine) {
	        FCRecipes.RemoveVanillaShapelessRecipe(new ItemStack(block, 1, blockMeta), new Object[] {new ItemStack(slab, 1, slabMeta), new ItemStack(slab, 1, slabMeta)});
	        FCRecipes.AddRecipe(new ItemStack(block, 1, blockMeta), new Object[] {"X", "X", 'X', new ItemStack(slab, 1, slabMeta)});
		}
		
		FCRecipes.AddRecipe(new ItemStack(layer, 8), new Object[] {"XX", 'X', new ItemStack(slab, 1, slabMeta)});
		FCRecipes.AddShapelessRecipe(new ItemStack(slab, 1, slabMeta), new ItemStack[] {new ItemStack(layer), new ItemStack(layer), new ItemStack(layer), new ItemStack(layer)});
		FCRecipes.AddShapelessRecipe(new ItemStack(block, 1, blockMeta), new ItemStack[] {new ItemStack(layer), new ItemStack(layer), new ItemStack(layer), new ItemStack(layer), new ItemStack(layer), new ItemStack(layer), new ItemStack(layer), new ItemStack(layer)});
		
		if (componentItem != null)
			FCRecipes.AddShapelessRecipe(new ItemStack(componentItem, 1, componentMeta), new ItemStack[] {new ItemStack(layer)});
	}
}