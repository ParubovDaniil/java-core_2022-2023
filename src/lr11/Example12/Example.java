package lr11.Example12;

/*
 * 6. Разработать проект, в котором для ввода, вывода и изменения
 * односвязного линейного списка создать следующие методы:
 * а) с использованием цикла:
 * + ввод с головы createHead();
 * + ввод с хвоста createTail();
 * + вывод (возвращается строка, сформированная из элементов списка) toString();
 * + добавление элемента в начало списка AddFirst();
 * + добавление элемента в конец списка AddLast();
 * + вставка элемента в список с указанным номером Insert();
 * + удаление элемента с головы списка RemoveFirst();
 * + удаление последнего элемента списка RemoveLast();
 * + удаление из списка элемента с указанным номером Remove();
 * б) с использованием рекурсии:
 * + ввод с головы createHeadRec();
 * + ввод с хвоста createTailRec();
 * – вывод (возвращается строка, сформированная из элементов
 * списка) toStringRec().
 */
class Node {

    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
public class Example {
    public static void main(String[] args) {

        MyFirstLinkedList list = new MyFirstLinkedList();

        System.out.println("Наращивание головы:");
        list.createHead(new int[]{3, 2, 1});
        list.printLinkedList();

        System.out.println("Наращивание хвоста");
        list.createFromTail(new int[]{4, 5, 6});
        list.printLinkedList();

        System.out.println("добавление элемента в начало и конец списка:");
        list.createHead(new int[]{3, 2, 1});
        list.printLinkedList();
        list.addFirst(new Node(-5, null));
        list.addLast(new Node(60, null));
        list.printLinkedList();

        System.out.println("добавление элемента '-1' по индексу 1:");
        list.createFromTail(new int[]{1,2,3});
        list.printLinkedList();
        list.insert(new Node(-1, null));
        list.printLinkedList();

        System.out.println("удаление первого и последнего элементов:");
        list.createFromTail(new int[]{1,2,3,4});
        list.printLinkedList();
        list.removeFirst();
        list.removeLast();
        list.printLinkedList();

        System.out.println("удаление элемента по значению:");
        list.createFromTail(new int[]{1,2,3,4});
        list.printLinkedList();
        list.remove();
        list.printLinkedList();

        System.out.println("Наращивание головы, рекурсивно:");
        list.recursiveCreateHead(new int[]{4,3,2,1});
        list.printLinkedList();

        System.out.println("Наращивание хвоста, рекурсивно:");
        list.createFromTailRecursive(new int[]{4,3,2,1});
        list.printLinkedList();

        System.out.println("Вывод рекурсивно, исходный список:");
        list.createFromTailRecursive(new int[]{4,3,2,1});
        list.printLinkedList();
        System.out.println("Рекурсивный вывод:\n" + list.toStringRecursive());
    }
}

class MyFirstLinkedList {

    private Node tail = null;
    private Node head = null;


    void createHead(int[] values) {
        head = new Node(values[0], null);
        tail = head;

        for (int i = 1; i < values.length; i++) {
            head = new Node(values[i], head);
        }
    }

    void recursiveCreateHead(int[] values) {
        head = new Node(values[0], null);
        tail = head;

        addItems_HeadRecursive(subArray(values));
    }

    private int[] subArray(int[] arr) {

        int[] newArr = new int[arr.length- 1];

        if (newArr.length >= 0) System.arraycopy(arr, 1, newArr, 0, newArr.length);

        return newArr;
    }

    private void addItems_HeadRecursive(int[] values) {
        if(values.length == 0) return;

        head = new Node(values[0], head);

        addItems_HeadRecursive(subArray(values));
    }

    void createFromTail(int[] val) {
        head = new Node(val[0], null);
        tail = head;

        for (int i = 1; i < val.length; i++) {
            tail.next = new Node(val[i], null);
            tail = tail.next;
        }
    }

    void createFromTailRecursive(int[] val) {
        head = new Node(val[0], null);
        tail = head;

        addItems_TailRecursive(subArray(val));
    }

    private void addItems_TailRecursive(int[] values) {
        if(values.length == 0) return;

        tail.next = new Node(values[0], null);
        tail = tail.next;

        addItems_TailRecursive(subArray(values));
    }

    void printLinkedList() {
        System.out.println(toString());
    }

    void addFirst(Node node) {
        node.next = head;
        head = node;
    }

    void addLast(Node node) {
        tail.next = node;
        tail = node;
    }

    void insert(Node node) {

        Node ref = head;
        while (ref != null) {

            if (ref.value == 1) {
                node.next = ref.next;
                ref.next = node;
                break;
            }
            ref = ref.next;
        }
    }

    void removeFirst() {
        head = head.next;
    }

    void removeLast() {

        Node ref = head;

        while (ref.next.next != null) {
            ref = ref.next;
        }

        ref.next = null;
        tail = ref;
    }

    void remove() {

        Node ref = head;

        while (ref.next.value != 3) ref = ref.next;

        ref.next = ref.next.next;
    }

    @Override
    public String toString() {

        StringBuilder build = new StringBuilder();
        Node ref = head;

        while (ref != null) {
            build.append(ref.value);
            build.append(" ");
            ref = ref.next;
        }

        return build.toString();
    }

    String toStringRecursive() {

        return toStringRecursiveInternal(head);
    }

    private String toStringRecursiveInternal(Node current) {

        if(current == null) return "";

        return current.value + " " + toStringRecursiveInternal(current.next);
    }
}
