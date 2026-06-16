public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int max = -1;

    for(int keyboard : keyboards) {

        for(int drive : drives) {

            int total = keyboard + drive;

            if(total <= b) {

                max = Math.max(max, total);
            }
        }
    }

    return max;

    }