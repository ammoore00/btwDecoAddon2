package net.minecraft.src;

import java.util.List;

public class DecoBlockStoneVariantBrick extends Block {
	public DecoBlockStoneVariantBrick(int ID) {
		super(ID, Material.rock);
        this.setHardness(2.25F);
        this.setResistance(10.0F);
        this.SetPicksEffectiveOn();
        this.setStepSound(soundStoneFootstep);
		this.setUnlocalizedName("decoBlockStoneBricks");
		this.setCreativeTab(CreativeTabs.tabBlock);

		DecoManager.Register(this, new String[] {"granite", "andesite", "diorite", "slate", "slateTiles"});
	}

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World var1, int var2, int var3, int var4, int var5, float var6, int var7)
    {
        //super.dropBlockAsItemWithChance(var1, var2, var3, var4, var5, var6, var7);

        if (!var1.isRemote)
        {
        	Block drop = DecoDefs.graniteStoneBrickLoose;
        	
        	switch (var5) {
        	case 0:
        		drop = DecoDefs.graniteStoneBrickLoose;
        		break;
        	case 1:
        		drop = DecoDefs.andesiteStoneBrickLoose;
        		break;
        	case 2:
        		drop = DecoDefs.dioriteStoneBrickLoose;
        		break;
        	case 3:
        	case 4:
        		drop = DecoDefs.slateBrickLoose;
        		break;
        	}
        	
            this.dropBlockAsItem_do(var1, var2, var3, var4, new ItemStack(drop));
        }
    }

    public boolean HasMortar(IBlockAccess var1, int var2, int var3, int var4)
    {
        return true;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
        par3List.add(new ItemStack(par1, 1, 4));
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
    }

	@Override
    public int getItemIDDroppedOnStonecutter(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        
        switch (meta) {
        default:
        case 0:
        	return DecoDefs.stoneTypesStoneBrickSidingAndCorner[0].blockID;
        case 1:
        	return DecoDefs.stoneTypesStoneBrickSidingAndCorner[1].blockID;
        case 2:
        	return DecoDefs.stoneTypesStoneBrickSidingAndCorner[2].blockID;
        case 3:
        	return DecoDefs.slateBrickSidingAndCorner.blockID;
        case 4:
        	return DecoDefs.slateTilesSidingAndCorner.blockID;
        }
    }

	@Override
    public int getItemCountDroppedOnStonecutter(World world, int x, int y, int z) {
        return 2;
    }

	@Override
    public int getItemDamageDroppedOnStonecutter(World world, int x, int y, int z)  {
        return 0;
    }
}
