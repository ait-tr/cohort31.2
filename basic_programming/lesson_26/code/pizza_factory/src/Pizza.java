public abstract class Pizza {

    private String type;

    public Pizza( String type){
        this.type = type;
    }

    public void orderPizza(){
        prepare();
        bake();
        pack();
    }

  protected  abstract void prepare(); //  protected   означает что метод/переменная будут видны также в дочерних классах

  private   void bake(){
        System.out.println("Baking "+type);
    }

  private   void pack(){
        System.out.println("Packing "+type);
    }


}
