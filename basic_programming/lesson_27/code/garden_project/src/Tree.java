public class Tree extends Plant{

    private static int TREE_GROW_PER_SEASON = 5;

    public Tree( String name, int height, int age){
        super(name, height, age);
    }

    public void doSummer(){
        setHeight( getHeight() + getGrowPerSeason());
        System.out.println(getName()+" has grown in Summer - "+getHeight());
    }

    public void doAutumn(){
        System.out.println(getName() + " is not growing in Autumn - "+getHeight());
    }

    public int getGrowPerSeason(){

        return TREE_GROW_PER_SEASON;
    }



}
