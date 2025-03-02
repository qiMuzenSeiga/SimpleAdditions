package com.example.simpleadditions.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.example.simpleadditions.SimpleAdditions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.UUID;




public class ItemBase extends Item  {

    private final float attackDamage;
    private final float attackSpeed;

    public ItemBase(String name, float attackDamage, float attackSpeed) {

        super();
        this.setTranslationKey(SimpleAdditions.MOD_ID + "." + name);


        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        // 剑通常不允许堆叠
        this.maxStackSize = 1;
        // 设置耐久度（可选）
        setMaxDamage(715);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        // 将描述信息添加到tooltip列表中，每个字符串代表一行
        tooltip.add("绝对不是胡桃的桃！");
        tooltip.add("绝对不是森兮的木！");
        tooltip.add("冰呢？桃烧化了（？");
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        // 创建一个属性映射集合
        Multimap<String, AttributeModifier> modifiers = HashMultimap.create();
        // 仅在主手时添加剑的属性
        if (slot == EntityEquipmentSlot.MAINHAND) {
            // 添加攻击伤害修饰器
            modifiers.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
                    new AttributeModifier(
                            UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"),
                            "Weapon modifier", this.attackDamage, 0));
            // 添加攻击速度修饰器
            modifiers.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
                    new AttributeModifier(
                            UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACB4"),
                            "Weapon modifier", this.attackSpeed, 0));
        }
        return modifiers;
    }
}