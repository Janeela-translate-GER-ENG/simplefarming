package enemeez.simplefarming.blocks;

import enemeez.simplefarming.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CustomCrop extends CropsBlock
{ 
	private String name;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;
	
	public CustomCrop(Block.Properties builder, String name) 
	{
	   super(builder);
	   this.name=name;
	   this.setDefaultState(this.stateContainer.getBaseState().with(this.getAgeProperty(), Integer.valueOf(0)));
	}
	
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
	      return state.getBlock() instanceof FarmlandBlock;
	   }
	
	
	@OnlyIn(Dist.CLIENT)
	   protected IItemProvider getSeedsItem() 
	   {
		if (name.equals("barley"))
			return ModItems.barley_seeds;
		if (name.equals("carrot"))
			return ModItems.carrot_seeds;
		if (name.equals("potato"))
			return ModItems.potato_seeds;
		if (name.equals("cucumber"))
			return ModItems.cucumber;
		if (name.equals("eggplant"))
			return ModItems.eggplant;
		if (name.equals("lettuce"))
			return ModItems.lettuce;
		if (name.equals("oat"))
			return ModItems.oat;
		if (name.equals("onion"))
			return ModItems.onion;
		if (name.equals("pea"))
			return ModItems.pea_seeds;
		if (name.equals("pepper"))
			return ModItems.pepper;
		if (name.equals("radish"))
			return ModItems.radish;
		if (name.equals("rice"))
			return ModItems.rice;
		if (name.equals("rye"))
			return ModItems.rye;
		if (name.equals("soybean"))
			return ModItems.soybean;
		if (name.equals("spinach"))
			return ModItems.spinach;
		if (name.equals("tomato"))
			return ModItems.tomato;
		if (name.equals("yam"))
			return ModItems.yam;
		if (name.equals("squash"))
			return ModItems.squash_block;
		if (name.equals("cantaloupe"))
			return ModItems.cantaloupe_block;
		if (name.equals("cassava"))
			return ModItems.cassava;
		if (name.equals("honeydew"))
			return ModItems.honeydew_block;
		if (name.equals("ginger"))
			return ModItems.ginger;
		else
			return ModItems.peanut;
	   }

	   @OnlyIn(Dist.CLIENT)
	   public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) 
	   {
		   if (name.equals("barley"))
				return new ItemStack(ModItems.barley);
		   if (name.equals("carrot"))
				return new ItemStack(Items.CARROT);
		   if (name.equals("potato"))
				return new ItemStack(Items.POTATO);
		   if (name.equals("cucumber"))
				return new ItemStack(ModItems.cucumber);
			if (name.equals("eggplant"))
				return new ItemStack(ModItems.eggplant);
			if (name.equals("lettuce"))
				return new ItemStack(ModItems.lettuce);
			if (name.equals("oat"))
				return new ItemStack(ModItems.oat);
			if (name.equals("onion"))
				return new ItemStack(ModItems.onion);
			if (name.equals("pea"))
				return new ItemStack(ModItems.pea_pod);
			if (name.equals("pepper"))
				return new ItemStack(ModItems.pepper);
			if (name.equals("radish"))
				return new ItemStack(ModItems.radish);
			if (name.equals("rice"))
				return new ItemStack(ModItems.rice);
			if (name.equals("rye"))
				return new ItemStack(ModItems.rye);
			if (name.equals("soybean"))
				return new ItemStack(ModItems.soybean);
			if (name.equals("spinach"))
				return new ItemStack(ModItems.spinach);
			if (name.equals("tomato"))
				return new ItemStack(ModItems.tomato);
			if (name.equals("yam"))
				return new ItemStack(ModItems.yam);
			if (name.equals("squash"))
				return new ItemStack(ModItems.squash_block);
			if (name.equals("cantaloupe"))
				return new ItemStack(ModItems.cantaloupe_block);
			if (name.equals("cassava"))
				return new ItemStack(ModItems.cassava);
			if (name.equals("honeydew"))
				return new ItemStack(ModItems.honeydew_block);
			if (name.equals("ginger"))
				return new ItemStack(ModItems.ginger);
			else
				return new ItemStack(ModItems.peanut);
	   }
	


}