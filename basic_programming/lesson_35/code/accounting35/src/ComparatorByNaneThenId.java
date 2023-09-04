import java.util.Comparator;

public class ComparatorByNaneThenId implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int res = e1.getFirstName().compareTo(e2.getFirstName());
        if( res == 0)
            res = Integer.compare(e1.getId(),e2.getId());
        return res;
    }
}
