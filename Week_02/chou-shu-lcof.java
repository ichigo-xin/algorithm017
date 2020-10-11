class Solution {
    public int nthUglyNumber(int n) {
        int[] uglyNumber = {2, 3, 5};
        Queue<Long> queue = new PriorityQueue<>();
        queue.add(1l);

        int count = 0;
        while (true) {
            long temp = queue.poll();
            if (++count >= n) {
                return (int)temp;
            }
            for (int nums : uglyNumber) {
                if (!queue.contains(temp * nums)) {
                    queue.add(temp * nums);
                }
            }
        }
    }
}
