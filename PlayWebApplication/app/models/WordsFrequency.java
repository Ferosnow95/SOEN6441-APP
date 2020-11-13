package models;

/**
 * model
 * @author
 * @date 2020-11-03
 */
public class WordsFrequency {
    public String word;
    public Long frequency;

    public WordsFrequency(String word, Long frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordsFrequency that = (WordsFrequency) o;
        return word.equals(that.word) &&
                frequency.equals(that.frequency);
    }


}
