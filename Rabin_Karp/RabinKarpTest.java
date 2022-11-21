package ua.lviv.iot;


class RabinKarpTest {
    RabinKarp rabinKarp = new RabinKarp();

    String text1 = "ABCDRABDH";
    String pattern1 = "AB";

    String text2 = "ABABABCDAB";
    String pattern2 = "AB";

    String text3 = "AB";
    String pattern3 = "AB";

    String text4 = "ABCDRDH";
    String pattern4 = "AB";

    String text5 = "ABBARABABDH";
    String pattern5 = "AB";

    String text6 = "GHTYNBJK";
    String pattern6 = "AB";
    public long max(long [] array) {
        long max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public long min(long [] array) {
        long min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }

    void testRabinCarp() {
        System.out.println(" ");
        System.out.println("------------------||---------------");

        System.out.println(text1);
        System.out.println(pattern1);
        long time1 = recordTime(text1, pattern1);

        System.out.println(" ");
        System.out.println("------------------||---------------");

        System.out.println(text2);
        System.out.println(pattern2);
        long time2 = recordTime(text2, pattern2);

        System.out.println(" ");
        System.out.println("------------------||---------------");

        System.out.println(text3);
        System.out.println(pattern3);
        long time3 = recordTime(text3, pattern3);

        System.out.println(" ");
        System.out.println("------------------||---------------");

        System.out.println(text4);
        System.out.println(pattern4);
        long time4 = recordTime(text1, pattern4);

        System.out.println(" ");
        System.out.println("------------------||---------------");

        System.out.println(text5);
        System.out.println(pattern5);
        long time5 = recordTime(text5, pattern5);

        System.out.println(" ");
        System.out.println("------------------||---------------");

        System.out.println(text6);
        System.out.println(pattern6);
        long time6 = recordTime(text6, pattern6);


        System.out.println(" ");
        System.out.println("------------------||---------------");

        long [] array = {time1, time2, time3, time4, time5};
        System.out.println(" ");
        System.out.println("Min time: " + min(array));
        System.out.println(" ");
        System.out.println("Max time: " + max(array));



    }
    
    long recordTime(String text, String pattern){
        long time = 0;
        long startTime = System.nanoTime();
        rabinKarp.matchWithPattern(text, pattern);
        long endTime = System.nanoTime();
        System.out.println("Total execution time: " + (endTime-startTime) + "nanos");
        time = endTime - startTime;
        return time;
    }
}