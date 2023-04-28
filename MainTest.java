import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void deleteNode() {
    Node head = null;

    Main.deleteNode(head);

    Assertions.assertEquals(null, head);

    head = new Node(10);

    Main.deleteNode(head);

    Assertions.assertEquals("10", head.toString());

    Node b = new Node(11);
    Node c = new Node(12);
    Node d = new Node(13);
    Node e = new Node(14);
    Node f = new Node(15);

    head.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;

    Main.deleteNode(c);

    Assertions.assertEquals("10->11->13->14->15", head.toString());

    Main.deleteNode(b);

    Assertions.assertEquals("10->13->14->15", head.toString());

    Main.deleteNode(e);

    Assertions.assertEquals("10->13->15", head.toString());

    Main.deleteNode(f);

    Assertions.assertEquals("10->13->15", head.toString());
  }
}
