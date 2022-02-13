package Task1;

import java.util.Scanner;

abstract class AbstractHandler {


    public abstract void open();
    public abstract void create();
    public abstract void change();
    public abstract void save();

    public static void main(String[] args) {
        AbstractHandler doc1 = new XMLHandler();
        AbstractHandler doc2 = new TXTHandler();
        AbstractHandler doc3 = new DOCHandler();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите формат вашего документа: ");
        String form = in.next();

        if (form.equals("XML")) {

            doc1.open();
            doc1.create();
            doc1.change();
            doc1.save();

        } else if (form.equals("TXT")){

            doc2.open();
            doc2.create();
            doc2.change();
            doc2.save();

        } else if (form.equals("DOC")) {

            doc3.open();
            doc3.create();
            doc3.change();
            doc3.save();

        }
    }


    static class XMLHandler extends AbstractHandler {

        public void open(){
            System.out.println( "Открытие XML документа.");
        }

        public void create() {
            System.out.println("Создание XML документа.");
        }

        public void change() {
            System.out.println("Редактирование XML документа.");
        }

        public void save() {
            System.out.println("Сохранение документа в XML формате.");
        }
    }

    static class TXTHandler extends AbstractHandler {

        public void open(){
            System.out.println("Открытие TXT документа.");
        }

        public void create() {
            System.out.println("Создание TXT документа.");
        }

        public void change() {
            System.out.println("Редактирование TXT документа.");
        }

        public void save() {
            System.out.println("Сохранение документа в TXT формате.");
        }
    }

    static class DOCHandler extends AbstractHandler {

        public void open(){
            System.out.println("Открытие DOC документа.");
        }

        public void create() {
            System.out.println("Создание DOC документа.");
        }

        public void change() {
            System.out.println("Редактирование DOC документа.");
        }

        public void save() {
            System.out.println("Сохранение документа в DOC формате.");
        }
    }
}
