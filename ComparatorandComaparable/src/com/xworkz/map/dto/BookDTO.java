package com.xworkz.map.dto;

public class BookDTO implements Comparable<BookDTO> {
    private String title;
    private int pages;

    public BookDTO(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public int compareTo(BookDTO other) {

        if(other.getPages()>this.pages){
            return 1;
        } else if (other.getPages()==this.pages) {
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "BookDTO{title='" + title + "', pages=" + pages + "}";
    }

    public int getPages() {
        return pages;
    }
}
