/**
 * For this challenge, we'll assume the following simple singly linked list:
 *
 * public class Node {
 *   public Node next;
 *   public int data;
 *
 *   public Node(int data) {
 *     this.data = data;
 *   }
 *
 *   @Override
 *   public String toString() {
 *     StringBuilder sb = new StringBuilder();
 *
 *     Node nextNode = next;
 *
 *     sb.append(data);
 *
 *     while (nextNode != null) {
 *       sb.append("->");
 *
 *       sb.append(nextNode.data);
 *
 *       nextNode = nextNode.next;
 *     }
 *
 *     return sb.toString();
 *   }
 * }
 *
 * Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 *
 * Example
 *
 * Input: the node c from the linked list a->b->c->d->e->f
 * Result: nothing is returned but the new linked list looks like a->b->d->e->f
 */
public class Main {

  /**
   * This challenge doesn't allow us to go backwards, so we can only work with the current node and those after it.
   *
   * We can get the data of the next node (if the passed one has next) and set it in the current one,
   * then simply change the next pointer of the current one to point to <code>next.next</code>
   *
   * Time Complexity: O(1)
   * Space Complexity: O(1)
   */
  public static void deleteNode(Node node) {
    if (node == null || node.next == null) {
      return;
    }

    Node next = node.next;

    node.data = next.data;
    node.next = next.next;
  }
}
