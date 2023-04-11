package org.example.library;
import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
   private LibraryDatabase libraryDatabase;

   public BookLibrary(LibraryDatabase libraryDatabase) {
      this.libraryDatabase = libraryDatabase;
   }
   //...

   public List<Book> listBooksWithCondition(String titleFragment) {
      List<Book> bookList = new ArrayList<>();
      if (titleFragment.length() < 3) return bookList;
      List<Book> resultList = libraryDatabase
            .listBooksWithCondition(titleFragment);
      if (resultList.size() > 20) return bookList;
      bookList = resultList;
      return bookList;
   }
   //...

   public int listBooksInHandsOf(LibraryUser libraryUser) {
//      List<Book> borrowedBooks = new ArrayList<>();
//      if rentABook(LibraryUser libraryUser, Book book) {
//         borrowedBooks.add(book);
//      }
//      borrowedBooks.size();
      return 0;
   }
}
