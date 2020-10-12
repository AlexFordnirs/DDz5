package ua.step.homework;
import java.util.Arrays;
import java.util.Collections;
import  java.util.StringTokenizer;

/**
 * В массиве хранится n явно заданных текстовых строк.
 * <p>
 * Создать методы:
 * • Возвращает содержимое массива в виде строки через пробел (join)
 * • Возвращает содержимое массива в виде строки через заданный разделитель (перегруженный join)
 * • Сортирующий массив обратном порядке (без учёта регистра) от z до a (sortDesc);
 * • Сортирующий массив по количеству слов в строке (слова разделены пробелами) (sortByWordCount).
 *
 * Примечание: Не использовать методы строк и стандартную сортировку
 */
public class Task02 {
    public static void main(String[] args) {
        // TODO: Проверяйте методы здесь
    }

    /**
     * Соединяет массив строк в одну строку разделенную пробелом
     *
     * @param strings - массив строк
     * @return строка состоящая из элементов массив
     */
    public static String join(String[] strings) {
        String get= new String();
       for(int i=0;i<strings.length;i++)
       {if(i+1<strings.length){get+=strings[i]+" ";} else {get+=strings[i];}

       }
        return get;
    }

    /**
     * Соединяет массив строк в одну строку разделенную соединителем glue
     *
     * @param strings - массив строк
     * @param glue    - соединитель
     * @return строка состоящая из элементов массива
     */
    public static String join(String[] strings, String glue) {
        String get= new String();
        for(int i=0;i<strings.length;i++)
        {if(i+1<strings.length){get+=strings[i]+glue;} else {get+=strings[i];}

        }
        return get;
    }

    /**
     * Сортирует массив строк в порядке обратном алфавитному
     *
     * @param strings - массив строк для сортировки
     * @return
     */
    public static void sortDesc(String[] strings) {
        String sit= new String();
         Arrays.sort(strings, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
       //for (int i=0;i<strings.length;i++){sit+=strings[i];}
        //return sit;
    }

    /**
     * Сортирует массив строк по количеству слов в строке
     *
     * @param strings - массив строк для сортировки
     * @return
     */
    public static void sortByWordCount(String[] strings) {
        //Arrays.sort(strings, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        for (int i = 0; i < strings.length; i++)
        {
            for (int j = i + 1; j < strings.length; j++)
            {
                StringTokenizer sL1 = new StringTokenizer(strings[i]);
                int tl1 = sL1.countTokens();
                StringTokenizer sL2 = new StringTokenizer(strings[j]);
                int tr2 = sL2.countTokens();
                if ( tl1 > tr2)
                {
                    String temp = strings[j];
                    strings[j]=strings[i];
                    strings[i]=temp;
                }
            }
        }

    }

    }

