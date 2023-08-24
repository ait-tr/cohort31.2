public class ConstantsClass implements InterfaceConstants {
    public static void main(String[] args) {
        int []ints = new int[MAX];

        for( int i = MIN; i < 11; i++){
      //  for( int i = MIN; i < ints.length; i++){
            if( i >= MAX)
                System.out.println(ERROR);
            else {
                ints[i] = i;
                System.out.print(ints[i]+" ");
            }
        }
    }
}
