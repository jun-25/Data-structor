import java.util.ArrayList;

public class MergeSort {
    public ArrayList<Integer> split(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;

        ArrayList<Integer> leftList=new ArrayList<>(list.subList(0,mid));
        ArrayList<Integer> rightList=new ArrayList<>(list.subList(mid,list.size()));
        leftList=split(leftList);
        rightList=split(rightList);
        return merge(leftList, rightList);
    }

    private ArrayList<Integer> merge(ArrayList<Integer> lList, ArrayList<Integer> rList) {
        ArrayList<Integer> list = new ArrayList<>();
        int lPoint = 0;
        int rPoint = 0;
        while (lList.size() > lPoint && rList.size() > rPoint) {
            if (lList.get(lPoint) < rList.get(rPoint)) {
                list.add(lList.get(lPoint));
                lPoint++;
            } else {
                list.add(rList.get(rPoint));
                rPoint++;
            }
        }

        while (rList.size()>rPoint) {
            list.add(rList.get(rPoint));
            rPoint++;
        }
        while (lList.size()>lPoint) {
            list.add(lList.get(lPoint));
            lPoint++;
        }
        return list;
    }
}
