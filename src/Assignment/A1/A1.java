package Assignment.A1;

import java.util.ArrayList;

//TODO [Qi ZHOU Student ID: 261080897]
public class A1 {

    private static class Total {
        int total;
    }

    public static void main(String[] args) {

        System.out.println(crazySeries(5));
        System.out.println(crazySeries(9));
        System.out.println(crazySeries(16));
        System.out.println(crazySeries(-2));

        System.out.println(benNumber(2,5));
        System.out.println(benNumber(3,8));
        System.out.println(benNumber(1,1));
        System.out.println(benNumber(1,0));
        System.out.println(benNumber(5,8));
        
    }


    //Q1
    public static ArrayList<Integer> crazySeries(int start) {
        ArrayList<Integer> answer = new ArrayList<>();
        if (start > 0) {
            answer.add(start);
            int next = start - 3;
            crazySeries(answer, start, start, next);
        } else {
            System.out.println("The input number must be greater than 0.");
            return null;
        }
        return answer;
    }

    private static void crazySeries(ArrayList<Integer> answer, int start, int start2, int next) {
        if (next >= 0 && next != start) {
            if (start2 > next) {
                start2 = next;
                answer.add(next);
                next -= 3;
            } else {
                start2 = next;
                answer.add(next);
                next += 3;
            }
            crazySeries(answer, start, start2, next);
        } else if (next < 0) {
            start2 = next;
            answer.add(next);
            next += 3;
            crazySeries(answer, start, start2, next);
        } else { // next == start
            answer.add(next);
        }
    }


    //Q2
    public static int benNumber(int start, int numbers) {
        if (start <= 0 || numbers <= 0) {
            System.out.println("The start number and index must be greater than 0.");
            return 0;
        }
        //TODO write your code in this method.
        int answer;
        int index = 1;
        if (numbers == 1) {
            return start + 1;
        } else {
            Total total = new Total();
            benNumber(total, start, index, numbers);
            answer = total.total;
        }
        return answer;
    }

    private static void benNumber(Total answer, int start, int index, int numbers) {
        if (index <= numbers) {
            if (index % 2 != 0) {
                start += 1;
            } else {
                start *= 2;
            }
            index += 1;
            answer.total += start;
            benNumber(answer, start, index, numbers);

        }
    }
}
