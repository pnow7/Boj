import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int sum = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers.add(num);
            sum += num;

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // 정렬
        Collections.sort(numbers);

        // 산술 평균
        int avg = (int) Math.round((double) sum / N);

        // 중앙값
        int median = numbers.get(N / 2);

        // 최빈값 찾기
        int maxFreq = Collections.max(freqMap.values());

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes); // 최빈값 여러 개일 때 작은 순 정렬
        int mode = (modes.size() > 1) ? modes.get(1) : modes.get(0);

        // 범위
        int range = max - min;

        // 결과 출력
        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}