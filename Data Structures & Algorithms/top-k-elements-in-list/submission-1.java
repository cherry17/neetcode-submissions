class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((p1, p2) -> p1.getValue() - p2.getValue());
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Pair<>(entry.getKey(), entry.getValue()));
            if(pq.size() > k) {
                pq.poll();
            }
        }
        for(int i=0; i < k; i++) {
            res[i] = pq.poll().getKey();
        }
        return res;
    }   
}

