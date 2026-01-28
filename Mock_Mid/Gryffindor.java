public class Gryffindor extends Houses implements Magicable {
    public Gryffindor() {
        super("Gryffindor","RED");
    }
    public void attackSpell(Player player, Player target, Spell spell) {
        if (spell instanceof Incendio) {
            player.setMana(player.getMana() - 4);
            target.setHP(target.getHP() - (spell.getDamage() + player.getAttackDamage()));
        }
        else if (spell instanceof Expelliarmus) {
            player.setMana(player.getMana() - 3);
            target.setHP(target.getHP() - (spell.getDamage() + player.getAttackDamage()));
        }
        System.out.print("[" + player.getName() + "]: use spell (" + spell.getName() + ")!");
    }
    public void defense(Player player, Player damager) {
        player.setHP(player.getHP() + 3);
        player.setMana(player.getMana() + 4);
        System.out.print("[" + player.getName() + "]: Episker !");
    }
}
