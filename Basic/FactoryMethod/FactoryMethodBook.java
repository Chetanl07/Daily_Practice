class FactoryMethodBook {
    private String title;
    private String author;

    private FactoryMethodBook(String title,String author)
    {
        super();
        this.author=author;
        this.title=title;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FactoryMethodBook{");
        sb.append("title=").append(title);
        sb.append(", author=").append(author);
        sb.append('}');
        return sb.toString();
    }

    public static FactoryMethodBook getBookObject()
    {
        return new FactoryMethodBook("java", "james Gosling");
    }

    
    
}
