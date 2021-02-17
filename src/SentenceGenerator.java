import java.security.SecureRandom;

public class SentenceGenerator {

    private String[] articles = {"the", "a","one", "some", "any"};
    private String[] noun = {"boy","girl","dog","town", "car"};
    private String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] prepositions = {"to","from","over","under", "on"};

    public String[] getNoun() {
        return noun;
    }

    public void setNoun(String[] noun) {
        this.noun = noun;
    }

    public String[] getVerbs() {
        return verbs;
    }

    public void setVerbs(String[] verbs) {
        this.verbs = verbs;
    }

    public String[] getPrepositions() {
        return prepositions;
    }

    public void setPrepositions(String[] prepositions) {
        this.prepositions = prepositions;
    }

    public String[] getArticles() {
        return articles;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public String getSentence() {
        StringBuilder builder = new StringBuilder();
        String space = " ";
        SecureRandom random = new SecureRandom();
        int wordIndex = random.nextInt(5);
        String article = articles[wordIndex];
        char firstLetter = article.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);

        article = article.replace(article.charAt(0),firstLetter);
        builder.append(article);
        builder.append(space);

        String nouns = noun[wordIndex];
        nouns= nouns.replace(nouns.charAt(0),Character.toUpperCase(nouns.charAt(0)));
        builder.append(nouns);
        builder.append(space);

        String verb = verbs[wordIndex];
        verb=verb.replace(verb.charAt(0),Character.toUpperCase(verb.charAt(0)));
        builder.append(verb);
        builder.append(space);

        String preposition = prepositions[wordIndex];
        preposition = preposition.replace(preposition.charAt(0),Character.toUpperCase(preposition.charAt(0)));
        builder.append(preposition);
        builder.append(space);

        wordIndex = random.nextInt(5);
        article = articles[wordIndex];
        article = article.replace(article.charAt(0),Character.toUpperCase(article.charAt(0)));
        builder.append(article);
        builder.append(space);

        nouns = noun[wordIndex];
        nouns = nouns.replace(nouns.charAt(0),Character.toUpperCase(nouns.charAt(0)));
        builder.append(nouns).append(".");

        return builder.toString();
    }
}
