package sem2Homeworks;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class sem2Homework2 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[] {2, 3, 1, 5, 6, 8, -1, 7, 12, 0};
        Logger logger = Logger.getLogger(sem2Homework2.class.getName());
        FileHandler fh = new FileHandler("C:/Users/romer/IdeaProjects/java_start_2/src/main/java/sem2Homeworks/log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info(bubbleSort(arr));
        System.out.println(Arrays.toString(arr));
    }
    private static String bubbleSort(int[] arr) {
        StringBuilder sb = new StringBuilder();
        try{
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                        for(int item : arr) {
                            sb.append(item + " ");
                        }
                        sb.append("\n");
                    }
                }
            }
        }catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
        return sb.toString();
    }
}
