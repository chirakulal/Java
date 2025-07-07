package com.xworkz.list.runner;

import com.xworkz.list.dto.BookDTO;

import java.util.*;

public class BookRunner {


    public static void main(String[] args) {
        List<BookDTO> books = new ArrayList<>();
        books.add(new BookDTO("The Alchemist", "Paulo Coelho", "HarperCollins", "9780061122415", 208, 399.0, "Fiction", 1, true, "English"));
        books.add(new BookDTO("Wings of Fire", "A.P.J. Abdul Kalam", "Universities Press", "9788173711466", 180, 299.0, "Autobiography", 2, false, "English"));
        books.add(new BookDTO("Harry Potter", "J.K. Rowling", "Bloomsbury", "9780747532743", 309, 499.0, "Fantasy", 1, true, "English"));
        books.add(new BookDTO("The Power of Habit", "Charles Duhigg", "Random House", "9780812981605", 371, 450.0, "Self-help", 1, false, "English"));
        books.add(new BookDTO("Zero to One", "Peter Thiel", "Crown Publishing", "9780804139298", 210, 350.0, "Business", 1, true, "English"));
        books.add(new BookDTO("The Monk Who Sold His Ferrari", "Robin Sharma", "Jaico", "9788179921623", 198, 280.0, "Motivational", 3, false, "English"));
        books.add(new BookDTO("Ikigai", "Francesc Miralles", "Penguin", "9780143130727", 208, 399.0, "Lifestyle", 1, true, "English"));
        books.add(new BookDTO("Atomic Habits", "James Clear", "Penguin", "9780735211292", 320, 499.0, "Productivity", 1, true, "English"));
        books.add(new BookDTO("Think and Grow Rich", "Napoleon Hill", "The Ralston Society", "9780449214923", 238, 299.0, "Finance", 5, false, "English"));
        books.add(new BookDTO("Rich Dad Poor Dad", "Robert Kiyosaki", "Plata Publishing", "9781612680194", 336, 350.0, "Finance", 2, true, "English"));

      ListIterator<BookDTO> list = books.listIterator();
      while (list.hasNext()){
        BookDTO bookDTO =  list.next();
          System.out.println(bookDTO);

          if(bookDTO.getTitle().equals("Rich Dad Poor Dad")){
              BookDTO newBook = new BookDTO("Deep Work", "Cal Newport", "Grand Central Publishing", "9781455586691", 304, 450.0, "Self-help", 1, true, "English");
              list.add(newBook);
              System.out.println(newBook);
          }
      }

    }

}
