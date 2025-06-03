package Collection;

import java.util.ArrayList;
import java.util.List;

class List_ {
    public static void main(String[] args) {
        List<String> newList= new ArrayList<>();
        newList.add("Harsh");
        newList.add("Utkarsh");
        newList.add(1,"adarsh");
        newList.set(1,"Aakarsh");
//        newList.remove(1);
        for (String s : newList) {
            System.out.println(s);
        }

    }
}
