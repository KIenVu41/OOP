/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qls10;

/**
 *
 * @author Admin
 */
public class QLS10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // class book
    static class Book{
        protected int id;
        protected String authors;
        protected String title;
        protected String category;

        public Book() {
        }

        public Book(int id, String authors, String title, String category) {
            this.id = id;
            this.authors = authors;
            this.title = title;
            this.category = category;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setAuthors(String authors) {
            this.authors = authors;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getId() {
            return id;
        }

        public String getAuthors() {
            return authors;
        }

        public String getTitle() {
            return title;
        }

        public String getCategory() {
            return category;
        }

        @Override
        public String toString() {
            return "Book{" + "id=" + id + ", authors=" + authors + ", title=" + title + ", category=" + category + '}';
        }
        
    }
}
