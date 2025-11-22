class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ctr = 0;
        int i = 0;
        int l = flowerbed.length;
        while (i < l) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == l - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                ctr++;
            }
            if (ctr >= n) {
                return true;
            }
            i++;
        }
        return false;
    }
    
}