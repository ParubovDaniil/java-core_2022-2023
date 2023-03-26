package lr11.Example9;
/*
 * 5. Создать два проекта, в которых продемонстрировать два
 * способа создания линейного однонаправленного списка (с головы и с
 * хвоста) согласно примеру 2 из второго раздела. Отработать код с
 * помощью отладчика и привести скриншоты минимум трех точек
 * обработанных отладчиком.
 */
class Node {
    public int value;
    public Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
public class Example {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        createHead(head);
        print(head);
        System.out.println();
        Node head2 = createTail();
        print(head2);
    }

    private static Node createTail() {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        return head;
    }

    private static void createHead(Node head) {
        Node tail = head;
        for (int i = 0; i < 9; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
        }
    }

    private static void print(Node ref) {
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}