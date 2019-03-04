public class FirstDuplicate {
    int firstDuplicate(int[] a) {

        boolean[] nums = new boolean[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            if (nums[a[i]]) return a[i];
            else nums[a[i]] = true;
        }

        return -1;
    }
}
