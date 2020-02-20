// Q9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each products.
enum Material
{
    WOOD(9.6,7.8),METAL(8.7,7.9);
    double firetestrating,stresstestrating;

    Material(double firetestrating,double stresstestrating)
    {
        this.firetestrating = firetestrating;
        this.stresstestrating = stresstestrating;
    }
}




abstract class Furniture
{
    public Furniture(float weight, String color, Material material)
    {
        this.weight = weight;
        this.color = color;
        this.material = material;
    }

    float weight;
    String color;
    Material material;
    abstract boolean firetest(Material material,float weight);
    abstract boolean stresstest(Material material,float weight);


}
public class Q9
{
    public static void main(String[] args)
    {
        Table table1 = new Table(67,"green",Material.METAL);
        Table table2 = new Table(67,"green",Material.WOOD);
        table2.firetest(table2.material,table2.weight);
    }
}
class Table extends Furniture
{
    public Table(float weight, String color, Material material)
    {
        super(weight, color, material);
    }

    @Override
    boolean firetest(Material material,float weight)
    {
        //firetest for table on the basis of material
        System.out.println(material.toString());
        if((material.toString()).equalsIgnoreCase(Material.WOOD.toString()))
        {
            System.out.println("I am wooden chair..");
        }
        else
        {
            //logic for metal testing...
        }
        return true;
    }

    @Override
    boolean stresstest(Material material,float weight)
    {
       // firetest for table on the basis of material
        return true;
    }
}
class Chair extends Furniture
{

    public Chair(float weight, String color, Material material) {
        super(weight, color, material);
    }

    @Override
    boolean firetest(Material material,float weight)
    {
        //firetest for chair on the basis of material
        return true;
    }

    @Override
    boolean stresstest(Material material,float weight)
    {
        //firetest for table on the basis of material
        return true;
    }
}
