public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
         
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
         
        Collections.sort(listOne);
        Collections.sort(listTwo);
         
        
         
        boolean isEqual = listOne.equals(listTwo);      
        System.out.println(isEqual);
         
     
         
        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
         
        isEqual = listOne.equals(listThree);      
        System.out.println(isEqual);
    }
}